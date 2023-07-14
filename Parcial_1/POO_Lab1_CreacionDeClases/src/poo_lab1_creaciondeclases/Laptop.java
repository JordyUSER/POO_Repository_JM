//clase Laptop
package poo_lab1_creaciondeclases;

public class Laptop {
    public String marca = "";
    public String modelo = "";
    public String procesador = "";
    public String grafica = "";
    public String hertz = "";
    
    public static void prender(){
        System.out.println("La laptop está prendido");
    }
    public static void apagar(){
        System.out.println("La laptop se apaga");
    }
    public void procesarDatos(){
        System.out.println("La laptop procesa datos");
    }
    public void Suspender(){
        System.out.println("La laptop se suspende");
    }
    public void Reiniciar(){
        System.out.println("La laptop se reinicia");
    }
}


