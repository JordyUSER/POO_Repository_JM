package poo_13_arreglos;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy Mejia
 */
public class ManejoArreglos {
    int nNumeros = 0, arrNums[], aux=0, prom=0, nNombres =0;
    String arrNombres[];
    public int getnNumeros() {
        return nNumeros;
    }

    public void setnNumeros(int nNumeros) {
        this.nNumeros = nNumeros;
    }

    public void establecerArr() {
        arrNums = new int[this.nNumeros];
        for(int i=0; i<this.nNumeros; i++){
            arrNums[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero en el rango (0-20): "));
            if ((arrNums[i]>=0) && (arrNums[i]<=20)){
                continue;
            } else {
                System.out.println("Ingrese nuevamente el dato entre 0 y 20...");
                i--;
            }
        }
    }

    public void mostrarArrC() {
        for(int i=0; i<this.nNumeros;i++){
            System.out.print("El numero en la posicion " + i + " es: " + arrNums[i] + "\n");
        }
    }
    
    public void mostrarArrD() {
        for(int i: arrNums){
            System.out.print("El numero en la posicion " + i + " es: " + arrNums[i] + "\n");
        }
    }
    
    public int sumaArrNums() {
        aux = 0;
        for(int i=0; i < this.nNumeros; i++){
            aux += arrNums[i];
        }
        return aux;
    }
    
    public int promedioNums(){
        prom = 0;
        for(int i=0; i<this.nNumeros; i++){
            prom += arrNums[i];
        }
        prom = prom/arrNums.length;
        return prom;
    }

    public int arrSize() {
        return arrNums.length;  
    }

    public void setnNombres(int nNombres) {
        this.nNombres = nNombres;
    }

    public void verPositive() {
        if (this.arrNums[1] > 0) {
            System.out.println("El numero del arreglo en la posicion 1 es positivo");
        } else {
            System.out.println("El numero del arreglo en la posicion 1 es negativo");
        }
    }

    public void establecerArrNombres() {
        arrNombres = new String [this.nNombres];
        for(int i=0; i<this.nNombres; i++){
            arrNombres[i] = JOptionPane.showInputDialog("Ingrese un nombre: ");
        }
    }

    public int arrNombresSize() {
        return arrNombres.length;  
    }

    public void mostrarArrN() {
        for(int i=0; i<(arrNombres.length);i++){
            System.out.print("El numero en la posicion " + i + " es: " + arrNombres[i] + "\n");
        }
    }
}

