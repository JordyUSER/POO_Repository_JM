import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		int flag = -2, option; //Intanciacion de variables para funcionamiento del programa
		Cuadrado c1 = new Cuadrado(); //Declaracion del objeto cuadrado
		Triangulo tri1 = new Triangulo(); //Declaracion del objeto triangulo
		Rectangulo r1 = new Rectangulo(); //Declaracion del objeto rectangular
		Poligono p1 = new Poligono(); //Declaracion del objeto poligono
		
		do { //Menu de figuras
			option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
                    "\n===============================\n" +
                    "          Menu - Figuras         \n" +
                    "===============================\n" +
                    "1. Cuadrado.\n" +
                    "2. Triangulo.\n" +
                    "3. Rectangulo.\n" +
                    "4. Poligono.\n" +
                    "5. Salir"));
			
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
					case 1: //Sacar Area
						c1.setLong(); //Permite ingresar la longitud del lado
						c1.area(c1.getLong()); //Muestra el area segun la longitud especificada anteriormente
						break;
					case 2: //Sacar Perimetro
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
				} while(option != 3);
				break;
			case 2: // Opcion de Triangulo
				do { //Menu de metodos del Triangulo
					option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
		                    "\n===============================\n" +
		                    "       Triangulo - Metodos      \n" +
		                    "===============================\n" +
		                    "1. Area.\n" +
		                    "2. Perimetro\n" +
		                    "3. Volver"));
					switch(option) { //Seleccionador del metodo
					case 1: //Sacar Area
						tri1.setLongB(); //Permite ingresar la longitud base del triangulo
						tri1.setAltH(); //Permite ingresar la base del triangulo
						tri1.area(tri1.getLongB(), tri1.getAltH()); //Muestra el area del triangulo segun la longitud y la altura especificada anteriormente
						break;
					case 2: //Sacar Perimetro
						tri1.setLongA(); //Permite ingresar la longitud a del triangulo
						tri1.setLongB(); //Permite ingresar la longitud base del triangulo
						tri1.setLongC(); //Permite ingresar la longitud c del triangulo
						tri1.perimetro(tri1.getLongA(), tri1.getLongB(), tri1.getLongC()); //Muestra el area segun los datos especificados anteriormente
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
			case 3: // Opcion de Rectangulo
				do { //Menu de metodos del Rectangulo
					option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
		                    "\n===============================\n" +
		                    "       Rectangulo - Metodos      \n" +
		                    "===============================\n" +
		                    "1. Area.\n" +
		                    "2. Perimetro\n" +
		                    "3. Volver"));
					switch(option) { //Seleccionador del metodo
					case 1: //Sacar Area
						r1.setLongB(); //Permite ingresar la base del rectangulo
						r1.setAltH(); //Permite ingresar la altura del rectangulo
						r1.area(r1.getLongB(), r1.getAltH()); //Muestra el area segun los datos especificados anteriormente
						break;
					case 2: //Sacar Permietro
						r1.setLongB(); //Permite ingresar la base del rectangulo
						r1.setAltH(); //Permite ingresar la altura del rectangulo
						r1.perimetro(r1.getLongB(), r1.getAltH()); //Muestra el perimetro segun los datos especificados anteriormente			
						break;
					case 3: //Vuelve al menu de figuras
						System.out.println("Volviendo.");
						break;
					default: //Pide que ingrese una opcion valida
						System.out.println("Ingrese una opcion valida.");
						break;
					}
				} while(option != 3);
				break;
			case 4: // Opcion de poligono
				do { //Menu de metodos del poligono
					option = Integer.parseInt(JOptionPane.showInputDialog("\n" +
		                    "\n===============================\n" +
		                    "       Poligono - Metodos      \n" +
		                    "===============================\n" +
		                    "1. Area.\n" +
		                    "2. Perimetro\n" +
		                    "3. Volver"));
					switch(option) { //Seleccionador del metodo
					case 1: 
						p1.setLongB(); //Permite ingresar la base del poligono
						p1.setNLados(); //Permite ingresar el numero de lados del poligono
						p1.setApotema(); //Permite ingresar el apotema del poligono
						p1.area(p1.getLongB(), p1.getNLados(), p1.getApotema()); //Muestra el area segun los datos especificados anteriormente
						break;
					case 2:
						p1.setLongB(); //Permite ingresar la base del poligono
						p1.setNLados(); //Permite ingresar el numero de lados del poligono
						p1.perimetro(p1.getLongB(), p1.getNLados()); //Muestra el perimetro segun los datos especificados anteriormente			
						break;
					case 3: //Vuelve al menu de figuras
						System.out.println("Volviendo.");
						break;
					default: //Pide que ingrese una opcion valida
						System.out.println("Ingrese una opcion valida.");
						break;
					}
				} while(option != 3);
				break;
			case 5: //Cierra el menu y acaba el programa
				System.out.println("Gracias por usar.");
        		flag = 0;
        		break;
			default: //Pide que ingrese una opcion valida
				System.out.println("Ingrese una opcion valida.");
				break;
			}
		} while(flag != 0);
	}
}