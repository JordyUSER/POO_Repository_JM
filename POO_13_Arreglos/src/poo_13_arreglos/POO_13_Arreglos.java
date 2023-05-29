package poo_13_arreglos; //verifica si el numero del array en la posicion [1] ***es positivo (me toco numero 2)***
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy Mejia
 */
public class POO_13_Arreglos {
    public static void main(String[] args) {
        int option, n;
        ManejoArreglos obj1 = new ManejoArreglos();
        
        option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                "===============================\n" +
                "              Menu             \n" +
                "===============================\n" +
                "1. Crear un arreglo numerico.\n" +
                "2. Crear un arreglo de nombres.\n" +
                "3. Salir"));
        switch(option){
            case 1:
                int option2;
                
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desee tenga el arreglo numeico: "));
                obj1.setnNumeros(n);
                obj1.getnNumeros();
                obj1.establecerArr();
                
                option2 = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                    "1. Sumar todos los numeros del arreglo.\n" +
                    "2. Promedio de todo los numeros del arreglo.\n" +
                    "3. Cantidad de numeros del arreglos.\n" +
                    "4. Salir"));
                switch(option2){
                    case 1:
                        System.out.println(obj1.sumaArrNums());
                        break;
                    case 2:
                        System.out.println(obj1.promedioNums());
                        break;
                }
                
                System.out.println("Mostrando arreglos por for normal.");
                obj1.mostrarArrC();
                System.out.println("Mostrando arreglos por for each.");
                obj1.mostrarArrD();
        }
    }
    
}
