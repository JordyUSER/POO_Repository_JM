
public class Circulo extends Figura{
	double radio;
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		double resul = (radio*radio)*3.1416;
		return resul;
	}

}
