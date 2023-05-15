package poo_l1_p8_metodosconretorno;
import javax.swing.JOptionPane;

public class POO_L1_P8_MetodosConRetorno {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    
    Operaciones op1 = new Operaciones();
    
    op1.resultadosSum(op1.sumar(n1, n2));
    op1.resultadosRes(op1.restar(n1, n2));
    op1.resultadosMul(op1.multiplicar(n1, n2));
    op1.resultadosDiv(op1.dividir(n1, n2));
    
    }
    
}
