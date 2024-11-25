package app.ejercicio01_diapos;


import javax.swing.*;

public class FrmEjercicio01 extends javax.swing.JFrame {



    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(500, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        txtPalabra = new javax.swing.JTextField();
        btnParentesis = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 150, 30));

        txtPalabra.setBorder(javax.swing.BorderFactory.createTitledBorder("Expresion"));
        txtPalabra.setPreferredSize(new java.awt.Dimension(70, 25));
        txtPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabraKeyTyped(evt);
            }
        });
        getContentPane().add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 50));

        btnParentesis.setText("Parentesis");
        btnParentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesisActionPerformed(evt);
            }
        });
        getContentPane().add(btnParentesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 150, 30));

        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(txtLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 150, 30));

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

    private void btnParentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesisActionPerformed
        // TODO add your handling code here:
     if(!txtPalabra.getText().isEmpty()){
           if (verificarParentesis(txtPalabra.getText())) {
                JOptionPane.showMessageDialog(null, "Los parentesis estan colocados correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Los parentesis no estan colocado correctamente ");
            }
    }else{
             JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
     }

         


    }//GEN-LAST:event_btnParentesisActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        // TODO add your handling code here:
        
        txtPalabra.setText("");
    }//GEN-LAST:event_txtLimpiarActionPerformed

    public boolean verificarParentesis(String expresion) {
        Pila<Character> pc = new Pila<>();
        int i, n = expresion.length();
        char car;
        for (i = 0; i < n; i++) {
            car = expresion.charAt(i);

            if (car == '(') {
                pc.push(car);
            } else if (car == ')') {
                if (pc.isEmpty()) {
                    return false;
                } else {
                    pc.pop();
                }
            }
        }
        return pc.isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnParentesis;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
