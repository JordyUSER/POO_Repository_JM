
public class Administrativo extends Personal implements Datos, CalcularSueldos{
	
	private int seccion;
	private String section;
	//Constructor
	public Administrativo(String nombre, int edad, double sueldoBasico, int seccion) {
		super(nombre, edad, sueldoBasico);
		this.seccion = seccion;
		if(seccion == 1) {
			section = "Gerencia";
		} else if (seccion == 2) {
			section = "Ventas";
		} else if (seccion == 3) {
			section = "Jefe";
		} else {
			section = "Aun no ha designado ninguna seccion.";
		}
	}
	
	//Getters y Setters
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getSeccion() {
		return seccion;
	}



	public void setSeccion(int seccion) {
		if(seccion == 1) {
			section = "Gerencia";
		} else if (seccion == 2) {
			section = "Ventas";
		} else if (seccion == 3) {
			section = "Jefe";
		} else {
			section = "Aun no ha designado ninguna seccion.";
		}
		this.seccion = seccion;
	}

	@Override
	public void calcularSueldos() {
		double bono;
		if(seccion == 4) {
			bono = getSueldoBasico() * (0.2 * getSeccion());
			setSueldoFinal(bono);
		} else if (seccion == 1){
			bono = getSueldoBasico() * (0.7 * getSeccion());
			setSueldoFinal(bono);
		} else if (seccion == 2) {
			bono = getSueldoBasico() * (0.4 * getSeccion());
			setSueldoFinal(bono);
		} else if (seccion == 3) {
			bono = getSueldoBasico() * (0.8 * getSeccion());
			setSueldoFinal(bono);
		}
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"\n\tDatos - Tecnico" +
				"\nNombre:         " + getNombre() +
				"\nEdad:           " + getEdad() + " años." +
				"\nSeccion: " + getSection() +
				"\nSueldo Basico:  " + getSueldoBasico() + "$" +
				"\nSueldo Final:   " + getSueldoFinal() + "$");
	}
}
