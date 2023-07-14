package poo4_operadoreslogicos;

public class POO4_OperadoresLogicos {
    public static void main(String[] args) {
        int val1 = 2;
        int val2 = 6;
        
        System.out.println((val1 == val2) && (val1 < val2));
        System.out.println((val1 == val2) || (val1 > val2));
        System.out.println(!(val1 == val2) && !(val1 > val2));
    }    
}
