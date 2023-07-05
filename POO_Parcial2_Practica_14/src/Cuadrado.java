
public class Cuadrado implements Figura, Dibujar {
	double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double resul = lado*lado;
		return resul;
	}

	@Override
	public void dibujar() {
		System.out.println("Se puede dibujar el cuadrado...");
	}
}
