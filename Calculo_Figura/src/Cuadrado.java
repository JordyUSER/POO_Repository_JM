import javax.swing.JOptionPane;

public class Cuadrado extends Figura {
	
	public double getLong() {
        return longitud_a;
    }

    public void setLong() {
    	this.longitud_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado: "));
    }
    
    public void area(double longitud_a) {
    	double area;
    	area = (longitud_a*longitud_a);
    	System.out.println("El area del cuadrado es: " + area);
    }
    public void perimetro(double longitud_a) {
    	double area;
    	area = (4*longitud_a);
    	System.out.println("El perimetro del cuadrado es: " + area);
    }
}
