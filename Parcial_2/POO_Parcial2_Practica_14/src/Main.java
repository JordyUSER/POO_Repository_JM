import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		Cuadrado F1;
		Circulo F2;
		Rectangulo F3;
		int opcion, opcion2;
		boolean flag1, flag2;
		do {
			flag1 = true;
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Menu de Figuras" +
					"\n1. Cuadrado" +
					"\n2. Circulo" +
					"\n3. Rectangulo" +
					"\n4. Salir" +
					"\n\nIngrese una opcion"));
			switch(opcion) {
			case 1:
				double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del cuadrado:"));
				F1 = new Cuadrado(lado);
				do {
					flag2 = true;
					opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
							"Menu de Cuadrado" +
							"\n1. Calcular area" +
							"\n2. Ver si es dibujable" +
							"\n3. Volver" +
							"\n\nIngrese una opcion"));
					switch(opcion2) {
					case 1:
						System.out.println("El area del Cuadrado es: " + F1.calcularArea());
						break;
					case 2:
						F1.dibujar();
						break;
					case 3:
						flag2 = false;
						System.out.println("\nVolviendo...");
						break;
					default:
						System.out.println("\nIngrese una opcion valida...");
						break;
					}
				} while(flag2 != false);
				break;
			case 2:
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo:"));
				F2 = new Circulo(radio);
				do {
					flag2 = true;
					opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
							"Menu de Circulo" +
							"\n1. Calcular area" +
							"\n2. Ver si es dibujable" +
							"\n3. Rodar" +
							"\n4. Volver" +
							"\n\nIngrese una opcion"));
					switch(opcion2) {
					case 1:
						System.out.println("\nEl area del Circulo es: " + F2.calcularArea());
						break;
					case 2:
						F2.dibujar();
						break;
					case 3:
						F2.rodar();
						break;
					case 4:
						flag2 = false;
						System.out.println("\nVolviendo...");
						break;
					default:
						System.out.println("\nIngrese una opcion valida...");
						break;
					}
				} while(flag2 != false);				
				break;
			case 3:
				double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo:"));
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo:"));
				F3 = new Rectangulo(base, altura);
				do {
					flag2 = true;
					opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
							"Menu de Rectangulo" +
							"\n1. Calcular area" +
							"\n2. Ver si es dibujable" +
							"\n3. Volver" +
							"\n\nIngrese una opcion"));
					switch(opcion2) {
					case 1:
						System.out.println("El area del Rectangulo es: " + F3.calcularArea());
						break;
					case 2:
						F3.dibujar();
						break;
					case 3:
						flag2 = false;
						System.out.println("\nVolviendo...");
						break;
					default:
						System.out.println("\nIngrese una opcion valida...");
						break;
					}
				} while(flag2 != false);
				break;
			case 4:
				flag1 = false;
				System.out.println("\nGracias por usar el programa :D");
				break;
			default:
				System.out.println("\nIngrese una opcion valida...");
				break;
			}
		}while (flag1 != false);
	}
}
