
public class Docente extends Personal implements Datos, CalcularSueldos{
	
	private int cursos, titulo;
	private String titu;
	
	//Constructor
	public Docente(String nombre, int edad, double sueldoBasico, int titulo) {
		super(nombre, edad, sueldoBasico);
		this.titulo = titulo;
		if(titulo == 1) {
			titu = "Doctorado";
		} else if (titulo == 2) {
			titu = "Maestria";
		} else if (titulo == 3) {
			titu = "Ingenieria";
		} else {
			titu = "Aun no ha designado su titulo.";
		}
	}
	
	
	//Getters y Setters
	public int getCursos() {
		return cursos;
	}



	public void setCursos(int cursos) {
		this.cursos = cursos;
	}



	public String getTitu() {
		return titu;
	}

	public void setTitu(String titu) {
		if(titulo == 1) {
			this.titu = "Doctorado";
		} else if (titulo == 2) {
			this.titu = "Maestria";
		} else if (titulo == 3) {
			this.titu = "Ingenieria";
		} else {
			this.titu = "Aun no ha designado su titulo.";
		}
		
	}

	public int getTitulo() {
		return titulo;
	}



	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}

	@Override
	public void calcularSueldos() {
		double bono;
		if(cursos >= 4) {
			if(titulo == 4) {
				bono = getSueldoBasico() * (0.2 * getCursos());
				setSueldoFinal(bono);
			} else if (titulo == 1){
				bono = getSueldoBasico() * (0.5 * getCursos());
				setSueldoFinal(bono);
			} else if (titulo == 2) {
				bono = getSueldoBasico() * (0.4 * getCursos());
				setSueldoFinal(bono);
			} else if (titulo == 3) {
				bono = getSueldoBasico() * (0.3 * getCursos());
				setSueldoFinal(bono);
			}
		} else {
			System.out.println("Aun no tiene cursos a carno necesarios para ser bonificado");
		}
	}

	@Override
	public void mostrarDatos() {
		System.out.println(
				"\n\tDatos - Tecnico" +
				"\nNombre:         " + getNombre() +
				"\nEdad:           " + getEdad() + " años." +
				"\nCursos a Cargo: " + getCursos() + " cursos." +
				"\nTitulo:         " + getTitu() +
				"\nSueldo Basico:  " + getSueldoBasico() + "$" +
				"\nSueldo Final:   " + getSueldoFinal() + "$");
	}
}
