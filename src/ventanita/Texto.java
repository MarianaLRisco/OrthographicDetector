package ventanita;

import com.inet.jortho.FileUserDictionary;
import com.inet.jortho.SpellChecker;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
import ventanita.modelo.ErrorCorreccion;
import ventanita.modelo.Resultado;
import ventanita.util.Correccion;
import java.util.regex.Pattern;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */

public class Texto extends javax.swing.JFrame {
    int xMouse, yMouse;
    public Texto() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/imagenes/libromine.png")));
        SpellChecker.setUserDictionaryProvider(new FileUserDictionary());
        SpellChecker.registerDictionaries(null,null);
        SpellChecker.register(textErrores);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        background = new javax.swing.JPanel();
        Detector = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        libros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textIntro = new javax.swing.JTextArea();
        intro = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JPanel();
        aceptar = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        limpiar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textErrores = new javax.swing.JTextArea();
        jexit = new javax.swing.JPanel();
        equis = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jmin = new javax.swing.JPanel();
        min = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Detector.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        Detector.setForeground(new java.awt.Color(255, 255, 255));
        Detector.setText("D");
        background.add(Detector, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, 50));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, 70));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("T");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("T");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("O");
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("R");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/fondoLibro3.jpeg"))); // NOI18N
        libros.setText("jLabel1");
        background.add(libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 250, 530));

        textIntro.setBackground(new java.awt.Color(234, 236, 231));
        textIntro.setColumns(30);
        textIntro.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        textIntro.setForeground(new java.awt.Color(102, 102, 102));
        textIntro.setLineWrap(true);
        textIntro.setRows(5);
        textIntro.setText(" Ingrese texto");
        textIntro.setWrapStyleWord(true);
        textIntro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        textIntro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textIntroMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(textIntro);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 520, 210));

        intro.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        intro.setForeground(new java.awt.Color(204, 204, 204));
        intro.setText("Con este programa vas a poder corregir tu texto ¡Deja que Detector haga su magia!");
        background.add(intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(0, 187, 232));

        aceptar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptar.setText("ACEPTAR");
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAceptarLayout = new javax.swing.GroupLayout(btnAceptar);
        btnAceptar.setLayout(btnAceptarLayout);
        btnAceptarLayout.setHorizontalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnAceptarLayout.setVerticalGroup(
            btnAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        background.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 120, 50));

        btnLimpiar.setBackground(new java.awt.Color(0, 187, 232));

        limpiar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limpiar.setText("LIMPIAR");
        limpiar.setToolTipText("");
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limpiarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        background.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 120, 50));

        textErrores.setBackground(new java.awt.Color(234, 236, 231));
        textErrores.setColumns(20);
        textErrores.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        textErrores.setForeground(new java.awt.Color(102, 102, 102));
        textErrores.setLineWrap(true);
        textErrores.setRows(5);
        textErrores.setText(" Mostrando errores");
        textErrores.setWrapStyleWord(true);
        textErrores.setBorder(null);
        jScrollPane2.setViewportView(textErrores);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 520, 90));

        jexit.setBackground(new java.awt.Color(153, 153, 153));

        equis.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        equis.setForeground(new java.awt.Color(51, 51, 51));
        equis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equis.setText("X ");
        equis.setToolTipText("");
        equis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jexitLayout = new javax.swing.GroupLayout(jexit);
        jexit.setLayout(jexitLayout);
        jexitLayout.setHorizontalGroup(
            jexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jexitLayout.setVerticalGroup(
            jexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(equis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(jexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 50, 30));

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 50));

        jmin.setBackground(new java.awt.Color(153, 153, 153));

        min.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        min.setForeground(new java.awt.Color(51, 51, 51));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("_");
        min.setToolTipText("");
        min.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jminLayout = new javax.swing.GroupLayout(jmin);
        jmin.setLayout(jminLayout);
        jminLayout.setHorizontalGroup(
            jminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jminLayout.setVerticalGroup(
            jminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(jmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseEntered
        btnLimpiar.setBackground(new Color(0,207,255));
    }//GEN-LAST:event_limpiarMouseEntered

    private void aceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseEntered
        btnAceptar.setBackground(new Color(0,207,255));
    }//GEN-LAST:event_aceptarMouseEntered

    private void aceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseExited
        btnAceptar.setBackground(new Color(0,187,232));
    }//GEN-LAST:event_aceptarMouseExited

    private void limpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseExited
        btnLimpiar.setBackground(new Color(0,187,232));
    }//GEN-LAST:event_limpiarMouseExited

    private void textIntroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textIntroMousePressed
        if(textIntro.getText().equals(" Ingrese texto")){
            textIntro.setText(" ");
            textIntro.setForeground(Color.black);
        }
    }//GEN-LAST:event_textIntroMousePressed

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        if(!(textIntro.getText().equals(" Ingrese texto"))){
            textIntro.setText(" ");
            if(!(textErrores.getText().equals(" Mostrando errores"))){
                textErrores.setText(" ");
            }
        }
          
        if (textIntro.getText().equals(" ") && textErrores.getText().equals(" ")){
            textIntro.setForeground(Color.gray);
            textErrores.setForeground(Color.gray);
            textIntro.setText(" Ingrese texto");
            textErrores.setText(" Mostrando errores");
        }
        
    }//GEN-LAST:event_limpiarMouseClicked

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
        String texto = textIntro.getText();
        Correccion correccion = new Correccion(texto);
        Resultado corregido = correccion.obtenerCorrecion();
        String[] errores = corregido.getErrores().stream().map(ErrorCorreccion::getMsgError).toArray(String[]::new);
        textErrores.setText("");
        textErrores.setText(corregido.getTextoCorregido());
       
        JOptionPane.showMessageDialog(null,errores,"Corrigiendo errores esenciales",JOptionPane.INFORMATION_MESSAGE);
       
        textErrores.setForeground(Color.black);
       
    }//GEN-LAST:event_aceptarMouseClicked

    private void equisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisMouseEntered
        jexit.setBackground(new Color(0,187,232));
        jexit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        equis.setForeground(Color.white);
    }//GEN-LAST:event_equisMouseEntered

    private void equisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisMouseExited
        jexit.setBackground(new Color(153,153,153));
        equis.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_equisMouseExited

    private void equisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisMouseClicked
        System.exit(0);
    }//GEN-LAST:event_equisMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        jmin.setBackground(new Color(0,187,232));
        jmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        min.setForeground(Color.white);
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        jmin.setBackground(new Color(153,153,153));
        min.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_minMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Texto().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Detector;
    private javax.swing.JLabel aceptar;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnAceptar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JLabel equis;
    private javax.swing.JPanel header;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jexit;
    private javax.swing.JPanel jmin;
    private javax.swing.JLabel libros;
    private javax.swing.JLabel limpiar;
    private javax.swing.JLabel min;
    private javax.swing.JTextArea textErrores;
    private javax.swing.JTextArea textIntro;
    // End of variables declaration//GEN-END:variables

}
