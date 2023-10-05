package view;

import java.util.Scanner;

import service.AgendaService;

public class ProgramaAgenda {

	static AgendaService agendaService=new AgendaService();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					pedirContacto();
					break;
				case 2:
					buscarContacto();
					break;
				case 3:
					eliminarContacto();
					break;
				case 4:
					mostrarNombres();
					break;
				
				case 5:
					System.out.println("---Adios---");
			}
		}while(opcion!=5);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo contacto");
		System.out.println("2.- Buscar contacto");
		System.out.println("3.- Eliminar contacto");
		System.out.println("4.- Mostrar nombres");
		System.out.println("5.- Salir");
		
	}
	static void pedirContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		String nombre;
		System.out.println("Introduce Email");
		email=sc.nextLine();
		System.out.println("Introduce nombre");
		nombre=sc.nextLine();
		
		agendaService.agregar(email, nombre);
	}
	static void buscarContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		String nombre;
		System.out.println("Introduce email");
		email=sc.nextLine();
		nombre=agendaService.buscar(email);
		System.out.println(nombre);
	}
	static void eliminarContacto() {
		Scanner sc=new Scanner(System.in);
		String email;
		System.out.println("Introduce email");
		email=sc.nextLine();
		agendaService.eliminar(email);
	}
	static void mostrarNombres() {
		String[] nombres=agendaService.nombres();
		for(String n:nombres) {
			System.out.println(n);
		}
	}

}
