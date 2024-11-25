package app.ejercicio02;
import app.reutilizar.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio02 extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    Colas<Cliente> cl = new Colas();

    public FrmEjercicio02() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnEncolar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpl = new javax.swing.JTable();
        txtMonto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAtender = new javax.swing.JButton();
        txtAcumulado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 110, 40));

        btnEncolar.setText("Encolar");
        btnEncolar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEncolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, 40));

        tblEmpl.setModel(modelo);
        jScrollPane1.setViewportView(tblEmpl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 480, 180));

        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO"));
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 210, 50));

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
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 210, 50));

        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 110, 40));

        txtAcumulado.setEditable(false);
        txtAcumulado.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTOS ACUMULADOS"));
        jPanel1.add(txtAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        try {
            String nom = txtNombre.getText();
            float monto = Float.parseFloat(txtMonto.getText());

            Cliente x = new Cliente(nom, monto);
            cl.encolar(x);
            limpiar();
            txtNombre.requestFocus();
            mostrar(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alguno de los valores es incorrecto");
        }
    }//GEN-LAST:event_btnEncolarActionPerformed

    public void limpiar() {

        txtNombre.setText("");

        txtMonto.setText("");

    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !(c == KeyEvent.VK_SPACE) && !(c == KeyEvent.VK_BACK_SPACE) && !(c == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c != '.' || txtMonto.getText().contains(".")))
            evt.consume();
    }//GEN-LAST:event_txtMontoKeyTyped

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        // TODO add your handling code here:

        Cliente clien = cl.desencolar();

        if (clien != null) {

            montoTotal = montoTotal + clien.getMonto();
            JOptionPane.showMessageDialog(null, "El Cliente " + clien.getNombre() + " ha sido atendido");
            mostrar(modelo);
            txtAcumulado.setText(String.valueOf(montoTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado ");
        }

    }//GEN-LAST:event_btnAtenderActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public void mostrar(DefaultTableModel modelo) {
        Nodo<Cliente> p = cl.getPrimero();
        int i = 0;

        Object datos[][] = new Object[contar()][5];
        String titulos[] = {"Nombres", "Monto"};
        while (p != null) {

            datos[i][0] = p.getInfo().getNombre();
            datos[i][1] = p.getInfo().getMonto();

            i++;

            p = p.getSgte();
        }
        modelo.setDataVector(datos, titulos);

    }
    
    public int contar() {
        int c = 0;
        Nodo p = cl.getPrimero();
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpl;
    private javax.swing.JTextField txtAcumulado;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private static double montoTotal = 0f;

}
