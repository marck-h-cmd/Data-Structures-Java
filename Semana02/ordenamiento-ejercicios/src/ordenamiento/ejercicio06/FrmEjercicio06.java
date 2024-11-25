package ordenamiento.ejercicio06;


import javax.swing.table.DefaultTableModel;

public class FrmEjercicio06 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VectorPersonas vector = new VectorPersonas();
    
    public FrmEjercicio06() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumeroDeTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNumeroDeTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnOrdenar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumeroDeTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumeroDeTelefono.setText("NÚMERO DE TELÉFONO:");
        lblNumeroDeTelefono.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNumeroDeTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, -1));

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNombre.setText("NOMBRE:");
        lblNombre.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        txtNumeroDeTelefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNumeroDeTelefono.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtNumeroDeTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String numeroDeTelefono = txtNumeroDeTelefono.getText();
        
        txtNombre.setText("");
        txtNumeroDeTelefono.setText("");
        txtNombre.requestFocus();
        
        Persona x = new Persona(nombre, numeroDeTelefono);
        vector.agregar(x);
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        vector.mergeSortNombre();
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDeTelefono;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroDeTelefono;
    // End of variables declaration//GEN-END:variables
}
