
public abstract class Empleado {
	private String nombre, fechaIngreso;
	private int edad, mesesTrabajados;
	private double salarioAnual;
	protected double BONO = 1000;
	
	public Empleado(String nombre, String fechaIngreso, int mesesTrabajados, int edad, double salarioAnual) {
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.mesesTrabajados = mesesTrabajados;
		this.salarioAnual = salarioAnual;
	}

	public int getMesesTrabajados() {
		return mesesTrabajados;
	}

	public void setMesesTrabajados(int mesesTrabajados) {
		this.mesesTrabajados = mesesTrabajados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}
	
	public abstract void incentivar();
	public abstract void mostrarDatos();
}
