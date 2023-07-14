package evaluacion1;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy Mejia
 */
public class Evaluacion1 {
    public static void main(String[] args) {
        int contador = 1;
        int option;
        String nombre, apellido;
        int edad;
        Boolean bandera;
        String aprobacion;
        
        Notas n1 = new Notas();
        Persona p1 = new Persona();
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        
        p1.setName(nombre);
        p1.setLastName(apellido);
        p1.setAge(edad);
        
        while(contador == 1){
            option = Integer.parseInt(JOptionPane.showInputDialog("\n" + 
                    "=============================\n" + 
                    "=========== Menu ============\n" +
                    "=============================\n" +
                    "1. Agregar nota\n" + 
                    "2. Ver nota media\n" +
                    "3. Ver si aprobó\n" + 
                    "4. Salir\n" +
                    "=============================\n" +
                    "Ingresar opción: \n"));            
            switch(option){
                case 1:
                    
                    n1.aggNota();
                    
                    break;
                case 2:
                    System.out.println("Calculando Media...");
                    n1.mediaNota();
                    System.out.println("Su Nota Media es: " + n1.getMedia());
                    break;
                case 3:
                    bandera = n1.notaAprobada();
                    if (bandera){
                        aprobacion = "Aprobado!!!";
                    } else {
                        aprobacion = "Reprobado!!";
                    }
                    System.out.println(p1.getName() + "\n" + 
                            p1.getLastName() + "\n" +
                            p1.getAge() + "\n" + 
                            "Usted ha " + aprobacion);
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa :D");
                    contador = -100;
                    break;
                default:
                    System.out.println("La opcoin ingresada no es valida. Vuelva a intentarlo...");
                    break;
            }
        }
    }
}
