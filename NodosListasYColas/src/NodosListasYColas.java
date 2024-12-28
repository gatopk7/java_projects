/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.util.HashSet;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author gatopk
 */
public class NodosListasYColas extends javax.swing.JFrame {

    /**
     * Creates new form NodosListasYColas
     */
    public NodosListasYColas() {
        initComponents();
        setTitle("Nodos, Listas Y Colas");
        setLocationRelativeTo(null);
        jTDatos.setEditable(false);
    }

    private static Stack <Libro> pila; // Declaracion de pila
    private static Libro libro;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBSalir = new javax.swing.JButton();
        jBCrear = new javax.swing.JButton();
        jBApilar = new javax.swing.JButton();
        jBDesapilar = new javax.swing.JButton();
        jBMostrarSima = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBMostrar = new javax.swing.JButton();
        jBDestruir = new javax.swing.JButton();
        jTClave = new javax.swing.JTextField();
        jTTitulo = new javax.swing.JTextField();
        jTEditorial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBCrear.setText("Crear Pila");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });

        jBApilar.setText("Apilar");
        jBApilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApilarActionPerformed(evt);
            }
        });

        jBDesapilar.setText("Desapilar");
        jBDesapilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesapilarActionPerformed(evt);
            }
        });

        jBMostrarSima.setText("Mostrar Sima");
        jBMostrarSima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarSimaActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBMostrar.setText("Mostrar");
        jBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarActionPerformed(evt);
            }
        });

        jBDestruir.setText("Destruir");
        jBDestruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDestruirActionPerformed(evt);
            }
        });

        jLabel1.setText("Clave");

        jLabel2.setText("Titulo");

        jLabel3.setText("Editorial");

        jTDatos.setColumns(20);
        jTDatos.setRows(5);
        jScrollPane1.setViewportView(jTDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEditorial)
                            .addComponent(jTTitulo)
                            .addComponent(jTClave)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBMostrar)
                    .addComponent(jBMostrarSima)
                    .addComponent(jBDesapilar)
                    .addComponent(jBDestruir)
                    .addComponent(jBBuscar)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBCrear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBApilar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jTClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCrear)
                    .addComponent(jTTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBApilar)
                    .addComponent(jTEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBDesapilar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBMostrarSima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBMostrar)
                        .addGap(9, 9, 9)
                        .addComponent(jBDestruir))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarActionPerformed
        // TODO add your handling code here:
        if(pila != null){
            jTDatos.setText(null);
            String libros = "";
            for (Libro libro1 : pila) {        
                libros = libros + "\n" + libro1;
                //jTDatos.setText(libro1.toString()); 
                //System.out.println(libro1);               
            }
            jTDatos.setText(libros);
        }else{
            jTDatos.setText(null);
            jTDatos.setText("La pila no ha sido creada");      
        }
    }//GEN-LAST:event_jBMostrarActionPerformed

    private void jBDestruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDestruirActionPerformed
        // TODO add your handling code here:
        if(pila != null){
            pila = null;
            jTDatos.setText(null);
            jTDatos.setText("La pila ha sido borrada"); 
        }else{
            jTDatos.setText(null);
            jTDatos.setText("La pila no ha sido creada");            
        }   
    }//GEN-LAST:event_jBDestruirActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed
        // TODO add your handling code here:
        if(pila == null){
            
            pila = new Stack();
            jTDatos.setText(null);
            jTDatos.setText("Pila crada");            
        }else{
            jTDatos.setText(null);
            jTDatos.setText("La pila no ha sido creada");            
        }        
            
    }//GEN-LAST:event_jBCrearActionPerformed

    private void jBApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApilarActionPerformed
        // TODO add your handling code here:
        if(pila != null){
            
            libro = new Libro();

            libro.setClave(jTClave.getText());
            libro.setTitulo(jTTitulo.getText());
            libro.setEditorial(jTEditorial.getText());

            pila.push(libro);

            jTDatos.setText(null);
            jTDatos.setText("Libro añadido " + libro); 

            jTClave.setText(null);
            jTTitulo.setText(null);
            jTEditorial.setText(null);
        }else{
            jTDatos.setText(null);
            jTDatos.setText("La pila no ha sido creada"); 
        }
    }//GEN-LAST:event_jBApilarActionPerformed

    private void jBDesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesapilarActionPerformed
        // TODO add your handling code here:
         if(pila != null){
            libro = pila.pop();
            jTDatos.setText(null);
            jTDatos.setText("Libro desapilado: " + libro);
         }else{
            jTDatos.setText(null);
            jTDatos.setText("La pila no ha sido creada"); 
        }
    }//GEN-LAST:event_jBDesapilarActionPerformed

    private void jBMostrarSimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarSimaActionPerformed
        // TODO add your handling code here:
        if(pila != null){
            libro = pila.peek();
            jTDatos.setText(null);
            jTDatos.setText("Libro en la sima " + libro); 
        }else{
            jTDatos.setText(null);
            jTDatos.setText("La pila no ha sido creada"); 
        }
    }//GEN-LAST:event_jBMostrarSimaActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        if(pila != null){ 
            if(!(jTClave == null || jTClave.equals(" ") || jTClave.equals(""))){
                 libro = new Libro(jTClave.getText());
                int posicion = pila.search(libro);
                if(posicion < 0){
                     jTDatos.setText(null);
                    jTDatos.setText("Libro no encontnrado"); 
                }else{
                     jTDatos.setText(null);
                     jTDatos.setText("encontrado en la posicion " + posicion); 
                     jTDatos.setText(libro.toString()); 
                }   
            }else{
                jTDatos.setText(null);
                jTDatos.setText("La clave esta vacia"); 
            }
        }else{
            jTDatos.setText(null);
            jTDatos.setText("La pila no ha sido creada"); 
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NodosListasYColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NodosListasYColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NodosListasYColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NodosListasYColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NodosListasYColas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBApilar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBDesapilar;
    private javax.swing.JButton jBDestruir;
    private javax.swing.JButton jBMostrar;
    private javax.swing.JButton jBMostrarSima;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTClave;
    private javax.swing.JTextArea jTDatos;
    private javax.swing.JTextField jTEditorial;
    private javax.swing.JTextField jTTitulo;
    // End of variables declaration//GEN-END:variables
}