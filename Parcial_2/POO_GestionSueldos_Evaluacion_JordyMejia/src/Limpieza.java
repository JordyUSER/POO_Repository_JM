
public class Limpieza extends Personal implements Datos, CalcularSueldos{
	
	private int antiguedad;
	//Constructor
	public Limpieza(String nombre, int edad, double sueldoBasico, int antiguedad) {
		super(nombre, edad, sueldoBasico);
		this.antiguedad = antiguedad;
	}

	
	//Getters y Setters
	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}



	@Override
	public void calcularSueldos() {
		double bono;
		if(antiguedad >= 4) {
			bono = getSueldoBasico() * (0.1 * getAntiguedad());
			setSueldoFinal(bono);
		} else {
			System.out.println("Aun no cumple con la experiencia necesaria para ser bonificado");
		}
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"\n\tDatos - Tecnico" +
				"\nNombre:         " + getNombre() +
				"\nEdad:           " + getEdad() + " años." +
				"\nAntiguedad:     " + getAntiguedad() + " años." +
				"\nSueldo Basico:  " + getSueldoBasico() + "$" +
				"\nSueldo Final:   " + getSueldoFinal() + "$");
	}
}
