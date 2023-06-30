//Sobrecarga
package poo_parcial2_practica_10;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy
 */
public class POO_Parcial2_Practica_10 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ingrese su nomnbre: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        long ced = Long.parseLong(JOptionPane.showInputDialog("Ingrese su cedula: "));
        
        Persona p1 = new Persona(name, age, ced);
        
        p1.jugar();
        String juego = JOptionPane.showInputDialog("Ingrese un juego que este jugando");
        p1.jugar(juego);
    }
    
}
