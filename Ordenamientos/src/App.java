import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int a;
        Ordenamientos obj1 = new Ordenamientos();
        a = Integer.parseInt(JOptionPane.showInputDialog("Especifique la cantidad de numeros que va a ingresar: "));

        obj1.setnNumeros(a);
        obj1.establecerArr();
        obj1.mostrarArrC();
        obj1.OrdBurbuja();
        System.out.println("\n");
        obj1.mostrarArrC();
        System.out.println("\n");
        obj1.mostrarArrD();
    }
}
