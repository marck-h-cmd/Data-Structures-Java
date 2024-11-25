package propuestos.ejercicio06;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio06 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    VectorReales vectorReales = new VectorReales();

    public FrmEjercicio06() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(400, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVector = new javax.swing.JList<>();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector.setModel(modelo);
        jScrollPane1.setViewportView(lstVector);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.setPreferredSize(new java.awt.Dimension(80, 25));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 90, 30));

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtValor.setPreferredSize(new java.awt.Dimension(70, 25));
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(80, 25));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 90, 30));

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 80, -1));

        lblBuscar.setText("Numero a buscar");
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        txtValor.setText("");
        txtValor.requestFocus();
        vectorReales.agregar(valor);
        vectorReales.mostrar(modelo);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (vectorReales.getTotalElementos() > 0)
            if (!txtNumero.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La posición es: " + vectorReales.vectorBuscar(Double.parseDouble(txtNumero.getText())));
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:
           char c=evt.getKeyChar();
       if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtValor.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
           char c=evt.getKeyChar();
       if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtValor.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
