package poo_parcial2_practica7_herencia;

public class Vehiculo {
    String placa;
    int nRuedas;
    boolean encendido;
    String estado;
    
    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public void encendido() {
        this.encendido = true;
        this.estado = "Esta encendido";
    }
    
    public void apagado() {
        this.encendido = false;
        this.estado = "Esta apagado";
    }
    
}
