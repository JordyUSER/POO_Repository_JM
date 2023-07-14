
package poo_parcial2_practica_11;
import Animal.Animal;
/**
 *
 * @author Jordy
 */
public class Persona extends Animal{
    
    private int edad;
    
    public Persona(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }
    
    @Override
    public void comer(){
        System.out.println("Soy un humano y como un monton :D");
    }
    
}
