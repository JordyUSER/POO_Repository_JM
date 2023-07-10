/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_parcial2_practica_16;

/**
 *
 * @author ESPE
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public void mostrarDatos() {
        System.out.println(
                "\tCirculo" + 
                "\nRadio  - " + radio +
                "\nColor  - " + getColor() +
                "\nArea   - " + area());
    }
}
