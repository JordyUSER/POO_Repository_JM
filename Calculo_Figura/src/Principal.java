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
					default: //Pide que ingrese una opcion valida
						System.out.println("Ingrese una opcion valida.");
					}
				} while (option != 3);
				break;
			/*case 2: // Opcion de cuadrado
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
						tri1.setLong(); //Permite ingresar la longitud del lado
						tri1.area(tri1.getLong()); //Muestra el area segun la longitud especificada anteriormente
						break;
					case 2:
						c1.setLong(); //Permite ingresar la longitud del lado
						c1.perimetro(c1.getLong()); //Muestra el perimetro segun la longitud especificada anteriormente			
						break;
					case 3: //Vuelve al menu de figuras
						System.out.println("Volviendo.");
					default: //Pide que ingrese una opcion valida
						System.out.println("Ingrese una opcion valida.");
					}
				} while (option != 3);
				break;*/
			case 6: //Cierra el menu y acaba el programa
				System.out.println("Gracias por usar.");
        		flag = 0;
        		break;
			}
			
		} while(flag != 0);
		
		
		
	}

}
