package poo_parcial2_practica_15;
import java.io.*;
/**
 *
 * @author Jordy
 */
public class Archivo {
    public static void crearArchivo(String nombreArchivo){            
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close(); 
            System.out.println("\nArchivo creado :D");        
        } catch(FileNotFoundException e) {
            e.printStackTrace(System.out);  
        }
    }
    public static void escribirArchivo(String nombreArchivo){            
        try{
            PrintWriter salida = new PrintWriter(nombreArchivo);
            salida.println("Contenido"); 
            salida.close(); 
            System.out.println("\nArchivo cerrado :D");        
        } catch(FileNotFoundException e) {
            System.out.println("Cree primero su archivo >:V");
            e.printStackTrace(System.out);  
        } catch(IOException e) {
            e.printStackTrace(System.out);  
        }
    }
    public static void leerArchivo(String nombreArchivo){            
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            String lectura = entrada.readLine();
            System.out.println("Contenido del archivo: " + nombreArchivo + "\n");
            while(lectura!=null){
                System.out.println(lectura + "\n");
                lectura = entrada.readLine();
            }
            System.out.println("\nArchivo leido :D");        
        } catch(FileNotFoundException e){
            System.out.println("Cree primero su archivo >:V");
            e.printStackTrace(System.out);
        } catch(IOException e) {
            e.printStackTrace(System.out);  
        }
    }
}
