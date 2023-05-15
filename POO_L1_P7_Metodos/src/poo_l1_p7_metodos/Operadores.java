package poo_l1_p7_metodos;
import javax.swing.JOptionPane;

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
    
    public void Resultado(){
        System.out.println("El resultado de la suma entre " + num1 + " + " + num2 + " es: " + suma);
    } //Metodo para mostrar la suma de dos datos
}
