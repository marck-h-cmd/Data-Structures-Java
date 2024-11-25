package app.ejercicio03;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.*;

public class FrmEjercicio03 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
        DefaultListModel modelo2 = new DefaultListModel();
              DefaultListModel modelo3 = new DefaultListModel();
    ListaDoblementeEnlazada LED = new ListaDoblementeEnlazada();
        ListaDoblementeEnlazada LED2 = new ListaDoblementeEnlazada();
    ListaDoblementeEnlazada aux = new ListaDoblementeEnlazada();

    public FrmEjercicio03() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVector2 = new javax.swing.JList<>();
        btnSalir = new javax.swing.JButton();
        txtNumero2 = new javax.swing.JTextField();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertar2 = new javax.swing.JButton();
        btnBurbuja = new javax.swing.JButton();
        btnInvertir = new javax.swing.JButton();
        btnInterseccion = new javax.swing.JButton();
        btnUnion = new javax.swing.JButton();
        btnDiferencia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstVector1 = new javax.swing.JList<>();
        txtNumero1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lst3 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector2.setModel(modelo2);
        jScrollPane1.setViewportView(lstVector2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 110, 160));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 140, 30));

        txtNumero2.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero2.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero2KeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 80, 40));

        btnInsertarFinal.setText("Insertar Primera");
        btnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 140, 30));

        btnInsertar2.setText("Insertar Segunda");
        btnInsertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 140, 30));

        btnBurbuja.setText("Ordenar Burbuja");
        btnBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBurbujaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 30));

        btnInvertir.setText("Invertir Lista");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 140, 30));

        btnInterseccion.setText("Interseccion");
        btnInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterseccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnInterseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, 30));

        btnUnion.setText("Union");
        btnUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnionActionPerformed(evt);
            }
        });
        getContentPane().add(btnUnion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 140, 40));

        btnDiferencia.setText("Diferencia");
        btnDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 140, 40));

        lstVector1.setModel(modelo);
        jScrollPane2.setViewportView(lstVector1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 160));

        txtNumero1.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero1.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero1KeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, 40));

        lst3.setModel(modelo3
        );
        jScrollPane3.setViewportView(lst3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNumero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumero2KeyTyped

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        // TODO add your handling code here:
        if (!txtNumero1.getText().isEmpty()) {
            int valor = Integer.parseInt(txtNumero1.getText());
            txtNumero1.setText("");
            txtNumero1.requestFocus();
            LED.insertaAlFinal(valor);
            LED.mostrarHaciaAdelante(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar2ActionPerformed
        // TODO add your handling code here:
        if (LED.contar() > 0) {

             if (!txtNumero2.getText().isEmpty()) {
            int valor = Integer.parseInt(txtNumero2.getText());
            txtNumero2.setText("");
            txtNumero2.requestFocus();
            LED2.insertaAlFinal(valor);
            LED2.mostrarHaciaAdelante(modelo2);
        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }
        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnInsertar2ActionPerformed

    private void txtNumero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero1KeyTyped

    private void btnBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBurbujaActionPerformed
        // TODO add your handling code here:
        
        LED.burbuja();
        LED.mostrarHaciaAdelante(modelo);
    }//GEN-LAST:event_btnBurbujaActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        // TODO add your handling code here:
        
        
        LED.invertirLista();
        LED.mostrarHaciaAdelante(modelo);
        
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterseccionActionPerformed
        // TODO add your handling code here:
        aux =  LED.getInterseccion(LED2);
       
        aux.mostrarHaciaAdelante(modelo3);
        
    }//GEN-LAST:event_btnInterseccionActionPerformed

    private void btnDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiferenciaActionPerformed
        // TODO add your handling code here:
        
        
        aux = LED.getDiferencia(LED2);
        aux.mostrarHaciaAdelante(modelo3);
    }//GEN-LAST:event_btnDiferenciaActionPerformed

    private void btnUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnionActionPerformed
        // TODO add your handling code here:
           aux = LED.getUnion(LED2);
        aux.mostrarHaciaAdelante(modelo3);
    }//GEN-LAST:event_btnUnionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBurbuja;
    private javax.swing.JButton btnDiferencia;
    private javax.swing.JButton btnInsertar2;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInterseccion;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUnion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lst3;
    private javax.swing.JList<String> lstVector1;
    private javax.swing.JList<String> lstVector2;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
