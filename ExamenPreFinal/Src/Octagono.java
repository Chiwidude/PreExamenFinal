/*
 * Clase que modela un octagono, implementa la interfaz poligono
 */
public class Octagono implements Poligono {
 private double lado, area, perimetro;
	@Override
	public void area() {
		
		area = 4.83 * Math.pow(lado, 2);
	}

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

	@Override
	public void perimetro() {
		perimetro = lado * 8;
		
	}

}
