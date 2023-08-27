package View;

import Control.ConnectionDB;
import com.mysql.jdbc.*;
import java.awt.*;
import java.awt.event.*;

//import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.*;

//import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author appka
 */
public class ViewForm extends JInternalFrame {
    
    ConnectionDB cc = new ConnectionDB(); //Creacion del objetos que conecta con la base de datos
    Connection con = cc.Conectar(); //Ejecucion del metodo para conectarse con la base de datos
    
    JTextField txtCodigo, txtCedula, txtApellido, txtNombre, txtMail, txtTelefono, txtDireccion;
    JButton boton1, boton2, boton3, boton4, boton5;
    JRadioButton rbEstado;
    public JTable tabla;
    public JPanel panel;
    public JComboBox<String> comMateria;
    public ViewForm(){
        this.setSize(800,500);
        //setTitle("Registro");

        //Para que se cierre el programa
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //Centrar la ventana
        //setBounds(500,200,500,500);
        //setLocationRelativeTo(null);
        iniciarComponentes();
    }
    
    @SuppressWarnings("Convert2Lambda")
    public void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaTxt();
        colocarComboBox();
        colocarRadButtons();
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
        boton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        boton4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        boton5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        colocarTabla();
        ModelTableDefault();
        mostrarDatos();
        /*comMateria = new JComboBox<>();
        comMateria.setModel(new DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        comMateria.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        comMateriaActionPerformed(evt);
        }*/
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        
        //damos color al panel
        panel.setBackground(Color.LIGHT_GRAY);
        
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("Registrar", SwingConstants.CENTER); //Crea un nuevo label
        panel.add(label); //Añade el label al panel
        panel.setLayout(null); //Quita las coordenadas del label por defecto
        label.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label.setBounds(75,10,100,20); //Coloca nuevas coordenadas para el label
        label.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label2 = new JLabel("Codigo:"); //Label de Codigo
        panel.add(label2); //Añade otro label al panel
        label2.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label2.setBounds(20, 50, 100, 50); //Coloca nuevas coordenadas para el label
        label2.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label3 = new JLabel("Cedula:"); //Label de Cedula
        panel.add(label3); //Añade otro label al panel
        label3.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label3.setBounds(20, 75, 100, 50); //Coloca nuevas coordenadas para el label
        label3.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label4 = new JLabel("Apellido:"); //Label de Apellido
        panel.add(label4); //Añade otro label al panel
        label4.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label4.setBounds(20, 100, 100, 50); //Coloca nuevas coordenadas para el label
        label4.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label5 = new JLabel("Nombre:"); //Label de Nombre
        panel.add(label5); //Añade otro label al panel
        label5.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label5.setBounds(20, 125, 100, 50); //Coloca nuevas coordenadas para el label
        label5.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label6 = new JLabel("Mail:"); //Label de Mail
        panel.add(label6); //Añade otro label al panel
        label6.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label6.setBounds(20, 150, 100, 50); //Coloca nuevas coordenadas para el label
        label6.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label7 = new JLabel("Telefonos:"); //Label de Telefonos
        panel.add(label7); //Añade otro label al panel
        label7.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label7.setBounds(20, 175, 100, 50); //Coloca nuevas coordenadas para el label
        label7.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label8 = new JLabel("Direccion:"); //Label de Direccion
        panel.add(label8); //Añade otro label al panel
        label8.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label8.setBounds(20, 200, 100, 50); //Coloca nuevas coordenadas para el label
        label8.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label9 = new JLabel("Materia:"); //Label de Materia
        panel.add(label9); //Añade otro label al panel
        label9.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label9.setBounds(20, 225, 100, 50); //Coloca nuevas coordenadas para el label
        label9.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label10 = new JLabel("Estado:");
        panel.add(label10); //Añade otro label al panel
        label10.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label10.setBounds(20, 250, 100, 50); //Coloca nuevas coordenadas para el label
        label10.setForeground(Color.black); //Cambia el color de la fuente del label
    }
    
    public void colocarBotones(){ //Metodo de botones
        boton1 = new JButton("Nuevo");
        boton1.setBounds(30,300,100,40);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        boton2 = new JButton("Guardar");
        boton2.setBounds(140,300,100,40);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('b');
        
        boton3 = new JButton("Editar");
        boton3.setBounds(30,350,100,40);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('v');
        
        boton4 = new JButton("Eliminar");
        boton4.setBounds(140,350,100,40);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('c');
        
        boton5 = new JButton("Cerrar");
        boton5.setBounds(85,400,100,40);
        panel.add(boton5);
        boton5.setEnabled(true);
        boton5.setMnemonic('n');
        
        //JButton boton2 = new JButton("imagen");
        ImageIcon Img1 = new ImageIcon("rgs.png");
        
        /*boton2.setBounds(180,310,80,50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('b');
        
        boton2.setIcon(new ImageIcon(Img1.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));*/
    }
    
    public void colocarCajaTxt(){
        txtCodigo = new JTextField();
        txtCodigo.setBounds(130,65,100,25);
        panel.add(txtCodigo);
        txtCodigo.setText("");
        //System.out.println("el texto de la caja es: " + cajaTxt.getText());
        txtCedula = new JTextField();
        txtCedula.setBounds(130,90,100,25);
        panel.add(txtCedula);
        txtCedula.setText("");
        txtApellido = new JTextField();
        txtApellido.setBounds(130,115,100,25);
        panel.add(txtApellido);
        txtApellido.setText("");
        txtNombre = new JTextField();
        txtNombre.setBounds(130,140,100,25);
        panel.add(txtNombre);
        txtNombre.setText("");
        txtMail = new JTextField();
        txtMail.setBounds(130,165,100,25);
        panel.add(txtMail);
        txtMail.setText("");
        txtTelefono = new JTextField();
        txtTelefono.setBounds(130,190,100,25);
        panel.add(txtTelefono);
        txtTelefono.setText("");
        txtDireccion = new JTextField();
        txtDireccion.setBounds(130,215,100,25);
        panel.add(txtDireccion);
        txtDireccion.setText("");
        
        
    }
    public void colocarComboBox(){
        comMateria = new JComboBox<>();
        comMateria.setBounds(130, 240, 100, 20);
        panel.add(comMateria);
        comMateria.addItem("POO");
        comMateria.addItem("Computo");
        comMateria.addItem("Fisica");
        comMateria.addItem("EDO");
        comMateria.addItem("Calculo");  
        //comMateria.addItemListener();
    }
    
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==comMateria) {
            String seleccionado=(String)comMateria.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    
    public void colocarRadButtons(){
        rbEstado = new JRadioButton();
        rbEstado.setBounds(130, 265, 100, 20);
        
        panel.add(rbEstado);
        rbEstado.setText("Activo");
        rbEstado.setEnabled(true);
    }
    
    public void colocarTabla(){
        tabla = new JTable();
        //tabla.setBounds
        panel.add(tabla);
        tabla.setBackground(new Color(40, 45, 51));
        tabla.setForeground(new Color(255, 255, 255));
        tabla.setModel(new DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.setSelectionBackground(new Color(40, 45, 51));
        tabla.setSelectionForeground(new Color(40, 45, 51));
        tabla.setEnabled(true);
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(250, 10, 500, 430);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane); 
    }
    
    public void ModelTableDefault(){
        String titulos[] = {"ID", "Codigo", "Cedula", "Apellido", "Nombre", "Mail", "Telefono", "Direccion", "Materia", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
    }
    
    public void mostrarDatos(){
        String titulos[] = {"ID", "Codigo", "Cedula", "Apellido", "Nombre", "Mail", "Telefono", "Direccion", "Materia", "Estado"};
        String registro[] = new String[10];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM estudiantes";
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
               registro[0] = rs.getString("id");
               registro[1] = rs.getString("estuCodigo");
               registro[2] = rs.getString("estuCedula");
               registro[3] = rs.getString("estuApellido");
               registro[4] = rs.getString("estuNombre");
               registro[5] = rs.getString("estuMail");
               registro[6] = rs.getString("estuTelefono");
               registro[7] = rs.getString("estuDireccion");
               registro[8] = rs.getString("estuMateria");
               registro[9] = rs.getString("estuEstado");
               modelo.addRow(registro);
            }
            tabla.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos.");
            System.out.println(e);
        }
        
    }
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {
        txtCodigo.setText("");
        txtCedula.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtMail.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        comMateria.setSelectedItem(null);
        rbEstado.setSelected(false);
    }
    
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String SQL = "INSERT INTO estudiantes(estuCodigo, estuCedula, estuApellido, estuNombre, estuMail, estuTelefono, estuDireccion, estuMateria, estuEstado)values(?,?,?,?,?,?,?,?,?)";
        try {
            String estado; 
            if(rbEstado.isSelected()){
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            int select = comMateria.getSelectedIndex();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,txtCodigo.getText());
            pst.setString(2,txtCedula.getText());
            pst.setString(3,txtApellido.getText());
            pst.setString(4,txtNombre.getText());
            pst.setString(5,txtMail.getText());
            pst.setString(6,txtTelefono.getText());
            pst.setString(7,txtDireccion.getText());
            pst.setString(8,comMateria.getItemAt(select));
            pst.setString(9,estado);
            pst.execute();
            mostrarDatos();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String SQL = "UPDATE estudiantes set estuCodigo = ?, estuCedula = ?, estuApellido = ?, estuNombre = ?, estuMail = ?, estuTelefono = ?, estuDireccion = ?, estuMateria = ?, estuEstado = ? where id = ?";
            String estado; 
            if(rbEstado.isSelected()){
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            int fila = tabla.getSelectedRow();
            int select = comMateria.getSelectedIndex();
            String dao = (String) tabla.getValueAt(fila, 0);
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,txtCodigo.getText());
            pst.setString(2,txtCedula.getText());
            pst.setString(3,txtApellido.getText());
            pst.setString(4,txtNombre.getText());
            pst.setString(5,txtMail.getText());
            pst.setString(6,txtTelefono.getText());
            pst.setString(7,txtDireccion.getText());
            pst.setString(8,comMateria.getItemAt(select));
            pst.setString(9,estado);
            pst.setString(10, dao); 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
            mostrarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion"+e.getMessage());
        }
    }
    
    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int fila = tabla.getSelectedRow();
            System.out.println(tabla.getValueAt(fila, 0));
            String SQL = "DELETE FROM `estudiantes` WHERE  id = " + tabla.getValueAt(fila, 0);
            System.out.println("PASO1");
            Statement st = (Statement) con.createStatement();
            System.out.println("PASO2");
            int n = st.executeUpdate(SQL);
            System.out.println("PASO3");
            if (n >= 0){
                System.out.println("PASO4");
                JOptionPane.showMessageDialog(null, "Ya se elimino.");
            }
            mostrarDatos();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error.");
        }
    }
    
    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
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
                new ViewForm().setVisible(true);
            }
        });
    }
}
