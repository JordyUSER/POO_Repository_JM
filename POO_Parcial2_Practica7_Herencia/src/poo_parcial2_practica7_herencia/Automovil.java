package poo_parcial2_practica7_herencia;

public class Automovil extends Vehiculo{
    boolean parabrisas;

    @Override
    public void encendido() {
        this.encendido = true;
        this.estado = "Esta encendido";
    }
    
    public void apagado() {
        this.encendido = false;
        this.estado = "Esta apagado";
    }
}
