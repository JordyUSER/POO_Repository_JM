package poo_l1_p9_metodosparametrosargumentos;

public class Operators {
    int suma; int resta; int division; int multiplicacion;
    
    public void sumar(int num1, int num2){ //Metodo que realiza la suma
        suma = num1 + num2;
    }
    public void restar(int num1, int num2){ //Metodo que realiza la resta
        resta = num1-num2;
    }
    public void multiplicar(int num1, int num2){ //Metodo que realiza la multiplicacion
        multiplicacion = num1*num2;
    }
    public void dividir(int num1, int num2){ //Metodo que realiza la division
        division = num1/num2;
    }
    
    public void resultadoSum(){ //Metodo que muestra la suma
        System.out.println("El resultado de la suma es: " + suma);
    }
    public void resultadoRes(){ //Metodo que muestra la resta
        System.out.println("El resultado de la resta es: " + resta);
    }
    public void resultadoMul(){ //Metodo que muestra la multiplicacion
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    }
    public void resultadoDiv(){ //Metodo que muestra la division
        System.out.println("El resultado de la division es: " + division);
    }
}
