import java.util.Scanner;
/*
 * Clase que funciona como creación de figuras poligonales
 */

public class FabricaFiguras {

	private static int opcion;
	private static double dimension1, dimension2, dimension3;

	public static void main(String[] args) {
		boolean decisión = false;
		do {
		Triangulo t1;
		System.out.println("Indice el número de la figura que desea crear:");
		System.out.println("1: Triangulo");
		System.out.println("2: Triangulo Isósceles");
		System.out.println("3: Triangulo Equilatero");
		System.out.println("4: Cuadrado");
		System.out.println("5: Rectángulo");
		System.out.println("6: Pentagono");
		System.out.println("7: Hexágono");
		System.out.println("8: Octagono");
		System.out.println("9: Cuadrilatero");
		Scanner sc = new Scanner(System.in);
		opcion = sc.nextInt();
		
		switch(opcion) {
		case 1:
			 t1 = new Triangulo();
			
			System.out.println("Ingrese  el lado 1 del triangulo");
				dimension1 = sc.nextDouble();
				System.out.println("Ingrese  el lado 2 del triangulo");
				dimension2 = sc.nextDouble();
				System.out.println("Ingrese  el lado 3 del triangulo");
				dimension3 = sc.nextDouble();
				t1.setLado1(dimension1);
				t1.setLado2(dimension2);
				t1.setBase(dimension3);
				t1.area();
				t1.perimetro();
				System.out.println("El perimetro del triangulo es:" + " " + t1.getPerimetro() );
				 System.out.println("El área del triangulo es:" + " " + t1.getArea()); 
				
				
				break;
		case 2:
		TrianguloIsoceles	t1s = new TrianguloIsoceles();
			
					
			System.out.println("Ingrese  el lado diferente del triangulo");
			dimension2 = sc.nextDouble();
			System.out.println("Ingrese  el lado igual del triangulo");
			dimension1 = sc.nextDouble();
			t1s.setLadoA(dimension1);
			t1s.setLadoB(dimension2);
			t1s.area();
			t1s.perimetro();
			System.out.println("El perimetro del triangulo es:" + " " + t1s.getPerimetro() );
			System.out.println("El área del triangulo es:" + " " + t1s.getArea());
			decisión = true;
			break;
		case 3:
			TrianguloEquilatero t1e = new TrianguloEquilatero();
			
			System.out.println("Ingrese  el lado  del triangulo");
			dimension1 = sc.nextDouble();
			t1e.setLado(dimension1);
			t1e.area();
			t1e.perimetro();
			System.out.println("El perimetro del triangulo es:" + " " + t1e.getPerimetro() );
			System.out.println("El área del triangulo es:" + " " + t1e.getArea());
			decisión = true;
			break;	
			
		case 4:
			Cuadrado c = new Cuadrado();
			System.out.println("Ingrese  el lado  del cuadrado");
			dimension1 = sc.nextDouble();
			c.setLado(dimension1);
			c.area();
			c.perimetro();
			System.out.println("El perimetro del cuadrado es:" + " " + c.getPerimetro() );
			System.out.println("El área del cuadrado es:" + " " + c.getArea());
			decisión = true;
			break;
		case 5: 
			Rectangulo r1 = new Rectangulo();
			System.out.println("Ingrese  el lado A  del réctangulo");
			dimension1 = sc.nextDouble();
			r1.setLadoA(dimension1);
			System.out.println("Ingrese  el lado B  del réctangulo");
			dimension1 = sc.nextDouble();
			r1.setLadoB(dimension1);
			
			r1.area();
			r1.perimetro();
			System.out.println("El perimetro del rectángulo es:" + " " + r1.getPerimetro() );
			System.out.println("El área del rectángulo es:" + " " + r1.getArea());
			decisión = true;
			break;
		case 6:
			Pentagono p1 = new Pentagono();
			System.out.println("Ingrese  el lado del Pentágono");
			dimension1 = sc.nextDouble();
			p1.setLado(dimension1);
			p1.area();
			p1.perimetro();
			System.out.println("El perimetro del pentágono es:" + " " + p1.getPerimetro() );
			System.out.println("El área del pentágono es:" + " " + p1.getArea());
			decisión = true;
			break;
		case 7:
			Hexagono hex = new Hexagono();
			System.out.println("Ingrese  el lado  del Hexágono");
			dimension1 = sc.nextDouble();
			hex.setLado(dimension1);
			hex.area();
			hex.perimetro();
			System.out.println("El perimetro del hexágono es:" + " " + hex.getPerimetro() );
			System.out.println("El área del hexágono es:" + " " + hex.getArea());
			decisión = true;
		case 8:
			Octagono oct = new Octagono();
			System.out.println("Ingrese  el lado del Octagono");
			dimension1 = sc.nextDouble();
			oct.setLado(dimension1);
			oct.area();
			oct.perimetro();
			System.out.println("El perimetro del octágono es:" + " " + oct.getPerimetro() );
			System.out.println("El área del octágono es:" + " " + oct.getArea());
			decisión = true;
			break;
		case 9: 
			Cuadrilatero cua = new Cuadrilatero();
			System.out.println("Ingrese  el ladoA del cuadrilatero");
			dimension1 = sc.nextDouble();
			cua.setLado1(dimension1);
			System.out.println("Ingrese  el ladoB del cuadrilatero");
			dimension2 = sc.nextDouble();
			cua.setLado2(dimension2);
			cua.perimetro();
			System.out.println("El perimetro del cuadrilatero es:" + " " + cua.getPerimetro() );
			System.out.println("El área del cuadrilatero es:" + " " + cua.getArea());
			decisión = true;
			
			
			default:
				decisión = false;
				break;
				
		}
	}while(decisión == true);

	}

}
