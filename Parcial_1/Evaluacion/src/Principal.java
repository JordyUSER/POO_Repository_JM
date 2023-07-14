//Gestion de pedidos
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int flag = 4;
		String [] peds = new String[2];
		int nPeds = 0;
		int pedMay = 0;
		int n = 0;
		int option;
		int facturado = 0;
		Productos prod1 = new Productos();
		Proveedores prov1 = new Proveedores();
		Pedido ped1 = new Pedido();
		
		do {
            option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                    "\n===============================\n" +
                    "              Menu             \n" +
                    "===============================\n" +
                    "1. Productos.\n" +
                    "2. Proveedores.\n" +
                    "3. Nuevo pedido.\n" +
                    "4. Pedido mayor.\n" +
                    "5. Total facultado.\n" +
                    "6. Salir"));
            switch(option) {
            	case 1:
            		prod1.establecerProd();
            		prod1.establecerPrec();
            		prod1.mostrarArrProd();
            		break;
            	case 2:
            		prov1.establecerProv();
            		prov1.mostrarArrProv();
            		break;
            	case 3:
            		int prod = Integer.parseInt(JOptionPane.showInputDialog(
            				"Productos\n" +
            				"1. " + prod1.arrProd[0] + " - $" + prod1.arrPrec[0] + "\n" + 
            				"2. " + prod1.arrProd[1] + " - $" + prod1.arrPrec[1] + "\n" +
            				"3. " + prod1.arrProd[2] + " - $" + prod1.arrPrec[2] + "\n" +
            				"4. " + prod1.arrProd[3] + " - $" + prod1.arrPrec[3] + "\n" +
            				"Seleccione el producto que desea comprar:"));
            		int cant = Integer.parseInt(JOptionPane.showInputDialog(
            				"Cantidad de produtos: "));
            		int prov = Integer.parseInt(JOptionPane.showInputDialog(
            				"Provedores\n" +
            				"1. " + prov1.arrProv[0] + "\n" + 
            				"2. " + prov1.arrProv[1] + "\n" + 
            				"Seleccione su provedor:"));
            		peds[n] = ped1.setPedido(prod1.arrProd[prod-1], prov1.arrProv[prov-1], (prod1.arrPrec[prod-1]*cant), cant);
            		facturado += (prod1.arrPrec[prod-1]*cant); 
            		if ((prod1.arrPrec[prod-1]*cant) > facturado) {
            			pedMay = n;
            		}
            		ped1.getPedido(nPeds);
            		n++;
            		break;
            	case 4:
            		System.out.println("El pedido mayor es: " + "\n"  + peds[pedMay]);
            		break;
            	case 5:
            		System.out.println("El total facturado es: " + facturado);
            		break;
            	case 6:
            		System.out.println("Gracias por usar.");
            		flag = 1;
            		break;
            	default:
            		System.out.println("Ingrese una opcion correcta.");
            		break;
            }
		} while(flag != 1);
	}
}
