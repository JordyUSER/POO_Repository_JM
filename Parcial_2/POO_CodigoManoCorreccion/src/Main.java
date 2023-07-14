import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		int opcion2, opcion3;
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		String cedula = JOptionPane.showInputDialog("Ingrese su cedula: ");
		String sexo   = JOptionPane.showInputDialog("Ingrese su sexo: ");
		
		
		String deporte = JOptionPane.showInputDialog("Digite su deporte: ");
		Deportista PD1 = new Deportista(nombre, cedula, sexo, deporte);
		
		int experiencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos años de experiencia posee programando: "));
		Programador PP1 = new Programador(nombre, cedula, sexo, experiencia);
		do {
			opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
					"Qué desea gestionar?" +
					"\n1. Deportista" +
					"\n2. Programador" +
					"\n3. Salir"));
			switch(opcion2) {
			case 1:
				do {
					opcion3 = Integer.parseInt(JOptionPane.showInputDialog(
							"Qué desea realizar?\n\n" +
							"1. Mostrar Datos\n" +
							"2. Mostrar Estado\n" +
							"3. Caminar\n" +
							"4. Ocupar\n" +
							"5. Desocupar\n" +
							"6. Ingresar Tiempo Practicado\n" +
							"7. Mostrar Tiempo Practicado\n" +
							"8. Ingresar Nivel\n" +
							"9. Mostrar Nivel\n" +
							"0. Volver"));
					switch(opcion3) {
					case 1:
						PD1.mostrarDatos();
						break;
					case 2:
						PD1.estado();
						break;
					case 3:
						PD1.caminar();
						break;
					case 4:
						PD1.ocupar();
						break;
					case 5:
						PD1.desocupar();
						break;
					case 6:
						int tiempPrac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos años de practica tiene: "));
						PD1.setTiempoPracticado(tiempPrac);
						System.out.println("Establecido...");
						break;
					case 7:
						System.out.println("Su tiempo dedicato al " + PD1.getDeporte() + " es: " + PD1.getTiempoPracticado() + " años.");
						break;
					case 8:
						String lvl = JOptionPane.showInputDialog(
								"Niveles.\n" +
								"- Junior\n" +
								"- Medio\n" +
								"- Profesional\n");
						PD1.setNivel(lvl);
						System.out.println("Establecido...");
						break;
					case 9:
						System.out.println("Su nivel en el deporte " + PD1.getDeporte() + " es: " + PD1.getNivel());
						break;
					case 0:
						System.out.println("Volviendo...");
						break;
					default:
						System.out.println("Ingrese una opcion valida...");
						break;
					}	
				}while(opcion3 != 0);
				break;
			case 2:
				do {
					opcion3 = Integer.parseInt(JOptionPane.showInputDialog(
							"Qué desea realizar?\n\n" +
							"1. Mostrar Datos\n" +
							"2. Mostrar Estado\n" +
							"3. Caminar\n" +
							"4. Ocupar\n" +
							"5. Desocupar\n" +
							"6. Establecer Lenguaje de Programacion\n" +
							"7. Mostrar Lenguaje de Programacion\n" +
							"8. Establecer Numero de Proyectos\n" +
							"9. Mostrar Numero de Proyectos\n" +
							"0. Salir"));
					switch(opcion3) {
					case 1:
						PP1.mostrarDatos();
						break;
					case 2:
						PP1.estado();
						break;
					case 3:
						PP1.caminar();
						break;
					case 4:
						PP1.ocupar();
						break;
					case 5:
						PP1.desocupar();
						break;
					case 6:
						String leng = JOptionPane.showInputDialog("Ingrese su lenguaje de programacion de preferencia: ");
						PP1.setLenguaje(leng);;
						System.out.println("Establecido...");
						break;
					case 7:
						System.out.println("Su lenguaje de programacion de preferencia es: " + PP1.getlenguaje());
						break;
					case 8:
						int numProy = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos proyectos ha realizado: "));
						PP1.setNumProyectos(numProy);;
						System.out.println("Establecido...");
						break;
					case 9:
						System.out.println("Usted ha realizado " + PP1.getNumProyectos() + " proyectos.");
						break;
					case 0:
						System.out.println("Volviendo...");
						break;
					default:
						System.out.println("Ingrese una opcion valida...");
						break;
					}	
				}while(opcion3 != 0);
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Ingrese una opcion valida...");
				break;
			}		
		}while(opcion2 != 3);	
	}
}

