import javax.swing.JOptionPane;

public class Triangulo extends Figura{
	
	public double getLongA() {
        return longitud_a;
    }

    public void setLongA() {
    	this.longitud_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado a: "));
    }
    
	public double getLongB() {
        return longitud_b;
    }

    public void setLongB() {
    	this.longitud_b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
    }
    
	public double getLongC() {
        return longitud_c;
    }

    public void setLongC() {
    	this.longitud_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado c: "));
    }
    
    public double getAltH() {
        return altura_h;
    }

    public void setAltH() {
    	this.altura_h = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura h: "));
    }
    
    public void area(double longitud_b, double altura_h) {
    	double area;
    	area = (longitud_b*altura_h);
    	System.out.println("El area del triangulo es: " + area);
    }
    public void perimetro(double longitud_a, double longitud_b, double longitud_c) {
    	double area;
    	area = (longitud_a + longitud_b + longitud_c);
    	System.out.println("El perimetro del triangulo es: " + area);
    }
}
