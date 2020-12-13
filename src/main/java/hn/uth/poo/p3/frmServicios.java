/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3;

import hn.uth.poo.p3.recursos.clases.Carros;
import hn.uth.poo.p3.recursos.clases.Cliente;
import hn.uth.poo.p3.recursos.clases.Placa;
import hn.uth.poo.p3.recursos.clases.Servicios;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class frmServicios extends javax.swing.JFrame {

    /**
     * Creates new form frmServicios
     */
    public frmServicios() {
        initComponents();
        this.getContentPane().setBackground(Color.BLUE);
        setSize(620, 516);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblServicio = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        cboLista = new javax.swing.JComboBox<>();
        btnEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPlaca1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lblServicio.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblServicio.setText("Seccion Servicio");
        getContentPane().add(lblServicio);
        lblServicio.setBounds(220, 20, 180, 30);

        lblNombre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblNombre.setText("Nombre del Cliente");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(80, 140, 140, 18);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(240, 130, 160, 30);

        lblCodigo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblCodigo.setText("Placa del carro");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(90, 210, 100, 18);

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(240, 280, 170, 30);

        lblPrecio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblPrecio.setText("Precio del servicio");
        getContentPane().add(lblPrecio);
        lblPrecio.setBounds(90, 280, 130, 20);

        cboLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavado\t", "Alineado", "Balanceo", "Lavado de Motor", "Pintar el carro", "Enderesamiento", "Cambio de aceite", "Revisado de los borners", "Mantenimiento del carro", "Sistemas de freno", "Servicio Electronico", "Baterias", "Reparación", "Sistema de inyeccion" }));
        cboLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboListaMouseClicked(evt);
            }
        });
        cboLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboListaActionPerformed(evt);
            }
        });
        getContentPane().add(cboLista);
        cboLista.setBounds(200, 360, 190, 30);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(230, 450, 103, 23);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 0, 510, 440);

        txtPlaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPlaca1);
        txtPlaca1.setBounds(240, 200, 170, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void cboListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboListaActionPerformed
        // TODO add your handling code here:
        Servicios servicio=new Servicios();
        int itemTexto=cboLista.getSelectedIndex();
        switch (itemTexto) {
            case 0:
            servicio.setPrecio(342);
            break;
            case 1:
            servicio.setPrecio(360);
            break;
            case 2:
            servicio.setPrecio(744);
            break;
            case 3:
            servicio.setPrecio(415);
            break;
            case 4:
            servicio.setPrecio(561);
            break;
            case 5:
            servicio.setPrecio(934);
            break;
            case 6:
            servicio.setPrecio(321);
            break;
            case 7:
            servicio.setPrecio(503);
            break;
            case 8:
            servicio.setPrecio(211);
            break;
            case 9:
            servicio.setPrecio(123);
            break;
            case 10:
            servicio.setPrecio(3432);
            break;
            case 11:
            servicio.setPrecio(321);
            break;
            case 12:
            servicio.setPrecio(2312);
            break;
            
            default:
            break;
        }
        txtPrecio.setText(String.valueOf(servicio.getPrecio()));
    }//GEN-LAST:event_cboListaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        try {
           boolean Existe=false;
           String Placa= "";
            String NombreCliente ="";
            Cliente clientes = new Cliente();
            Carros carros= new Carros();
            clientes.setNombre(txtNombre.getText());  
            carros.setPlaca(new Placa(txtPrecio.getText()));
//           Existe= new ClienteNegocios().BuscarB(clientes);      
            
            JOptionPane.showMessageDialog(null, "Enviando", "EXITO", JOptionPane.INFORMATION_MESSAGE);;
            if (Existe) {
                    
                NombreCliente=txtNombre.getText();
             
            } else {
              
              frmCliente cliente=new frmCliente();
              cliente.setVisible(true); 
        
            } 
            Existe= false;
//            Existe= new CarrosNegocios().BuscarB(carros);
//            List<Cliente> listaClientes = new ClienteNegocios().Buscar(clientes);
            
             if (Existe) {
                    
                Placa=txtPrecio.getText();
              
            } else {
              
              frmCarro Carro =new frmCarro();
              Carro.setVisible(true); 
        
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

//        LimpiarCampos();                   
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void cboListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboListaMouseClicked
//         TODO add your handling code here:
    }//GEN-LAST:event_cboListaMouseClicked

    private void txtPlaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cboLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca1;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
