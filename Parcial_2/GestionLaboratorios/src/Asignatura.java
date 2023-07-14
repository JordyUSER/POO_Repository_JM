
public class Asignatura {
	public String nombre;
	private String horariosLabEx[][] = new String[5][5];
	private String horariosLabCo[][] = new String[5][5];
	LaboratorioComputacional labCom1;
	LaboratorioExactas labEx1;
	public Asignatura(String nombre) {
		this.nombre = nombre;
	}
	
	public void setLabCo(String nombre, int capacidad, int nComps) {
		labCom1 = new LaboratorioComputacional(nombre, capacidad, nComps);
	}
	
	public void setLabEx(String Nombre, int capac, String ayudanteLab) {
		 labEx1 = new LaboratorioExactas(Nombre, capac, ayudanteLab);
	}
	
	public void setEquipos(int lab, String equipos) {
		switch(lab) {
		case 1:
			labEx1.setEquipos(equipos);	
			break;
		case 2:
			labCom1.setEquipos(equipos);
			break;
		default:
			System.out.println("Ingrese un laboratorio existente...");
			break;
		}
	}
	
	public void getEquipos(int lab) {
		switch(lab) {
		case 1:
			labEx1.mostrarEquipos();	
			break;
		case 2:
			labCom1.mostrarEquipos();
			break;
		default:
			System.out.println("Ingrese un laboratorio existente...");
			break;
		}
	}
	
	public void getAyudante() {
		labEx1.mostrarAyudanteLab();
	}
	
	public void getNComps() {
		labCom1.mostrarNumComps();
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
		if(horariosLabEx[dia-1][hora-1]!="Vacio"){
			System.out.println("El horario seleccionado no esta disponible.");
		} else {
			this.horariosLabEx[dia-1][hora-1] = materia;
			System.out.println("Horario asignado...");
		}
	}
	
	public void asignarHorarioLabCo(String materia, int hora, int dia) {
		if(horariosLabCo[dia-1][hora-1]!="Vacio"){
			System.out.println("El horario seleccionado no esta disponible.");
		} else {
			this.horariosLabCo[dia-1][hora-1] = materia;
			System.out.println("Horario asignado...");
		}
	}
	
	public void mostrarHorariosLabEx() {
		System.out.println(
				"========================================\n" +
				"Horario del laboratorio \n" + labEx1.nombre + "\n" +
				"Ayudante: " + labEx1.getHelper() + "\n" +
				"Capacidad: " + labEx1.capacidad + "\n" +
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
				"Horario del laboratorio \n" + labCom1.nombre + "\n" +
				"Numero de computadores: " + labCom1.getNumComps() + "\n" +
				"Capacidad: " + labCom1.capacidad + "\n" +
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
