public class Automovil extends Vehiculo{
    boolean parabrisas;

    @Override
    public void encendido() {
        this.encendido = true;
        this.estado = "El automovil esta encendido";
    }
    
    public void apagado() {
        this.encendido = false;
        this.estado = "El automovil esta apagado";
    }
}