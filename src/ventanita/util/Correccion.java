package ventanita.util;

import org.json.JSONObject;
import org.json.JSONTokener;
import ventanita.modelo.ErrorCorreccion;
import ventanita.modelo.Resultado;

import java.io.InputStream;
import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Correccion {

    private final static String WORD_REGEX = "[\\s]";
    private final static String SENTENCE_REGEX = "[.]( )*";
    private final static String DICCIONARIO_FILE = "/recursos/stanespanol.json";
    boolean flag = false;
 
    private static List<String> diccionario = null;

    private final String texto;
    private Resultado resultado;

    public Correccion(String texto) {
        this.texto = texto;
        diccionario = obtenerDiccionario();
        resultado = new Resultado();
    }

    public Resultado obtenerCorrecion () {
        String textoCorregido = obtenerTextoCorregidoPorPalabras();
        textoCorregido = obtenerTextoCorregidoPorOraciones(textoCorregido);
        resultado.setTextoCorregido(textoCorregido);
        return resultado;
    }
    
    public static String convertirMayuscula (String parametro){
        String str = "";
        char primeraLetra;
        char p = ' ';
        
        primeraLetra = parametro.charAt(0);
        
        for(int i=0; i<parametro.length();i++){
            p = parametro.charAt(i);
            
            if(primeraLetra ==' '){
                if(i==1){
                    p= Character.toUpperCase(p);
                }
                 
            }else if(!Character.isLetter(primeraLetra)){
                 if(i==2){
                    p= Character.toUpperCase(p);
                }
                 
            }
            else if(i==0){
                p = Character.toUpperCase(p);
            }
           str+=p;
        }
        
       return str;
    }
    
    
    private String obtenerTextoCorregidoPorPalabras() {
        final StringBuilder textoCorregido = new StringBuilder();
        String [] palabras = texto.split(WORD_REGEX);
        
        String errorAgudas1 = "([a-z]+[áéíóú][ns]*)";
        Pattern patronAgudas1 = Pattern.compile(errorAgudas1);
        
        String errorAgudas2 = "^([a-z]+ción[ ]*)$";
        Pattern patronAgudas2 = Pattern.compile(errorAgudas2);
        
        String errorGraves = "^(([a-z]*[áéíóú][a-z]+[aeiou][a-mo-rt-z])|([a-z]*[áéíóú][a-z]*[aeiou]+[a-mo-rt-z]*))$";
        Pattern patronGraves = Pattern.compile(errorGraves);
        
        String errorEsdrujula = "([a-z]*[b-df-hj-np-tv-z]+[áéíóú][b-df-hj-np-tv-z]+[aeiou][b-df-hj-np-tv-z]+[aeiou][b-df-hj-np-tv-z]*)";
        Pattern patronEsdrujula = Pattern.compile(errorEsdrujula);
        
        
        final Collator instance = Collator.getInstance();
        instance.setStrength(Collator.NO_DECOMPOSITION);
         
        
        Arrays.stream(palabras).forEach(System.err::println);

        Arrays.stream(palabras).map(String::toLowerCase).forEach(palabra -> {
            diccionario.stream()
                    .filter(dic -> instance.compare(dic, palabra) == 0)
                    .findAny()
                .ifPresentOrElse(dic -> {
                    textoCorregido.append(dic).append(" ");
                    
                    Matcher errorAguda1 = patronAgudas1.matcher(palabra);
                    Matcher errorAguda2 = patronAgudas2.matcher(palabra);
                    Matcher errorGrave = patronGraves.matcher(palabra);
                    Matcher errorEsdruju = patronEsdrujula.matcher(palabra);
                    
                    boolean aguda1 = errorAguda1.find();
                    boolean aguda2 = errorAguda2.find();
                    boolean graves = errorGrave.find();
                    boolean esdrujulas = errorEsdruju.find();
                    
                    // Comparacion estricta
                    if (palabra.compareTo(dic) != 0) {
                        //Si es diferente de 0 es que son diferentes y no tiene bien las tildes
                        if(!aguda1){
                             resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal escrita. palabra=" + palabra));
                             resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal escrita. Correcion=" + dic));
                        }else{
                            if(!aguda2){
                             resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal tildada. palabra=" + palabra));
                             resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal tildada. Correcion=" + dic));
                            }else{
                                 if(!graves){
                                 resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal escrita. palabra=" + palabra));
                                 resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra  mal escrita. Correcion=" + dic));
                                }else{
                                    if(!esdrujulas){
                                        resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal escrita. palabra=" + palabra));
                                        resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal escrita. Correcion=" + dic));
                                    }
                                 }
                            }
                        }
                                                
                        //resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra mal escrita. Correcion=" + dic));
                    }
                 
                },
                () -> {
                    textoCorregido.append(palabra).append(" ");
                    //resultado.getErrores().add(new ErrorCorreccion(palabra,"Palabra desconocida. palabra=" + palabra));
                   
                });
        });
                   
        return textoCorregido.toString();
    }
    
     public String obtenerTextoCorregidoPorOraciones(String texto) {
        StringBuilder textoCorregido = new StringBuilder();
        String [] oraciones = texto.split(SENTENCE_REGEX);
        
        String errorPunto = "^([A-Z]{1})(\\w|\\s)+([.])$";
        Pattern patron = Pattern.compile(errorPunto);
        
        for(String oracion : oraciones){
            Matcher error = patron.matcher(oracion);
            boolean esCoincidente = error.find();
            oracion = convertirMayuscula(oracion);
            if (!esCoincidente) {
                oracion = oracion.concat(".");
                textoCorregido.append(" "+oracion);
                resultado.getErrores().add(new ErrorCorreccion(oracion,"Oracion sin punto final. Correcion=" + oracion));
            }
        }
        return textoCorregido.toString();
    }



    private static List<String> obtenerDiccionario() {
        InputStream is = Correccion.class.getResourceAsStream(DICCIONARIO_FILE);
        if(is == null){
            System.out.print("No se ha podido cargar");
        }
        JSONTokener json = new JSONTokener(is);
        JSONObject object = new JSONObject(json);

        return object.keySet().stream().map(object::getString).collect(Collectors.toList());
    }


}
