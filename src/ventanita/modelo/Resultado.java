package ventanita.modelo;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

    private String textoCorregido;
    private List<ErrorCorreccion> errores;

    public Resultado() {
        this.errores = new ArrayList<>();
    }

    public String getTextoCorregido() {
        return textoCorregido;
    }
     
    public String errores() {
        return textoCorregido;
    }

    public void setTextoCorregido(String textoCorregido) {
        this.textoCorregido = textoCorregido;
    }

    public List<ErrorCorreccion> getErrores() {
        return errores;
    }    

    public void setErrores(List<ErrorCorreccion> errores) {
        this.errores = errores;
    }
}
