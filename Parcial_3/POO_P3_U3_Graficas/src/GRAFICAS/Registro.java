package GRAFICAS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
/**
 *
 * @author appka
 */
public class Registro extends JFrame {
//Creamos una ventana gráfica cln JFrame
    
    public JPanel panel;
    public Registro(){
        this.setSize(500,500);
        setTitle("Registro");

        //Para que se cierre el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Centrar la ventana
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaTxt();
        colocarAreaTxt();
    }
    private void colocarPanel(){
        panel = new JPanel();
        
        //damos color al panel
        panel.setBackground(Color.BLUE);
        
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    public void colocarEtiquetas(){
        JLabel label = new JLabel("REGISTRAR", SwingConstants.CENTER); //Crea un nuevo label
        panel.add(label); //Añade el label al panel
        panel.setLayout(null); //Quita las coordenadas del label por defecto
        label.setBounds(100,10,300,50); //Coloca nuevas coordenadas para el label
        label.setForeground(Color.orange); //Cambia el color de la fuente del label
        label.setOpaque(true);
        //Creamos otro objeto
        JLabel label1 = new JLabel("NOMBRE: JORDY MEJIA", SwingConstants.CENTER);
        //label1.setText();
        
        panel.add(label1); //Añade otro label al panel
        label1.setHorizontalAlignment(HEIGHT);
        
        label1.setFont(new Font("arial", Font.PLAIN, 16)); //Cambia la funte y su tamaño
        label1.setBounds(50, 400, 350, 50); //Coloca nuevas coordenadas para el label
        label1.setForeground(Color.red); //Cambia el color de la fuente del label
        //label1.setOpaque(true);
        
        //Imagen
        JLabel labelImg = new JLabel();
        ImageIcon Img = new ImageIcon("descarga.png");
        labelImg.setBounds(30,80,50,50);
        panel.add(labelImg);
        labelImg.setIcon(new ImageIcon(Img.getImage().getScaledInstance(labelImg.getWidth(), labelImg.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    public void colocarBotones(){
        JButton boton1 = new JButton("CLICK");
        boton1.setBounds(30,310,100,50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        boton1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5,true));
        
        
        JButton boton2 = new JButton("imagen");
        ImageIcon Img1 = new ImageIcon("rgs.png");
        
        boton2.setBounds(180,310,80,50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('b');
        
        boton2.setIcon(new ImageIcon(Img1.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    public void colocarCajaTxt(){
        JTextField cajaTxt = new JTextField();
        cajaTxt.setBounds(200,200,100,60);
        panel.add(cajaTxt);
        cajaTxt.setText("BOOOOOF!..");
        System.out.println("el texto de la caja es: " + cajaTxt.getText());
    }
    
    public void colocarAreaTxt(){
        JTextArea txtArea = new JTextArea();
        txtArea.setBounds(10,200,100,60);
        panel.add(txtArea);
        txtArea.setText("BOOOOOF!..");
        txtArea.append("AGG algo");
        
        JScrollPane barra = new JScrollPane(txtArea);
        barra.setBounds(10,200,100,60);
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(barra);
        
        
        
    }
}
