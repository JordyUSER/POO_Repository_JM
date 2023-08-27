/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Control.ConnectionDB;
import com.mysql.jdbc.*;
import java.awt.*;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.*;
import java.sql.ResultSet;

public class ViewLogin extends JFrame{
    
    ConnectionDB cc = new ConnectionDB(); //Creacion del objetos que conecta con la base de datos
    Connection con = cc.Conectar(); //Ejecucion del metodo para conectarse con la base de datos
    
    public JPanel panel;
    public JButton boton1, boton2;
    public JTextField txtUser;
    public JPasswordField txtPass;
    public ViewLogin(){
        this.setSize(600,400);
        setTitle("Login");

        //Para que se cierre el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Centrar la ventana
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarIngresoDatos();
        
        boton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        boton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        
        //damos color al panel
        panel.setBackground(Color.LIGHT_GRAY);
        
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("LOGIN", SwingConstants.CENTER); //Crea un nuevo label
        panel.add(label); //Añade el label al panel
        panel.setLayout(null); //Quita las coordenadas del label por defecto
        label.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label.setBounds(250, 20, 100, 50); //Coloca nuevas coordenadas para el label
        label.setForeground(Color.black); //Cambia el color de la fuente del label
        //label.setOpaque(true);
        
        JLabel label2 = new JLabel("USUARIO:");
        panel.add(label2); //Añade otro label al panel
        //label2.setHorizontalAlignment(HEIGHT);
        //label2.setLayout(null);
        label2.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label2.setBounds(100, 100, 150, 50); //Coloca nuevas coordenadas para el label
        label2.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label3 = new JLabel("CONTRASEÑA:");
        panel.add(label3); //Añade otro label al panel
        label3.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label3.setBounds(100, 150, 150, 50); //Coloca nuevas coordenadas para el label
        label3.setForeground(Color.black); //Cambia el color de la fuente del label
    }
    
    public void colocarBotones(){
        boton1 = new JButton("Registrar");
        panel.add(boton1);
        boton1.setBounds(100,260,400,30);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        boton2 = new JButton("Ingresar");
        panel.add(boton2);
        boton2.setBounds(100,220,400,30);
        boton2.setEnabled(true);       
    }
    
    public void colocarIngresoDatos(){
        txtUser = new JTextField();
        panel.add(txtUser);
        txtUser.setBounds(250, 110, 250, 30);
        txtUser.setText("");
        
        txtPass = new JPasswordField();
        panel.add(txtPass);
        txtPass.setBounds(250, 160, 250, 30);
        txtPass.setText("");
    }
    
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String pass = String.valueOf(txtPass.getPassword());
        String SQL = "INSERT INTO usuario(userUsuario, userPass)values(?,?)";
        try {
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,txtUser.getText());
            pst.setString(2,pass);
            pst.execute();
            JOptionPane.showMessageDialog(null, "USUARIO NUEVO REGISTRADO :D");
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {
        validarUsuario();
    }
    
    public void validarUsuario(){
        int resultado = 0;
        String userPass = String.valueOf(txtPass.getPassword());
        String userUsuario = txtUser.getText();
        String SQL = "SELECT * FROM usuario WHERE userUsuario= '"+userUsuario+"' and userPass='"+userPass+"'";
        try{
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if(rs.next()){
                resultado=1;
                if(resultado == 1){
                    viewMenu inicio = new viewMenu();
                    inicio.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "BIENVENIDO " +userUsuario+ " :D");
                } 
            } else {
                JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS, VUELVA A INGRESARLOS D:");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR LOGIN"+e.getMessage());
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }
}
