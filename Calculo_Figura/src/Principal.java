import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		int flag = -2, option; //Intanciacion de variables para funcionamiento del programa
		Cuadrado c1 = new Cuadrado(); //Declaracion del objeto cuadrado
		Triangulo tri1 = new Triangulo(); //Declaracion del objeto triangulo
		
		
		do { //Menu de figuras
			option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                    "\n===============================\n" +
                    "          Menu - Figuras         \n" +
                    "===============================\n" +
                    "1. Cuadrado.\n" +
                    "2. Triangulo.\n" +
                    "3. .\n" +
                    "4. .\n" +
                    "5. .\n" +
                    "n. Salir"));
			
			switch(option) {
			case 1: // Opcion de cuadrado
				do { //Menu de metodos del cuadrado
					option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
		                    "\n===============================\n" +
		                    "       Cuadrado - Metodos      \n" +
		                    "===============================\n" +
		                    "1. Area.\n" +
		                    "2. Perimetro\n" +
		                    "3. Volver"));
					switch(option) { //Seleccionador del metodo
					case 1: 
						c1.setLong(); //Permite ingresar la longitud del lado
						c1.area(c1.getLong()); //Muestra el area segun la longitud especificada anteriormente
						break;
					case 2:
						c1.setLong(); //Permite ingresar la longitud del lado
						c1.perimetro(c1.getLong()); //Muestra el perimetro segun la longitud especificada anteriormente			
						break;
					case 3: //Vuelve al menu de figuras
						System.out.println("Volviendo.");
						break;
					default: //Pide que ingrese una opcion valida
						System.out.println("Ingrese una opcion valida.");
						break;
					}
				} while(option != 0);

			case 2: // Opcion de cuadrado
				do { //Menu de metodos del cuadrado
					option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
		                    "\n===============================\n" +
		                    "       Triangulo - Metodos      \n" +
		                    "===============================\n" +
		                    "1. Area.\n" +
		                    "2. Perimetro\n" +
		                    "3. Volver"));
					switch(option) { //Seleccionador del metodo
					case 1: 
						tri1.setLongB(); //Permite ingresar la longitud base del triangulo
						tri1.setAltH(); //Permite ingresar la base del triangulo
						tri1.area(tri1.getLongB(), tri1.getAltH()); //Muestra el area del triangulo segun la longitud y la altura especificada anteriormente
						break;
					case 2:
						tri1.setLongA(); //Permite ingresar la longitud a del lado	
						tri1.setLongB(); //Permite ingresar la longitud base del lado
						tri1.setLongC(); //Permite ingresar la longitud c del lado
						tri1.perimetro(tri1.getLongA(), tri1.getLongB(), tri1.getLongC()); //Muestra el area segun la longitud especificada anteriormente
						break;
					case 3: //Vuelve al menu de figuras
						System.out.println("Volviendo.");
						break;
					default: //Pide que ingrese una opcion valida
						System.out.println("Ingrese una opcion valida.");
						break;
					}
				} while (option != 3);
				break;
			case 6: //Cierra el menu y acaba el programa
				System.out.println("Gracias por usar.");
        		flag = 0;
        		break;
			}
			
		} while(flag != 0);
	}
}