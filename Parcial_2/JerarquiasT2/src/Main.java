import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) throws Exception{
		Director d1;
		Operario o1;
		int opcion, opcion2;
		int mesesWorked, edad, personal;
		double salarioAnual;
		boolean flag, flag2;
		String nombre, fechaIng, dep;
		
		do {
			flag = true;
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"\n\tMenú de Gestion" +
					"\n1. Director." +
					"\n2. Operario." +
					"\n3. Salir." +
					"\n\nIngrese una opcion: "));
			switch(opcion) {
			case 1:
				nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
				edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
				fechaIng = JOptionPane.showInputDialog("Fecha de ingreso\nFormato DD/MM/AAAA\n\nIngrese su fecha de ingreso: ");
				mesesWorked = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus meses trabajados: "));
				salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario anual: "));
				dep = JOptionPane.showInputDialog("Ingrese su departamento: ");
				personal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personal que tiene a cargo: "));
				d1 = new Director(nombre, fechaIng, mesesWorked, edad, salarioAnual, dep, personal);
				do {
					flag2 = true;
					opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tMenú de Director" +
							"\n1. Mostrar Datos." +
							"\n2. Incentivar." +
							"\n3. Cambiar el numero de personal a cargo." +
							"\n4. Cambiar el departamento del empleado." +
							"\n5. Cambiar meses trabajados." +
							"\n6. Cambiar nombre" +
							"\n7. Cambiar fecha de ingreso." +
							"\n8. Cambiar edad" +
							"\n9. Cambiar salario anual" +
							"\n0. Volver" +
							"\n\nIngrese una opcion: "));
					switch(opcion2) {
					case 1:
						d1.mostrarDatos();
						break;
					case 2:
						d1.incentivar();
						break;
					case 3:
						personal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personal que tiene a cargo: "));
						d1.setPersonal(personal);
						break;
					case 4:
						dep = JOptionPane.showInputDialog("Ingrese su departamento: ");
						d1.setDepartamento(dep);
						break;
					case 5:
						mesesWorked = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus meses trabajados: "));
						d1.setMesesTrabajados(mesesWorked);
						break;
					case 6:
						nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");	
						d1.setNombre(nombre);
						break;
					case 7:
						fechaIng = JOptionPane.showInputDialog("Fecha de ingreso\nFormato DD/MM/AAAA\n\nIngrese su fecha de ingreso: ");
						d1.setFechaIngreso(fechaIng);
						break;
					case 8:
						edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
						d1.setEdad(edad);
						break;
					case 9:
						salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario anual: "));
						d1.setSalarioAnual(salarioAnual);
						break;
					case 0:
						flag2 = false;
						System.out.println("\nVolviendo...");
						break;
					default:
						System.out.println("\nIngrese una opcion valida >:v.");
						break;
					}
				} while(flag2 != false);
				break;
			case 2:
				nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
				edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
				fechaIng = JOptionPane.showInputDialog("Fecha de ingreso\nFormato DD/MM/AAAA\n\nIngrese su fecha de ingreso: ");
				mesesWorked = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus meses trabajados: "));
				salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario anual: "));
				o1 = new Operario(nombre, fechaIng, mesesWorked, edad, salarioAnual);
				do {
					flag2 = true;
					opcion2 = Integer.parseInt(JOptionPane.showInputDialog(
							"\n\tMenú de Director" +
							"\n1. Mostrar Datos." +
							"\n2. Incentivar." +
							"\n3. Actualizar Nivel." +
							"\n4. Cambiar meses trabajados." +
							"\n5. Cambiar nombre" +
							"\n6. Cambiar fecha de ingreso." +
							"\n7. Cambiar edad" +
							"\n8. Cambiar salario anual" +
							"\n0. Volver" +
							"\n\nIngrese una opcion: "));
					switch(opcion2) {
					case 1:
						o1.mostrarDatos();
						break;
					case 2:
						o1.incentivar();
						break;
					case 3:
						o1.actualizarNivel(mesesWorked);
						break;
					case 4:
						mesesWorked = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus meses trabajados: "));
						o1.setMesesTrabajados(mesesWorked);
						break;
					case 5:
						nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");	
						o1.setNombre(nombre);
						break;
					case 6:
						fechaIng = JOptionPane.showInputDialog("Fecha de ingreso\nFormato DD/MM/AAAA\n\nIngrese su fecha de ingreso: ");
						o1.setFechaIngreso(fechaIng);
						break;
					case 7:
						edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
						o1.setEdad(edad);
						break;
					case 8:
						salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario anual: "));
						o1.setSalarioAnual(salarioAnual);
						break;
					case 0:
						flag2 = false;
						System.out.println("\nVolviendo...");
						break;
					default:
						System.out.println("\nIngrese una opcion valida >:v.");
						break;
					}
				} while(flag2 != false);
				break;
			case 3:
				System.out.println("\nGracias por usar el programa :D.");
				flag = false;
				break;
			default:
				System.out.println("\nIngrese una opcion valida >:v.");
				break;
			}
		} while(flag != false);

	}

}