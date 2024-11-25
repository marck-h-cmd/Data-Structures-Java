package app.arbolEntero;

import javax.swing.*;

public class FrmEjercicio01 extends javax.swing.JFrame {

    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3 = new DefaultListModel();
    ArbolBinario ar = new ArbolBinario();

    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPostOrden = new javax.swing.JList<>();
        btnInsert = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalculo = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPreorden1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrden = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        brnSearch = new javax.swing.JButton();
        btnProfundidad = new javax.swing.JButton();
        btnAltura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstPostOrden.setBorder(javax.swing.BorderFactory.createTitledBorder("PostOrden"));
        lstPostOrden.setModel(modelo3
        );
        jScrollPane1.setViewportView(lstPostOrden);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 120, 160));

        btnInsert.setText("Ingresar");
        btnInsert.setPreferredSize(new java.awt.Dimension(80, 25));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 150, 30));

        btnCalculo.setText("Calculo");
        btnCalculo.setPreferredSize(new java.awt.Dimension(80, 25));
        btnCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, 30));

        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero"));
        txtNumero.setPreferredSize(new java.awt.Dimension(70, 25));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 150, 30));

        lstPreorden1.setBorder(javax.swing.BorderFactory.createTitledBorder("PreOrden"));
        lstPreorden1.setModel(modelo1);
        jScrollPane2.setViewportView(lstPreorden1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, 160));

        lstOrden.setBorder(javax.swing.BorderFactory.createTitledBorder("EnOrden"));
        lstOrden.setModel(modelo2);
        jScrollPane3.setViewportView(lstOrden);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, 160));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane4.setViewportView(txtArea);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 310, 130));

        brnSearch.setText("Buscar");
        brnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(brnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 150, 40));

        btnProfundidad.setText("Profundidad Nodo");
        btnProfundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfundidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 40));

        btnAltura.setText("Altura Nodo");
        btnAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            if (!txtNumero.getText().isEmpty()) {
                int valor = Integer.parseInt(txtNumero.getText());
                txtNumero.setText("");
                txtNumero.requestFocus();
                ar.insertar(valor);
                ar.traversePreOrden(modelo1);
                ar.traverseOrden(modelo2);
                ar.traversePostOrden(modelo3);

            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage());
        }


    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoActionPerformed
   //     if (!ar.isEmpty()) {

            txtNumero.setText("");
            txtArea.setText(ar.mostrar());

 /*       } else
            JOptionPane.showMessageDialog(null, "El vector está vacío"); */
    }//GEN-LAST:event_btnCalculoActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
        /*    char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();*/
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (!ar.isEmpty()) {
            int valor = Integer.parseInt(txtNumero.getText());
            txtNumero.setText("");
            txtNumero.requestFocus();
            ar.eliminar(valor);
            ar.traversePreOrden(modelo1);
            ar.traverseOrden(modelo2);
            ar.traversePostOrden(modelo3);
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void brnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnSearchActionPerformed
        // TODO add your handling code here:
        if (!txtNumero.getText().isEmpty()) {

            int valor = Integer.parseInt(txtNumero.getText());
            txtNumero.setText("");
            txtNumero.requestFocus();
            Nodo nodo = ar.busqueda(valor);
            if (nodo != null) {
                JOptionPane.showMessageDialog(null, "Número " + nodo.getInfo() + " encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Elemento no encontrado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_brnSearchActionPerformed

    private void btnProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfundidadActionPerformed
        // TODO add your handling code here:
        if (!ar.isEmpty()) {
            if (!txtNumero.getText().isEmpty()) {

                int valor = Integer.parseInt(txtNumero.getText());
                txtNumero.setText("");
                txtNumero.requestFocus();
                int num = ar.getProfundidadNodo(valor);
                if (num !=0) {
                    JOptionPane.showMessageDialog(null, "La profundidad es: " + num);
                } else {
                    JOptionPane.showMessageDialog(null, "Elemento no encontrado");
                }

            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }

    }//GEN-LAST:event_btnProfundidadActionPerformed

    private void btnAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaActionPerformed
        // TODO add your handling code here:
        
         if (!ar.isEmpty()) {
            if (!txtNumero.getText().isEmpty()) {

                int valor = Integer.parseInt(txtNumero.getText());
                txtNumero.setText("");
                txtNumero.requestFocus();
                int num = ar.getAlturaNodo(valor);
                if (num !=0) {
                    JOptionPane.showMessageDialog(null, "La Altura es: " + num);
                } else {
                    JOptionPane.showMessageDialog(null, "Elemento no encontrado");
                }

            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        }
    }//GEN-LAST:event_btnAlturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnSearch;
    private javax.swing.JButton btnAltura;
    private javax.swing.JButton btnCalculo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnProfundidad;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lstOrden;
    private javax.swing.JList<String> lstPostOrden;
    private javax.swing.JList<String> lstPreorden1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
