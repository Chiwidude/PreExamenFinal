/*
 * Clase Cuadrilatero, implementa la interfaz poligono
 */
public class Cuadrilatero implements Poligono {

		private double lado1,lado2;
		private double perimetro, area;
	public double getPerimetro() {
			return perimetro;
		}

		public double getArea() {
			return area;
		}

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

	

	@Override
	public void area() {
		
		area = lado1 * lado2;
	}

	@Override
	public void perimetro() {
		perimetro = 2*lado1 + 2*lado2;
		
	}

}
