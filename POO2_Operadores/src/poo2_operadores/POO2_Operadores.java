package poo2_operadores;

public class POO2_Operadores {
    public static void main(String[] args) {
        int val1 = 2;
        int val2 = 6;
        int suma = val1 + val2, resta = val1 - val2, multiplicacion = val1 * val2, division = val2 / val1, resto = val2 % val1;
        
        
        System.out.println("La suma de " + val1 + " + " + val2 + " = " + suma);
        System.out.println("La resta de " + val1 + " - " + val2 + " = " + resta);
        System.out.println("La multiplicacion de " + val1 + " * " + val2 + " = " + multiplicacion);
        System.out.println("La division de " + val2 + " / " + val1 + " = " + division);
        System.out.println("El resto de " + val2 + " % " + val1 + " = " + resto);
    }
    
}
