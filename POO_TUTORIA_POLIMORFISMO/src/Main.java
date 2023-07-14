import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int opc, edad;
		String name, disciplina, prueba, sexo, estilo;
		Atletismo A1; //Declaracion del objeto A1 de tipo Atletismo
		Natacion N1; //Declaracion del objeto N1 de tipo Natacion
		boolean flag;
		// Menu
		do {
			flag = true;
			System.out.println(
					"\nEscoja una opcion" +
					"\n1. Atletismo" + 
					"\n2. Natacion" +
					"\n3. Salir");
			opc = sc.nextInt();
			sc.nextLine();
			switch(opc) {
			case 1:
				disciplina = "Atletismo";
				System.out.print("\nIngrese su nombre: ");
				name = sc.nextLine();
				System.out.print("Ingrese su edad: ");
				edad = sc.nextInt();
				sc.nextLine();
				System.out.print("Ingrese su sexo: ");
				sexo = sc.nextLine();
				System.out.print("Ingrese la prueba que practica: ");
				prueba = sc.nextLine();
				A1 = new Atletismo(name, edad, disciplina, sexo, prueba);
				A1.mostrarDatos();
				break;
			case 2:
				disciplina = "Natacion";
				System.out.print("\nIngrese su nombre: ");
				name = sc.nextLine();
				sc.nextLine();
				System.out.print("Ingrese su edad: ");
				edad = sc.nextInt();
				sc.nextLine();
				System.out.print("Ingrese su sexo: ");
				sexo = sc.nextLine();
				System.out.print("Ingrese su estilo de natacion: ");
				estilo = sc.nextLine();
				N1 = new Natacion(name, edad, disciplina, sexo, estilo);
				N1.mostrarDatos();
				break;
			case 3:
				System.out.println("\nGracias por usar :D");
				flag = false;
				break;
			default:
				System.out.println("\nIngrese una opcion valida...");
				break;
			}
		}while (flag != false);
	}
}
