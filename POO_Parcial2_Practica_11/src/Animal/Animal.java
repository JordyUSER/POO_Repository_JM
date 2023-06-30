package Animal;

/**
 *
 * @author Jordy
 */
public class Animal {
    private String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public void comer(){
        System.out.println("Soy un animal y como :D");
    }
}
