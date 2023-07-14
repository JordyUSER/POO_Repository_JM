import javax.swing.JOptionPane;

public class Figura {
	double longitud_a;
	double longitud_b;
	double longitud_c;
	double apotema;
	double n_lados;
	double altura_h;

	public double getLong() {
        return longitud_a;
    }

    public void setLong() {
    	this.longitud_a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado: "));
    }

	public double getNLados() {
        return n_lados;
    }

    public void setNLados() {
    	this.n_lados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de lados: "));
    }

	public double getApotema() {
        return apotema;
    }

	public void setApotema() {
    	this.apotema = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el apotema: "));
    }

	public double getAltH() {
        return altura_h;
    }
    
    public void setAltH() {
    	this.altura_h = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura h: "));
    }

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
}
