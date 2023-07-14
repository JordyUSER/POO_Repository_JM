package poo_09_menu_met_get_set;
import java.util.Scanner;

public class POO_09_MENU_MET_GET_SET {
    public static void main(String[] args) {
        //Este programa permite solicitar al usuario datos personales
      //los coloca en objetos de la clase persona y luego 
      //muestra en pantalla
      Scanner teclado=new Scanner(System.in);
      //el objeto teclado de la clase Scanner permite el usuario ingresar
      //informacion desde el teclado
      //creamos 3 variables auxiliares que recibiran los datos 
      //ingresados por el usuario via teclado
      String nombre, apellido;
      int edad;
      System.out.print("Ingrese su nombre:");
      nombre=teclado.nextLine();//se almacena en la variable nombre
      System.out.println("Ingrese su apellido");
      apellido=teclado.nextLine();//nextLine()recupera la informacion ingresada
                                  //por teclado en formato String
      System.out.println("Ingrese su edad");
      edad=teclado.nextInt();//nextInt() recupera la informacion ingresada
                             //por teclado en formato int
                             
      Persona persona= new Persona(); //Creacion de un objeto de tipo Persona
      persona.setNombre(nombre); //Con los sets establecemos el contenido de ese
      persona.setApellido(apellido); //atributo de nuestro objeto
      persona.setEdad(edad);
      
      //Con get mostramos en pantalla los  
      System.out.println("Datos de la persona");
      System.out.println("Nombre:"+persona.getNombre());
      System.out.println("Apellido: "+persona.getApellido());
      System.out.println("Edad: "+persona.getEdad());
    }
}
