
public class LaboratorioComputacional extends Laboratorio{

	private int numComputadoras;
	
	public LaboratorioComputacional(String nombre, int capacidad, int numComputadoras) {
		super(nombre, capacidad);
		this.numComputadoras = numComputadoras;
	}
	
	public void mostrarNumComps() {
		System.out.println("El numero de computadoras disponibles es: " + this.numComputadoras);
	}
	
	@Override
	public void mostrarEquipos() {
		System.out.println("El laboratorio de computacion cuenta con los equipos: " + equipos);
	}
	
}
