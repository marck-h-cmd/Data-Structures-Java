package app;

public class FrmEjercicio06 extends javax.swing.JFrame {

    public FrmEjercicio06() {
        initComponents();
        setLocationRelativeTo(null);
         setSize(400,300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblX = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setText("Valor de X");
        lblX.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 90, -1));

        lblPotencia.setText("Potencia");
        lblPotencia.setPreferredSize(new java.awt.Dimension(150, 25));
        getContentPane().add(lblPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 80, -1));

        txtResultado.setEditable(false);
        txtResultado.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, -1));

        txtX.setPreferredSize(new java.awt.Dimension(64, 25));
        getContentPane().add(txtX, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 22));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 30));

        btnSalir.setText("SALIR");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 22));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 40));

        btnCalcular.setText("CALCULAR");
        btnCalcular.setPreferredSize(new java.awt.Dimension(100, 22));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        lblN.setText("Valor de N");
        getContentPane().add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
        getContentPane().add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(txtX.getText());
         int n = Integer.parseInt(txtN.getText());
        Matematica ma = new Matematica(x,n);
        txtResultado.setText(String.valueOf(ma.calcularPotencia()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtX.setText("");
         txtN.setText("");
        txtResultado.setText("");
        txtX.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblX;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables
}
