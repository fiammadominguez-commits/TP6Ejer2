package vistas;

import entidades.DeTodoSA;
import entidades.Producto;
import javax.swing.JOptionPane;

public class GestionDeProductos extends javax.swing.JInternalFrame {


    public GestionDeProductos() {

        initComponents();
            setClosable(true);
             setIconifiable(true);
               setMaximizable(true);
                 setResizable(true);
        String[] categorias = { "Comestibles", "Electrodomésticos", "Ropa", "Limpieza" };
                for (String categoria : categorias ) {

            ComboCategoria.addItem(categoria);
        }

    }
                    public boolean validarCamposVacios(javax.swing.JPanel panel) {
    for (java.awt.Component c : panel.getComponents()) {
        if (c instanceof javax.swing.JTextField) {
            javax.swing.JTextField txt = (javax.swing.JTextField) c;
            if (txt.getText().trim().isEmpty()) {
                return false;
            }
        }
    }
    return true;
}

        public void vaciarCampos(javax.swing.JPanel panel) {
    for (java.awt.Component c : panel.getComponents()) {
        if (c instanceof javax.swing.JTextField) {
            ((javax.swing.JTextField) c).setText("");
        }
        if (c instanceof javax.swing.JComboBox) {
            ((javax.swing.JComboBox) c).setSelectedIndex(-1);
        }
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Jtablas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        GeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboCategoria = new javax.swing.JComboBox<>();
        JNombre = new javax.swing.JLabel();
        JPrecio = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Jtablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Precio"
            }
        ));
        jScrollPane1.setViewportView(Jtablas);

        GeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        GeLabel.setText("GESTION DE PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel2.setText("Categoria");

        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });

        JNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        JNombre.setText("Nombre");

        JPrecio.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        JPrecio.setText("Precio ($)");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        botonAgregar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        botonAgregar.setText("AGREGAR PRODUCTO\n");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(JPrecio)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(JNombre)
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(botonAgregar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(GeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
       
        if (!validarCamposVacios(jPanel2)) {
    JOptionPane.showMessageDialog(this,
            "Debe completar todos los campos.",  "Error",  JOptionPane.WARNING_MESSAGE);
            return;
            }

        String categoria = ComboCategoria.getSelectedItem().toString();
        String nombre = txtNombre.getText().trim();
        String precioTexto = txtPrecio.getText().trim();

// Validar precio numérico
            double precio;
                try {
                 precio = Double.parseDouble(precioTexto);
            } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this,
            "El precio debe ser un número válido.",   "Error", JOptionPane.WARNING_MESSAGE);
    txtPrecio.requestFocus();
    return;
            }

// Crear producto (usa tu clase Producto)
        Producto nuevo = new Producto(DeTodoSA.listaProductos.size() + 1, nombre, precio, 0, categoria);

            if (!DeTodoSA.agregarProducto(nuevo)) {
    JOptionPane.showMessageDialog(this,
            "Ya existe un producto con ese código.",
            "Error",
            JOptionPane.WARNING_MESSAGE);
    return;
        }

//tabla
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) Jtablas.getModel();
        modelo.addRow(new Object[]{nombre, categoria, precio});

// Limpiar campos
        vaciarCampos(jPanel2);
        txtNombre.requestFocus();
   
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_ComboCategoriaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JLabel GeLabel;
    private javax.swing.JLabel JNombre;
    private javax.swing.JLabel JPrecio;
    private javax.swing.JTable Jtablas;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
