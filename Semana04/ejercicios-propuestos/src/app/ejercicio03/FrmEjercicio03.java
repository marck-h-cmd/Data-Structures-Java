package app.ejercicio03;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio03 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ListaSimplementeEnlazadaCurso vector = new ListaSimplementeEnlazadaCurso();

    public FrmEjercicio03() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpl = new javax.swing.JTable();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        txtCreditos = new javax.swing.JTextField();
        btnOrdenar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbxCiclo = new javax.swing.JComboBox<>();
        lblCarrera = new javax.swing.JLabel();
        cbxCarrera = new javax.swing.JComboBox<>();
        btnMostrarCarrera = new javax.swing.JButton();
        cbxCarreraMostrar = new javax.swing.JComboBox<>();
        lblInfo = new javax.swing.JLabel();

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 100, 40));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 100, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 40));

        tblEmpl.setModel(modelo);
        jScrollPane1.setViewportView(tblEmpl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 480, 170));

        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 50));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 50));

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 110, 40));

        txtCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Creditos"));
        txtCreditos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCreditosKeyTyped(evt);
            }
        });
        jPanel1.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 50));

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 110, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 100, 40));

        cbxCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Ciclo*", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" }));
        jPanel1.add(cbxCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 100, 50));

        lblCarrera.setText("Seleccione Carrera");
        jPanel1.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 20));

        cbxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Carrera*", "Sistemas", "Mecanica", "Medicina", "Informatica", "Enfermeria" }));
        jPanel1.add(cbxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 100, 50));

        btnMostrarCarrera.setText("Mostrar Cursos Carrera");
        btnMostrarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCarreraActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 170, 40));

        cbxCarreraMostrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistemas", "Mecanica", "Medicina", "Informatica", "Enfermeria" }));
        jPanel1.add(cbxCarreraMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 30));

        lblInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInfo.setText("Registro Cursos");
        jPanel1.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String nom = txtNombre.getText();
            String codigo = txtCod.getText();
            String ciclo = cbxCiclo.getSelectedItem().toString();
            int creditos = Integer.parseInt(txtCreditos.getText());
            String carrera = cbxCarrera.getSelectedItem().toString();

            Curso x = new Curso(codigo, nom, ciclo, creditos, carrera);
            vector.insertarAlInicio(x);
            limpiar();
            txtCod.requestFocus();
            vector.mostrar(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alguno de los valores es incorrecto");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    public void limpiar() {

        txtNombre.setText("");
        txtCod.setText("");
        txtCreditos.setText("");
        cbxCiclo.setSelectedIndex(0);
        cbxCarrera.setSelectedIndex(0);
    }

    public void cambiarEstado(boolean estado) {

        btnEliminar.setEnabled(estado);
        btnAgregar.setEnabled(!estado);
        btnBuscar.setEnabled(!estado);

    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (vector.contar() > 0) {

            if (!txtCod.getText().isEmpty()) {

                Nodo pro = vector.buscar(txtCod.getText());
                if (pro != null) {

                    txtNombre.setText(pro.getInfo().getNombre());
                    txtCod.setText(pro.getInfo().getCodigo());
                    cbxCiclo.setSelectedItem(pro.getInfo().getCiclo());
                    cbxCarrera.setSelectedItem(pro.getInfo().getCarrera());
                    txtCreditos.setText(String.valueOf(pro.getInfo().getCreditos()));

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

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0)
            vector.mostrar(modelo);
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnTodosActionPerformed

    private void txtCreditosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtCreditosKeyTyped

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0) {
            vector.ordenarPorNombre();
            vector.mostrar(modelo);
        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    
        Nodo pro = vector.buscar(txtCod.getText());
        if (pro != null) {
            int a = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar?");
            if (a == JOptionPane.YES_OPTION) {
                vector.eliminar(pro.getInfo().getCodigo());
                JOptionPane.showMessageDialog(null, "El curso " + pro.getInfo().getNombre() + " ha sido eliminado");
                vector.mostrar(modelo);
                limpiar();
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

    private void btnMostrarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCarreraActionPerformed
        // TODO add your handling code here:

        String nombre = cbxCarreraMostrar.getSelectedItem().toString();
        ListaSimplementeEnlazadaCurso carreras = vector.getCarreras(nombre);

        if (carreras != null) {

            carreras.mostrar(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "Carrera con cursos no registrados");
        }


    }//GEN-LAST:event_btnMostrarCarreraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarCarrera;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private javax.swing.JComboBox<String> cbxCarrera;
    private javax.swing.JComboBox<String> cbxCarreraMostrar;
    private javax.swing.JComboBox<String> cbxCiclo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTable tblEmpl;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
