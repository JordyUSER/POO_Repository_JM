package poo_l1_p9_metodosparametrosargumentos;
import javax.swing.JOptionPane;
public class POO_L1_P9_MetodosParametrosArgumentos {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    
        Operators op1 = new Operators();
        
        op1.sumar(n1, n2);
        op1.resultadoSum();
        op1.restar(n1, n2);
        op1.resultadoRes();
        op1.multiplicar(n1, n2);
        op1.resultadoMul();
        op1.dividir(n1, n2);
        op1.resultadoDiv();
    }
    
}
