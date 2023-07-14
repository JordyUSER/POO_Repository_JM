
public class Atletismo extends Deportista{
	private String prueba;
	
	public Atletismo(String nombre, int edad, String disciplina, String sexo, String prueba) {
		super(nombre, edad, disciplina, sexo);
		this.prueba = prueba;
	}
	
	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}

	@Override
	public void entrenamiento() {
		System.out.println("\nEl atletismo es un deporte bastante intenso...");
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"\n\tDatos del Deportista" + 
				"\nNombre:     " + getNombre() +
				"\nEdad:       " + getEdad() +
				"\nDisciplina: " + getDisciplina() +
				"\nSexo:       " + getSexo() +
				"\nPrueba:     " + getPrueba());		
	}
}
