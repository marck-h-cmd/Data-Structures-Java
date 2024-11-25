package app.ejercicio02;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio02 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    ListaDoblementeEnlazada LED = new ListaDoblementeEnlazada();
    ListaDoblementeEnlazada aux = new ListaDoblementeEnlazada();

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
        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnDesviacion = new javax.swing.JButton();
        btnInsertarFinal = new javax.swing.JButton();
        btnMediana = new javax.swing.JButton();
        btnMenor = new javax.swing.JButton();
        btnMostrarPrimos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector.setModel(modelo);
        jScrollPane1.setViewportView(lstVector);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 160));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 150, 30));

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

        btnDesviacion.setText("Desviación Estandar");
        btnDesviacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesviacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesviacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, 30));

        btnInsertarFinal.setText("Insertar al Final");
        btnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 30));

        btnMediana.setText("Mediana");
        btnMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedianaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 150, 30));

        btnMenor.setText("Menor");
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 140, 30));

        btnMostrarPrimos.setText("Primos");
        btnMostrarPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPrimosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarPrimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnDesviacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesviacionActionPerformed
        // TODO add your handling code here:
        if (LED.contar() > 0) {
            //   if (!txtValorMod.getText().isEmpty()) {
            double des = LED.calcularDS();

            JOptionPane.showMessageDialog(null, "La desviación estandar es: " + des);

        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnDesviacionActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        // TODO add your handling code here:
        if (!txtNumero.getText().isEmpty()) {
            int valor = Integer.parseInt(txtNumero.getText());
            txtNumero.setText("");
            txtNumero.requestFocus();
            LED.insertaAlFinal(valor);
            LED.mostrarHaciaAdelante(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedianaActionPerformed
        // TODO add your handling code here:
        if (LED.contar() > 0) {
            try {
                
             
                float mediana = LED.getMediana();
                LED.mostrarHaciaAdelante(modelo);
                JOptionPane.showMessageDialog(null, "La mediana es: " + mediana);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se encontro el elemento");
                System.out.print(e.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnMedianaActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
        // TODO add your handling code here:
        if (LED.contar() > 0) {

            int menor = LED.returnMenor();
               JOptionPane.showMessageDialog(null, "El numero menor es "+menor);
        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnMenorActionPerformed

    private void btnMostrarPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPrimosActionPerformed
        // TODO add your handling code here:
        if (LED.contar() > 0) {

            aux = LED.returnPrimos();
            aux.mostrarHaciaAdelante(modelo);

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnMostrarPrimosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesviacion;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnMediana;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnMostrarPrimos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
