//creacion de clases
package poo_lab1_creaciondeclases;

public class POO_Lab1_CreacionDeClases {
    public static void main(String[] args) {
        Laptop carro1 = new Laptop();
        carro1.marca = "BMW";
        carro1.color = "Blanco";
        carro1.modelo = "M8 Coupe";
        carro1.year = 2020;
        carro1.potencia = 2019;
        carro1.velocidad = 0;
        System.out.println("Mi objeto carro1 tiene como atributos\n");
        System.out.print("Marca: " + carro1.marca + "\n");
        System.out.print("Modelo: " + carro1.modelo + "\n");
        System.out.print("Color: " + carro1.color + "\n");
        System.out.print("Año: " + carro1.year + "\n");
        System.out.print("Potencia: " + carro1.potencia + "hp\n\n");
        
        carro1.prender();
        
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.tocarClaxon();
        carro1.desacelerar();
        carro1.desacelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frenar();
        carro1.apagar();
        
    }
    
}
