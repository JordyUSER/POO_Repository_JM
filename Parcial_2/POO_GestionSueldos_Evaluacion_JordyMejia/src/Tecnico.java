
public class Tecnico extends Personal implements Datos, CalcularSueldos{
	
	private int experiencia;
	private int antiguedad = 0;
	//Constructor
	public Tecnico(String nombre, int edad, double sueldoBasico, int experiencia) {
		super(nombre, edad, sueldoBasico);
		this.experiencia = experiencia;
	}
	
	//Getters y Setters
	public int getExperiencia() {
		return experiencia;
	}



	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}



	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public void calcularSueldos() {
		double bono;
		if(experiencia >= 5) {
			bono = getSueldoBasico() * (0.1 * getExperiencia());
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
				"\nExperiencia:    " + getExperiencia() + " años de experiencia." +
				"\nAntiguedad:     " + getAntiguedad() + " años." +
				"\nSueldo Basico:  " + getSueldoBasico() + "$" +
				"\nSueldo Final:   " + getSueldoFinal() + "$");
	}

}
