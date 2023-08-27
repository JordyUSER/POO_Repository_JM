package view;

import mongodb_java.MongoConnection;
import com.mongodb.client.*;
import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.*;
import org.bson.Document;
import org.bson.types.ObjectId;
/**
 *
 * @author appka
 */
public class viewHorario extends JInternalFrame {
    
    MongoConnection con = new MongoConnection();
    MongoDatabase cc = con.conectar();
    
    JTextField txtNombre, txtEncargado;
    JButton boton1, boton2, boton3, boton4, boton5;
    public JTable tabla;
    public JPanel panel;
    public JComboBox<String> comHora, comHoraO, comDepartamento;
    
    public void resetFields(){
        txtNombre.setText("");
        txtEncargado.setText("");
        comDepartamento.setSelectedItem(null);
    }
    
    public viewHorario(){        
        this.setSize(800,500);

        //Para que se cierre el programa
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        iniciarComponentes();
    }
    
    @SuppressWarnings("Convert2Lambda")
    public void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaTxt();
        colocarComboBox();
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
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //damos color al panel
        panel.setBackground(Color.LIGHT_GRAY);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    
    public void colocarEtiquetas(){
        JLabel label = new JLabel("Horario", SwingConstants.CENTER); //Crea un nuevo label
        panel.add(label); //Añade el label al panel
        panel.setLayout(null); //Quita las coordenadas del label por defecto
        label.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label.setBounds(75,10,100,20); //Coloca nuevas coordenadas para el label
        label.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label2 = new JLabel("Nombre de Laboratorio:"); //Label de Codigo
        panel.add(label2); //Añade otro label al panel
        label2.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label2.setBounds(30, 50, 200, 25); //Coloca nuevas coordenadas para el label
        label2.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label5 = new JLabel("Encargado:"); //Label de Nombre
        panel.add(label5); //Añade otro label al panel
        label5.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label5.setBounds(30, 170, 200, 25); //Coloca nuevas coordenadas para el label
        label5.setForeground(Color.black); //Cambia el color de la fuente del label
        
        JLabel label6 = new JLabel("Departamento:"); //Label de Mail
        panel.add(label6); //Añade otro label al panel
        label6.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label6.setBounds(30, 110, 200, 25); //Coloca nuevas coordenadas para el label
        label6.setForeground(Color.black); //Cambia el color de la fuente del label
    }
    
    public void colocarCajaTxt(){
        txtNombre = new JTextField();
        txtNombre.setBounds(30,80,200,25);
        panel.add(txtNombre);
        txtNombre.setText("");
        txtEncargado = new JTextField();
        txtEncargado.setBounds(30,200,200,25);
        panel.add(txtEncargado);
        txtEncargado.setText("");
    }
    public void colocarBotones(){ //Metodo de botones
        boton1 = new JButton("Nuevo");
        boton1.setBounds(30,280,200,25);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        boton2 = new JButton("Guardar");
        boton2.setBounds(30,310,200,25);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('b');
        
        boton3 = new JButton("Editar");
        boton3.setBounds(30,340,200,25);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('v');
        
        boton4 = new JButton("Eliminar");
        boton4.setBounds(30,370,200,25);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('c');
        
        boton5 = new JButton("Cerrar");
        boton5.setBounds(30,400,200,25);
        panel.add(boton5);
        boton5.setEnabled(true);
        boton5.setMnemonic('n');
    }
    
    public void colocarComboBox(){
        comDepartamento = new JComboBox<>();
        comDepartamento.setBounds(30, 140, 200, 25);
        panel.add(comDepartamento);
        comDepartamento.addItem("Ciencias Exactas");
        comDepartamento.addItem("Ciencias Computacionales");
        comDepartamento.addItem("Ciencias Humanas");
        comDepartamento.addItem("Ciencias de la Salud");
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
        String titulos[] = {"ID", "Nombre", "Encargado", "Departamento"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
    }
    
    public void mostrarDatos(){
        MongoCollection<Document> collection = cc.getCollection("horarios");
        // Obtener todos los documentos de la colección
        FindIterable<Document> documents = collection.find();
        
        String titulos[] = {"ID", "Nombre", "Encargado", "Departamento"};
        String registro[] = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        try (MongoCursor<Document> cursor = documents.iterator()) {
            while(cursor.hasNext()){
                Document document = cursor.next();
                registro[0] = document.getObjectId("_id").toString();
                registro[1] = document.getString("Nombre");
                registro[2] = document.getString("Encargado");
                registro[3] = document.getString("Departamento");
                
                modelo.addRow(registro);
            }
            tabla.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos.");
            System.out.println("Hubo un error : " + e);
        }
        
    }
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {
        resetFields();
    }
    
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.out.println("SE DIO CLICK AL BOTON AGREGAR");
        
        //OBTENER VALORES
        String name = txtNombre.getText();
        String encargado = txtEncargado.getText();
        int select1 = comDepartamento.getSelectedIndex();
        
        resetFields(); //Reseteamos los campos

        if (name == null || encargado == null){
            JOptionPane.showMessageDialog(null, "Falta llenar los campos.");
            return;
        }
        MongoCollection<Document> collection = cc.getCollection("horarios");
        Document newDocument = new Document(
                "Nombre", name).append(
                "Encargado", encargado).append(
                "Departamento",String.valueOf(comDepartamento.getItemAt(select1)));
        
        collection.insertOne(newDocument);
        mostrarDatos();
    }
    
    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("SE DIO CLICK AL BOTON EDITAR");

        MongoCollection<Document> collection = cc.getCollection("horarios");

        //OBTENER VALORES
        String name = txtNombre.getText();
        String encargado = txtEncargado.getText();
        int select1 = comDepartamento.getSelectedIndex();
        resetFields(); //Reseteamos los campos

        int fila = tabla.getSelectedRow();
        ObjectId id = new ObjectId((String) tabla.getValueAt(fila, 0));

        Document newDocument = new Document(
                "Nombre", name).append(
                "Encargado", encargado).append(
                "Departamento",String.valueOf(comDepartamento.getItemAt(select1)));
        //Remplazamos el documento con el id igual
        collection.replaceOne(new Document("_id", id), newDocument);

        mostrarDatos();
    }
    
    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("SE DIO CLICK AL BOTON ELIMINAR");
        
        MongoCollection<Document> collection = cc.getCollection("horarios");
        
        int fila = tabla.getSelectedRow();
        ObjectId id = new ObjectId((String) tabla.getValueAt(fila, 0));
        
        collection.deleteOne(new Document("_id", id));
        
        mostrarDatos();
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
                new viewProfesor().setVisible(true);
            }
        });
    }
}
