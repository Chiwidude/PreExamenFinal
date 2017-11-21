/*
 * Clase que modela un Cuadrado, heredad de la clase Cuadrilatero
 */
public class Rectangulo extends Cuadrilatero {
private double area, perimetro, ladoA, ladoB;

public double getLadoA() {
	return ladoA;
}

public void setLadoA(double ladoA) {
	this.ladoA = ladoA;
}

public double getLadoB() {
	return ladoB;
}

public void setLadoB(double ladoB) {
	this.ladoB = ladoB;
}

public double getArea() {
	return area;
}

public double getPerimetro() {
	return perimetro;
}
public void area() {
	area = ladoA * ladoB;
}
public void perimetro() {
	perimetro = 2*ladoA + 2*ladoB;
}

}
