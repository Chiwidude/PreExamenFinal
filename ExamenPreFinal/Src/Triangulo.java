/*
 * Clase que modela un triangulo, heredad de la clase poligono
 */
public class Triangulo implements Poligono {

	private double lado3;

	private double area;
	private double perimetro;
	private double lado1;
	private double lado2;
	private double semiperimetro,parte1, parte2, parte3;
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getLado3() {
		return lado3;
	}

	public void setBase(double lado3) {
		this.lado3 = lado3;
	}


	@Override
	public void area() {
		semiperimetro();
		parte1 = semiperimetro - lado1;
		parte2 = semiperimetro - lado2;
		parte3 = semiperimetro - lado3;
		area = Math.sqrt(semiperimetro*parte1*parte2*parte3);
		

		
	}

	@Override
	public void perimetro() {
		
		perimetro = lado1 + lado2 + lado3;
		
	}
	private void semiperimetro() {
		semiperimetro = (lado1+lado2+lado3)/2;
	}

}
