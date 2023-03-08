package principal;

public class Triangulo extends Forma {
	
	private double base;
	private double altura;
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double getPerimetro() {
		return 4*this.altura;
	}
	
	@Override
	public double getArea() {
		return this.altura*this.altura;
	}
	
	
}
