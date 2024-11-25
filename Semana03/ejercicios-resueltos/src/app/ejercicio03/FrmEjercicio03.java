package app.ejercicio03;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio03 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VectorEmpleados vector = new VectorEmpleados();
    
    public FrmEjercicio03() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpl = new javax.swing.JTable();
        lblNVentas = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodBuscar = new javax.swing.JTextField();
        lblCodBus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCod.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCod.setText("CODIGO: ");
        lblCod.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, -1));

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNombre.setText("NOMBRE:");
        lblNombre.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 180, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 40));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 100, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 100, 30));

        tblEmpl.setModel(modelo);
        jScrollPane1.setViewportView(tblEmpl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 240, 200));

        lblNVentas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNVentas.setText("MONTO VENTAS");
        lblNVentas.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, -1));

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 30));

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 30));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 26, 130, 30));

        txtCodBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodBuscarActionPerformed(evt);
            }
        });
        txtCodBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 226, 100, 30));

        lblCodBus.setText("Codigo a buscar");
        jPanel1.add(lblCodBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String codigo = txtCod.getText();
        float sueldo = Float.parseFloat(txtSueldo.getText());
             
        Empleado x = new Empleado(codigo, nombre, sueldo);
        vector.agregar(x);
         txtNombre.setText("");
        txtCod.setText("");
        txtSueldo.setText("");
        txtNombre.requestFocus();
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (vector.getTotalElementos() > 0)
          if (!txtCodBuscar.getText().isEmpty()) {
               
                 int pos = vector.recursiveSequentialSearch(txtCodBuscar.getText());
                 if(pos!=-1)
                 vector.mostrar(modelo, pos);
                 else
                    JOptionPane.showMessageDialog(null, "Codigo no se encuentra registrado");
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void txtCodBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodBuscarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
            char c=evt.getKeyChar();
        if(!Character.isLetter(c)&& !(c == KeyEvent.VK_SPACE)&& !(c==KeyEvent.VK_BACK_SPACE) && !(c==KeyEvent.VK_DELETE))
           evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyTyped
        // TODO add your handling code here:
           char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtCodKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        // TODO add your handling code here:
            char c=evt.getKeyChar();
       if(((c<'0')||(c>'9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c!= '.' || txtSueldo.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void txtCodBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodBuscarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
          if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtCodBuscarKeyTyped

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodBus;
    private javax.swing.JLabel lblNVentas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblEmpl;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
