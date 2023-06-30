import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
            String name = "ITIN";
            Asignatura a1 = new Asignatura(name);
            int opcion;
            int flag = 2;
            int nComps; int capacity; String nombre; String ayudante;
            String dia, materia, horario;
            do {
		int flag2 = 2;
			
		System.out.print(
					"\n            UNIDAD EDUCATIVA\n" +
					"JUNTOS POR LA EDUCACION TECNOLOGICA SUPERIOR\n\n" +
					"SISTEMA DE GESTION DE HORARIO EN LOS LABORATORIOS...\n" +
					"\n		Menu \n" +
					"1. Establecer un laboratorio.\n" +
					"2. Asignar horarios.\n" +
					"3. Vacial horarios.\n" +
					"4. Gestionar Laboratorio Computacional.\n" +
					"5. Gestionar Laboratorio Exactas.\n" +
					"6. Salir\n");
			
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion"));
			
                switch(opcion) {
		case 1:
                    do {
			flag2 = 2;
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
				flag2 = 0;
				break;
			case 2:
				nombre = JOptionPane.showInputDialog("Ingrese nombre del laboratorio de Computacion: ");
				capacity = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del laboratorio: "));
				nComps = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de computadores de laboratorio: "));
				a1.setLabCo(nombre, capacity, nComps);
				a1.vaciarHorariosCo();
                                System.out.println("\nLaboratorio establecido...");
				flag2 = 0;
				break;
			default:
				System.out.println("\nIngrese un valor valido...");
                                break;
			}
                    } while(flag2 != 0);
                    break;
                case 2:
                    System.out.print(
				"\nHorarios\n" +
				"1. 07:00 - 09:00\n" +
				"1. 09:00 - 11:00\n" +
				"1. 11:00 - 13:00\n" +
				"1. 14:00 - 16:00\n" +
				"1. 16:00 - 18:00\n");
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoja el horario: "));
                case 6:
                    System.out.println("Gracias por usar el programa de gestion :D");
                    flag = 0;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida...");
                    break;
			}
		}while(flag !=0);
	}
}
