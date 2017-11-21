/*
 * Clase que modela un hexagono, implementa la interfaz poligono
 */
public class Hexagono implements Poligono {
private double lado;
private double perimetro, area;
	public double getArea() {
	return area;
}

	public double getPerimetro() {
	return perimetro;
}

	public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

	@Override
	public void area() {
		area = 2.60 * Math.pow(lado, 2);
		
	}

	@Override
	public void perimetro() {
	
	 perimetro = 6 *lado;	
	}

}
