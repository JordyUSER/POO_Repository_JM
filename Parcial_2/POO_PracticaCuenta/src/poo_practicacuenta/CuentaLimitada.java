package poo_practicacuenta;

/**
 *
 * @author Jordy
 */
public class CuentaLimitada extends Cuenta{
    private int LIM_MOVIMIENTO = 1000;
    
    public CuentaLimitada(String nombre, int numCuenta, int cuentaTipo) {
        super(nombre, numCuenta, cuentaTipo);
    }
    
    @Override
    public void ingreso(int numCuenta, int monto){
        if(monto < LIM_MOVIMIENTO){
            if(capital < LIM_MOVIMIENTO){
                capital += monto;
            }
        } else {
            System.out.println("Ingrese un monto acorde al limite de su tarjeta.");
        }
    }
    
    @Override
    public void salida(int numCuenta, int monto){
        if(monto < LIM_MOVIMIENTO){
            if(capital < LIM_MOVIMIENTO){
                capital -= monto;
            } else {
                
            }
        } else {
            System.out.println("Ingrese un monto acorde al limite de su tarjeta.");
        }
    }
    
}
