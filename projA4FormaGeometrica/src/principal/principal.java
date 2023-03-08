package principal;

public class principal {

	public static void main(String[] args) {
		
		//Instanciar 
		Forma qua = new Quadrado(3);
		
		System.out.println("***** QUADRADO ******");
		System.out.println("Perimetro: " + qua.getPerimetro());
		System.out.println("Area: " + qua.getArea());
		
		Forma tri = new Triangulo(2,3);
		System.out.println("***** TRIANGULO *****");
		System.out.println("Perimetro: " + qua.getPerimetro());
		System.out.println("Area: " + qua.getArea());
	}

}
