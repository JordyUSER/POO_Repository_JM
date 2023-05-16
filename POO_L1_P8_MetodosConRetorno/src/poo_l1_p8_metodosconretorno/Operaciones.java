package poo_l1_p8_metodosconretorno;

public class Operaciones {
    public int sumar(int num1, int num2){ //Método de tipo entero que recibe y devuelve la suma de estos.
        int suma = num1+num2;
        return suma;
    }
    public int restar(int num1, int num2){ //Método de tipo entero que recibe y devuelve la resta de estos.
        int resta = num1-num2;
        return resta;
    }
    public int multiplicar(int num1, int num2){ //Método de tipo entero que recibe y devuelve la multiplicacion de estos.
        int multiplicacion = num1*num2;
        return multiplicacion;
    }
    public int dividir(int num1, int num2){ //Método de tipo entero que recibe y devuelve la division de estos.
        int division = num1/num2;
        return division;
    }
    
    public void resultadosSum(int suma){ //Método de tipo void que recibe datos enteros y muestra la suma.
        System.out.println("El resultado de la suma es: " + suma);
    }
    public void resultadosRes(int resta){ //Método de tipo void que recibe datos enteros y muestra la resta.
        System.out.println("El resultado de la resta es: " + resta);
    }
    public void resultadosMul(int multiplicacion){ //Método de tipo void que recibe datos enteros y muestra la multiplicacion.
        System.out.println("El resultado de la multipliacion es: " + multiplicacion);
    }
    public void resultadosDiv(int division){ //Método de tipo void que recibe datos enteros y muestra la division.
        System.out.println("El resultado de la division es: " + division);
    }
}
