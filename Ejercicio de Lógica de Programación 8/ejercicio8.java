package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio8 {
	
	
	public static void numdiez() {
		Scanner pet = new Scanner(System.in);
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();

		//int con1=0,con2=0;
		for (int j = 0; j < 10; j++) {
			System.out.println("Escribe un numero");
			int num=pet.nextInt();
			if (primo(num)==true) {
				lista1.add(num);
			}
			else {
				lista2.add(num);
			}
		}
		lista1.addAll(lista2);
		System.out.println(lista1);
}


public static boolean primo(int n){
	int cont=0;
	boolean edo=false;
    if(n==2||n==3||n==5||n==7){
        edo=!edo;
    }
	    else if(n==1) {
    }
    else{
        if((n%2==1)&&( n%3!=0 && n%5!=0 && n%7!=0)){
            edo=!edo;
        }
    }
	return edo;
}

	
	
	

	public static void main(String[] args) {
		numdiez();

	}

}
