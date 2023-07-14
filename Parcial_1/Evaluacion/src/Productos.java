import javax.swing.JOptionPane;

public class Productos {
	public String arrProd[];
	public int arrPrec[];
	
	public void establecerProd() {
        arrProd = new String[4];
        for(int i=0; i<4; i++){
            arrProd[i] = JOptionPane.showInputDialog("Ingrese el producto "+ (i+1) + ": ");
        }
    }
	
	public void establecerPrec() {
        arrPrec = new int[4];
        for(int i=0; i<4; i++){
            arrPrec[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto "+ (i+1) + ": "));
        }
    }
	
	public void mostrarArrProd() {
        for(int i=0; i<4;i++){
            System.out.print("El producto " + (i+1) + " es: " + arrProd[i] + " - $" + arrPrec[i] + "\n");
        }
    }
}
