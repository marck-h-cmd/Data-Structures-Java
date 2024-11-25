package app;

public class FrmEjercicio01 extends javax.swing.JFrame {

    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
         setSize(400,300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero = new javax.swing.JLabel();
        lblFactorial = new javax.swing.JLabel();
        txtFactorial = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setText("NUMERO");
        lblNumero.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, -1));

        lblFactorial.setText("Factorial");
        lblFactorial.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, -1));

        txtFactorial.setEditable(false);
        txtFactorial.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, -1));

        txtNumero.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 22));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 30));

        btnSalir.setText("SALIR");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 22));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 40));

        btnCalcular.setText("CALCULAR");
        btnCalcular.setPreferredSize(new java.awt.Dimension(100, 22));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txtNumero.getText());
        NumeroEntero ne = new NumeroEntero(n);
        txtFactorial.setText(String.valueOf(ne.calcularFactorial()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNumero.setText("");
        txtFactorial.setText("");
        txtNumero.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblFactorial;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JTextField txtFactorial;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
