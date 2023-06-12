package poo_parcial2_practica7_herencia;

/**
 *
 * @author Jordy Mejia
 */
public class POO_Parcial2_Practica7_Herencia {
    public static void main(String[] args) {
        
        Automovil carro1 = new Automovil();
        Motocicleta moto1 = new Motocicleta();
        
        carro1.setnRuedas(6);
        carro1.encendido();
        System.out.println(carro1.estado);
        carro1.apagado();
        System.out.println(carro1.estado);
        
    }
}
