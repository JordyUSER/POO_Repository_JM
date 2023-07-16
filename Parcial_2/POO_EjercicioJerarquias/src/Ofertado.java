import javax.swing.JOptionPane;

public class Ofertado extends Producto{
	private String prods[] = new String[3];
	private double price[] = new double[3];
	private double priceFinal = 0;
	private int dias;
	
	public Ofertado(String nombre, int dias) {
		super(nombre);
		this.dias = dias;
	}
	
	public void setNProds(int nProds) {
		this.prods = new String[nProds];
	}
	public void setNPrice(int nPrice) {
		this.price = new double[nPrice];
	}
	
	public void setProds() {
		for(int i = 0; i<prods.length; i++) {
			prods[i] = JOptionPane.showInputDialog("Ingrese el producto " + (i+1) + ": ");
		}
	}
	
	public void setPrice() {
		for(int i = 0; i<price.length; i++) {
			price[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto " + (i+1) + ": "));
		}
	}
	
	public void getProds() {
		System.out.println("\n\tProductos");
		for (int i = 0; i < prods.length; i++) {
			System.out.print("\n" + (i+3) + ". " + prods[i] + "");
		}
	}
	
	public String getAProd(int n) {
		return prods[n-1];
	}
	
	public double getAPric(int n) {
		return price[n-1];
	}
	
	public void getPrice() {
		System.out.println("\n\tPrecios");
		for (int i = 0; i < price.length; i++) {
			System.out.print("\n" + (i+3) + ". " + price[i] + "");
		}
	}
	
	public double getPriceFinal() {
		return priceFinal;
	}

	public void setPriceFinal(double priceFinal) {
		this.priceFinal += priceFinal;
	}
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String obtenerPedido() {
		
		return pedido;
	}

	@Override
	public void hacerPedido(int Producto, int precio, int unidades, int diasOf) {
		if(diasOf == 1) {
			double desc = price[precio-1] * 0.2;
			pedido = prods[Producto-1] + " " + ((price[precio-1]*unidades)-desc) + "$";
		} else if(diasOf == 2 || diasOf == 3) {
			double desc = price[precio-1] * 0.15;
			pedido = prods[Producto-1] + " " + ((price[precio-1]*unidades)-desc) + "$"; 
		} else if(diasOf > 3) {
			double desc = price[precio-1] * 0.1;
			pedido = prods[Producto-1] + " " + ((price[precio-1]*unidades)-desc) + "$";
		}
	}

}
