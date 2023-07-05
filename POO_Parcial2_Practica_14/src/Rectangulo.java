
public class Rectangulo implements Figura, Dibujar {
	double base, altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		double resul = (base*altura);
		return resul;
	}
	
	@Override
	public void dibujar() {
		System.out.println("Se puede dibujar el rectangulo...");
	}
}
