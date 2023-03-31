
package Logica;


public class Ejercicios {
	
	static void invertir(String palabra) {
		int largo = palabra.length();
		char letra;
		for (int i = largo-1; i>=0; i--) {
			letra = palabra.charAt(i);
			System.out.print(letra);
		}
	}
	
	public static void main(String[] args) {
		String frase = "Hola Generation";
		invertir(frase);
	}

}
