package poo_13_arreglos; //verifica si el numero del array en la posicion [1] ***es positivo (me toco numero 2)***

import javax.swing.JOptionPane;

/**
 *
 * @author Jordy Mejia
 */
public class POO_13_Arreglos {
    public static void main(String[] args) {
        int option, option2 = 0, option3 = 0, n, flag = -2, tam;
        ManejoArreglos obj1 = new ManejoArreglos();
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                    "\n===============================\n" +
                    "              Menu             \n" +
                    "===============================\n" +
                    "1. Crear un arreglo numerico.\n" +
                    "2. Crear un arreglo de nombres.\n" +
                    "3. Salir"));
            switch (option) {
                case 1:
                    int flag1 = -2;
                    do {
                        if (option2 == 0) {
                            n = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Ingrese la cantidad de numeros que desee tenga el arreglo numerico: "));
                            obj1.setnNumeros(n);
                            obj1.establecerArr();
                        }
                        option2 = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                                "1. Sumar todos los numeros del arreglo.\n" +
                                "2. Promedio de todo los numeros del arreglo.\n" +
                                "3. Cantidad de numeros del arreglos.\n" +
                                "4. Verificar si el numero en la posición 1 es positivo.\n" +
                                "5. Salir"));
                        switch (option2) {
                            case 1:
                                System.out.println("La suma de todos los numeros dados es: " + obj1.sumaArrNums());
                                break;
                            case 2:
                                System.out.println("El promedio de los numeros dados es: " + obj1.promedioNums());
                                break;
                            case 3:
                                System.out.println("El tamaño del arreglo es: " + obj1.arrSize());
                                break;
                            case 4:
                                obj1.verPositive();
                                break;
                            case 5:
                                flag1 = 1;
                                option2 = 0;
                        }
                    } while (flag1 != 1);
                    break;
                case 2:
                    int flag2 = -2;
                    do {
                        if (option3 == 0) {
                            tam = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Ingrese la cantidad de numeros que desee tenga el arreglo de nombres: "));
                            obj1.setnNombres(tam);
                            obj1.establecerArrNombres();
                        }
                        option3 = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                                "1. Mostrar los elementos dentro del arreglo.\n" +
                                "2. Cantidad de nombres del arreglos.\n" +
                                "3. Salir"));
                        switch (option3) {
                            case 1:
                                System.out.print("Los elementos dentro del arreglo son: \n");
                                obj1.mostrarArrN();
                                break;
                            case 2:
                                System.out.println(
                                        "La cantidad de nombres dentro del arreglo es: " + obj1.arrNombresSize());
                                break;
                            case 3:
                                flag2 = 1;
                                option3 = 0;
                        }
                    } while (flag2 != 1);
                    break;
                case 3:
                    flag = 1;
                    System.out.println("Hasta luego");
                    break;
            }
        } while (flag != 1);
    }
}
