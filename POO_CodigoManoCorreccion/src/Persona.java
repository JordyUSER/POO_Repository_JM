
public class Persona {
	protected String cedula, nombre, sexo;
	private int estado = -1;
	
	public Persona(String nombre, String cedula, String sexo) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.sexo = sexo;
	}
	
	public void mostrarDatos() {
		System.out.println(
				"Datos de la Persona" +
				"\nNombre: " + this.nombre + "\n" +
				"Cedula: " + this.cedula + "\n" +
				"Sexo:   " + this.sexo);
	}
	
	public void ocupar() {
		if(estado != 0) {
			System.out.println("Se ocupa...");
			this.estado = 1;
		} else {
			System.out.println("No se puede ocupar, esta muerto...");
		}
	}
	
	public void desocupar() {
		if(estado != 0) {
			System.out.println("Se desocupa...");
			this.estado = 2;
		} else {
			System.out.println("No se puede desocupar, esta muerto...");
		}
	}
	
	public void caminar() {
		if(estado != 0) {
			System.out.println("Camina...");
			this.estado = 3;
		} else {
			System.out.println("No se puede caminar, esta muerto...");
		}
	}
	
	public void estado() {
		switch(estado) {
		case -1:
			System.out.println("La persona esta viva :D");
			break;
		case 0:
			System.out.println("La persona esta muesta D:");
			break;
		case 1:
			System.out.println("La persona esta ocupada...");
			break;
		case 2:
			System.out.println("La persona esta desocupada...");
			break;
		case 3:
			System.out.println("La persona esta caminando...");
			break;
		default:
			System.out.println("La opcion no es valida, vuelva a intentarlo...");
			break;
		}
	}
}
