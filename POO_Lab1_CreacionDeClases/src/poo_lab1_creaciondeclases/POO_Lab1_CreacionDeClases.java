//creacion de clases
package poo_lab1_creaciondeclases;

public class POO_Lab1_CreacionDeClases {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
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
        System.out.print("Potencia: " + carro1.potencia + "hp\n");
        
        Laptop laptop1 = new Laptop();
        laptop1.marca = "Asus";
        laptop1.procesador = "Ryzen 7";
        laptop1.modelo = "Tuf Gaming";
        laptop1.grafica = "Geforce RTX 4080";
        laptop1.hertz = "120hz";
        System.out.println("Mi objeto laptop1 tiene como atributos\n");
        System.out.print("Marca: " + laptop1.marca + "\n");
        System.out.print("Modelo: " + laptop1.modelo + "\n");
        System.out.print("Procesadro: " + laptop1.procesador + "\n");
        System.out.print("Grafica: " + laptop1.grafica + "\n");
        System.out.print("Hertz: " + laptop1.hertz+ "\n");
        
        RelogDigital relog1 = new RelogDigital();
        relog1.marca = "Casio";
        relog1.color = "Negro";
        relog1.modelo = "NRX-08";
        relog1.calidad = "Media";
        relog1.brillo = "Alto";
        System.out.println("Mi objeto carro1 tiene como atributos\n");
        System.out.print("Marca: " + relog1.marca + "\n");
        System.out.print("Modelo: " + relog1.modelo + "\n");
        System.out.print("Color: " + relog1.color + "\n");
        System.out.print("Calidad: " + relog1.calidad + "\n");
        System.out.print("Brillo: " + relog1.brillo);
    }
}
