package ejercicios.ejercicioBicola;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio02 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    Bicolas bcl = new Bicolas();

    public FrmEjercicio02() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVector = new javax.swing.JList<>();
        btnEncolarFinal = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        btnUltimo = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnEmpty = new javax.swing.JButton();
        btnDesencolarFinal = new javax.swing.JButton();
        btnEncolarInicio = new javax.swing.JButton();
        btnFrente = new javax.swing.JButton();
        btnDesencolarInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector.setModel(modelo);
        jScrollPane1.setViewportView(lstVector);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 160));

        btnEncolarFinal.setText("Encolar Final");
        btnEncolarFinal.setPreferredSize(new java.awt.Dimension(80, 25));
        btnEncolarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncolarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 150, 30));

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnUltimo.setText("Ultimo");
        btnUltimo.setPreferredSize(new java.awt.Dimension(80, 25));
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 150, 30));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 40));

        btnEmpty.setText("Empty");
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, 30));

        btnDesencolarFinal.setText("Desencolar Final");
        btnDesencolarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesencolarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 150, 30));

        btnEncolarInicio.setText("Encolar Inicio");
        btnEncolarInicio.setPreferredSize(new java.awt.Dimension(80, 25));
        btnEncolarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncolarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 150, 30));

        btnFrente.setText("Frente");
        btnFrente.setPreferredSize(new java.awt.Dimension(80, 25));
        btnFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnFrente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, 30));

        btnDesencolarInicio.setText("Desencolar Inicio");
        btnDesencolarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesencolarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarFinalActionPerformed
        try {
            if (!txtNumero.getText().isEmpty()) {
                String valor = txtNumero.getText();
                txtNumero.setText("");
                txtNumero.requestFocus();
                bcl.encolarAlFinal(valor);
                bcl.mostrar(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }


    }//GEN-LAST:event_btnEncolarFinalActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if (!bcl.isEmpty()) {
            String u = String.valueOf(bcl.ultimo()) ;

            JOptionPane.showMessageDialog(null, " El ultimo es: " + u);
            bcl.mostrar(modelo);

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        // TODO add your handling code here:
        if (!bcl.isEmpty())
            JOptionPane.showMessageDialog(null, "El vector no está vacío");
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnDesencolarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarFinalActionPerformed
        // TODO add your handling code here:
        if (!bcl.isEmpty()) {
            String u = String.valueOf(bcl.desencolarAlFinal()) ;
            JOptionPane.showMessageDialog(null, "El numero: " + u + " ha sido eliminado ");
            bcl.mostrar(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnDesencolarFinalActionPerformed

    private void btnEncolarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarInicioActionPerformed
        // TODO add your handling code here:
        
      try {
            if (!txtNumero.getText().isEmpty()) {
                String valor = txtNumero.getText();
                txtNumero.setText("");
                txtNumero.requestFocus();
                bcl.encolarAlInicio(valor);
                bcl.mostrar(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }
    }//GEN-LAST:event_btnEncolarInicioActionPerformed

    private void btnFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenteActionPerformed
        // TODO add your handling code here:
        if (!bcl.isEmpty()) {
            String t = String.valueOf(bcl.frente()) ;

            JOptionPane.showMessageDialog(null, " El frente es: " + t);
            bcl.mostrar(modelo);

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnFrenteActionPerformed

    private void btnDesencolarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarInicioActionPerformed
        // TODO add your handling code here:
         if (!bcl.isEmpty()) {
            String i = String.valueOf(bcl.desencolarAlInicio()) ;
            JOptionPane.showMessageDialog(null, "El numero: " + i + " ha sido eliminado ");
            bcl.mostrar(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }
    }//GEN-LAST:event_btnDesencolarInicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesencolarFinal;
    private javax.swing.JButton btnDesencolarInicio;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnEncolarFinal;
    private javax.swing.JButton btnEncolarInicio;
    private javax.swing.JButton btnFrente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
