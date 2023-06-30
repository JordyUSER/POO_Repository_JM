package poo_practicacuenta;

/**
 *
 * @author Jordy
 */
public class CuentaIlimitada extends Cuenta {
    
    
    public CuentaIlimitada(String nombre, int numCuenta, int cuentaTipo) {
        super(nombre, numCuenta, cuentaTipo);
    }
    
    @Override
    public void ingreso(int numCuenta, int monto){
        capital += monto;
    }
}
