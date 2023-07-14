package poo_practicacuenta;

/**
 *
 * @author Jordy
 */
public class Cuenta {
    private String nombre;
    protected int numCuenta;
    private int cuentaTipo;
    protected int capital = 0;
    protected String tipoCuenta;
    
    public Cuenta(String nombre, int numCuenta, int cuentaTipo){
        this.cuentaTipo = cuentaTipo;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        switch(cuentaTipo){
            case 1:
                CuentaLimitada CardL = new CuentaLimitada(nombre, numCuenta, cuentaTipo);
                tipoCuenta = "Limitada";
                break;
            case 2:
                CuentaIlimitada CardI = new CuentaIlimitada(nombre, numCuenta, cuentaTipo);
                tipoCuenta = "Ilimitada";
                break;
            default:
                System.out.println("Ingrese tipo de cuenta valido");
                break;
        }
    }
    
    public void ingreso(int numCuenta, int monto){
        capital += monto;
    }
    
    public void salida(int numCuenta, int monto){
        capital -= monto;
    }
    
    public void mostrarCapital(){
        System.out.println(
                "\n===========================" +
                "\n     Cuenta " + numCuenta +
                "\n===========================" +
                "\n- Tipo    " + cuentaTipo +
                "\n- Nombre  " + nombre +
                "\n- Capital " + capital);
    }
    
}
