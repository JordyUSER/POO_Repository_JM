package poo_l1_p8_metodosconretorno;

import javax.swing.JOptionPane;

public class Operaciones {
    public int sumar(int num1, int num2){
        int suma = num1+num2;
        
        return suma;
    }
    
    public int restar(int num1, int num2){
        int resta = num1-num2;
        
        return resta;
    }
    
    public int multiplicar(int num1, int num2){
        int multiplicacion = num1*num2;
        
        return multiplicacion;
    }
    
    public int dividir(int num1, int num2){
        int division = num1/num2;
        
        return division;
    }
    
    public void resultadosSum(int suma){
        System.out.println("El resultado de la suma es: " + suma);
    }
    public void resultadosRes(int resta){
        System.out.println("El resultado de la resta es: " + resta);
    }
    public void resultadosMul(int multiplicacion){
        System.out.println("El resultado de la multipliacion es: " + multiplicacion);
    }
    public void resultadosDiv(int division){
        System.out.println("El resultado de la division es: " + division);
    }
}
