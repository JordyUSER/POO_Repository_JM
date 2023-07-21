import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		//Declaración de Objetos
		Tecnico tec1;
		Docente doce1;
		Administrativo adm1;
		Limpieza limp1;
		
		//Declaracion de Variables
		boolean flag, flag1;
		int tipoPersonal, opcion;
		String nameTc, nameDc, nameAdm, nameLim;
		int edadTc, edadDc, edadAdm, edadLim;
		double sueldoBasicTc, sueldoBasicDc, sueldoBasicAdm, sueldoBasicLim;
		int expTc, antTc, antLim;
		int tituloDc, cursDc;
		int seccionAdm;
		
		do { //Menu inicial
			flag = true;
			tipoPersonal = Integer.parseInt(JOptionPane.showInputDialog(
					"\n\tMenu Getion Personal" + 
					"\n1. Tecnico." +
					"\n2. Docente." +
					"\n3. Administrativo." +
					"\n4. Limpieza." + 
					"\n5. Salir."));
			
			switch(tipoPersonal) {
			case 1:
				nameTc = JOptionPane.showInputDialog("Ingrese su nombre: ");
				edadTc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
				sueldoBasicTc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo basico: "));
				expTc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus años de experiencia: "));
				tec1 = new Tecnico(nameTc, edadTc, sueldoBasicTc, expTc);
				tec1.setSueldoFinal(tec1.getSueldoBasico());
				do { //Menu de Tecnico
					flag1 = true;
					opcion = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tMenu Getion Personal Tecnico" + 
							"\n1. Mostrar Datos." +
							"\n2. Calcular Sueldo Final." +
							"\n3. Cambiar Nombre." +
							"\n4. Cambiar Años de Experiencia." + 
							"\n5. Cambiar sueldo basico." +
							"\n6. Establecer o Cambiar Antiduedad" +
							"\n0. Salir."));
					
					switch(opcion) {
					case 1:
						tec1.mostrarDatos();
						break;
					case 2:
						tec1.calcularSueldos();
						break;
					case 3:
						expTc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus años de experiencia: "));
						tec1.setExperiencia(expTc);
						break;
					case 4:
						nameTc = JOptionPane.showInputDialog("Ingrese su nombre: ");
						tec1.setNombre(nameTc);
						break;
					case 5:
						sueldoBasicTc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo basico: "));
						tec1.setSueldoBasico(sueldoBasicTc);
						break;
					case 6:
						antTc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su años de antiguedad: "));
						tec1.setAntiguedad(antTc);
						break;
					case 0:
						System.out.println("\nVolviendo...");
						flag1 = false;
						break;
					default:
						System.out.println("\nIngrese una opcion valida >:V");
						break;
					}
				} while(flag1 != false);
				break;
			case 2:
				nameDc = JOptionPane.showInputDialog("Ingrese su nombre: ");
				edadDc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
				sueldoBasicDc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo: "));
				do {
					tituloDc = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tTitulos" +
							"\n1. Doctorado." +
							"\n2. Maestria." +
							"\n3. Ingenieria." +
							"\n4. No seleccionar."));
					if (tituloDc < 1 || tituloDc > 4) {
						System.out.println("Ingrese un titulo existente.");
					}
				}while(tituloDc < 1 || tituloDc > 4);
				doce1 = new Docente(nameDc, edadDc, sueldoBasicDc, tituloDc);
				doce1.setSueldoFinal(doce1.getSueldoBasico());
				do { //Menu de docente
					flag1 = true;
					opcion = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tMenu Getion Personal Docente" + 
							"\n1. Mostrar Datos." +
							"\n2. Calcular Sueldo Final." +
							"\n3. Cambiar Nombre." +
							"\n4. Cambiar Titulo." + 
							"\n5. Establecer o Cambiar cursos a cargo." +
							"\n6. Cambiar Sueldo Basico." +
							"\n0. Salir."));
					
					switch(opcion) {
					case 1:
						doce1.mostrarDatos();
						break;
					case 2:
						doce1.calcularSueldos();
						break;
					case 3:
						nameDc = JOptionPane.showInputDialog("Ingrese su nombre: ");
						doce1.setNombre(nameDc);
						break;
					case 4:
						do {
							tituloDc = Integer.parseInt(JOptionPane.showInputDialog(
									"\n\tTitulos" +
									"\n1. Doctorado." +
									"\n2. Maestria." +
									"\n3. Ingenieria." +
									"\n4. No seleccionar."));
							if (tituloDc < 1 || tituloDc > 4) {
								System.out.println("Ingrese un titulo existente.");
							}
						}while(tituloDc < 1 || tituloDc > 4);
						break;
					case 5:
						cursDc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cursos que tiene a cargo: ")); 
						doce1.setCursos(cursDc);
						break;
					case 6:
						sueldoBasicDc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cursos que tiene a cargo: ")); 
						doce1.setSueldoBasico(sueldoBasicDc);
						break;
					case 0:
						System.out.println("\nVolviendo...");
						flag1 = false;
						break;
					default:
						System.out.println("\nIngrese una opcion valida >:V");
						break;
					}
				} while(flag1 != false);
				break;
			case 3:
				nameAdm = JOptionPane.showInputDialog("Ingrese su nombre: ");
				edadAdm = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
				sueldoBasicAdm = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo: "));
				do {
					seccionAdm = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tSecciones" +
							"\n1. Gerencia." +
							"\n2. Ventas." +
							"\n3. Jefe." +
							"\n4. No seleccionar."));
					if (seccionAdm < 1 || seccionAdm > 4) {
						System.out.println("Ingrese una seccion existente.");
					}
				}while(seccionAdm < 1 || seccionAdm > 4);
				adm1 = new Administrativo(nameAdm, edadAdm, sueldoBasicAdm, seccionAdm);
				adm1.setSueldoFinal(adm1.getSueldoBasico());
				do { //Menu de administrativo
					flag1 = true;
					opcion = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tMenu Getion Personal Administrativo" + 
							"\n1. Mostrar Datos." +
							"\n2. Calcular Sueldo Final." +
							"\n3. Cambiar Nombre." +
							"\n4. Cambiar Seccion." + 
							"\n5. Cambiar sueldo basico." +
							"\n0. Salir."));
					
					switch(opcion) {
					case 1:
						adm1.mostrarDatos();
						break;
					case 2:
						adm1.calcularSueldos();
						break;
					case 3:
						nameAdm = JOptionPane.showInputDialog("Ingrese su nombre: ");
						adm1.setNombre(nameAdm);
						break;
					case 4:
						do {
							seccionAdm = Integer.parseInt(JOptionPane.showInputDialog(
									"\n\tSecciones" +
									"\n1. Gerencia." +
									"\n2. Ventas." +
									"\n3. Jefe." +
									"\n4. No seleccionar."));
							if (seccionAdm < 1 || seccionAdm > 4) {
								System.out.println("Ingrese una seccion existente.");
							} 
						}while(seccionAdm < 1 || seccionAdm > 4);
						adm1.setSeccion(seccionAdm);
						break;
					case 5:
						sueldoBasicAdm = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cursos que tiene a cargo: ")); 
						adm1.setSueldoBasico(sueldoBasicAdm);
						break;
					case 0:
						System.out.println("\nVolviendo...");
						flag1 = false;
						break;
					default:
						System.out.println("\nIngrese una opcion valida >:V");
						break;
					}
				} while(flag1 != false);
				break;
			case 4:
				nameLim = JOptionPane.showInputDialog("Ingrese su nombre: ");
				edadLim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
				sueldoBasicLim = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo basico: "));
				antLim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su años de antiguedad: "));
				limp1 = new Limpieza(nameLim, edadLim, sueldoBasicLim, antLim);
				limp1.setSueldoFinal(limp1.getSueldoBasico());
				do { //Menu de limpieza
					flag1 = true;
					opcion = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tMenu Getion Personal Limpieza" + 
							"\n1. Mostrar Datos." +
							"\n2. Calcular Sueldo Final." +
							"\n3. Cambiar Nombre." +
							"\n4. Cambiar Años de Experiencia." + 
							"\n5. Cambiar sueldo basico." +
							"\n6. Establecer o Cambiar Antiduedad" +
							"\n0. Salir."));
					
					switch(opcion) {
					case 1:
						limp1.mostrarDatos();
						break;
					case 2:
						limp1.calcularSueldos();
						break;
					case 3:
						nameLim = JOptionPane.showInputDialog("Ingrese su nombre: ");
						limp1.setNombre(nameLim);
						break;
					case 5:
						sueldoBasicLim = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo basico: "));
						limp1.setSueldoBasico(sueldoBasicLim);
						break;
					case 6:
						antLim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su años de antiguedad: "));
						limp1.setAntiguedad(antLim);
						break;
					case 0:
						System.out.println("\nVolviendo...");
						flag1 = false;
						break;
					default:
						System.out.println("\nIngrese una opcion valida >:V");
						break;
					}
				} while(flag1 != false);
				break;
			case 5:
				System.out.println("\nGracias por usar el programa :D");
				flag = false;
				break;
			default:
				System.out.println("\nIngrese un tipo de personal existente >:V");
				break;
			}	
		} while(flag != false);
	}
}
