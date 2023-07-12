
public class Director extends Empleado{
	private String departamento;
	private int personal;
	
	public Director(String nombre, String fechaIngreso, int mesesTrabajados, int edad, double salarioAnual, String departamento, int personal) {
		super(nombre, fechaIngreso, mesesTrabajados, edad, salarioAnual);
		this.departamento = departamento;
		this.personal = personal;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}

	@Override
	public void incentivar() {
		if(getMesesTrabajados()>30 && getPersonal()>=20) {
			setSalarioAnual((2*BONO)+getSalarioAnual());
			System.out.println("\nCumple con los 2 requisitos, a su salario se le suma " + (BONO * 2) +"$.");
		} else if (getMesesTrabajados()>30 || getPersonal()>=20){
			setSalarioAnual(BONO+getSalarioAnual());
			System.out.println("\nCumple con 1 requisito, a su salario se le suma " + (BONO) +"$.");
		} else {
			System.out.println("\nNo cumple con los requisitos para ser incentivado...");
		}		
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"\nDatos de Director" + 
				"\nNombre:           " + getNombre() +
				"\nEdad:             " + getEdad() +
				"\nFecha de ingreso: " + getFechaIngreso() +
				"\nMeses trabajados: " + getMesesTrabajados() +
				"\nSalario anual:    " + getSalarioAnual() + "$" +
				"\nDepartamento:     " + getDepartamento() +
				"\nPersonal a cargo: " + getPersonal());
	}

}
