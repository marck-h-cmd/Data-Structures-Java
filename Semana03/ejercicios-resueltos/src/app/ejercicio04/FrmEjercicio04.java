package app.ejercicio04;


import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio04 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    VectorPersonas vector = new VectorPersonas();
    
    public FrmEjercicio04() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumeroDeTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNumeroDeTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        txtNomBuscar = new javax.swing.JTextField();
        lblCodBus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumeroDeTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumeroDeTelefono.setText("NÚMERO DE TELÉFONO:");
        lblNumeroDeTelefono.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNumeroDeTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, -1));

        lblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNombre.setText("NOMBRE:");
        lblNombre.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 180, -1));

        txtNumeroDeTelefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNumeroDeTelefono.setPreferredSize(new java.awt.Dimension(130, 25));
        txtNumeroDeTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDeTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroDeTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(130, 25));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 110, 30));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 100, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 100, -1));

        tblPersona.setModel(modelo);
        jScrollPane1.setViewportView(tblPersona);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 170, 200));

        txtNomBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomBuscarActionPerformed(evt);
            }
        });
        txtNomBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(txtNomBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        lblCodBus.setText("Nombre  persona a buscar");
        jPanel1.add(lblCodBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombre.getText();
        String numeroDeTelefono = txtNumeroDeTelefono.getText();
        
        
        
        if(!txtNombre.getText().isEmpty() || !txtNumeroDeTelefono.getText().isEmpty() || !txtNombre.getText().isEmpty()){
              Persona x = new Persona(nombre, numeroDeTelefono);
        vector.agregar(x);
        txtNombre.setText("");
        txtNumeroDeTelefono.setText("");
        txtNombre.requestFocus();
        }else{
              JOptionPane.showMessageDialog(null, "Datos no validos");
        }
      
      
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (vector.getTotalElementos() > 0)
          if (!txtNomBuscar.getText().isEmpty()) {
               
                 int pos = vector.busquedaRecursivaTelefono(txtNomBuscar.getText());
                 if(pos!=-1){
                      JOptionPane.showMessageDialog(null, "El numero de telefono es" + vector.returnTelefono(pos));
                        vector.mostrar(modelo, pos);
                        
                 }
                 else
                    JOptionPane.showMessageDialog(null, "Nombre no se encuentra registrado");
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNomBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNomBuscarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
           char c=evt.getKeyChar();
        if(!Character.isLetter(c)&& !(c == KeyEvent.VK_SPACE)&& !(c==KeyEvent.VK_BACK_SPACE) && !(c==KeyEvent.VK_DELETE))
           evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNumeroDeTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeTelefonoKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtNumeroDeTelefonoKeyTyped

    private void txtNomBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomBuscarKeyTyped
        // TODO add your handling code here:
           char c=evt.getKeyChar();
        if(!Character.isLetter(c)&& !(c == KeyEvent.VK_SPACE)&& !(c==KeyEvent.VK_BACK_SPACE) && !(c==KeyEvent.VK_DELETE))
           evt.consume();
    }//GEN-LAST:event_txtNomBuscarKeyTyped

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodBus;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDeTelefono;
    private javax.swing.JTable tblPersona;
    private javax.swing.JTextField txtNomBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroDeTelefono;
    // End of variables declaration//GEN-END:variables
}
