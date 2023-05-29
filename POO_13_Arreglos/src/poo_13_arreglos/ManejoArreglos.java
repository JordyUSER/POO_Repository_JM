package poo_13_arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordy Mejia
 */
public class ManejoArreglos {
    private int nNumeros = 0, arrNums[], aux = 0, prom = 0, nNombres = 0;
    String arrNombres[];

    public void setnNumeros(int nNumeros) {
        this.nNumeros = nNumeros;
    } // Permite establecer el numero que sera el tamaño del arreglo

    public void establecerArr() { //Establece todas las posiciones del arreglo
        arrNums = new int[this.nNumeros]; // Declara el tamaño del arreglo con el dato de nNumeros previamente adquirido
        for (int i = 0; i < this.nNumeros; i++) { // Permite recorrer el arreglo agregando datos
            arrNums[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero en el rango (0-20): "));
            if ((arrNums[i] >= 0) && (arrNums[i] <= 20)) { // Verifica que los numeros ingresados esten dentro del rango
                                                           // esperado
                continue;
            } else { // En caso de que no se cumple imprimira en pantalla que lo vuelva a hacer y
                     // restará una posicion en el arreglo para volver a establecerlo
                System.out.println("Ingrese nuevamente el dato entre 0 y 20...");
                i--;
            }
        }
    }

    public void mostrarArrC() { // Este metodo permite mostrar los elementos del arreglo usando un for simple
        for (int i = 0; i < this.nNumeros; i++) {
            System.out.print("El numero en la posicion " + i + " es: " + arrNums[i] + "\n");
        }
    }

    public void mostrarArrD() { // Este metodo permite mostrar los elementos del arreglo usando un for each
        for (int i : arrNums) {
            System.out.print("El numero en la posicion " + i + " es: " + arrNums[i] + "\n");
        }
    }

    public int sumaArrNums() { // Realiza la suma de cada uno de los elementos dentro del array haciendo uso de
                               // una variable auxiliar llamada aux
        aux = 0;
        for (int i = 0; i < this.nNumeros; i++) {
            aux += arrNums[i];
        }
        return aux;
    }

    public int promedioNums() { // Realiza el promedio todos los numeros ingresados al array haciendo uso de una
                                // variable auxiliar llamada prom
        prom = 0;
        for (int i = 0; i < this.nNumeros; i++) {
            prom += arrNums[i];
        }
        prom = prom / arrNums.length;
        return prom;
    }

    public int arrSize() { //Devuelve la cantidad de elementos que hay dentro del array usando la funcion .length
        return arrNums.length;
    }

    public void verPositive() { //Verifica si el numero de una posicion especifica del arreglo sea positivo o negativo
        if (this.arrNums[1] > 0) {
            System.out.println("El numero del arreglo en la posicion 1 es positivo");
        } else if (this.arrNums[1] == 0){
            System.out.println("El numero del arreglo en la posicion 1 es nulo");
        } else {
            System.out.println("El numero del arreglo en la posicion 1 es negativo");
        }
    }

    public void setnNombres(int nNombres) { //
        this.nNombres = nNombres;
    }  //Permite establecer el numero que sera el tamaño del arreglo de nombres

    public void establecerArrNombres() { //Establece todas las posiciones del arreglo
        arrNombres = new String[this.nNombres]; // Declara el tamaño del arreglo con el dato de nNombres previamente adquirido
        for (int i = 0; i < this.nNombres; i++) {
            arrNombres[i] = JOptionPane.showInputDialog("Ingrese un nombre: ");
        }
    }

    public int arrNombresSize() { //Devuelve la cantidad de nombres que hay dentro del array usando la funcion .length
        return arrNombres.length;
    }

    public void mostrarArrN() { // Este metodo permite mostrar los elementos del arreglo usando un for simple
        for (int i = 0; i < (arrNombres.length); i++) {
            System.out.print("El numero en la posicion " + i + " es: " + arrNombres[i] + "\n");
        }
    }
}