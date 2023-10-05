package view;

import java.util.Scanner;

public class ProgramaCiudad {
	
	/*Programa para gestión de ciudades
	Una ciudad se caracteriza por un nombre, habitantes y pais.

	1. Nueva ciudad
	2. Ciudades por pais
	3. Ciudad más poblada
	4. Eliminar ciudad
	5. Salir

	1. Pide los datos de la ciudad y la guarda
	2. Se pide el pais, y muestra datos de todas sus ciudades
	3. Muestra datos de la ciudad más poblada
	4. Pide el nombre de la ciudad y la elimina

	Las ciudades se guardan en un ArrayList*/
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		mostrarMenu();
		/*do {
			
		}while(opcion!=5);*/
	}
	
	static void mostrarMenu(){
		System.out.println("1.-");
		System.out.println("2.-");
		System.out.println("3.-");
		System.out.println("4.-");
		System.out.println("5.- Salir");
	}
}
