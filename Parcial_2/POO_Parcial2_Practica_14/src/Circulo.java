
public class Circulo implements Figura, Dibujar, Rotar{
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		double pi = 3.1416;
		double resul = (radio*radio)*pi;
		return resul;
	}

	@Override
	public void dibujar() {
		System.out.println("Se puede dibujar el circulo...");
	}

	@Override
	public void rodar() {
		System.out.println("Rueda el circulo...");
	}
}
