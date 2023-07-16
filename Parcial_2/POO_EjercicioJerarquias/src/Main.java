import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		Estandar e1;
		Ofertado o1;
		System.out.println(
				"Establecer productos Estandar ...\n");
		String name = JOptionPane.showInputDialog("Ingrese el tipo de producto que va a ingresar: ");
		String seccion = JOptionPane.showInputDialog("Ingrese la seccion: ");
		
		
		e1 = new Estandar(name, seccion);
		e1.setProds();
		e1.setPrice();
		
		e1.getProds();
		e1.getPrice();
		
		int prod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese producto: "));
		int unit = Integer.parseInt(JOptionPane.showInputDialog("Ingrese unidades: "));
		e1.hacerPedido(prod, prod, unit);
		System.out.println("\nEl pedido tiene: ");
		System.out.print(e1.obtenerPedido());
		
		
		
		System.out.println(
				"\nEstablecer productos Ofertados ...\n");
		name = JOptionPane.showInputDialog("Ingrese el tipo de producto que va a ingresar: ");
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias de oferta: "));
		o1 = new Ofertado(name, dias);
		o1.setProds();
		o1.setPrice();

		o1.getProds();
		o1.getPrice();
		
		prod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese producto: "));
		unit = Integer.parseInt(JOptionPane.showInputDialog("Ingrese unidades: "));
		o1.hacerPedido(prod, prod, unit, o1.getDias());
		System.out.println("\nEl pedido tiene: ");
		System.out.println(o1.obtenerPedido());
	}

}
