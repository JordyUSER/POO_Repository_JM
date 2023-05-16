//clase Carro
package poo_lab1_creaciondeclases;
public class Carro{
    public String marca = "";
    public String modelo = "";
    public String color = "";
    public int year = 0;
    public int potencia = 0;
    public int velocidad = 0;
    
    public static void prender(){
        System.out.println("El carro está prendido");
    }
    public static void apagar(){
        System.out.println("El carro se apaga");
    }
    public void acelerar(){
        this.velocidad++;
        System.out.println("El carro acelera a: " + this.velocidad + "km/h");
    }
    public void desacelerar(){
        this.velocidad--;
        System.out.println("El carro desacelera y va a: " + this.velocidad + "km/h");
    }
    public void frenar(){
        System.out.println("El carro frena a raya");
        this.velocidad = 0;
    }
    public static void tocarClaxon(){
        System.out.println("El carro suena el claxon");
    }
}
