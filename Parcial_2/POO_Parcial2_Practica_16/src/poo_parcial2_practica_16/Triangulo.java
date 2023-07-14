/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial2_practica_16;

/**
 *
 * @author ESPE
 */
public class Triangulo extends Figura{
    private double base, altura;
    
    
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return ((base*altura)/2);
    }

    @Override
    public void mostrarDatos() {
        System.out.println(
                "\tTriangulo" + 
                "\nBase   - " + base +
                "\nAltura - " + altura +
                "\nColor  - " + getColor() +
                "\nArea   - " + area());
    }
    
}
