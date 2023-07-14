import javax.swing.JOptionPane;

public class Cuadrado extends Figura {
	
    public void area(double longitud_a) {
    	double area;
    	area = (longitud_a*longitud_a);
    	System.out.println("El area del cuadrado es: " + area);
    }
    
    public void perimetro(double longitud_a) {
    	double perimetro;
    	perimetro = (4*longitud_a);
    	System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

    @Override
    public double getLong() {
        return longitud_a;
    }
    @Override
    public void setLong() {
    	this.longitud_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado: "));
    }
}
