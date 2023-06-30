import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String name = "ITIN";
		Asignatura a1 = new Asignatura(name);
		int opcion;
		int flag = 2;
		
		do {
			int flag2 = 2;
			
			System.out.print(
					"            UNIDAD EDUCATIVA\n" +
					"JUNTOS POR LA EDUCACION TECNOLOGICA SUPERIOR\n\n" +
					"SISTEMA DE GESTION DE HORARIO EN LOS LABORATORIOS...\n" +
					"\n Menu \n" +
					"1. Establecer un laboratorio.\n" +
					"2. Asignar horarios.\n" +
					"3. Vacial horarios.\n" +
					"4. Gestionar Laboratorio Computacional.\n" +
					"5. Gestionar Laboratorio Exactas.\n" +
					"Ingrese una opcion: ");
			opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				do {
					System.out.print(
							"\nLaboratorios\n" +
							"1. Laboratorio de Exactas\n" +
							"2. Laboratorio de Computacion\n\n" +
							"Escoja el laboratorio a establecer: ");
					opcion = teclado.nextInt();
					switch(opcion) {
					case 1:
						System.out.println("Ingrese nombre del laboratorio de Exactas: ");
						String nombre;
						nombre = teclado.nextLine();
						System.out.println("Ingrese la capacidad del laboratorio: ");
						int capacity;
						capacity= teclado.nextInt();
						System.out.println("Ingrese nombre del ayudante de laboratorio");
						String ayudante;
						ayudante= teclado.nextLine();
						a1.setLabEx(nombre, capacity, ayudante);
						System.out.println("Laboratorio establecido...");
						break;
					}
				} while(flag2 != 0);
				break;
			}
		}while(flag !=0);
		
		
				

	}
}
