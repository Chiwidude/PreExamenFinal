package Ejercicio_Criptograf�a;

import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		int dimensi�n;
		String frase;
		Cifrado_Cesar cifrado = new Cifrado_Cesar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la frase a encriptar: ");
		frase = sc.nextLine();
		System.out.println("Ingrese la distancia de encriptado:");
		dimensi�n = sc.nextInt();
		System.out.println("La frase encriptada es:" + cifrado.cifrarCesar(frase, dimensi�n));
		System.out.println("La frase encriptada es:" + cifrado.cifrarCesar(frase, dimensi�n, "abcdefghijklmnopqrstuvwxyz"));

	}

}
