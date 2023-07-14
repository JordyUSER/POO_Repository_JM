package poo_09_menu_met_get_set;

/**
 *
 * @author Jordy Mejia
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int  edad; 
    
    /* Despues de declarar los atributos de la clase privada presionamos 
     * click derecho y damos donde dice <insert code>, ahi daremos en "Getter y
     * Setter y luego seleccionamos a los atributos a los que queremos que se 
     * les creen estos metodos
    
    Set -> Establecer
    Get -> Obtener                     "*/
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
