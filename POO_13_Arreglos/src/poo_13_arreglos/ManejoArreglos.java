package poo_13_arreglos;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy Mejia
 */
public class ManejoArreglos {
    int nNumeros = 0, arrNums[], aux=0, prom=0;
    String nNombres = "";
    public int getnNumeros() {
        return nNumeros;
    }

    public void setnNumeros(int nNumeros) {
        this.nNumeros = nNumeros;
    }

    public void establecerArr() {
        arrNums = new int[this.nNumeros];
        for(int i=0; i<this.nNumeros; i++){
            arrNums[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
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
        for(int i: arrNums){
            aux += arrNums[i];
        }
        return aux;
    }
    
    public int promedioNums(){
        for(int i: arrNums){
            prom += arrNums[i];
        }
        prom = prom/this.nNumeros;
        return prom;
    }
}
