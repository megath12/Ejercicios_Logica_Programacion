//- Crear un programa en `Java` que realice lo siguiente
//  
//- Crear un diccionario Español-Inglés, que contenga al menos *20* palabras con su respectiva traducción
//- Utiliza un *objeto* `HashMap` para almacenar pares de palabras
//- Input 
//  - Solicitar a usuario una palabra en español
//- Output
//  - Mostrar por consola la palabra en inglés
//  - En caso de no encontrar su traducción en el diccionario, debe imprimir un mensaje indicándolo



package Logica;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
        HashMap<String, String> traduccion = new HashMap<>();
        traduccion.put("gato","cat");
        traduccion.put("perro","dog");
        traduccion.put("tigre","tiger");
        traduccion.put("elefante","elephant");
        traduccion.put("raton","mouse");
        traduccion.put("leon","lion");
        traduccion.put("pinguino","pinguin");
        traduccion.put("delfin","dolphin");
        traduccion.put("tiburon","shark");
        traduccion.put("burro","donkey");
        traduccion.put("mono","monkey");
        traduccion.put("aguila","eagle");
        traduccion.put("oso","bear");
        traduccion.put("jaguar","jaguar");
        traduccion.put("rana","frog");
        traduccion.put("ave","bird");
        traduccion.put("pez","fish");
        traduccion.put("caiman","alligator");
        traduccion.put("pollo","chicken");
        traduccion.put("vaca","cow");
        traduccion.put("pavo","turkey");

		Scanner palabra = new Scanner(System.in);
		System.out.println("Escribe un animal: ");
		String pal =palabra.nextLine();
		if(traduccion.containsKey(pal)) {
			System.out.println(pal+" en ingles es "+traduccion.get(pal));
		}
		else {
			System.out.println("No tenemos disponible ese animal");
		}
		palabra.close();
		
	}

}

