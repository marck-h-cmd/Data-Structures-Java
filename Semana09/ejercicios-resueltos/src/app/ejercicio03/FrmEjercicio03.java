package app.ejercicio03;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio03 extends javax.swing.JFrame {
    
    DefaultListModel modelo = new DefaultListModel();
    Colas cl = new Colas();
    
    public FrmEjercicio03() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(600, 300);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVector = new javax.swing.JList<>();
        btnEncolar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnEmpty = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        txtPrioridad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector.setModel(modelo);
        jScrollPane1.setViewportView(lstVector);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 230, 160));

        btnEncolar.setText("Encolar");
        btnEncolar.setPreferredSize(new java.awt.Dimension(80, 25));
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 150, 30));

        btnTop.setText("Frente");
        btnTop.setPreferredSize(new java.awt.Dimension(80, 25));
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        getContentPane().add(btnTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 150, 30));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 40));

        btnEmpty.setText("Empty");
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 150, 30));

        btnPop.setText("Desencolar");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 150, 30));

        txtPrioridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Prioridad"));
        getContentPane().add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        try {
            if (!txtNumero.getText().isEmpty()) {
                String valor = txtNumero.getText();
                int priori = Integer.parseInt(txtPrioridad.getText());
                txtNumero.setText("");
                txtPrioridad.setText("");
                txtNumero.requestFocus();
                cl.encolar(valor, priori);
                cl.mostrar(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }
        

    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        if (!cl.isEmpty()) {
            String top = String.valueOf(cl.frente());
            
            JOptionPane.showMessageDialog(null, " El frente es: " + top);
            cl.mostrar(modelo);
            
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
        if (!cl.isEmpty())
            JOptionPane.showMessageDialog(null, "El vector no está vacío");
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
        if (!cl.isEmpty()) {
            String cima = String.valueOf(cl.desencolar());
            JOptionPane.showMessageDialog(null, "El numero: " + cima + " ha sido eliminado ");
            cl.mostrar(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnPopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPrioridad;
    // End of variables declaration//GEN-END:variables
}
