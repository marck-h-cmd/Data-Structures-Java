package ordenamiento.ejercicio02;

import javax.swing.table.DefaultTableModel;

public class FrmEjercicio07 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VectorEmpleados vector = new VectorEmpleados();
    
    public FrmEjercicio07() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEdad = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNVentas = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtNVentas = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEdad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEdad.setText("EDAD:");
        lblEdad.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, -1));

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNombre.setText("NOMBRE:");
        lblNombre.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, -1));

        btnOrdenar.setText("Ordenar");
        btnOrdenar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 100, -1));

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
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 450, 200));

        lblNVentas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNVentas.setText("MONTO VENTAS");
        lblNVentas.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 30));

        txtNVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNVentasActionPerformed(evt);
            }
        });
        jPanel1.add(txtNVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 26, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        float nVentas = Float.parseFloat(txtNVentas.getText());
        
        txtNombre.setText("");
        txtEdad.setText("");
        txtNVentas.setText("");
        txtNombre.requestFocus();
        
        Empleado x = new Empleado(nombre, edad, nVentas);
        vector.agregar(x);
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        vector.sortVentasByInsercion();
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNVentasActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNVentas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNVentas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
