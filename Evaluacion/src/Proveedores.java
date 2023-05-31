import javax.swing.JOptionPane;

public class Proveedores {
	public String arrProv[];

    public void establecerProv() {
        arrProv = new String[2];
        for(int i=0; i<2; i++){
            arrProv[i] = JOptionPane.showInputDialog("Ingrese el proveedor "+ (i+1) + ": ");
        }
    }
    
    public void mostrarArrProv() {
        for(int i=0; i<2;i++){
            System.out.print("El provedor " + (i+1) + " es: " + arrProv[i] + "\n");
        }
    }
}
