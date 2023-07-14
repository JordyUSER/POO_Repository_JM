import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int flag = 1, option;
		Equipos e1 = new Equipos();
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print(
					"\n=================================\n" +
					"               Menu              \n" +
					"=================================\n" +
					"1. Ingrese los equipos\n" +
					"2. Muestre los equipos\n" +
					"3. Ejecutar campeonato\n" + 
					"4. Salir\n\n" +
					"Ingresa una opcion: ");
			option = teclado.nextInt();
			System.out.print("=================================\n");
			switch(option) {
			case 1:
				e1.addNombreEquipos();
				e1.addNombreJugadores();
				break;
			case 2:
				e1.getNombreJugadores();
				break;
			case 3:
				e1.ejecutarCampeonato();
				break;
			case 4:
				System.out.println("Gracias por usar :D");
				flag = 0;
				break;
			default:
				System.out.println("Ingresa una opcion valida...");
				break;
			}
		} while(flag != 0);
	}
}