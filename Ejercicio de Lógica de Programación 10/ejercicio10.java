
//
//- Crear un programa en `Java` que realice lo siguiente:
//- Crear un diccionario Español-Inglés, que contenga al menos 20 palabras su respectiva traducción
//- Utilizar un *objeto* `HashMap` para almacenar los pares de palabras
//- Escoger al azar 5 palabars en español del mini diccionario
//
//- Input
//  - Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
//	- Comprobar si el input es correcto
//- Output
//  - Mostrar cuántas respuestas correctas e incorrectas tiene el usuario
//--- 



package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ejericcio10 {

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
        traduccion.put("lagarto","alligator");
        traduccion.put("pollo","chicken");
        traduccion.put("vaca","cow");
        traduccion.put("pavo","turkey");
        
        List<String> llave = new ArrayList<>();
        List<String> valores = new ArrayList<>();
        
        for (String paso : traduccion.keySet()) {
			llave.add(paso);
		}
        
        for (String paso : traduccion.values()) {
			valores.add(paso);
		}
        
        System.out.println("¿como se escriben estos animales en ingles?");
        Scanner palabra = new Scanner(System.in);
    	int coY=0,coN=0;
        for (int i = 0; i <5; i++) {
        	int numAle = (int) Math.round(Math.random()*21);
    		System.out.println(llave.get(numAle));
    		String vVal =valores.get(numAle);		
        	System.out.println("traduccion: ");
    		String pal =palabra.nextLine();
    		if(vVal.equals(pal)) {
    			coY++;
    		}
    		else {
    			coN++;
    		}
		}
		palabra.close();
		System.out.println("Acertaste "+coY+" , fallaste "+coN);
	}
}

