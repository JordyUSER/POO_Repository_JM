package poo5_randomnum;

public class POO5_RandomNum {
    public static void main(String[] args) {
        double number;
        
        number = (Math.random() * 50)+10;
        System.out.println(number);
        
        if(number >= 10 && number <=60){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    
}
