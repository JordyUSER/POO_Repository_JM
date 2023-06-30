package poo_parcial2_practica_10;

/**
 *
 * @author Jordy
 */
public class Persona {
    private String nombre;
    private int edad;
    private long cedula;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nombre, int edad, long cedula){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }
    
    public void jugar(){
        System.out.println("Mi nombre es " + this.nombre + " y voy a jugar. :D");
    }
    public void jugar(String juego){
        System.out.println("Mi nombre es " + this.nombre + " y voy a jugar" + juego +" :D");
    }
}
