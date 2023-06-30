package poo_parcial2_practica_11;
import Animal.Animal;
/**
 *
 * @author ESPE
 */
public class Gato extends Animal{
    
    private String tamaño; 
    
    public Gato(String nombre, String tamaño) {
        super(nombre);
        this.tamaño = tamaño;
    }
    
    @Override
    public void comer(){
        System.out.println("Soy un gato y me peleo por gatitas en el techo :D");
    }
}
