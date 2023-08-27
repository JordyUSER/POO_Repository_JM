package view;

import java.time.*;
import java.time.format.DateTimeFormatter;
import plantilla_itext.plantilla;
import mongodb_java.MongoConnection;
import com.mongodb.client.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import org.bson.Document;

/**
 *
 * @author appka
 */
public class getHorario extends JInternalFrame {

    MongoConnection con = new MongoConnection();
    MongoDatabase cc = con.conectar();

    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedTime = time.format(formatter);

    plantilla plant;
    JTextField txtNombre, txtEncargado, txtApellido;
    JTextArea txtArea;
    JButton boton1, boton2, boton3, boton4;
    public JTable tabla;
    public JPanel panel;
    public JComboBox<String> comDia, comHora, comHoraO, comDepartamento, comNombre;

    public void resetFields() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEncargado.setText("");
        comDia.setSelectedItem(null);
        comNombre.setSelectedItem(null);
        comHora.setSelectedItem(null);
        comHoraO.setSelectedItem(null);
        comDepartamento.setSelectedItem(null);
        txtArea.setText("");
    }

    public getHorario() {
        this.setSize(800, 500);

        //Para que se cierre el programa
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        iniciarComponentes();
    }

    @SuppressWarnings("Convert2Lambda")
    public void iniciarComponentes() {
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaTxt();
        colocarAreaTxt();
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
                try {
                    boton2ActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(getHorario.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    }

    private void colocarPanel() {
        panel = new JPanel();
        //damos color al panel
        panel.setBackground(Color.LIGHT_GRAY);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }

    public void colocarEtiquetas() {
        JLabel label = new JLabel("Peticion de Horario", SwingConstants.CENTER); //Crea un nuevo label
        panel.add(label); //Añade el label al panel
        panel.setLayout(null); //Quita las coordenadas del label por defecto
        label.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label.setBounds(275, 10, 200, 20); //Coloca nuevas coordenadas para el label
        label.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel labelN = new JLabel("Apellidos:"); //Label de Codigo
        panel.add(labelN); //Añade otro label al panel
        labelN.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        labelN.setBounds(30, 50, 200, 25); //Coloca nuevas coordenadas para el label
        labelN.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel labelProp = new JLabel("Proposito:"); //Label de Codigo
        panel.add(labelProp); //Añade otro label al panel
        labelProp.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        labelProp.setBounds(430, 50, 200, 25); //Coloca nuevas coordenadas para el label
        labelProp.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel labelL = new JLabel("Nombres:"); //Label de Codigo
        panel.add(labelL); //Añade otro label al panel
        labelL.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        labelL.setBounds(30, 80, 200, 25); //Coloca nuevas coordenadas para el label
        labelL.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel label2 = new JLabel("Nombre de Laboratorio:"); //Label de Codigo
        panel.add(label2); //Añade otro label al panel
        label2.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label2.setBounds(30, 110, 200, 25); //Coloca nuevas coordenadas para el label
        label2.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel label3 = new JLabel("Dia:"); //Label de Cedula
        panel.add(label3); //Añade otro label al panel
        label3.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label3.setBounds(30, 140, 100, 25); //Coloca nuevas coordenadas para el label
        label3.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel label4 = new JLabel("Entrada:"); //Label de Apellido
        panel.add(label4); //Añade otro label al panel
        label4.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label4.setBounds(30, 170, 100, 25); //Coloca nuevas coordenadas para el label
        label4.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel labelh = new JLabel("Salida:"); //Label de Apellido
        panel.add(labelh); //Añade otro label al panel
        labelh.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        labelh.setBounds(30, 200, 100, 25); //Coloca nuevas coordenadas para el label
        labelh.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel label5 = new JLabel("Encargado del Laboratorio:"); //Label de Nombre
        panel.add(label5); //Añade otro label al panel
        label5.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label5.setBounds(30, 230, 200, 25); //Coloca nuevas coordenadas para el label
        label5.setForeground(Color.black); //Cambia el color de la fuente del label

        JLabel label6 = new JLabel("Departamento:"); //Label de Mail
        panel.add(label6); //Añade otro label al panel
        label6.setFont(new Font("arial", Font.PLAIN, 14)); //Cambia la funte y su tamaño
        label6.setBounds(30, 260, 200, 25); //Coloca nuevas coordenadas para el label
        label6.setForeground(Color.black); //Cambia el color de la fuente del label
    }

    public void colocarCajaTxt() {

        txtNombre = new JTextField();
        txtNombre.setBounds(205, 80, 150, 25);
        panel.add(txtNombre);
        txtNombre.setText("");
        txtApellido = new JTextField();
        txtApellido.setBounds(205, 50, 150, 25);
        panel.add(txtApellido);
        txtApellido.setText("");
        txtEncargado = new JTextField();
        txtEncargado.setBounds(205, 230, 150, 25);
        panel.add(txtEncargado);
        txtEncargado.setText("");

    }

    public void colocarAreaTxt() {
        txtArea = new JTextArea();
        txtArea.setBounds(430, 80, 325, 200);
        panel.add(txtArea);
        txtArea.setText("");

        JScrollPane barra = new JScrollPane(txtArea);
        barra.setBounds(430, 80, 325, 200);
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barra);
    }

    public void colocarBotones() { //Metodo de botones
        boton1 = new JButton("Nuevo");
        boton1.setBounds(30, 340, 325, 25);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');

        boton2 = new JButton("PDF");
        boton2.setBounds(430, 340, 325, 25);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('v');

        boton3 = new JButton("Actualizar");
        boton3.setBounds(30, 370, 325, 25);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('c');

        boton4 = new JButton("Cerrar");
        boton4.setBounds(430, 370, 325, 25);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('n');
    }

    public void colocarComboBox() {
        comNombre = new JComboBox<>();
        comNombre.setBounds(205, 110, 150, 25);
        panel.add(comNombre);

        MongoCollection<Document> collection = cc.getCollection("horarios");

        String campoDeseado = "Nombre"; // Cambia esto al nombre real del campo

        // Crea una proyección para recuperar solo el campo deseado
        Document projection = new Document(campoDeseado, 1);

        // Obtén un cursor para iterar sobre los documentos
        FindIterable<Document> documents = collection.find().projection(projection);
        String auxVal;

        for (Document document : documents) {
            // Obtiene el valor del campo deseado para cada documento
            Object valorCampo = document.get(campoDeseado);
            auxVal = String.valueOf(valorCampo);
            comNombre.addItem(auxVal);
        }

        comDia = new JComboBox<>();
        comDia.setBounds(205, 140, 150, 25);
        panel.add(comDia);
        comDia.addItem("Lunes");
        comDia.addItem("Martes");
        comDia.addItem("Miercoles");
        comDia.addItem("Jueves");
        comDia.addItem("Viernes");
        comHora = new JComboBox<>();
        comHora.setBounds(205, 170, 150, 25);
        panel.add(comHora);
        comHora.addItem("07:00");
        comHora.addItem("09:00");
        comHora.addItem("11:00");
        comHora.addItem("14:00");
        comHora.addItem("16:00");
        comHoraO = new JComboBox<>();
        comHoraO.setBounds(205, 200, 150, 25);
        panel.add(comHoraO);
        comHoraO.addItem("09:00");
        comHoraO.addItem("11:00");
        comHoraO.addItem("13:00");
        comHoraO.addItem("16:00");
        comHoraO.addItem("18:00");
        comDepartamento = new JComboBox<>();
        comDepartamento.setBounds(205, 260, 150, 25);
        panel.add(comDepartamento);
        comDepartamento.addItem("Exactas");
        comDepartamento.addItem("Computacionales");
        comDepartamento.addItem("Humanas");
        comDepartamento.addItem("Salud");
        comDepartamento.addItem("Quimica");
    }

    public void mostrarDatos() {
        MongoCollection<Document> collection = cc.getCollection("horarios");
        String campoDeReferencia = "Nombre"; // Cambia esto al nombre real del campo
        int select = comNombre.getSelectedIndex();
        Object valorDeReferencia = String.valueOf(comNombre.getItemAt(select)); // Cambia esto al valor real
        Document filtro = new Document(campoDeReferencia, valorDeReferencia);

        FindIterable<Document> documents = collection.find(filtro);

        for (Document document : documents) {
            // Obtiene el dato deseado del documento encontrado
            Object datoDeseado = document.get("Encargado"); // Cambia esto al nombre real del campo deseado
            txtEncargado.setText(String.valueOf(datoDeseado));
        }
        txtEncargado.disable();
    }

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {
        resetFields();
    }

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        System.out.println("SE DIO CLICK AL BOTON PDF");

        //OBTENER VALORES
        int select = comDia.getSelectedIndex();
        int select1 = comHora.getSelectedIndex();
        int select3 = comHoraO.getSelectedIndex();
        int select2 = comDepartamento.getSelectedIndex();
        int select4 = comNombre.getSelectedIndex();

        plant = new plantilla(txtApellido.getText(), txtNombre.getText(), date, formattedTime,
                txtEncargado.getText(), String.valueOf(comNombre.getItemAt(select4)),
                txtArea.getText(), String.valueOf(comDepartamento.getItemAt(select2)),
                String.valueOf(comHora.getItemAt(select1)), String.valueOf(comHoraO.getItemAt(select3)),
                String.valueOf(comDia.getItemAt(select)));
        plant.crearPlantilla();
        resetFields(); //Reseteamos los campos
    }

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarDatos();
    }

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {
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
