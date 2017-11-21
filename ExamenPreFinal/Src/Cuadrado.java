/*
 * Clase que modela un Cuadrado, heredad de la clase Cuadrilatero
 */
public class Cuadrado extends Cuadrilatero {
private double lado, area, perimetro;

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
public void area() {
	area = Math.pow(lado, 2);
}
public void perimetro() {
	perimetro = lado * 4;
}


}
