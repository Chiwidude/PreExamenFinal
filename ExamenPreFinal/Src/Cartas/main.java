package Cartas;

public class main {

	public static void main(String[] args) {
		ManoCartas mano = new ManoCartas();
		
		mano.AgregarCarta("10", "treboles");
		mano.AgregarCarta("5", "corazones");
		mano.jugar("corazones");

	}

}
