
package poo_parcial2_practica_15;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy
 */
public class POO_Parcial2_Practica_15 {
    public static void main(String[] args) {
        boolean flag = true;
        Archivo a1 = new Archivo();
        do{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "\tMenu\t\n" +
                    "1. Crear Archivo\n" +
                    "2. Excribir en Archivo\n" +
                    "3. Leer Archivo\n"));
            switch(opcion){
                case 1:
                    a1.crearArchivo("C:\\Users\\ESPE.DESKTOP-MTB7TFC\\Documents\\Jordy_POO\\miArchivo");
                    break;
                case 2:
                    
            }    
        }while(flag!=false);
        
        
        
        
    }
}
