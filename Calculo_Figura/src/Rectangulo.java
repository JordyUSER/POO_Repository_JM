import javax.swing.JOptionPane;
public class Rectangulo extends Figura{
    
    public void area(double longitud_b, double altura_h) {
    	double area;
    	area = (longitud_b*altura_h);
    	System.out.println("El area del rectangulo es: " + area);
    }
    
    public void perimetro(double longitud_b, double altura_h) {
    	double area;
    	area = 2*(longitud_b + altura_h);
    	System.out.println("El perimetro del rectangulo es: " + area);
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
    public double getAltH() {
        return altura_h;
    }
    @Override
    public void setAltH() {
    	this.altura_h = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura h: "));
    }
}
