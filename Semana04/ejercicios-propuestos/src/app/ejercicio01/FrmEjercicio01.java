package app.ejercicio01;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio01 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    ListaSimplementeEnlazada vector = new ListaSimplementeEnlazada();
    ListaSimplementeEnlazada vector2 = new ListaSimplementeEnlazada();

    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst2 = new javax.swing.JList<>();
        btnIngresarLista1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnInsertarLista2 = new javax.swing.JButton();
        btnComprobar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstnum1 = new javax.swing.JList<>();
        btnCreciente = new javax.swing.JButton();
        btnInvertir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnAgregarPos = new javax.swing.JButton();
        btnSuprimir = new javax.swing.JButton();
        btnNUltimos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lst2.setModel(modelo2);
        jScrollPane1.setViewportView(lst2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 130, 160));

        btnIngresarLista1.setText("Ingresar Lista 1");
        btnIngresarLista1.setPreferredSize(new java.awt.Dimension(80, 25));
        btnIngresarLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarLista1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarLista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 140, 30));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, 50));

        btnInsertarLista2.setText("Ingresar lista 2");
        btnInsertarLista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarLista2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarLista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 150, 30));

        btnComprobar.setText("g) Son iguales");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 130, 40));

        lstnum1.setModel(modelo);
        jScrollPane2.setViewportView(lstnum1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 130, 160));

        btnCreciente.setText("c) Es creciente");
        btnCreciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrecienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, 40));

        btnInvertir.setText("d) Invertir Lista");
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 140, 40));

        btnEliminar.setText("f) Eliminar iguales");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, 40));

        btnSumar.setText("e) Sumar Elementos");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 150, 40));

        btnAgregarPos.setText("a) Añadir Posición");
        btnAgregarPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 40));

        btnSuprimir.setText("b) Suprimir i-ésimo ");
        btnSuprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 40));

        btnNUltimos.setText("e) N Ultimos");
        btnNUltimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUltimosActionPerformed(evt);
            }
        });
        getContentPane().add(btnNUltimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarLista1ActionPerformed
        try {
            if (!txtNumero.getText().isEmpty()) {
                int valor = Integer.parseInt(txtNumero.getText());
                txtNumero.setText("");
                txtNumero.requestFocus();
                vector.insertarAlInicio(valor);
                vector.mostrar(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }


    }//GEN-LAST:event_btnIngresarLista1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnInsertarLista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarLista2ActionPerformed
        // TODO add your handling code here:

        if (!txtNumero.getText().isEmpty()) {
            int valor = Integer.parseInt(txtNumero.getText());
            txtNumero.setText("");
            txtNumero.requestFocus();
            vector2.insertarAlFinal(valor);
            vector2.mostrar(modelo2);
        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_btnInsertarLista2ActionPerformed

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        // TODO add your handling code here:

          if (vector.contar() > 0 && vector2.contar()>0) {
        if (vector.sonIguales(vector2)) {
            JOptionPane.showMessageDialog(null, "Las listas son iguales");
        } else {
            JOptionPane.showMessageDialog(null, "Las listas no son iguales");
        }

        } else {
            JOptionPane.showMessageDialog(null, "Las listas o una estan vacias");
        }

    }//GEN-LAST:event_btnComprobarActionPerformed

    private void btnCrecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrecienteActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
            if (vector.esAscendente()) {
                JOptionPane.showMessageDialog(null, "La lista se encuentra ordenada en forma creciente.");
            } else {
                JOptionPane.showMessageDialog(null, "La lista no esta ordenada en forma creciente");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }

    }//GEN-LAST:event_btnCrecienteActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        // TODO add your handling code here:

        if (vector.contar() > 0) {
            vector.invertirLista();
            vector.mostrar(modelo);

        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
            float sum = vector.sumaRecursiva();

            JOptionPane.showMessageDialog(null, "La suma de Elementos es " + sum);
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }

    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnAgregarPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPosActionPerformed
        // TODO add your handling code here:

        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posición "));

        if (vector.insertarPosicion(Float.parseFloat(txtNumero.getText()), pos)) {
            JOptionPane.showMessageDialog(null, "El valor ha sido insertado");
            vector.mostrar(modelo);
        } else
            JOptionPane.showMessageDialog(null, "La posición ingresada no existe");
    }//GEN-LAST:event_btnAgregarPosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
            
            try{
             
            float num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor a eliminar"));
            Nodo ent = vector.buscar(num);

         
            vector.eliminarIguales(num);
            JOptionPane.showMessageDialog(null, "El numero: " + ent.getReal() + " ha sido eliminado ");
            vector.mostrar(modelo);   
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null, "Numero no encontrado "+e.getMessage());
            }
          

        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNUltimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUltimosActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n cantidad de valores a devolver "));
            ListaSimplementeEnlazada list = vector.getNultimos(n);
            list.mostrar(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }
    }//GEN-LAST:event_btnNUltimosActionPerformed

    private void btnSuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuprimirActionPerformed
        // TODO add your handling code here:

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición de elemento a eliminar"));

        if (vector.suprimirElementoN(num)) {
            JOptionPane.showMessageDialog(null, "El elemento ha sido suprimido");
            vector.mostrar(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "Elemento no encontrado en esa posición");
        }

    }//GEN-LAST:event_btnSuprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPos;
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnCreciente;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresarLista1;
    private javax.swing.JButton btnInsertarLista2;
    private javax.swing.JButton btnInvertir;
    private javax.swing.JButton btnNUltimos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnSuprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lst2;
    private javax.swing.JList<String> lstnum1;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
