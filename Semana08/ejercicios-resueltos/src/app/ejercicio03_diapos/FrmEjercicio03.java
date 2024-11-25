package app.ejercicio03_diapos;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio03 extends javax.swing.JFrame {


    public FrmEjercicio03() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnConversion = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        lblBase = new javax.swing.JLabel();

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

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Base"));
        txtBase.setPreferredSize(new java.awt.Dimension(70, 25));
        txtBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBaseKeyTyped(evt);
            }
        });
        getContentPane().add(txtBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, 40));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 150, 30));

        btnConversion.setText("Conversion Base");
        btnConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 150, 30));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 90, 40));

        lblBase.setText("Base:");
        getContentPane().add(lblBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBaseKeyTyped
        // TODO add your handling code here:
            char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();   
    }//GEN-LAST:event_txtBaseKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
       txtNumero.setText("");
       txtBase.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversionActionPerformed
        // TODO add your handling code here:
        if (!txtNumero.getText().isEmpty() && !txtBase.getText().isEmpty()) {

            
            String conv = conversionBase(Integer.parseInt(txtNumero.getText()),Integer.parseInt(txtBase.getText()));
            
           
                JOptionPane.showMessageDialog(null, "La conversion es: "+conv);
            

        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_btnConversionActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
             char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();   
    }//GEN-LAST:event_txtNumeroKeyTyped

    public String conversionBase(int num, int base) {
     
        Pila<Number> pg = new Pila();
        int res, val;
        String cad = "";
        
        while(num>0){
            res = num % base;
            pg.push(res);
            num = num/base;
        }
        
        while(!pg.isEmpty()){
            val = (int) pg.pop();
            if(val<10)
                cad = cad +String.valueOf(val);
            else
                cad = cad + (char)(val + 55);
        }
        return cad;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConversion;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JTextField txtBase;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
