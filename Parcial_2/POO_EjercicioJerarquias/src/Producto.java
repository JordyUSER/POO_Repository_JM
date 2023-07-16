
public abstract class Producto {
	protected String nombre, pedido;
	protected double precio;
	protected int cantidad;
	
	
	public Producto(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract String obtenerPedido();
	public void hacerPedido(int Producto, int precio, int unidades) {}
	public void hacerPedido(int Producto, int precio, int unidades, int diasOf) {}
	
}
