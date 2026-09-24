/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import entidades.DeTodoSA;
import entidades.Producto;

/**
 *
 * @author domin
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }
        private void abrirGestionProductos() {
         GestionDeProductos gp = new GestionDeProductos();
        jDesktopPane1.add(gp);
        gp.setVisible(true);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jmenu1 = new javax.swing.JMenu();
        itemGestionProductos = new javax.swing.JMenuItem();
        Jmenu2 = new javax.swing.JMenu();
        itemConsultaRubro = new javax.swing.JMenuItem();
        itemConsultaNombre = new javax.swing.JMenuItem();
        itemConsultaPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        Jmenu1.setText("Administracion");

        itemGestionProductos.setText("Gestión de Productos");
        itemGestionProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGestionProductosActionPerformed(evt);
            }
        });
        Jmenu1.add(itemGestionProductos);

        jMenuBar1.add(Jmenu1);

        Jmenu2.setText("Consultas");

        itemConsultaRubro.setText("Consulta por Rubro");
        itemConsultaRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaRubroActionPerformed(evt);
            }
        });
        Jmenu2.add(itemConsultaRubro);

        itemConsultaNombre.setText("Consulta por Nombre");
        itemConsultaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaNombreActionPerformed(evt);
            }
        });
        Jmenu2.add(itemConsultaNombre);

        itemConsultaPrecio.setText("Consulta por Precio");
        itemConsultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaPrecioActionPerformed(evt);
            }
        });
        Jmenu2.add(itemConsultaPrecio);

        jMenuBar1.add(Jmenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemGestionProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestionProductosActionPerformed
                              abrirGestionProductos();


    }//GEN-LAST:event_itemGestionProductosActionPerformed

    private void itemConsultaRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaRubroActionPerformed
                ConsultaPorRubro cr = new ConsultaPorRubro();
                 jDesktopPane1.add(cr);
                  cr.setVisible(true);
    }//GEN-LAST:event_itemConsultaRubroActionPerformed

    private void itemConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaNombreActionPerformed
                ConsultaPorNombre cn = new ConsultaPorNombre();
                 jDesktopPane1.add(cn);
                     cn.setVisible(true);
    }//GEN-LAST:event_itemConsultaNombreActionPerformed

    private void itemConsultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaPrecioActionPerformed
            ConsultaPorPrecio cp = new ConsultaPorPrecio();
             jDesktopPane1.add(cp);
               cp.setVisible(true);
    }//GEN-LAST:event_itemConsultaPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jmenu1;
    private javax.swing.JMenu Jmenu2;
    private javax.swing.JMenuItem itemConsultaNombre;
    private javax.swing.JMenuItem itemConsultaPrecio;
    private javax.swing.JMenuItem itemConsultaRubro;
    private javax.swing.JMenuItem itemGestionProductos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
