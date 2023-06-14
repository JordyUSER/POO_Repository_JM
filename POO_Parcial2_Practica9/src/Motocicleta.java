public class Motocicleta extends Vehiculo{
    boolean patada;

    @Override
    public void encendido() {
        this.encendido = true;
        this.estado = "La motocicleta esta encendida";
    }
    
    public void apagado() {
        this.encendido = false;
        this.estado = "La motocicleta esta apagada";
    }
}