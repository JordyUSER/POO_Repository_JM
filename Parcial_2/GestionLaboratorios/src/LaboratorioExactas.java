
public class LaboratorioExactas extends Laboratorio {

	private String ayudanteLab;
	
	public LaboratorioExactas(String nombre, int capacidad, String ayudanteLab) {
		super(nombre, capacidad);
		this.ayudanteLab = ayudanteLab;
	}
	
	public void mostrarAyudanteLab() {
		System.out.println("El nombre del ayudante es: " + ayudanteLab);
	}
	
	public String getHelper() {
		return ayudanteLab;
	}
	
	@Override
	public void mostrarEquipos() {
		System.out.println("El laboratorio de exactas cuenta con los equipos: " + equipos);
	}
}
