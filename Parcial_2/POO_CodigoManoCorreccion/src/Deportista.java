
public class Deportista extends Persona{

	private String deporte;
	private int tiempoPracticado = 0;
	private String nivel = "Sin establecer";
	
	
	public Deportista(String nombre, String cedula, String sexo, String deporte) {
		super(nombre, cedula, sexo);
		this.deporte = deporte;
	}
	
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	public String getDeporte() {
		return deporte;
	}
	
	public void setTiempoPracticado(int tiempoPracticado) {
		this.tiempoPracticado = tiempoPracticado;
	}
	
	public int getTiempoPracticado() {
		return tiempoPracticado;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	public String getNivel() {
		return nivel;
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"Datos de la Persona" +
				"\nNombre:     " + this.nombre + "\n" +
				"Cedula:     " + this.cedula + "\n" +
				"Sexo:       " + this.sexo + "\n" +
				"Tiempo      " +
				"\nPracticado: " + this.tiempoPracticado + "\n" +
				"Deporte:    " + this.deporte + "\n" +
				"Nivel:      " + this.nivel);
	}
}
