package view;

import java.util.Scanner;
import java.util.ArrayList;
import model.Ciudad;
import service.CiudadService;

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
	
	static CiudadService ciudadService=new CiudadService();
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				guardarCiudad();
				break;
			case 2:
				
				break;
			case 3:
				ciudadMasPoblada();
				break;
			case 4:
				eliminarCiudad();
				break;
			case 5:
				System.out.println("Adios!!");
			}
		}while(opcion!=5);
	}
	
	static void mostrarMenu(){
		System.out.println("1.- Agregar una nueva ciudad.");
		System.out.println("2.- Mostrar las ciudades por país.");
		System.out.println("3.- Mostrar la ciudad más poblada.");
		System.out.println("4.- Eliminar una ciudad.");
		System.out.println("5.- Salir");
	}
	
	static void guardarCiudad() {
		Scanner sc=new Scanner(System.in);
		String nombre;
		int habitantes;
		String pais;
		System.out.println("Introduce el nombre de la ciudad: ");
		nombre=sc.nextLine();
		System.out.println("Introduce el número de habitantes de la ciudad: ");
		habitantes=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el país al que pertenece la ciudad: ");
		pais=sc.nextLine();
		ciudadService.guardarCiudad(nombre, habitantes, pais);
		}
	static void ciudadesPorPais() {
		/*String pais;
		ArrayList<Ciudad> ciudades=ciudadService.ciudadesPorPais();
		Scanner sc=new Scanner(System.in);
		pais=sc.nextLine();
		System.out.println("Introduce el país que quieras mostrar: ");
		for(Ciudad c:ciudades) {
			if(c.equals(pais)) {
				System.out.println(c.getNombre+"-"+c.getPais());
			}else{
				System.out.println("País no válido");
		}*/
		System.out.println("No preparado aún");
	}
	
	static void ciudadMasPoblada() {
		System.out.println("No preparado aún");
	}
	
	static void eliminarCiudad() {
		Scanner sc=new Scanner(System.in);
		String nombre;
		System.out.println("Introduce el nombre de la ciudad");
		nombre=sc.nextLine();
		ciudadService.eliminarCiudad(nombre);
	}
	
	}
