package ordenamiento.ejercicio03;

import javax.swing.table.DefaultTableModel;

public class FrmEjercicio03 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VectorMedicamentos vector = new VectorMedicamentos();
    
    public FrmEjercicio03() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnOrdenarPrecio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblLaboratorio = new javax.swing.JLabel();
        txtLaboratorio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnOrdenarNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCodigo.setText("CÓDIGO:");
        lblCodigo.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, -1));

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNombre.setText("NOMBRE:");
        lblNombre.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, -1));

        txtCodigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, -1));

        btnOrdenarPrecio.setText("Ordenar por Precio");
        btnOrdenarPrecio.setPreferredSize(new java.awt.Dimension(170, 25));
        btnOrdenarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 100, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 100, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 450, 250));

        lblLaboratorio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblLaboratorio.setText("LABORATORIO:");
        lblLaboratorio.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, -1));

        txtLaboratorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtLaboratorio.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, -1));

        lblPrecio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPrecio.setText("PRECIO:");
        lblPrecio.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 180, -1));

        txtPrecio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtPrecio.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, -1));

        btnOrdenarNombre.setText("Ordenar por Nombre");
        btnOrdenarNombre.setPreferredSize(new java.awt.Dimension(170, 25));
        btnOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombreActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String laboratorio = txtLaboratorio.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        
        txtCodigo.setText("");
        txtNombre.setText("");
        txtLaboratorio.setText("");
        txtPrecio.setText("");
        txtCodigo.requestFocus();
        
        Medicamento x = new Medicamento(codigo, nombre, laboratorio, precio);
        vector.agregar(x);
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnOrdenarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPrecioActionPerformed
      
        vector.sortPrecioBySeleccion();
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarPrecioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombreActionPerformed
          vector.sortNombreBySeleccion();
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarNombreActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnOrdenarNombre;
    private javax.swing.JButton btnOrdenarPrecio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblLaboratorio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
