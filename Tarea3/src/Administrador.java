
import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Administrador extends javax.swing.JDialog {

    /**
     * Creates new form Administrador
     */
    public Administrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Administrar usuarios");
        llenarLista();
        btnAceptarA.setVisible(false); //BORRAR CUANDO SEA UPDATE
    }
    
    public void llenarLista(){
        try{
            Sql sql = new Sql();
            sql.conectar();
            ResultSet datos = sql.select("usuario", "usuarios");
            DefaultListModel model = new DefaultListModel();
            lstUsuariosA.setModel(model);
            
            //model.setRowCount(0);
            while(datos.next()){
                model.addElement(datos.getString("usuario"));
            }
            System.out.println("Seleccion exitosa");
            sql.desconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al seleccionar \n"+ex,"Error",3);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbOtroA = new javax.swing.JRadioButton();
        rbFemA = new javax.swing.JRadioButton();
        chbEmpleadoA = new javax.swing.JCheckBox();
        chbAdminA = new javax.swing.JCheckBox();
        jsEdadA = new javax.swing.JSpinner();
        lblUsuarioA = new javax.swing.JLabel();
        lblRoA = new javax.swing.JLabel();
        txtUsuarioA = new javax.swing.JTextField();
        btnAceptarA = new javax.swing.JButton();
        lblNombreA = new javax.swing.JLabel();
        txtNombreA = new javax.swing.JTextField();
        lblApellidoA = new javax.swing.JLabel();
        txtApellidoA = new javax.swing.JTextField();
        lblRutA = new javax.swing.JLabel();
        txtRutA = new javax.swing.JTextField();
        lblEdadA = new javax.swing.JLabel();
        rbMascA = new javax.swing.JRadioButton();
        btnSalirA = new javax.swing.JButton();
        lblSexoA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuariosA = new javax.swing.JList<>();
        lblTituloA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rbOtroA.setText("Otro");

        rbFemA.setText("Femenino");

        chbEmpleadoA.setText("Empleado");

        chbAdminA.setText("Administrador");

        lblUsuarioA.setText("Usuario");

        lblRoA.setText("Rol");

        btnAceptarA.setText("Aceptar");
        btnAceptarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAActionPerformed(evt);
            }
        });

        lblNombreA.setText("Nombre");

        lblApellidoA.setText("Apellido");

        lblRutA.setText("Rut");

        lblEdadA.setText("Edad");

        rbMascA.setText("Masculino");

        btnSalirA.setText("Salir");
        btnSalirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAActionPerformed(evt);
            }
        });

        lblSexoA.setText("Sexo");

        lstUsuariosA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstUsuariosA);

        lblTituloA.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        lblTituloA.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuarioA)
                        .addGap(27, 27, 27)
                        .addComponent(txtUsuarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreA)
                            .addComponent(lblApellidoA)
                            .addComponent(lblRutA)
                            .addComponent(lblEdadA)
                            .addComponent(lblRoA)
                            .addComponent(lblSexoA))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chbAdminA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbEmpleadoA))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreA)
                                .addComponent(txtRutA)
                                .addComponent(txtApellidoA, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jsEdadA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbFemA)
                                    .addComponent(rbMascA)
                                    .addComponent(rbOtroA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAceptarA)
                                .addGap(21, 21, 21)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalirA)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloA)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(lblTituloA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuarioA)
                            .addComponent(txtUsuarioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreA)
                            .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidoA)
                            .addComponent(txtApellidoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRutA)
                            .addComponent(txtRutA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdadA)
                            .addComponent(jsEdadA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(chbAdminA)
                            .addComponent(lblRoA)
                            .addComponent(chbEmpleadoA))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(rbMascA)
                                    .addComponent(lblSexoA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFemA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbOtroA))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAceptarA))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirA)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAActionPerformed
        
        //ESTE DEBE SER UPDATE!!!!  
        
        String usuario = txtUsuarioA.getText();
        String nombre = txtNombreA.getText();
        String apellido = txtApellidoA.getText();
        String rut = txtRutA.getText();
        byte edad = Byte.parseByte(jsEdadA.getValue().toString());
        byte rol = 0;

        if(chbAdminA.isSelected()){
            rol = 0;
        }else{
            rol = 1;
        }

        char sexo=' ';

        if(rbMascA.isSelected()){
            sexo = rbMascA.getText().charAt(0);
        }else{
            sexo = rbFemA.getText().charAt(0);
        }

        String insert="INSERT INTO usuarios VALUES ('"+ usuario +"','"+nombre+"','"+apellido+
                "','"+rut+"','"+sexo+"',"+edad+","+rol+")";
        Sql sql = new Sql();
        sql.conectar();
        ResultSet datos = sql.where("usuarios", "usuario", usuario);
        if(datos==null){
            System.out.println("null uwu");
        }

        sql.sentence(insert);
        sql.desconectar();
        this.setVisible(false);
        //this.dispose();

    }//GEN-LAST:event_btnAceptarAActionPerformed

    private void btnSalirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirAActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administrador dialog = new Administrador(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptarA;
    private javax.swing.JButton btnSalirA;
    private javax.swing.JCheckBox chbAdminA;
    private javax.swing.JCheckBox chbEmpleadoA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsEdadA;
    private javax.swing.JLabel lblApellidoA;
    private javax.swing.JLabel lblEdadA;
    private javax.swing.JLabel lblNombreA;
    private javax.swing.JLabel lblRoA;
    private javax.swing.JLabel lblRutA;
    private javax.swing.JLabel lblSexoA;
    private javax.swing.JLabel lblTituloA;
    private javax.swing.JLabel lblUsuarioA;
    private javax.swing.JList<String> lstUsuariosA;
    private javax.swing.JRadioButton rbFemA;
    private javax.swing.JRadioButton rbMascA;
    private javax.swing.JRadioButton rbOtroA;
    private javax.swing.JTextField txtApellidoA;
    private javax.swing.JTextField txtNombreA;
    private javax.swing.JTextField txtRutA;
    private javax.swing.JTextField txtUsuarioA;
    // End of variables declaration//GEN-END:variables
}
