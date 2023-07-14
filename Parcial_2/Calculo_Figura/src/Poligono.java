import javax.swing.JOptionPane;
public class Poligono extends Figura{
    
    public void area(double longitud_b, double n_lados, double apotema) {
    	double area;
    	area = ((n_lados * longitud_b)*apotema)/2;
    	System.out.println("El area del poligono es: " + area);
    }

    public void perimetro(double n_lados, double longitud_b) {
    	double perimetro;
    	perimetro = (n_lados*longitud_b);
    	System.out.println("El perimetro del poligono es: " + perimetro);
    }

    @Override
    public double getNLados() {
        return n_lados;
    }
    @Override
    public void setNLados() {
    	this.n_lados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de lados: "));
    }
    @Override
    public double getApotema() {
        return apotema;
    }
    @Override
    public void setApotema() {
    	this.apotema = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el apotema: "));
    }
    @Override
    public double getLongB() {
        return longitud_b;
    }
    @Override
    public void setLongB() {
    	this.longitud_b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
    }
}
