//clase RelogDigital
package poo_lab1_creaciondeclases;
public class RelogDigital {
    public String marca = "";
    public String modelo = "";
    public String color = "";
    public String calidad = "";
    public String brillo = "";
    
    public static void verHora(){
        System.out.println("Se ve la hora en el relog digital");
    }
    public static void verMinutos(){
        System.out.println("Se ve los minutos en el relog digital");
    }
    public void verSegundos(){
        System.out.println("Se ve los segundos en el relog digital");
    }
    public void verMilisegundos(){
        System.out.println("Se ve los milisegundos en el relog digital");
    }
    public void cronometrar(){
        System.out.println("El relog digital cronometra");
    }
}
