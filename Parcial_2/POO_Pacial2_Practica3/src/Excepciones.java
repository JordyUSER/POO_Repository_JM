import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class Excepciones {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String name = br.readLine();
			if(name.isEmpty()) {
				throw new IOException("Nombre vacio");
			}
			System.out.println("Ejecutado...");
			int div = 1/0;
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
