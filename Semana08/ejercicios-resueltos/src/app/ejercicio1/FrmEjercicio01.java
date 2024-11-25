package app.ejercicio1;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio01 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    Pila pg = new Pila();

    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(500, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVector = new javax.swing.JList<>();
        btnPush = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        btnTop = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnEmpty = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector.setModel(modelo);
        jScrollPane1.setViewportView(lstVector);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 160));

        btnPush.setText("Push");
        btnPush.setPreferredSize(new java.awt.Dimension(80, 25));
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        getContentPane().add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 150, 30));

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnTop.setText("Top");
        btnTop.setPreferredSize(new java.awt.Dimension(80, 25));
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 150, 30));

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
        getContentPane().add(btnEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 150, 30));

        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, 30));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        try {
            if (!txtNumero.getText().isEmpty()) {
                String valor = txtNumero.getText();
                txtNumero.setText("");
                txtNumero.requestFocus();
                pg.push(valor);
                pg.mostrar(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }


    }//GEN-LAST:event_btnPushActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        if (!pg.isEmpty()) {
            String top = String.valueOf(pg.top()) ;

            JOptionPane.showMessageDialog(null, " La cima es: " + top);
            pg.mostrar(modelo);

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnTopActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        // TODO add your handling code here:
        if (!pg.isEmpty())
            JOptionPane.showMessageDialog(null, "El vector no está vacío");
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (!pg.isEmpty()) {
            String cima = String.valueOf(pg.pop()) ;
            JOptionPane.showMessageDialog(null, "El numero: " + cima + " ha sido eliminado ");
            pg.mostrar(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnPopActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        if (!pg.isEmpty()) {
            pg.clear();
            pg.mostrar(modelo);
            JOptionPane.showMessageDialog(null, "El vector ha sido vaciado ");

        } else {
            JOptionPane.showMessageDialog(null, "El vector ya está vacío");
        }

    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
