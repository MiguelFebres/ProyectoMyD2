/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import proyecto2Miguel.Monticulo_Bin;
import proyecto2Miguel.TablaDeDispersion;
import proyecto2Miguel.Usuario;

public class VentanaDocumentos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaUsuarios
     */
    
    public static Monticulo_Bin monticulo_docs;
    public static TablaDeDispersion tabla_usuarios;


    public VentanaDocumentos(TablaDeDispersion tabla,Monticulo_Bin monticulo) {
        initComponents();
        this.setVisible(true);

        this.tabla_usuarios = tabla;
        this.monticulo_docs = monticulo;
        this.reg.setText(tabla_usuarios.usuarios_textArea(""));

    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reg = new javax.swing.JTextArea();
        usuario = new javax.swing.JTextField();
        elimDOC = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 310, 40));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 310, 40));
        jPanel1.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 310, 40));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 310, 40));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 740, -1, -1));

        reg.setColumns(20);
        reg.setRows(5);
        jScrollPane2.setViewportView(reg);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 430, 590));

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 340, 250, 40));
        jPanel1.add(elimDOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 250, 40));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 560, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo del Documento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ELIMINAR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Título del Documento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tamaño del Documento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre de usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Título del Documento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DOCUMENTOS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CREAR");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre de usuario:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 290, -1, -1));

        salir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(102, 102, 255));
        salir.setText("Regresar");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        boolean error = false;
        try{
            int stam = Integer.parseInt(this.size.getText());
        }catch(Exception e){
            error = true;
            JOptionPane.showMessageDialog(rootPane, "El tamaño debe ser un numero entero");
        }
        if(!error){
            String usern = this.username.getText().toLowerCase();
            String title = this.title.getText().toLowerCase();
            Usuario q = tabla_usuarios.buscar_usuario(usern);

            if (!q.getNombre_usuario().equals("")){
                int time = Tiempo.segundos;
                if(q.getPrioridad() == "prioridad_alta"){
                    time-= Tiempo.segundos*0.66;
                }
                else if (q.getPrioridad() == "prioridad_media"){
                    time -= Tiempo.segundos*0.33;
                }
                q.crearDocumento(this.title.getText().toLowerCase(), Integer.parseInt(this.size.getText()), this.type.getText(), time);
                JOptionPane.showMessageDialog(rootPane, "Documento Registrado Exitosamente", "Crear Documento", HEIGHT);
                this.dispose();
                Menu m = new Menu(monticulo_docs, tabla_usuarios);
                m.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Documento no registrado", "Crear Documento", HEIGHT);

            }}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String usern = this.usuario.getText().toLowerCase();
        String title = this.elimDOC.getText().toLowerCase();
        boolean q = tabla_usuarios.borrar_documento(usern, title);
        if (q){
            JOptionPane.showMessageDialog(rootPane, "Documento Eliminado Exitosamente", "Crear Usuario", HEIGHT);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Documento no encontrado", "Crear Usuario", HEIGHT);
        }

        this.reg.setText(tabla_usuarios.usuarios_textArea(""));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu(monticulo_docs,  tabla_usuarios);
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDocumentos(tabla_usuarios,  monticulo_docs).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField elimDOC;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea reg;
    private javax.swing.JButton salir;
    private javax.swing.JTextField size;
    private javax.swing.JTextField title;
    private javax.swing.JTextField type;
    private javax.swing.JTextField username;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}