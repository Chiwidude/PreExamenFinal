package Ejercicio_Criptograf�a;

public class Cifrado_Cesar {
	private char [] Alfabeto_espa�olmin = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	 private char [] Alfabeto_espa�olmay = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private char [] resultado;
	 private char letter, letterr;
	
	
	String cifrarCesar(String frase, int distancia) {
		resultado = new char[frase.length()];
			for (int counter = 0; counter < frase.length(); counter++ ) {
				letter = frase.charAt(counter);
				for (int i = 0; i< Alfabeto_espa�olmin.length; i++) {
					if(Alfabeto_espa�olmin[i] == letter) {
						if(letter == 'z') {
						letterr = Alfabeto_espa�olmin[0+distancia];
						} else if((letter == 'y' || letter == 'x') && distancia > 1) {
							
							letterr = Alfabeto_espa�olmin[1+distancia];
							} else {
						letterr = Alfabeto_espa�olmin[i+ distancia];
							}
						
					}
					else if(Alfabeto_espa�olmay[i] == letter) {
						if(letter == 'Z') {
							letter = Alfabeto_espa�olmay[0+distancia];
						} else if((letter == 'Y' || letter == 'X') && distancia > 1) {
							
							letterr = Alfabeto_espa�olmay[1+distancia];
							}
						letterr = Alfabeto_espa�olmay[i+ distancia];
							
						}
					}
					resultado[counter] = letterr;
				}
			String newfrase = new String(resultado);
			return newfrase;
			}
	String cifrarCesar(String frase, int distancia, String alfabeto) {
		char[] alfa = alfabeto.toCharArray();
		resultado = new char[frase.length()];
			for (int counter = 0; counter < frase.length(); counter++ ) {
				letter = frase.charAt(counter);
				for (int i = 0; i< alfa.length; i++) {
					if(alfa[i] == letter) {
						if(letter == 'z') {
						letterr = alfa[0+distancia];
						} else if((letter == 'y' || letter == 'x') && distancia > 1) {
							
							letterr = alfa[1+distancia];
							} else {
						letterr = alfa[i+ distancia];
							}
						
					}
					
					}
					resultado[counter] = letterr;
				}
			String newfrase = new String(resultado);
			return newfrase;
			}
		
			
						
			
	}

