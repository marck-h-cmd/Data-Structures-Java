package ordenamiento.ejercicio04;

import javax.swing.table.DefaultTableModel;

public class FrmEjercicio04 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VectorLibros vector = new VectorLibros();
    
    public FrmEjercicio04() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        lblEditorial = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        btnOrdenarNombre = new javax.swing.JButton();
        lblNroPaginas = new javax.swing.JLabel();
        txtNroPaginas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCodigo.setText("CÓDIGO:");
        lblCodigo.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, -1));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTitulo.setText("TÍTULO:");
        lblTitulo.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 180, -1));

        txtCodigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 130, -1));

        txtTitulo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTitulo.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, -1));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 450, 200));

        lblAutor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblAutor.setText("AUTOR:");
        lblAutor.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, -1));

        txtAutor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtAutor.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, -1));

        lblEditorial.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEditorial.setText("EDITORIAL:");
        lblEditorial.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 180, -1));

        txtEditorial.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtEditorial.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, -1));

        btnOrdenarNombre.setText("Ordenar por Autor");
        btnOrdenarNombre.setPreferredSize(new java.awt.Dimension(170, 25));
        btnOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombreActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        lblNroPaginas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNroPaginas.setText("#PÁGINAS");
        lblNroPaginas.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNroPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 180, -1));

        txtNroPaginas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNroPaginas.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(txtNroPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo = txtCodigo.getText();
        String titulo = txtTitulo.getText();
        String autor = txtAutor.getText();
        String editorial = txtEditorial.getText();
        int nroPaginas = Integer.parseInt(txtNroPaginas.getText());
        
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtEditorial.setText("");
        txtNroPaginas.setText("");
        txtCodigo.requestFocus();
        
        Libro x = new Libro(codigo, titulo, autor, editorial, nroPaginas);
        vector.agregar(x);
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombreActionPerformed
        vector.sortNombreByShell();
        vector.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarNombreActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnOrdenarNombre;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblNroPaginas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtNroPaginas;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
