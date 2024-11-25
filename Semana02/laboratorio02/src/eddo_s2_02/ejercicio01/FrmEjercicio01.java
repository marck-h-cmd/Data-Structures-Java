package eddo_s2_02.ejercicio01;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio01 extends javax.swing.JFrame {

     DefaultListModel modelo = new DefaultListModel();
    VectorReales vectorReales = new VectorReales();
    
    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
         setSize(400,300);
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
        btnAscendente = new javax.swing.JButton();
        btnDescendente = new javax.swing.JButton();

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
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 110, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 150, 30));

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtValor.setPreferredSize(new java.awt.Dimension(70, 25));
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 40));

        btnAscendente.setText("Burbuja Ascendente");
        btnAscendente.setPreferredSize(new java.awt.Dimension(80, 25));
        btnAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAscendenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAscendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, 30));

        btnDescendente.setText("Burbuja Descendente");
        btnDescendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescendenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, 30));

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

    private void btnAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAscendenteActionPerformed
       vectorReales.bubbleSortAscendente();
       vectorReales.mostrar(modelo);
    }//GEN-LAST:event_btnAscendenteActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
       if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtValor.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtValorKeyTyped

    private void btnDescendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescendenteActionPerformed
        // TODO add your handling code here:
        vectorReales.bubbleSortDescendente();
       vectorReales.mostrar(modelo);
    }//GEN-LAST:event_btnDescendenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAscendente;
    private javax.swing.JButton btnDescendente;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
