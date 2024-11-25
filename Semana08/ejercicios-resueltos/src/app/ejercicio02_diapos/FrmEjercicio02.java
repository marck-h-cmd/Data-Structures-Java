package app.ejercicio02_diapos;

import javax.swing.*;

public class FrmEjercicio02 extends javax.swing.JFrame {

    public FrmEjercicio02() {

        initComponents();
        setLocationRelativeTo(null);
        setSize(500, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        txtPalabra = new javax.swing.JTextField();
        btnLibro = new javax.swing.JButton();
        btnPalindromo3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 150, 30));

        txtPalabra.setBorder(javax.swing.BorderFactory.createTitledBorder("Palabra"));
        txtPalabra.setPreferredSize(new java.awt.Dimension(70, 25));
        txtPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabraKeyTyped(evt);
            }
        });
        getContentPane().add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 50));

        btnLibro.setText("Limpiar");
        btnLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 150, 30));

        btnPalindromo3.setText("Palindromo");
        btnPalindromo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalindromo3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalindromo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPalabraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalabraKeyTyped
        // TODO add your handling code here:
        /*    char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();   */
    }//GEN-LAST:event_txtPalabraKeyTyped

    private void btnLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibroActionPerformed
        // TODO add your handling code here:
        txtPalabra.setText("");

    }//GEN-LAST:event_btnLibroActionPerformed

    private void btnPalindromo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalindromo3ActionPerformed
        // TODO add your handling code here:

        if (!txtPalabra.getText().isEmpty()) {
            if (esPalindromo(txtPalabra.getText())) {
                JOptionPane.showMessageDialog(null, "Es palindromo");
            } else {
                JOptionPane.showMessageDialog(null, "No es palindromo ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }


    }//GEN-LAST:event_btnPalindromo3ActionPerformed

    public boolean esPalindromo(String palabra) {
        Pila<Character> pc = new Pila<>();
        int i, n = palabra.length();
        char car, car2;

        for (i = 0; i < n; i++) {
            car = palabra.charAt(i);
            pc.push(car);
        }

        for (i = 0; i < n; i++) {
            car2 = palabra.charAt(i);

            if (car2 != pc.pop()) {
                return false;
            }
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibro;
    private javax.swing.JButton btnPalindromo3;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
