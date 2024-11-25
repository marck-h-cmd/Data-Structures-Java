package app.arbolPalabra;
//import app.ejercicio01.Nodo;

import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio01 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ArbolBinario ar = new ArbolBinario();

    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 700);
         txtPalabra.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtPalabra = new javax.swing.JTextField();
        brnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsert.setText("Ingresar");
        btnInsert.setPreferredSize(new java.awt.Dimension(80, 25));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 150, 30));

        txtPalabra.setBorder(javax.swing.BorderFactory.createTitledBorder("Palabra"));
        txtPalabra.setPreferredSize(new java.awt.Dimension(70, 25));
        txtPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPalabraKeyTyped(evt);
            }
        });
        getContentPane().add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 190, 40));

        brnSearch.setText("Buscar");
        brnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(brnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, 30));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Significado"));
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 310, 100));

        tblDatos.setModel(modelo);
        jScrollPane2.setViewportView(tblDatos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 480, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        try {
            if (!txtPalabra.getText().isEmpty()) {
             
                Datos x = new Datos(txtPalabra.getText(),txtArea.getText());
               
                txtPalabra.requestFocus();
                ar.insertar(x);
                ar.enOrden(modelo);
                 txtPalabra.setText("");
                txtArea.setText("");

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

    private void txtPalabraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalabraKeyTyped
        // TODO add your handling code here:
           char c=evt.getKeyChar();
        if(!Character.isLetter(c)&& !(c == KeyEvent.VK_SPACE)&& !(c==KeyEvent.VK_BACK_SPACE) && !(c==KeyEvent.VK_DELETE))
           evt.consume();
    }//GEN-LAST:event_txtPalabraKeyTyped

    private void brnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnSearchActionPerformed
        // TODO add your handling code here:
        if (!txtPalabra.getText().isEmpty()) {
    
           Nodo pal = ar.busqueda(txtPalabra.getText());
        
           if(pal!=null){
            txtPalabra.setText("");
            txtPalabra.requestFocus();
            
            ar.limpiarTabla(modelo);
            ar.agregarFila(modelo, pal.getInfo());
               
               JOptionPane.showMessageDialog(null, "El significado de la palabra "+pal.getInfo().getPalabra() +"\n es: "+pal.getInfo().getSignificado());
           }else{
                 JOptionPane.showMessageDialog(null, "Palabra  no encontrada");
           }
          

        } else {
            JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
        }

    }//GEN-LAST:event_brnSearchActionPerformed

    private void txtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtAreaKeyTyped

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnSearch;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
