
public class Natacion extends Deportista{
	private String estilo;
	public Natacion(String nombre, int edad, String disciplina, String sexo, String estilo) {
		super(nombre, edad, disciplina, sexo);
		this.estilo = estilo;
	}
	
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public void entrenamiento() {
		System.out.println("\nLa natacion es un deporte interesante...");
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"\n\tDatos del Deportista" + 
				"\nNombre:     " + getNombre() +
				"\nEdad:       " + getEdad() +
				"\nDisciplina: " + getDisciplina() +
				"\nSexo:       " + getSexo() +
				"\nEstilo:     " + getEstilo());		
	}

}
