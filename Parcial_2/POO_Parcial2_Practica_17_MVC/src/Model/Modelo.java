package Model;

/**
 *
 * @author ESPE
 */
public class Modelo {
    private int valor1;
    private int valor2;
    private int total;
    
    public Modelo(){
        
    }
    public void setValor1(int val){
        this.valor1 = val;
    }
    public int getValor1(){
        return this.valor1;
    }
    public void setValor2(int val){
        this.valor2 = val;
    }
    public int getValor2(){
        return this.valor2;
    }
    public void sumar(){
        this.total = this.valor1 + this.valor2;
    }
    public void restar(){
        this.total = this.valor1 - this.valor2;
    }
    public void dividir(){
        if (valor2 == 0){
            System.out.println("Ingrese un numero distinto de cero para el denominador");
        } else {
            this.total = this.valor1 / this.valor2;
        }
    }
    public void multiplicar(){
        this.total = this.valor1 * this.valor2;
    }
    
    public int getTotal(){
        return this.total;
    }
}
