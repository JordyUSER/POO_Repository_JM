package poo6_condicionales;
public class POO6_Condicionales {
    public static void main(String[] args) {
        int hora = 0;
        
        if((hora >= 0 ) && (hora <= 12)){
            System.out.println("Buenos dias / Good Morning");
        } else if((hora > 12) && (hora <= 18)){
            System.out.println("Buenas Tardes / Good Afternoon");
        } else if((hora > 18) && (hora <= 24)){
            System.out.println("Buenas Noches / Good Evening");
        } else {
            System.out.println("Tienes una hora incorrecta...");
        }
    }
    
}
