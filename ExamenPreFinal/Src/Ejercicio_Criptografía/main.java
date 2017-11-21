package Ejercicio_Criptografía;

import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		int dimensión;
		String frase;
		Cifrado_Cesar cifrado = new Cifrado_Cesar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la frase a encriptar: ");
		frase = sc.nextLine();
		System.out.println("Ingrese la distancia de encriptado:");
		dimensión = sc.nextInt();
		System.out.println("La frase encriptada es:" + cifrado.cifrarCesar(frase, dimensión));
		System.out.println("La frase encriptada es:" + cifrado.cifrarCesar(frase, dimensión, "abcdefghijklmnopqrstuvwxyz"));

	}

}
