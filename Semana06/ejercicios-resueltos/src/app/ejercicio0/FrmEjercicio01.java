package app.ejercicio0;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class FrmEjercicio01 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
   ListaDoblementeEnlazada vector = new ListaDoblementeEnlazada();
  

    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVector = new javax.swing.JList<>();
        btnIsertarInicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnInsertarFinal = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnContar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstVector.setModel(modelo);
        jScrollPane1.setViewportView(lstVector);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 160));

        btnIsertarInicio.setText("Insertar al Inicio");
        btnIsertarInicio.setPreferredSize(new java.awt.Dimension(80, 25));
        btnIsertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsertarInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnIsertarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 150, 30));

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnBuscar.setText("Buscar Elemento");
        btnBuscar.setPreferredSize(new java.awt.Dimension(80, 25));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 30));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 40));

        btnModificar.setText("Modificar Elemento");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, 30));

        btnInsertarFinal.setText("Insertar al Final");
        btnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinalActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 150, 30));

        btnEliminar.setText("Eliminar Elemento");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 67, 150, 30));

        btnContar.setText("Contar Elemento");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 150, 30));

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsertarInicioActionPerformed
        try{
             if (!txtNumero.getText().isEmpty()) {
            int valor = Integer.parseInt(txtNumero.getText());
            txtNumero.setText("");
            txtNumero.requestFocus();
            vector.insertaAlInicio(valor);
            vector.mostrarHaciaAdelante(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Hubo un error"+ e.getMessage());
        }
       

    }//GEN-LAST:event_btnIsertarInicioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (vector.contar() > 0) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));
            Nodo ent = vector.buscar(num);
            if (ent != null) {
                JOptionPane.showMessageDialog(null, ent.getInfo() + " ha sido encontrado");
                vector.mostrarHaciaAdelante(modelo);
            } else {
                JOptionPane.showMessageDialog(null, "El valor no ha sido encontrado");
            }

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
         //   if (!txtValorMod.getText().isEmpty()) {
           int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a modificar"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del modificado"));
                Nodo ent = vector.buscar(num);

                ent.setInfo(num2);

                JOptionPane.showMessageDialog(null, "El numero ha sido modificado ");
                vector.mostrarHaciaAdelante(modelo);
          
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        // TODO add your handling code here:
        if (!txtNumero.getText().isEmpty()) {
            int valor = Integer.parseInt(txtNumero.getText());
            txtNumero.setText("");
            txtNumero.requestFocus();
            vector.insertaAlFinal(valor);
            vector.mostrarHaciaAdelante(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
          //  if (!txtValor.getText().isEmpty()) {
          try{
                int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a eliminar"));
                Nodo ent = vector.buscar(num);
                System.out.print(ent.getInfo());
                //vector.eliminar(Integer.parseInt(txtValor.getText()));
                vector.eliminar(num);
                JOptionPane.showMessageDialog(null, "El numero: " + ent.getInfo() + "ha sido eliminado ");
                vector.mostrarHaciaAdelante(modelo);
              
          }catch(Exception e){
               JOptionPane.showMessageDialog(null, "No se encontro el elemento");
               System.out.print(e.getMessage());
          }
              
            
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {

            JOptionPane.showMessageDialog(null, "El total de elementos es: " + vector.contar());
           

        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnContarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
            vector.ordenar();
            vector.mostrarHaciaAdelante(modelo);
        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnOrdenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnIsertarInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JList<String> lstVector;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
