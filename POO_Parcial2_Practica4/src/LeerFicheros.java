import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
public class LeerFicheros {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ESPE\\eclipse-workspace\\BestNotes1.txt"));
		String linea;
		try {
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
		} catch(IOException e) {
			System.out.println("No existe el archivo");
		}
	}
}
