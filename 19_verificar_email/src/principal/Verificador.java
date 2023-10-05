package principal;

import java.util.Scanner;

public class Verificador {

	public static void main(String[] args) {
		//Realizar un programa que solicite la introducción de una dirección de correo electrónico y nos diga si es válida
		//dirección válida: aquella que contiene un punto(.) y una arroba(@)
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una dirección de correo electrónico: ");
		String email=sc.nextLine();
		//sc.close();Cerramos el objeto Scanner
		/*int posarroba=email.indexOf("@");
		int pospunto=email.indexOf(".");
		if(posarroba!=-1 && pospunto!=-1) {//Recordar que indexOf, si no encuentra nada, devuelve -1, por eso se compara con -1
			System.out.println("Dirección válida");
		} else {
			System.out.println("Dirección no válida");
		}*/
		if(email.indexOf("@")!=-1 && email.indexOf(".")!=-1) {//Recordar que indexOf, si no encuentra nada, devuelve -1, por eso se compara con -1
			System.out.println("Dirección válida");
		} else {
			System.out.println("Dirección no válida");
		}	
		//SOLUCIÓN ALTERNATIVA
			if(email.contains("@") && email.contains(".")) {
				System.out.println("Dirección válida con contains");
			} else {
				System.out.println("Dirección no válida con contains");
			}
		
	}

}
