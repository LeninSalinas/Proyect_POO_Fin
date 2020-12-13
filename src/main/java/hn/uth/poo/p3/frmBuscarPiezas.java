/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3;

import hn.uth.poo.p3.recursos.clases.Piezas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class frmBuscarPiezas extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    DefaultTableModel tabla;
    Piezas piezas;
    int fila;
    public frmBuscarPiezas() {
        initComponents();
        setSize(704, 539);
        setLocationRelativeTo(null);
        tabla=new DefaultTableModel();
        piezas=new Piezas();
    }
    public void contenedorDeSets(){
            tabla=(DefaultTableModel) tbtTabla.getModel();
        
            piezas.setCodigo(Integer.parseInt(txtCodigo.getText()));
            piezas.setPrecio(Double.parseDouble(txtPrecio.getText()));
            piezas.setNombre((String) cbxProduc.getSelectedItem());
            piezas.setExistencia((String) cbxExistencia.getSelectedItem());
        
            Object columna[]={piezas.getCodigo(),piezas.getPrecio(),piezas.getNombre(),piezas.getExistencia()};
            tabla.addRow(columna);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtTabla = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        cbxProduc = new javax.swing.JComboBox<>();
        cbxExistencia = new javax.swing.JComboBox<>();
        btnChange = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codigo del produc");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 74, 144, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Producto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 161, 70, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Precio");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 80, 47, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Existencia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 160, 77, 22);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(210, 70, 133, 34);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(470, 70, 133, 34);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(140, 220, 111, 33);

        jScrollPane1.setToolTipText("");

        tbtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo del produc", "Precio", "Producto", "Existencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbtTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtTabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 280, 452, 220);

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 51, 51));
        lblTitulo.setText("Consulta de piezas");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(240, 20, 270, 40);

        cbxProduc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chasis", "Transmisión", "Neumático", "Llanta", "Motor explosión", "Codo escape", "Pipa resonante", "Carburador", "Filtro aire", "Amortiguador/muelle", "Suspensiones", "Paragolpes delantero", "Soportes carrocería", "Barra protectora antivuelco", "Depósito combustible", "Bandeja radio", "Macarrones de silicona" }));
        cbxProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProducActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProduc);
        cbxProduc.setBounds(160, 160, 180, 30);

        cbxExistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI EXISTE", "NO EXISTE" }));
        cbxExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxExistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxExistencia);
        cbxExistencia.setBounds(500, 160, 130, 30);

        btnChange.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnChange.setText("Realizar cambios");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChange);
        btnChange.setBounds(300, 220, 130, 30);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(490, 213, 140, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try {
            contenedorDeSets();
            Limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tbtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtTablaMouseClicked
        // TODO add your handling code here:        
        int FilaSeleccionada=tbtTabla.getSelectedRow();
        txtCodigo.setText(tbtTabla.getValueAt(FilaSeleccionada, 0).toString());
        txtPrecio.setText(tbtTabla.getValueAt(FilaSeleccionada, 1).toString());
        cbxProduc.setSelectedItem(tbtTabla.getValueAt(FilaSeleccionada, 2).toString());
        cbxExistencia.setSelectedItem(tbtTabla.getValueAt(FilaSeleccionada, 3).toString());
        fila=FilaSeleccionada;
    }//GEN-LAST:event_tbtTablaMouseClicked

    private void cbxProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProducActionPerformed

    private void cbxExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxExistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxExistenciaActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
        try {
            String info[]=new String[4];
            info[0]=txtCodigo.getText();
            info[1]=txtPrecio.getText();
            info[2]=(String) cbxProduc.getSelectedItem();
            info[3]=(String) cbxExistencia.getSelectedItem();
            for (int i = 0; i < tbtTabla.getColumnCount(); i++) {
                tabla.setValueAt(info[i], fila, i);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int elijoBotonParaEliminar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar?","Mensaje",JOptionPane.OK_CANCEL_OPTION);
        if (elijoBotonParaEliminar==0) {
            try {
                tabla=(DefaultTableModel) tbtTabla.getModel();

                piezas.setCodigo(Integer.parseInt(txtCodigo.getText()));
                piezas.setPrecio(Double.parseDouble(txtPrecio.getText()));
                piezas.setNombre((String) cbxProduc.getSelectedItem());
                piezas.setExistencia((String) cbxExistencia.getSelectedItem());

                int FilaSeleccionada=tbtTabla.getSelectedRow();
                tabla.removeRow(FilaSeleccionada);
                Limpiar();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    public void Limpiar(){
        txtCodigo.setText("");
        txtPrecio.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmBuscarPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBuscarPiezas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxExistencia;
    private javax.swing.JComboBox<String> cbxProduc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbtTabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
