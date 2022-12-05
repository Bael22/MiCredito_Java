/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interfaces;

import Clases.Cliente;
import Clases.Cuenta;
import Clases.Transaccion;
import Clases.leerArchivo;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Otorga_Credito extends javax.swing.JDialog {

    private Cliente cliente;
    private Cuenta cuenta;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public Otorga_Credito(javax.swing.JDialog parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        leerArchivo a=new leerArchivo(" ");
        Cliente cll=a.obtenerCliente1();
        Cuenta ccc=a.obtenerCuenta1();
        setCliente(cll);setCuenta(ccc);
        //JOptionPane.showMessageDialog(null, cll+" "+ccc);
        txt.setText(cll.getPrenombre()+" "+cll.getApellidos()+"   Nro Tarjeta: "+
                ccc.getNumeroTarj());
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeleditar = new javax.swing.JLabel();
        txtcredito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcuota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        btnotorga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeleditar.setText("Cliente:");
        getContentPane().add(labeleditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 20));
        getContentPane().add(txtcredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, -1));

        jLabel2.setText("Cuotas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 20));
        getContentPane().add(txtcuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 130, -1));

        jLabel3.setText("Credito:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 20));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 140, -1));

        btnotorga.setText("Otorgar");
        btnotorga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotorgaActionPerformed(evt);
            }
        });
        getContentPane().add(btnotorga, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 140, -1));

        jLabel1.setText("Otorgacion de crédito");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        txt.setEditable(false);
        getContentPane().add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        
    }//GEN-LAST:event_formMouseMoved

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void btnotorgaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotorgaActionPerformed
        leerArchivo l=new leerArchivo("");
        Cuenta o=l.obtenerCuenta1();
        Transaccion aa= new Transaccion(o,Integer.parseInt(txtcuota.getText()),
                Double.parseDouble(txtcredito.getText()),false);
                l.ActualizarTransaccion(aa);
                this.setVisible(false);
    }//GEN-LAST:event_btnotorgaActionPerformed

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
            java.util.logging.Logger.getLogger(Otorga_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Otorga_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Otorga_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Otorga_Credito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Otorga_Credito dialog = new Otorga_Credito(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnotorga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labeleditar;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txtcredito;
    private javax.swing.JTextField txtcuota;
    // End of variables declaration//GEN-END:variables
}
