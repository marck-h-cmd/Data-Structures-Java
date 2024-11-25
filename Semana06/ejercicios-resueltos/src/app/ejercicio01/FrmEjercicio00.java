package app.ejercicio01;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio00 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ListaDoblementeEnlazada LED = new ListaDoblementeEnlazada();

    public FrmEjercicio00() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpl = new javax.swing.JTable();
        txtCod = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbxSexo = new javax.swing.JComboBox<>();
        txtApellidos = new javax.swing.JTextField();
        txtSueldoEmp = new javax.swing.JTextField();
        txtAcumulado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText("Consultar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 110, 40));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 110, 40));

        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 110, 40));

        tblEmpl.setModel(modelo);
        jScrollPane1.setViewportView(tblEmpl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 480, 180));

        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO"));
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 50));

        txtSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("SUELDO"));
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
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 210, 50));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 210, 50));

        btnAtras.setText("Atras-Adelante");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 110, 40));

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 110, 40));

        btnAdelante.setText("Adelante-Atras");
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 110, 40));

        btnCancelar.setText("Restaurar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 110, 40));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --", "MASCULINO", "FEMENINO" }));
        cbxSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));
        jPanel1.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 50));

        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDOS"));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 200, 50));

        txtSueldoEmp.setEditable(false);
        txtSueldoEmp.setBorder(javax.swing.BorderFactory.createTitledBorder("EMPLEADO CON MAYOR SUELDO"));
        txtSueldoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoEmpActionPerformed(evt);
            }
        });
        jPanel1.add(txtSueldoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 50));

        txtAcumulado.setEditable(false);
        txtAcumulado.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO DE SUELDOS ACUMULADOS"));
        jPanel1.add(txtAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String nom = txtNombre.getText();
            String ape = txtApellidos.getText();
            String codigo = txtCod.getText();
            float sueldo = Float.parseFloat(txtSueldo.getText());
            String sexo = cbxSexo.getSelectedItem().toString();

            if (cbxSexo.getSelectedIndex() != 0) {
                // Empleado(String codigo, String nombre, String apellidos, String sexo, float sueldo)
                Empleado x = new Empleado(codigo, nom, ape, sexo, sueldo);
                LED.insertaAlFinal(x);
                limpiar();
                txtCod.requestFocus();
                mostrarMayor();
                mostrarMonto();
                LED.mostrarHaciaAdelante(modelo);

            }else{
                  JOptionPane.showMessageDialog(null, "Seleccione algun sexo valido");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alguno de los valores es incorrecto");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void mostrarMayor() {
        Nodo nod = LED.mayorSueldo();

        String concat = nod.getValor().getNombre() + " " + nod.getValor().getApellidos();

        txtSueldoEmp.setText(concat);

    }

    private void mostrarMonto() {
        double mon = LED.montoSueldos();

        txtAcumulado.setText(String.valueOf(mon));

    }

    public void limpiar() {

        txtNombre.setText("");
        txtCod.setText("");
        txtSueldo.setText("");
        txtApellidos.setText("");
        cbxSexo.setSelectedIndex(0);

    }

    public void cambiarEstado(boolean estado) {
        btnActualizar.setEnabled(estado);
        btnEliminar.setEnabled(estado);
        btnGuardar.setEnabled(!estado);
        btnBuscar.setEnabled(!estado);

    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (LED.contar() > 0) {

            if (!txtCod.getText().isEmpty()) {

                Nodo pro = LED.buscar(txtCod.getText());
                if (pro != null) {

                    txtNombre.setText(pro.getValor().getNombre());
                    txtCod.setText(pro.getValor().getCodigo());
                    txtSueldo.setText(String.valueOf(pro.getValor().getSueldo()));
                    txtApellidos.setText(pro.getValor().getApellidos());
                    cbxSexo.setSelectedItem(pro.getValor().getSexo());

                    cambiarEstado(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Codigo no se encuentra registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La caja de texto esta vacia");
            }
        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !(c == KeyEvent.VK_SPACE) && !(c == KeyEvent.VK_BACK_SPACE) && !(c == KeyEvent.VK_DELETE))
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
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c != '.' || txtSueldo.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try {

            Nodo pro1 = LED.buscar(txtCod.getText());
            if (pro1 != null) {
                String nom = txtNombre.getText();
                String ape = txtApellidos.getText();
                String codigo = txtCod.getText();
                float sueldo = Float.parseFloat(txtSueldo.getText());
                String sexo = cbxSexo.getSelectedItem().toString();

                Empleado x = new Empleado(codigo, nom, ape, sexo, sueldo);

                pro1.setValor(x);
                mostrarMayor();
                mostrarMonto();
                LED.mostrarHaciaAdelante(modelo);
                JOptionPane.showMessageDialog(null, "El producto " + pro1.getValor().getNombre() + " ha sido modificado");

            } else {
                JOptionPane.showMessageDialog(null, "El producto no ha sido encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alguno de los valores es incorrecto");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        // TODO add your handling code here:
        if (LED.contar() > 0) {
            mostrarMayor();
            LED.mostrarHaciaAdelante(modelo);

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        Nodo pro = LED.buscar(txtCod.getText());
        if (pro != null) {
            int a = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar?");
            if (a == JOptionPane.YES_OPTION) {
                LED.eliminar(pro.getValor().getCodigo());
                JOptionPane.showMessageDialog(null, "El Empleado " + pro.getValor().getNombre() + " ha sido eliminado");
                mostrarMayor();
                mostrarMonto();
                LED.mostrarHaciaAdelante(modelo);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Producto con codigo no registrado");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        cambiarEstado(false);
        txtCod.requestFocus();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:

        if (LED.contar() > 0) {

            mostrarMayor();
            mostrarMonto();
            LED.mostrarHaciaAtras(modelo);

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtSueldoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpl;
    private javax.swing.JTextField txtAcumulado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoEmp;
    // End of variables declaration//GEN-END:variables
}
