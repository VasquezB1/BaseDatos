/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Vista;

import ec.edu.ups.controladores.ControladorDireccion;
import ec.edu.ups.controladores.ControladorPersona;
import ec.edu.ups.ventanas.ActualizarPersona;
import ec.edu.ups.ventanas.BuscarPersona;
import ec.edu.ups.ventanas.CrearDireccion;
import ec.edu.ups.ventanas.CrearPersona;
import ec.edu.ups.ventanas.EliminarPersona;
import ec.edu.ups.ventanas.ListarPersona;
import javax.swing.JOptionPane;

/**
 *
 * @author Byron PC
 */
public class BaseDatos extends javax.swing.JFrame {
    private ControladorPersona controladorPersona;
    private ControladorDireccion controladorDireccion;
    private CrearPersona crearPersona;
    private BuscarPersona buscarPersona;
    private EliminarPersona eliminarPersona;
    private ActualizarPersona actualizarPersona;
    private ListarPersona listarPersona;
    private CrearDireccion crearDireccion;
    /**
     * Creates new form BaseDatos
     */
    public BaseDatos() {
        
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        controladorDireccion= new ControladorDireccion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Persona");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Actualizar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Listar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Direcciones");

        jMenuItem6.setText("Crear");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Buscar");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Actualizar");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Eliminar");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Listar");
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String x = CrearPersona.x;
        try{
             if(x ==null){
                 if (crearPersona == null || crearPersona.isVisible() == false) {
            crearPersona = new CrearPersona();
            crearPersona.setVisible(true);
            DesktopPane.add(crearPersona);
            DesktopPane.moveToFront(crearPersona);
             }
         }else{
                  JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
             }
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        String x = BuscarPersona.x;
        try{
             if(x ==null){
                 if (buscarPersona == null || buscarPersona.isVisible() == false) {
            buscarPersona = new BuscarPersona();
            buscarPersona.setVisible(true);
            DesktopPane.add(buscarPersona);
            DesktopPane.moveToFront(buscarPersona);
             }
         }else{
                  JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
             }
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        String x = EliminarPersona.x;
        try{
             if(x ==null){
                 if (eliminarPersona == null || eliminarPersona.isVisible() == false) {
            eliminarPersona = new EliminarPersona();
            eliminarPersona.setVisible(true);
            DesktopPane.add(eliminarPersona);
            DesktopPane.moveToFront(eliminarPersona);
             }
         }else{
                  JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
             }
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         String x = ActualizarPersona.x;
        try{
             if(x ==null){
                 if (actualizarPersona == null || actualizarPersona.isVisible() == false) {
            actualizarPersona = new ActualizarPersona();
            actualizarPersona.setVisible(true);
            DesktopPane.add(actualizarPersona);
            DesktopPane.moveToFront(actualizarPersona);
             }
         }else{
                  JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
             }
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         String x = ListarPersona.x;
        try{
             if(x ==null){
                 if (listarPersona == null || listarPersona.isVisible() == false) {
            listarPersona = new ListarPersona();
            listarPersona.setVisible(true);
            DesktopPane.add(listarPersona);
            DesktopPane.moveToFront(listarPersona);
             }
         }else{
                  JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
             }
        
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        String x = CrearDireccion.x;
        try{
             if(x ==null){
                 if (crearDireccion == null || crearDireccion.isVisible() == false) {
            crearDireccion = new CrearDireccion();
            crearDireccion.setVisible(true);
            DesktopPane.add(crearDireccion);
            DesktopPane.moveToFront(crearDireccion);
             }
         }else{
                  JOptionPane.showMessageDialog(rootPane, "La ventana esta en ejecucion");
             }
        
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
