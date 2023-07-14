package poo_parcial2_practica_16;

/**
 *
 * @author Jordy
 */
public abstract class Figura {
    private String color;
    public Figura(String color){
        this.color = color;
    }
    public abstract double area();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract void mostrarDatos();
}
