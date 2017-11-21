/*
 * Clase que modela un triangulo equilatero, heredad de la clase triangulo
 */
public class TrianguloEquilatero extends Triangulo{
	private double lado;
	private double area, perimetro;
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void area() {
		area = (Math.sqrt(3)/4) * Math.pow(lado,2);
	}
	public void perimetro() {
		perimetro = lado*3;
	}

}
