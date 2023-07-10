package poo_parcial2_practica_16;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy
 */
public class POO_Parcial2_Practica_16 {
    public static void main(String[] args) {
        Circulo c1;
        Triangulo tri1;
        Trapecio tra1;
        double base, altura, radio, baseMin, baseMax;
        String color = JOptionPane.showInputDialog("Ingrese el color de la figura");
        int option = Integer.parseInt(JOptionPane.showInputDialog(
                "\tMenu\n" +
                "1. Circulo\n" + 
                "2. Triangulo\n" +
                "3. Trapecio\n\n" +
                "Ingrese una opcion: "));
        switch(option){
            case 1:
                radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo."));
                c1 = new Circulo(color, radio);
                c1.mostrarDatos();
                break;
            case 2:
                base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo."));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altur del rectangulo."));
                tri1 = new Triangulo(color, base, altura);
                tri1.mostrarDatos();
                break;
            case 3:
                baseMin = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base menor del trapecio."));
                baseMax = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base mayor del trapecio."));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altur del trapecio."));
                tra1 = new Trapecio(color, baseMin, baseMax, altura);
                tra1.mostrarDatos();
                break;
            default:
                System.out.println("\nIngrese una opcion valida...");
                break;
        }
    }
    
}
