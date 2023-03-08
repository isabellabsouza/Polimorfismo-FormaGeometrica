package principal;

public class Quadrado extends Forma {
	
	private double lado;
	
	
	
	public Quadrado() {
		super();
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double getPerimetro() {
		return 4*this.lado;
	}
	
	@Override
	public double getArea() {
		return this.lado*this.lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
