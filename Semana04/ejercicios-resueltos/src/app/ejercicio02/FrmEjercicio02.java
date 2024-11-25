package app.ejercicio02;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio02 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ListaSimplementeEnlazadaProductos vector = new ListaSimplementeEnlazadaProductos();

    public FrmEjercicio02() {
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
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        btnPrecio = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

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
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 100, 40));

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 100, 40));

        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 40));

        tblEmpl.setModel(modelo);
        jScrollPane1.setViewportView(tblEmpl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 480, 200));

        txtCod.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodKeyTyped(evt);
            }
        });
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 50));

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 130, 50));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 180, 50));

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, 40));

        txtStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Stock"));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 100, 50));

        btnPrecio.setText("Ingresar Precio");
        btnPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 110, 40));

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, 40));

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 110, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String nom = txtNombre.getText();
            String codigo = txtCod.getText();
            float precio = Float.parseFloat(txtPrecio.getText());
            int stock = Integer.parseInt(txtStock.getText());

            // Producto(String codigo, String descripcion, float precio, int stock, String categoria)
            Producto x = new Producto(codigo, nom, precio, stock);
            vector.agregar(x);
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
        txtPrecio.setText("");
        txtStock.setText("");
    }

    public void cambiarEstado(boolean estado) {
        btnModificar.setEnabled(estado);
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
                    txtPrecio.setText(String.valueOf(pro.getInfo().getPrecio()));
                    txtStock.setText(String.valueOf(pro.getInfo().getStock()));

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

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

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

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c != '.' || txtPrecio.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
        if (vector.contar() > 0)
            vector.mostrar(modelo);
        else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnTodosActionPerformed

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            evt.consume();
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {

            Nodo pro1 = vector.buscar(txtCod.getText());
            if (pro1 != null) {
                String nom = txtNombre.getText();
                String codigo = txtCod.getText();
                float precio = Float.parseFloat(txtPrecio.getText());
                int stock = Integer.parseInt(txtStock.getText());

                Producto pro2 = new Producto(codigo, nom, precio, stock);

                pro1.setInfo(pro2);
                vector.mostrar(modelo);
                JOptionPane.showMessageDialog(null, "El producto " + pro1.getInfo().getNombre() + " ha sido modificado");

            } else {
                JOptionPane.showMessageDialog(null, "El producto no ha sido encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alguno de los valores es incorrecto");
        }


    }//GEN-LAST:event_btnModificarActionPerformed

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
                JOptionPane.showMessageDialog(null, "El producto " + pro.getInfo().getNombre() + " ha sido eliminado");
                vector.mostrar(modelo);
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

    private void btnPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecioActionPerformed
        // TODO add your handling code here:

        if (vector.contar() > 0) {
            float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del precio"));
            ListaSimplementeEnlazadaProductos aux = new ListaSimplementeEnlazadaProductos();
            aux = vector.devolverLista(precio);
            aux.mostrar(modelo);

        } else
            JOptionPane.showMessageDialog(null, "El vector está vacío");
    }//GEN-LAST:event_btnPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPrecio;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpl;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
