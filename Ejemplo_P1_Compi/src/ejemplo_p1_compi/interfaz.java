/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplo_p1_compi;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Us
 */
public class interfaz extends javax.swing.JFrame {
    private File ArchivoAbierto;  //agregar la variable
    public interfaz() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Entrada = new javax.swing.JTextArea();
        Nuevo = new javax.swing.JButton();
        Ejecutar = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Guardar_Como = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Entrada.setColumns(20);
        Entrada.setRows(5);
        jScrollPane1.setViewportView(Entrada);

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        Reportes.setText("Reportes");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Consola");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Entrada");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Guardar_Como.setText("Guardar Como");
        Guardar_Como.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_ComoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(374, 374, 374))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(Ejecutar)
                        .addGap(18, 18, 18)
                        .addComponent(Reportes)
                        .addGap(26, 26, 26)
                        .addComponent(Guardar)
                        .addGap(26, 26, 26)
                        .addComponent(Guardar_Como)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo)
                    .addComponent(Ejecutar)
                    .addComponent(Reportes)
                    .addComponent(Guardar)
                    .addComponent(Guardar_Como))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

             File file = ArchivoAbierto; // tomo el archivo que acabo de abrir
             String text = Entrada.getText(); // tomo lo que acabo de escribir en el editor de texto 
 
            try (PrintWriter nuevocontenido = new PrintWriter(file,StandardCharsets.UTF_8)){ // Se crea un nuevo PrintWriter llamado 'out' para escribir en el archivo.
                // 'file' es el archivo en el que se va a escribir.
                // Se utiliza la codificación UTF-8 para asegurar el manejo correcto de caracteres especiales.
                        nuevocontenido.print (text);
                        JOptionPane.showMessageDialog(null,"El archivo se escribio correctamente ");
            }
            catch (IOException e) {
                e.printStackTrace();
            }

    }//GEN-LAST:event_GuardarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
   JFileChooser fileChooser = new JFileChooser();     //usar un file choser para abrir el archivo 
       int seleccion = fileChooser.showSaveDialog(Entrada); 
       if (seleccion == JFileChooser.APPROVE_OPTION){
           String contenidoArchivo= "";   //se crea una variable para tener el contenido del archivo 
            ArchivoAbierto= fileChooser.getSelectedFile();  //el archivo avierto se guarda en la variable
           try {
               Scanner input = new Scanner(ArchivoAbierto);  // se parcea el contenido del archivo guardado en la variable y guarda el contenido en otra variable
               while (input.hasNextLine()){
                   contenidoArchivo += input.nextLine()+"\n";
               }
               input.close();
           }catch (Exception ex){
               ex.printStackTrace();
           }
           Entrada.setText(contenidoArchivo);//envia todo el contenido a la variable 
       }
    }//GEN-LAST:event_NuevoActionPerformed

    
    
    // desde aqui ---------------------------------------------------------------------------
    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
      //String entrada = "25"; // Puedes modificar esta entrada
    
    // Generar Analizadores
    String entradatexto = Entrada.getText();
   //analizadores("src/Analizador/", "lexico.jflex", "Sintactico.cup");   //deben de quitar colocar esto cargar y si no hay problema comentarlo y volver a ejecutar
    analizar(entradatexto);
    }//GEN-LAST:event_EjecutarActionPerformed

    public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
    
    
        // Realizar Analisis
    public static void analizar (String entrada){
        try {
            Analizador.Lexer lexer = new Analizador.Lexer(new StringReader(entrada)); 
            Analizador.Parser parser = new Analizador.Parser(lexer);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    } 
    //hasta aca !!!!!__________________________________________
    
    
    
    
    
    
    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportesActionPerformed

    private void Guardar_ComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_ComoActionPerformed
     if (!ArchivoAbierto.getAbsolutePath().endsWith(".ca")) {
                    ArchivoAbierto = new File(ArchivoAbierto.getAbsolutePath() + ".ca");
                }
                try {
                    // Crea un FileWriter para escribir en el archivo seleccionado
                    FileWriter writer = new FileWriter(ArchivoAbierto);

                    // Escribe el contenido del componente de GUI "Editor" en el archivo
                    writer.write(Entrada.getText());

                    // Cierra el FileWriter para finalizar la escritura en el archivo
                    writer.close();

                    // Actualiza el componente de GUI "consola" para mostrar un mensaje de éxito
                    JOptionPane.showMessageDialog(null,"El archivo se guardó con éxito el archivo ca");

                } catch (Exception ex) {
                    // Si ocurre una excepción durante la escritura, imprime la traza de la excepción para depuración
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_Guardar_ComoActionPerformed
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejecutar;
    private javax.swing.JTextArea Entrada;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Guardar_Como;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
