
public class Personal {
	private String nombre;
	private int edad;
	private double sueldoBasico;
	private double sueldoFinal = 0;
	
	//Constructor
	public Personal(String nombre, int edad, double sueldoBasico) {
		this.edad = edad;
		this.sueldoBasico = sueldoBasico;
		this.nombre = nombre;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal += sueldoFinal;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
}
