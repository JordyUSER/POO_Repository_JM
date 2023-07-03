
public class Programador extends Persona{
	private String lenguaje = "No establecido";
	private int experiencia;
	private int numProyectos = 0;
	
	
	public Programador(String nombre, String cedula, String sexo, int experiencia) {
		super(nombre, cedula, sexo);
		this.experiencia = experiencia;
	}
	
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	public String getlenguaje() {
		return lenguaje;
	}
	
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public int getExperiencia() {
		return experiencia;
	}
	
	public void setNumProyectos(int numProyectos) {
		this.numProyectos = numProyectos;
	}
	
	public int getNumProyectos() {
		return numProyectos;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"Datos de la Persona" +
				"\nNombre:      " + this.nombre + "\n" +
				"Cedula:      " + this.cedula + "\n" +
				"Sexo:        " + this.sexo + "\n" +
				"Experiencia: " + this.experiencia + "\n" +
				"Lenguaje:    " + this.lenguaje + "\n" +
				"Numero de  "+
				"\nProyectos:   " + this.numProyectos);
	}
}
