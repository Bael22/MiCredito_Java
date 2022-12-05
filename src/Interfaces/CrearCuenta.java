/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interfaces;
import Clases.Cuenta;

import Clases.Cliente;
import Clases.leerArchivo;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class CrearCuenta extends javax.swing.JDialog {
private Cuenta c=null;private Cliente cl=null;

    public Cuenta getC() {
        return c;
    }

    public Cliente getCl() {
        return cl;
    }
    
    public CrearCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlugarn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfechan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtgrado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttarjeta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfechavenci = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 130, -1));

        jLabel1.setText("PreNombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, -1));

        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        getContentPane().add(txtlugarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));

        jLabel3.setText("Lugar Nacimiento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(txtfechan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));

        jLabel4.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        getContentPane().add(txtsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 130, -1));

        jLabel5.setText("Sexo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        getContentPane().add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, -1));

        jLabel6.setText("Estado Civil:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        getContentPane().add(txtgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 140, -1));

        jLabel7.setText("Grado de Instrucción:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 20));
        getContentPane().add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, 30));

        jLabel8.setText("DNI:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 20));
        getContentPane().add(txttarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 140, 30));

        jLabel9.setText("Nro. Tarjeta:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, 20));
        getContentPane().add(txtfechavenci, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 140, 30));

        jLabel10.setText("Fecha Vencimiento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 20));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 140, -1));

        jLabel11.setText("Codigo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 20));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 190, 30));

        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        //try{
        cl=new Cliente(txtnombre.getText(), txtapellido.getText(), txtlugarn.getText(), txtfechan.getText(),
                txtsexo.getText(), txtestado.getText(), txtgrado.getText(),
                Long.parseLong(txtdni.getText()));
        c=new Cuenta(cl,Long.parseLong(txttarjeta.getText()),txtfechavenci.getText(),Integer.parseInt(txtcodigo.getText()));
        leerArchivo l=new leerArchivo("cuenta.txt");
        LinkedList<Cliente> client=l.obtenerCliente();
        LinkedList<Cuenta> cuent=l.obtenerCuenta();
        client.add(cl);cuent.add(c);
        
        l.ActualizarCliente(client);l.ActualizarCuenta(cuent);
        this.setVisible(false);
        //}catch(Exception e)
        //{JOptionPane.showInputDialog(e.getMessage()+"1");
            
        //}
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearCuenta dialog = new CrearCuenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtfechan;
    private javax.swing.JTextField txtfechavenci;
    private javax.swing.JTextField txtgrado;
    private javax.swing.JTextField txtlugarn;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txttarjeta;
    // End of variables declaration//GEN-END:variables
}
