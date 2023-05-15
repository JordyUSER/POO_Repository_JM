package poo_l1_p9_metodosparametrosargumentos;
import javax.swing.JOptionPane;

public class Operators {
    int suma; int resta; int division; int multiplicacion;
    
    public void sumar(int num1, int num2){
        suma = num1 + num2;
    }
    
    public void restar(int num1, int num2){
        resta = num1-num2;
    }
    
    public void multiplicar(int num1, int num2){
        multiplicacion = num1*num2;
    }
    
    public void dividir(int num1, int num2){
        division = num1/num2;
    }
    
    public void resultadoSum(){
        System.out.println("El resultado de la suma es: " + suma);
    }
    public void resultadoRes(){
        System.out.println("El resultado de la resta es: " + resta);
    }
    public void resultadoMul(){
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    }
    public void resultadoDiv(){
        System.out.println("El resultado de la division es: " + division);
    }
    
}
