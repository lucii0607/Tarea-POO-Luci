
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.lambdaworks.crypto.SCryptUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Registrar extends javax.swing.JDialog{
    //Connection connect=null;
    //Statement sentencia=null;

    /**
     * Creates new form Registrar
     */
    public Registrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Registrar Usuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        bgRol = new javax.swing.ButtonGroup();
        lblNombreR = new javax.swing.JLabel();
        txtNombreR = new javax.swing.JTextField();
        lblApellidoR = new javax.swing.JLabel();
        txtApellidoR = new javax.swing.JTextField();
        lblRutR = new javax.swing.JLabel();
        txtRutR = new javax.swing.JTextField();
        lblEdadR = new javax.swing.JLabel();
        rbMascR = new javax.swing.JRadioButton();
        lblSexoR = new javax.swing.JLabel();
        rbOtroR = new javax.swing.JRadioButton();
        rbFemR = new javax.swing.JRadioButton();
        pswPassR = new javax.swing.JPasswordField();
        lblPassR = new javax.swing.JLabel();
        jsEdadR = new javax.swing.JSpinner();
        lblUsuarioR = new javax.swing.JLabel();
        txtUsuarioR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAceptarR = new javax.swing.JButton();
        btnSalirR = new javax.swing.JButton();
        chbEmpleado = new javax.swing.JCheckBox();
        chbAdmin = new javax.swing.JCheckBox();
        lblRolR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblNombreR.setText("Nombre");

        lblApellidoR.setText("Apellido");

        lblRutR.setText("Rut");

        lblEdadR.setText("Edad");

        bgSexo.add(rbMascR);
        rbMascR.setText("Masculino");

        lblSexoR.setText("Sexo");

        bgSexo.add(rbOtroR);
        rbOtroR.setText("Otro");

        bgSexo.add(rbFemR);
        rbFemR.setText("Femenino");

        pswPassR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswPassRActionPerformed(evt);
            }
        });

        lblPassR.setText("Contraseña");

        lblUsuarioR.setText("Usuario");

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Registrar");

        btnAceptarR.setText("Aceptar");
        btnAceptarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRActionPerformed(evt);
            }
        });

        btnSalirR.setText("Salir");
        btnSalirR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRActionPerformed(evt);
            }
        });

        bgRol.add(chbEmpleado);
        chbEmpleado.setText("Empleado");

        bgRol.add(chbAdmin);
        chbAdmin.setText("Administrador");

        lblRolR.setText("Rol");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassR)
                            .addComponent(lblUsuarioR)
                            .addComponent(lblNombreR)
                            .addComponent(lblApellidoR)
                            .addComponent(lblRutR)
                            .addComponent(lblEdadR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswPassR, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsEdadR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRutR, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSexoR)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbOtroR)
                            .addComponent(rbFemR)
                            .addComponent(rbMascR)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRolR)
                            .addGap(25, 25, 25)
                            .addComponent(chbAdmin)
                            .addGap(18, 18, 18)
                            .addComponent(chbEmpleado))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAceptarR)
                            .addGap(10, 10, 10)
                            .addComponent(btnSalirR))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAceptarR, btnSalirR});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pswPassR, txtApellidoR, txtNombreR, txtRutR, txtUsuarioR});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioR)
                    .addComponent(txtUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassR)
                    .addComponent(pswPassR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreR)
                    .addComponent(txtNombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoR)
                    .addComponent(txtApellidoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRutR)
                    .addComponent(txtRutR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadR)
                    .addComponent(jsEdadR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbEmpleado)
                    .addComponent(chbAdmin)
                    .addComponent(lblRolR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSexoR)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMascR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFemR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOtroR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarR)
                    .addComponent(btnSalirR))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAceptarR, btnSalirR});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRActionPerformed
        
        //this.dispose(); 
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirRActionPerformed

    
    private void btnAceptarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRActionPerformed
        String usuario = txtUsuarioR.getText();
        String contraseña = pswPassR.getText();
        String nombre = txtNombreR.getText();
        String apellido = txtApellidoR.getText();
        String rut = txtRutR.getText();
        byte edad = Byte.parseByte(jsEdadR.getValue().toString());
        byte rol = 0;
        String hash = SCryptUtil.scrypt(contraseña, 16,16,16);
        
        if(chbAdmin.isSelected()){
            rol = 0;
        }else{
           rol = 1;
        }
        
        char sexo=' ';
        
        if(rbMascR.isSelected()){
            sexo = rbMascR.getText().charAt(0);
        }else{
            sexo = rbFemR.getText().charAt(0);
        }
        
        String insert="INSERT INTO usuarios VALUES ('"+ usuario +"','"+ hash +"','"+nombre+"','"+apellido+"','"+rut+"','"+sexo+"',"+edad+","+rol+")";
        
        Sql sql = new Sql();
        sql.conectar();
        
        ResultSet datos = sql.where("usuarios", "usuario", usuario);
        if(datos==null){
            System.out.println("null uwu");
        }
        
        sql.sentence(insert);
        sql.desconectar();
        this.dispose();
        

        
    }//GEN-LAST:event_btnAceptarRActionPerformed

    private void pswPassRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswPassRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswPassRActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registrar dialog = new Registrar(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgRol;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnAceptarR;
    private javax.swing.JButton btnSalirR;
    private javax.swing.JCheckBox chbAdmin;
    private javax.swing.JCheckBox chbEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jsEdadR;
    private javax.swing.JLabel lblApellidoR;
    private javax.swing.JLabel lblEdadR;
    private javax.swing.JLabel lblNombreR;
    private javax.swing.JLabel lblPassR;
    private javax.swing.JLabel lblRolR;
    private javax.swing.JLabel lblRutR;
    private javax.swing.JLabel lblSexoR;
    private javax.swing.JLabel lblUsuarioR;
    private javax.swing.JPasswordField pswPassR;
    private javax.swing.JRadioButton rbFemR;
    private javax.swing.JRadioButton rbMascR;
    private javax.swing.JRadioButton rbOtroR;
    private javax.swing.JTextField txtApellidoR;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtRutR;
    private javax.swing.JTextField txtUsuarioR;
    // End of variables declaration//GEN-END:variables
}
