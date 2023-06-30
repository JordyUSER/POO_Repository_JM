
public class Asignatura {
	private String nombre;
	private String horariosLabEx[][] = new String[5][5];
	private String horariosLabCo[][] = new String[5][5];
	
	public Asignatura(String nombre) {
		this.nombre = nombre;
	}
	
	public void setLabCo(String nombre, int capacidad, int nComps) {
		LaboratorioComputacional labCom1 = new LaboratorioComputacional(nombre, capacidad, nComps);
	}
	
	public void setLabEx(String nombre, int capacidad, String ayudanteLab) {
		LaboratorioExactas labEx1 = new LaboratorioExactas(nombre, capacidad, ayudanteLab);
	}
	
	public void vaciarHorariosEx() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				horariosLabEx[i][j] = "Vacio";
			}
		}
	}
	
	public void vaciarHorariosCo() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				horariosLabCo[i][j] = "Vacio";
			}
		}
	}
	
	public void asignarHorarioLabEx(String materia, int hora, int dia) {
		this.horariosLabEx[dia][hora] = materia;
		System.out.println("Horario asignado...");
	}
	
	public void asignarHorarioLabCo(String materia, int hora, int dia) {
		this.horariosLabCo[dia][hora] = materia;
		System.out.println("Horario asignado...");
	}
	
	public void mostrarHorariosLabEx() {
		System.out.println(
				"========================================\n" +
				"Horario de los laboratorios de Exactas\n" +
				"========================================\n" +
				"\nLunes" +
				"\n07:00 - 09:00: " + horariosLabEx[0][0] +
				"\n09:00 - 11:00: " + horariosLabEx[0][1] +
				"\n11:00 - 13:00: " + horariosLabEx[0][2] +
				"\n14:00 - 16:00: " + horariosLabEx[0][3] +
				"\n16:00 - 18:00: " + horariosLabEx[0][4] + "\n" +
				"\nMartes" +
				"\n07:00 - 09:00: " + horariosLabEx[1][0] +
				"\n09:00 - 11:00: " + horariosLabEx[1][1] +
				"\n11:00 - 13:00: " + horariosLabEx[1][2] +
				"\n14:00 - 16:00: " + horariosLabEx[1][3] +
				"\n16:00 - 18:00: " + horariosLabEx[1][4] + "\n" +
				"\nMiercoles" +
				"\n07:00 - 09:00: " + horariosLabEx[2][0] +
				"\n09:00 - 11:00: " + horariosLabEx[2][1] +
				"\n11:00 - 13:00: " + horariosLabEx[2][2] +
				"\n14:00 - 16:00: " + horariosLabEx[2][3] +
				"\n16:00 - 18:00: " + horariosLabEx[2][4] + "\n" +
				"\nJueves" +
				"\n07:00 - 09:00: " + horariosLabEx[3][0] +
				"\n09:00 - 11:00: " + horariosLabEx[3][1] +
				"\n11:00 - 13:00: " + horariosLabEx[3][2] +
				"\n14:00 - 16:00: " + horariosLabEx[3][3] +
				"\n16:00 - 18:00: " + horariosLabEx[3][4] + "\n" +
				"\nViernes" +
				"\n07:00 - 09:00: " + horariosLabEx[4][0] +
				"\n09:00 - 11:00: " + horariosLabEx[4][1] +
				"\n11:00 - 13:00: " + horariosLabEx[4][2] +
				"\n14:00 - 16:00: " + horariosLabEx[4][3] +
				"\n16:00 - 18:00: " + horariosLabEx[4][4] + "\n");
	}
	
	public void mostrarHorariosLabCo() {
		System.out.println(
				"========================================\n" +
				"Horario de los laboratorios de Computacion\n" +
				"========================================\n" +
				"\nLunes" +
				"\n07:00 - 09:00: " + horariosLabCo[0][0] +
				"\n09:00 - 11:00: " + horariosLabCo[0][1] +
				"\n11:00 - 13:00: " + horariosLabCo[0][2] +
				"\n14:00 - 16:00: " + horariosLabCo[0][3] +
				"\n16:00 - 18:00: " + horariosLabCo[0][4] + "\n" +
				"\nMartes" +
				"\n07:00 - 09:00: " + horariosLabCo[1][0] +
				"\n09:00 - 11:00: " + horariosLabCo[1][1] +
				"\n11:00 - 13:00: " + horariosLabCo[1][2] +
				"\n14:00 - 16:00: " + horariosLabCo[1][3] +
				"\n16:00 - 18:00: " + horariosLabCo[1][4] + "\n" +
				"\nMiercoles" +
				"\n07:00 - 09:00: " + horariosLabCo[2][0] +
				"\n09:00 - 11:00: " + horariosLabCo[2][1] +
				"\n11:00 - 13:00: " + horariosLabCo[2][2] +
				"\n14:00 - 16:00: " + horariosLabCo[2][3] +
				"\n16:00 - 18:00: " + horariosLabCo[2][4] + "\n" +
				"\nJueves" +
				"\n07:00 - 09:00: " + horariosLabCo[3][0] +
				"\n09:00 - 11:00: " + horariosLabCo[3][1] +
				"\n11:00 - 13:00: " + horariosLabCo[3][2] +
				"\n14:00 - 16:00: " + horariosLabCo[3][3] +
				"\n16:00 - 18:00: " + horariosLabCo[3][4] + "\n" +
				"\nViernes" +
				"\n07:00 - 09:00: " + horariosLabCo[4][0] +
				"\n09:00 - 11:00: " + horariosLabCo[4][1] +
				"\n11:00 - 13:00: " + horariosLabCo[4][2] +
				"\n14:00 - 16:00: " + horariosLabCo[4][3] +
				"\n16:00 - 18:00: " + horariosLabCo[4][4] + "\n");
	}
	
}
