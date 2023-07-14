import javax.swing.JOptionPane;

public class Triangulo extends Figura{
	
    public void area(double longitud_b, double altura_h) {
    	double area;
    	area = (longitud_b*altura_h)/2;
    	System.out.println("El area del triangulo es: " + area);
    }

    public void perimetro(double longitud_a, double longitud_b, double longitud_c) {
    	double perimetro;
    	perimetro = (longitud_a + longitud_b + longitud_c);
    	System.out.println("El perimetro del triangulo es: " + perimetro);
    }
    
    @Override
	public double getLongA() {
        return longitud_a;
    }
    @Override
    public void setLongA() {
    	this.longitud_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado a: "));
    }
    @Override
	public double getLongB() {
        return longitud_b;
    }
    @Override
    public void setLongB() {
    	this.longitud_b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
    }
    @Override
	public double getLongC() {
        return longitud_c;
    }
    @Override
    public void setLongC() {
    	this.longitud_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado c: "));
    }
    @Override
    public double getAltH() {
        return altura_h;
    }
    @Override
    public void setAltH() {
    	this.altura_h = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura h: "));
    }
}
