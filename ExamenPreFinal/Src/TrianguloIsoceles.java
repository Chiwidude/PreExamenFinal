/*
 * Clase que modela un triangulo Isosceles, heredad de la clase triangulo
 */
public class TrianguloIsoceles extends Triangulo {
private double ladoA, ladoB, area, perimetro, part1, part2;

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
	 part1  = Math.pow(ladoA, 2);
	 part2 = Math.pow(ladoB, 2) / 4;
	 area = ((ladoB* Math.sqrt(part1 - part2))/2);
	
}
public void perimetro() {
	perimetro = 2*ladoA + ladoB;
}


}
