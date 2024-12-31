package app.grafosMatriz;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio02 extends javax.swing.JFrame {

    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el total de  Vertices que contiene el grafo :"));
    GrafoMatriz gl = new GrafoMatriz(n);

    public FrmEjercicio02() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAdyacentes = new javax.swing.JButton();
        txtVerticeInicio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPreorden1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrden = new javax.swing.JList<>();
        brnDirigido = new javax.swing.JButton();
        btnRecorridoProf = new javax.swing.JButton();
        btnRecorridoAnchura = new javax.swing.JButton();
        txtVerticeFinal = new javax.swing.JTextField();
        btnGradoEntrada = new javax.swing.JButton();
        btnGradoSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsert.setText("Ingresar Vertice");
        btnInsert.setPreferredSize(new java.awt.Dimension(80, 25));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 150, 30));

        btnAdyacentes.setText("Adyacentes");
        btnAdyacentes.setPreferredSize(new java.awt.Dimension(80, 25));
        btnAdyacentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdyacentesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdyacentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 150, 30));

        txtVerticeInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Arista Inicio"));
        txtVerticeInicio.setPreferredSize(new java.awt.Dimension(70, 25));
        txtVerticeInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVerticeInicioKeyTyped(evt);
            }
        });
        getContentPane().add(txtVerticeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 30));

        lstPreorden1.setBorder(javax.swing.BorderFactory.createTitledBorder("Recorrido Anchura"));
        lstPreorden1.setModel(modelo1);
        jScrollPane2.setViewportView(lstPreorden1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 160, 170));

        lstOrden.setBorder(javax.swing.BorderFactory.createTitledBorder("Recorrido Profundidad"));
        lstOrden.setModel(modelo2);
        jScrollPane3.setViewportView(lstOrden);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 160, 170));

        brnDirigido.setText("Es dirigido?");
        brnDirigido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnDirigidoActionPerformed(evt);
            }
        });
        getContentPane().add(brnDirigido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, -1));

        btnRecorridoProf.setText("Recorrido Profunidad");
        btnRecorridoProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorridoProfActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecorridoProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 150, 40));

        btnRecorridoAnchura.setText("Recorrido Anchura");
        btnRecorridoAnchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorridoAnchuraActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecorridoAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 150, 40));

        txtVerticeFinal.setBorder(javax.swing.BorderFactory.createTitledBorder("Arista Final"));
        txtVerticeFinal.setPreferredSize(new java.awt.Dimension(70, 25));
        txtVerticeFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVerticeFinalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVerticeFinalKeyTyped(evt);
            }
        });
        getContentPane().add(txtVerticeFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, 40));

        btnGradoEntrada.setText("Grado Entrada");
        btnGradoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradoEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGradoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 110, 40));

        btnGradoSalida.setText("Grado Salida");
        btnGradoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradoSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGradoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            if (!txtVerticeInicio.getText().isEmpty() && !txtVerticeFinal.getText().isEmpty()) {
                int i = Integer.parseInt(txtVerticeInicio.getText());
                int j = Integer.parseInt(txtVerticeFinal.getText());
                txtVerticeInicio.setText("");
                txtVerticeFinal.setText("");
                txtVerticeInicio.requestFocus();
                gl.insertarArista(i, j);
                JOptionPane.showMessageDialog(null, "Arista insertada");

            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "El numero de aristas supero al  total de  vertices "+n+"  especificado");
        }


    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdyacentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdyacentesActionPerformed

        int v = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Vertice para ver sus adyacentes :"));
        JOptionPane.showMessageDialog(null, "Adyacentes: " + gl.mostrarAdyacentes(v));
    }//GEN-LAST:event_btnAdyacentesActionPerformed

    private void txtVerticeInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerticeInicioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtVerticeInicioKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!txtVerticeInicio.getText().isEmpty() && !txtVerticeFinal.getText().isEmpty()) {
            int i = Integer.parseInt(txtVerticeInicio.getText());
            int j = Integer.parseInt(txtVerticeFinal.getText());
            txtVerticeInicio.setText("");
            txtVerticeFinal.setText("");
            txtVerticeInicio.requestFocus();
            gl.eliminarArista(i, j);
            JOptionPane.showMessageDialog(null, "Arista Eliminada");

        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void brnDirigidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnDirigidoActionPerformed
        // TODO add your handling code here:

        try {
            if (gl.esDirigido()) {
                JOptionPane.showMessageDialog(null, "ES DIRIGIDO");
            } else {
                JOptionPane.showMessageDialog(null, "NO ES DIRIGIDO");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }

    }//GEN-LAST:event_brnDirigidoActionPerformed

    private void btnRecorridoProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorridoProfActionPerformed
        // TODO add your handling code here:
        try {
            int v = Integer.parseInt(JOptionPane.showInputDialog("Recorrer desde vertice: "));

            gl.recorridoProfundidad(v, modelo2);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }

    }//GEN-LAST:event_btnRecorridoProfActionPerformed

    private void btnRecorridoAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorridoAnchuraActionPerformed
        // TODO add your handling code here:
        try {
            int v = Integer.parseInt(JOptionPane.showInputDialog("Recorrer desde vertice: "));

            gl.recorridoAnchura(v, modelo1);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }

    }//GEN-LAST:event_btnRecorridoAnchuraActionPerformed

    private void txtVerticeFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerticeFinalKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtVerticeFinalKeyTyped

    private void btnGradoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradoEntradaActionPerformed
        // TODO add your handling code here:
        try {
            if (gl.esDirigido()) {
                int v = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Vertice :"));
                JOptionPane.showMessageDialog(null, "Grado de Entrada de  " + v + ": " + gl.gradoEntrada(v));
            } else {
                JOptionPane.showMessageDialog(null, "El Grafo NO es Dirigido");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }
    }//GEN-LAST:event_btnGradoEntradaActionPerformed

    private void btnGradoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradoSalidaActionPerformed
        // TODO add your handling code here:
        try {
            if (gl.esDirigido()) {
                int v = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Vertice :"));
                JOptionPane.showMessageDialog(null, "Grado de Salida de  " + v + ": " + gl.gradoSalida(v));
            } else {
                JOptionPane.showMessageDialog(null, "El Grafo NO es Dirigido");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }
    }//GEN-LAST:event_btnGradoSalidaActionPerformed

    private void txtVerticeFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVerticeFinalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerticeFinalKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnDirigido;
    private javax.swing.JButton btnAdyacentes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGradoEntrada;
    private javax.swing.JButton btnGradoSalida;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRecorridoAnchura;
    private javax.swing.JButton btnRecorridoProf;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstOrden;
    private javax.swing.JList<String> lstPreorden1;
    private javax.swing.JTextField txtVerticeFinal;
    private javax.swing.JTextField txtVerticeInicio;
    // End of variables declaration//GEN-END:variables
}
