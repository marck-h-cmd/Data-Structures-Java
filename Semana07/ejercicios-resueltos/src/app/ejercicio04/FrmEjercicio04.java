package app.ejercicio04;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio04 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    ListasCircularesDobles LCD = new ListasCircularesDobles();

    public FrmEjercicio04() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(500, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVector = new javax.swing.JList<>();
        btnIsertar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnEliminarDuplicados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector.setModel(modelo);
        jScrollPane1.setViewportView(lstVector);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 160));

        btnIsertar.setText("Insertar");
        btnIsertar.setPreferredSize(new java.awt.Dimension(80, 25));
        btnIsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 150, 30));

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 40));

        btnEliminarDuplicados.setText("Eliminar Elemento");
        btnEliminarDuplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDuplicadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsertarActionPerformed
        try {
            if (!txtNumero.getText().isEmpty()) {
                int valor = Integer.parseInt(txtNumero.getText());
                txtNumero.setText("");
                txtNumero.requestFocus();
                LCD.insertar(valor);
                LCD.mostrar(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }


    }//GEN-LAST:event_btnIsertarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnEliminarDuplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDuplicadosActionPerformed
        // TODO add your handling code here:
        if (LCD.contar() > 0) {
            //  if (!txtValor.getText().isEmpty()) {
                try {
                    //   int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a eliminar"));
                    //  Nodo ent = LCD.buscar(num);
                    LCD.eliminarDuplicados();
                    //    JOptionPane.showMessageDialog(null, "El numero: " + ent.getInfo() + "ha sido eliminado ");
                    LCD.mostrar(modelo);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No se encontro el elemento");
                    System.out.print(e.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(null, "El vector está vacío");
            }
    }//GEN-LAST:event_btnEliminarDuplicadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarDuplicados;
    private javax.swing.JButton btnIsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
