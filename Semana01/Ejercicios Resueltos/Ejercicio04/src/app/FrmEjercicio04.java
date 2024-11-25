package app;

public class FrmEjercicio04 extends javax.swing.JFrame {

    public FrmEjercicio04() {
        initComponents();
        setLocationRelativeTo(null);
         setSize(400,300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNValue = new javax.swing.JLabel();
        lblTermino = new javax.swing.JLabel();
        txtTermino = new javax.swing.JTextField();
        txtNvalue = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNValue.setText("Valor de N");
        lblNValue.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblNValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, -1));

        lblTermino.setText("Termino de Serie");
        lblTermino.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, -1));

        txtTermino.setEditable(false);
        txtTermino.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        txtNvalue.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtNvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 110, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 22));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, 30));

        btnSalir.setText("SALIR");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 22));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 40));

        btnCalcular.setText("CALCULAR");
        btnCalcular.setPreferredSize(new java.awt.Dimension(100, 22));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txtNvalue.getText());
       
        Fibonacci fi = new Fibonacci(n);
        txtTermino.setText(String.valueOf(String.valueOf(fi.calcularTermino())));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNvalue.setText("");
        txtTermino.setText("");
        txtNvalue.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblNValue;
    private javax.swing.JLabel lblTermino;
    private javax.swing.JTextField txtNvalue;
    private javax.swing.JTextField txtTermino;
    // End of variables declaration//GEN-END:variables
}
