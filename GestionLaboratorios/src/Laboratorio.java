
public class Laboratorio {
	private String nombre;
	private int capacidad;
	public String equipos;
	
	public String getEquipos() {
		return equipos;
	}

	public Laboratorio(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	public void setEquipos(String equipos) {
		this.equipos = equipos;
	}
	
	public void mostrarEquipos() {
		System.out.println("El laboratorio cuenta con los equipos: " + this.equipos);
	}
}
