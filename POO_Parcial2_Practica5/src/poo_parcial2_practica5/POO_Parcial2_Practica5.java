package poo_parcial2_practica5;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
/**
 *
 * @author ESPE
 */
public class POO_Parcial2_Practica5 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br0 = new BufferedReader(new FileReader("C:\\Users\\ESPE.DESKTOP-MTB7TFC\\Documents\\Jordy_POO\\Archivos\\texton.txt"));
            BufferedWriter bw0 = new BufferedWriter(new FileWriter("C:\\Users\\ESPE.DESKTOP-MTB7TFC\\Documents\\Jordy_POO\\Archivos\\texton.txt"));
            bw0.open();
            bw0.write("Hola nuevos papus...");
            bw0.newLine();
            
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
