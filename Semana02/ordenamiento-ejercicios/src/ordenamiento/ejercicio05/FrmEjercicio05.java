package ordenamiento.ejercicio05;

import javax.swing.table.DefaultTableModel;

public class FrmEjercicio05 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VectorAlumnos vector = new VectorAlumnos();
    
    public FrmEjercicio05() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumeroDeTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnOrdenarNota = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnOrdenarNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumeroDeTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumeroDeTelefono.setText("NOTA:");
        lblNumeroDeTelefono.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNumeroDeTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, -1));

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNombre.setText("NOMBRE:");
        lblNombre.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        txtNota.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNota.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));
        txtNota.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 85, 140, 40));

        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        txtNombre.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 35, 140, 40));

        btnOrdenarNota.setText("Ordenar Merito");
        btnOrdenarNota.setPreferredSize(new java.awt.Dimension(170, 25));
        btnOrdenarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNotaActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 190, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 100, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 100, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 450, 200));

        btnOrdenarNombre.setText("Ordenar Alfabetico");
        btnOrdenarNombre.setPreferredSize(new java.awt.Dimension(170, 25));
        btnOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombreActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        float nota = Float.parseFloat(txtNota.getText());
        
        txtNombre.setText("");
        txtNota.setText("");
        txtNombre.requestFocus();
        
        Alumno x = new Alumno(nombre, nota);
        vector.agregar(x);
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnOrdenarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNotaActionPerformed
        vector.quickSortMerito();
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarNotaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombreActionPerformed
        vector.quickSortAlfabetico();
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarNombreActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnOrdenarNombre;
    private javax.swing.JButton btnOrdenarNota;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDeTelefono;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
