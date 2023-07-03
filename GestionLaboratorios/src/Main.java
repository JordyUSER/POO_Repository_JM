import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		String name = "ITIN";
		Asignatura a1 = new Asignatura(name);		
		int opcion, opcion2, horario, dia;
		boolean flag = true;
		int nComps; int capacity; String nombre; String ayudante;
		String materia, equipos;
		
		do {
			boolean flag2 = true;
			
			System.out.print(
					"\n            UNIDAD EDUCATIVA\n" +
					"JUNTOS POR LA EDUCACION TECNOLOGICA SUPERIOR\n\n" +
					"SISTEMA DE GESTION DE HORARIO EN LOS LABORATORIOS...\n" +
					"\n		Menu " + a1.nombre + " \n" +
					"1. Establecer un laboratorio.\n" +
					"2. Asignar horarios.\n" +
					"3. Vaciar horarios.\n" +
					"4. Gestionar Laboratorios.\n" +
					"5. Salir\n");
			
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion"));
			
			switch(opcion) {
			case 1:
				do {
					flag2 = true;
					System.out.print(
							"\nLaboratorios\n" +	
							"1. Laboratorio de Exactas\n" +
							"2. Laboratorio de Computacion\n");
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja el laboratorio a establecer: "));
					switch(opcion) {
					case 1:	
						nombre = JOptionPane.showInputDialog("Ingrese nombre del laboratorio de Exactas: ");
						capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del laboratorio: "));
						ayudante = JOptionPane.showInputDialog("Ingrese nombre del ayudante de laboratorio: ");
						a1.setLabEx(nombre, capacity, ayudante);
						a1.vaciarHorariosEx();
						System.out.println("\nLaboratorio establecido...");
						flag2 = false;
						break;
					case 2:
						nombre = JOptionPane.showInputDialog("Ingrese nombre del laboratorio de Computacion: ");
						capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del laboratorio: "));
						nComps = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de computadores de laboratorio: "));
						a1.setLabCo(nombre, capacity, nComps);
						a1.vaciarHorariosCo();
						System.out.println("\nLaboratorio establecido...");
						flag2 = false;
						break;
					default:	
						System.out.println("\nIngrese un valor valido...");
						break;
					}
				} while(flag2 != false);
				break;
			case 2:
				do {
					flag2 = true;
					System.out.println(
							"\nLaboratorio\n" +
							"1. Laboratorio Exactas\n" +
							"2. Laboratorio Computacion\n");
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja el laboratorio: "));
					switch(opcion) {
					case 1:
						System.out.print(
								"\nDia de la semana\n" +
								"1. Lunes\n" +
								"2. Martes\n" +
								"3. Miercoles\n" +
								"4. Jueves\n" +
								"5. Viernes\n");
						dia = Integer.parseInt(JOptionPane.showInputDialog("Escoja el dia: "));
						System.out.print(
								"\nHorarios\n" +
								"1. 07:00 - 09:00\n" +
								"2. 09:00 - 11:00\n" +
								"3. 11:00 - 13:00\n" +
								"4. 14:00 - 16:00\n" +
								"5. 16:00 - 18:00\n");
						horario = Integer.parseInt(JOptionPane.showInputDialog("Escoja el horario: "));
						materia = JOptionPane.showInputDialog("Escoja la materia: ");
						a1.asignarHorarioLabEx(materia, horario, dia);
						flag2 = false;
						break;
					case 2:
						System.out.print(
								"\nDia de la semana\n" +
								"1. Lunes\n" +
								"2. Martes\n" +
								"3. Miercoles\n" +
								"4. Jueves\n" +
								"5. Viernes\n");
						dia = Integer.parseInt(JOptionPane.showInputDialog("Escoja el dia: "));
						System.out.print(
								"\nHorarios\n" +
								"1. 07:00 - 09:00\n" +
								"2. 09:00 - 11:00\n" +
								"3. 11:00 - 13:00\n" +
								"4. 14:00 - 16:00\n" +
								"5. 16:00 - 18:00\n");
						horario = Integer.parseInt(JOptionPane.showInputDialog("Escoja el horario: "));
						materia = JOptionPane.showInputDialog("Escoja la materia: ");
						a1.asignarHorarioLabCo(materia, horario, dia);
						flag2 = false;
						break;
					default:
						System.out.print("\nIngrese una opcion valida...");
						break;
					}
				} while(flag2 != false);
				break;
			case 3:
				do {
					flag2 = true;
					System.out.println(
							"\nLaboratorio\n" +
							"1. Laboratorio Exactas\n" +
							"2. Laboratorio Computacion\n");
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja el laboratorio: "));
					switch(opcion) {
					case 1:
						a1.vaciarHorariosEx();
						System.out.println("Horarios vacios...");
						flag2 = false;
						break;
					case 2:
						a1.vaciarHorariosCo();
						System.out.println("Horarios vacios...");
						flag2 = false;
						break;
					default:
						System.out.print("\nIngrese una opcion valida...");
						break;
					}
				} while(flag2 != false);
				break;
			case 4:
				do {
					boolean flag3 = true;
					flag2 = true;
					System.out.println(
							"\nLaboratorio\n" +
							"1. Laboratorio de Exactas\n" +
							"2. Laboratorio de Computacion\n");
					opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja el laboratorio: "));
					switch(opcion) {
					case 1:
						do {
							System.out.print(
									"\nMenu de Gestion\n" + 
									"1. Mostrar horarios\n" +
									"2. Ingresar Equipos de Laboratorio\n" +
									"3. Mostrar Equipos de Laboratorio\n" +
									"4. Mostrar Ayudante de Laboratorio\n" +
									"5. Salir\n");
							opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Escoja la opcion de gestion: "));
							switch(opcion2) {
							case 1:
								a1.mostrarHorariosLabEx();
								flag3 = false;
								break;
							case 2:
								equipos = JOptionPane.showInputDialog("Ingrese los equipos del laboratorio: ");
								a1.setEquipos(opcion, equipos);
								flag3 = false;
								break;
							case 3:
								a1.getEquipos(opcion);
								flag3 = false;
								break;
							case 4:
								a1.getAyudante();
								flag3 = false;
								break;
							case 5:
								System.out.println("Saliendo...\n");
								flag3 = false;
								break;
							default:
								System.out.println("Ingrese una opcion valida...\n");
								break;
							}
						} while(flag3 != false);
						flag2 = false;
						break;
					case 2:
						do {
							System.out.print(
									"\nMenu de Gestion\n" + 
									"1. Mostrar horarios\n" +
									"2. Ingresar Equipos de Laboratorio\n" +
									"3. Mostrar Equipos de Laboratorio\n" +
									"4. Mostrar numero de Computadoras del Laboratorio\n" +
									"5. Salir\n");
							opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Escoja la opcion de gestion: "));
							switch(opcion2) {
							case 1:
								a1.mostrarHorariosLabCo();
								flag3 = false;
								break;
							case 2:
								equipos = JOptionPane.showInputDialog("Ingrese los equipos del laboratorio: ");
								a1.setEquipos(opcion, equipos);
								flag3 = false;
								break;
							case 3:
								a1.getEquipos(opcion);
								flag3 = false;
								break;
							case 4:
								a1.getNComps();
								flag3 = false;
								break;
							case 5:
								System.out.println("Saliendo...\n");
								flag3 = false;
								break;
							default:
								System.out.println("Ingrese una opcion valida...\n");
								break;
							}
						} while(flag3 != false);
						flag2 = false;
						break;
					default:
						System.out.print("\nIngrese una opcion valida...");
						break;
					}
				} while(flag2 != false);
				break;
			case 5:
				System.out.println("Gracias por usar el programa de gestion :D");
				flag = false;
				break;
			default:
				System.out.println("Ingrese una opcion valida...");
				break;
			}
		}while(flag != false);
	}
}
