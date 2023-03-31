

package Logica;

import java.util.Scanner;

public class Ejercicios {
	
	
	public static void finde(String dia,int hora, int minutos) {
		int dias = 0,acumulado,total;
		int fin=4*24*60+15*60;
		switch (dia) {
		case "lunes":
			dias=0;
			break;
		case "martes":
			dias=1;
			break;
		case "miercoles":
			dias=2;
			break;
		case "jueves":
			dias=3;
			break;
		case "viernes":
			dias=4;
			break;
		case "sabado":
			dias=5;
			break;
		case "domingo":
			dias=6;
			break;
		}
		acumulado=dias*24*60+hora*60+minutos;
		total=fin-acumulado;
		if(total<=0) {
			System.out.println("Ya es fin de semana");
		}
		else {
			System.out.println("Faltan "+total+" minutos");
		}
	}
	
	public static void main(String[] args) {

		Scanner peticion = new Scanner(System.in);
		System.out.println("Escribe el día: ");
		String dia = peticion.nextLine();
		System.out.println("Escribe la hora: ");
		int hora = peticion.nextInt();
		System.out.println("Escribe los minutos: ");
		int minutos = peticion.nextInt();
		peticion.close();
		
		finde(dia,hora,minutos);
	}

}
