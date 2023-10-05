package principal;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		//Solicita la introducción de un texto y nos dice cuantas vocales contiene
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto:");
		String frase=sc.nextLine();
		//convertimos todo a minúsculas
		frase=frase.toLowerCase();
		int vocales=0;
		for(int i=0; i<frase.length(); i++) {
			switch(frase.charAt(i)) {
			case 'a','e','i','o','u'://devuelve un char y el tipo char se muestra entre comillas simples 
				vocales++;
				break;//optativo pq no hay más casos posibles
			}
		}
		System.out.println("El número de vocales es: "+vocales);

	}

}
