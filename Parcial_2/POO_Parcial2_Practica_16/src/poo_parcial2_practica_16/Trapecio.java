/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial2_practica_16;

/**
 *
 * @author ESPE
 */
public class Trapecio extends Figura{
    private double baseMin, baseMax, altura;
    
    public Trapecio(String color, double baseMin, double baseMax, double altura) {
        super(color);
        this.baseMin = baseMin;
        this.baseMax = baseMax;
        this.altura = altura;
    }

    @Override
    public double area() {
        return ((baseMin+baseMax)*altura/2);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(
                "\tTriangulo" + 
                "\nBase Menor - " + baseMin +
                "\nBase Mayor - " + baseMax +
                "\nAltura     - " + altura +
                "\nColor      - " + getColor() +
                "\nArea       - " + area());
    }
    
}
