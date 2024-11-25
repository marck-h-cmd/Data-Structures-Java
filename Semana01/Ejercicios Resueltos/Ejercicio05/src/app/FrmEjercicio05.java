package app;

public class FrmEjercicio05 extends javax.swing.JFrame {

    public FrmEjercicio05() {
        initComponents();
        setLocationRelativeTo(null);
         setSize(400,300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        txtNum1 = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblNum2 = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setText("NUMERO 1");
        lblNumero.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, -1));

        lblResultado.setText("M.C.D");
        lblResultado.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, -1));

        txtResultado.setEditable(false);
        txtResultado.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, -1));

        txtNum1.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 110, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 22));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, 30));

        btnSalir.setText("SALIR");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 22));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, 40));

        btnCalcular.setText("CALCULAR");
        btnCalcular.setPreferredSize(new java.awt.Dimension(100, 22));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        lblNum2.setText("NUMERO 2 ");
        getContentPane().add(lblNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        getContentPane().add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int n1 = Integer.parseInt(txtNum1.getText());
         int n2 = Integer.parseInt(txtNum2.getText());
        NumerosEnteros nums = new NumerosEnteros(n1,n2);
        txtResultado.setText(String.valueOf(nums.mcd()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNum1.setText("");
         txtNum2.setText("");
        txtResultado.setText("");
        txtNum1.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
