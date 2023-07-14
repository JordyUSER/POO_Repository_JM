package poo_l1_p7_metodos;
import javax.swing.JOptionPane; //Importamos a la clase que nos permite leer datos por teclado

public class Operadores {
    int num1;
    int num2;
    int suma, resta, division, multiplicacion;
    
    public void CaptuarNums(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    } //Metodo para leer datos por teclado
    
    public void Suma(){
        suma = num1 + num2;
    } //Metodo para realizar la suma de dos datos
    public void Resta(){
        resta = num1 - num2;
    } //Metodo para realizar la resta de dos datos
    public void Division(){
        division = num1 / num2;
    } //Metodo para realizar la division de dos datos
    public void Multiplicacion(){
        multiplicacion = num1 * num2;
    } //Metodo para realizar la multipliacion de dos datos

    
    public void ResultadoSum(){
        System.out.println("El resultado de la suma entre " + num1 + " + " + num2 + " es: " + suma);
    } //Metodo para mostrar la suma de dos datos
    public void ResultadoRes(){
        System.out.println("El resultado de la resta entre " + num1 + " + " + num2 + " es: " + resta);
    } //Metodo para mostrar la suma de dos datos
    public void ResultadoDiv(){
        System.out.println("El resultado de la division entre " + num1 + " + " + num2 + " es: " + division);
    } //Metodo para mostrar la suma de dos datos
    public void ResultadoMul(){
        System.out.println("El resultado de la multiplicacion entre " + num1 + " + " + num2 + " es: " + multiplicacion);
    } //Metodo para mostrar la suma de dos datos
}
