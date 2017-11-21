/*
 * Clase que modela un pentagono, implementa la interfaz poligono
 */
public class Pentagono implements Poligono {
		private double lado, perimetro, area;
	public double getArea() {
			return area;
		}

	public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}

		public double getPerimetro() {
			return perimetro;
		}

	@Override
	public void area() {
		
		area = 1.72 * Math.pow(lado, 2);
	}

	@Override
	public void perimetro() {
		perimetro = lado*5;
		
	}

}
