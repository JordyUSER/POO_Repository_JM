import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ordenamientos{
    int nNumeros = 0, arr[], aux;
    ArrayList<Carros> cars = new ArrayList<Carros>(); //Declaración de un array con ArrayList
    public int getnNumeros() {
        return nNumeros;
    }

    public void setnNumeros(int nNumeros) {
        this.nNumeros = nNumeros;
    }

    public void establecerArr() {
        arr = new int[this.nNumeros];
        for(int i=0; i<this.nNumeros; i++){
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
    }

    public void mostrarArrC() {
        for(int i=0; i<this.nNumeros;i++){
            System.out.print("El numero en la posicion " + i + " es: " + arr[i] + "\n");
        }
    }

    public void mostrarArrD() {
        for(int i=(this.nNumeros); i>0;i--){
            System.out.print("El numero en la posicion " + i + " es: " + arr[i-1] + "\n");
        }
    }

    public void OrdBurbuja(){
        for(int i=0;i<(this.nNumeros-1);i++){
            for(int j=0;j<(this.nNumeros-i-1);j++){
                if(arr[j]>arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public void OrdInsercion(){
        for(int i=0;i<this.nNumeros;i++){
            int pos = i;
            int aux1 = arr[i];
            while ((pos>0) && (arr[pos-1]>aux1)) {
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = aux1;
        }
    }

}
