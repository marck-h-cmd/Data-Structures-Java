package app.ejercicio_infija_postfija;

import javax.swing.*;

public class FrmEjercicio_Infija extends javax.swing.JFrame {

    public FrmEjercicio_Infija() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 300);
        txtConversion.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        txtEval = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnConversion_evaluacion_postfija = new javax.swing.JButton();
        txtConversion = new javax.swing.JTextField();
        lblBase = new javax.swing.JLabel();
        btnConversion_infija_postfija1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 190, 30));

        lblValor1.setText("Expresion:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        txtEval.setBorder(javax.swing.BorderFactory.createTitledBorder("Evaluación"));
        txtEval.setPreferredSize(new java.awt.Dimension(70, 25));
        txtEval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEvalKeyTyped(evt);
            }
        });
        getContentPane().add(txtEval, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 190, 40));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 190, 30));

        btnConversion_evaluacion_postfija.setText("Evaluación Postfija");
        btnConversion_evaluacion_postfija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversion_evaluacion_postfijaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConversion_evaluacion_postfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 190, 30));

        txtConversion.setBorder(javax.swing.BorderFactory.createTitledBorder("Conversion 1"));
        txtConversion.setPreferredSize(new java.awt.Dimension(70, 25));
        txtConversion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConversionKeyTyped(evt);
            }
        });
        getContentPane().add(txtConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, 40));

        lblBase.setText("Evaluación:");
        getContentPane().add(lblBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnConversion_infija_postfija1.setText("Conversion Infija Postfija");
        btnConversion_infija_postfija1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversion_infija_postfija1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnConversion_infija_postfija1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtEvalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEvalKeyTyped
        // TODO add your handling code here:
        /*   char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();*/
    }//GEN-LAST:event_txtEvalKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtConversion.setText("");
        txtEval.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConversion_evaluacion_postfijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversion_evaluacion_postfijaActionPerformed
        // TODO add your handling code here:

        try {
            if (!txtEval.getText().isEmpty()) {

                String conv = evaluarPostfija(txtEval.getText());

                JOptionPane.showMessageDialog(null, "La Evaluacion es: " + conv);

            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia, necesita primero convertir de infija postfija");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error " + ex.getMessage());
        }


    }//GEN-LAST:event_btnConversion_evaluacion_postfijaActionPerformed

    private void txtConversionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConversionKeyTyped
        // TODO add your handling code here:
        /*   char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();*/
    }//GEN-LAST:event_txtConversionKeyTyped

    private void btnConversion_infija_postfija1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversion_infija_postfija1ActionPerformed
        // TODO add your handling code here:

        try {
            if (!txtConversion.getText().isEmpty()) {

                String exp = infijaAPostfija(txtConversion.getText());

                txtEval.setText(exp);
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConversion_infija_postfija1ActionPerformed

    // CONVERSION INFIJA A POSTFIJA
    public boolean esOperando(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }

    public int getPrioridad(char c) {
        switch (c) {
            case '-', '+' -> {
                return 1;
            }
            case '*', '/' -> {
                return 2;
            }
            case '^' -> {
                return 3;
            }
        }
        return -1;

    }

    public String infijaAPostfija(String exp) {
        Pila<Character> p = new Pila<>();
        StringBuilder result = new StringBuilder();

        int n = exp.length();

        for (int i = 0; i < n; i++) {
            char c = exp.charAt(i);

            if (esOperando(c)) {
                result.append(c);
            } else if (c == '(') {
                p.push('(');
            } else if (c == ')') {
                while (p.top() != '(') {
                    result.append(p.pop());
                }
                p.pop();
            } else {
                while (!p.isEmpty() && (getPrioridad(c) < getPrioridad(p.top()) || getPrioridad(c) == getPrioridad(p.top()))) {
                    result.append(p.pop());
                }
                p.push(c);
            }
        }
        while (!p.isEmpty()) {
            result.append(p.pop());
        }
        return result.toString();
    }

    //EVALUACION POSTFIJA
    public String evaluarPostfija(String exp) {
        Pila<Integer> pg = new Pila<>();
        int n = exp.length();

        for (int i = 0; i < n; i++) {
            char c = exp.charAt(i);

            if (c >= '0' && c <= '9') {
                pg.push(c - '0');
            } else {
                int val1 = pg.pop();
                int val2 = pg.pop();
                int op = 0;
                switch (c) {
                    case '+' ->
                        op = val2 + val1;
                    case '-' ->
                        op = val2 - val1;
                    case '/' ->
                        op = val2 / val1;
                    case '*' ->
                        op = val2 * val1;
                    case '^' ->
                        op = (int) Math.pow(val2, val1);
                }
                pg.push(op);

            }
        }
        return String.valueOf(pg.pop());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConversion_evaluacion_postfija;
    private javax.swing.JButton btnConversion_infija_postfija1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JTextField txtConversion;
    private javax.swing.JTextField txtEval;
    // End of variables declaration//GEN-END:variables
}
