package principal;

import java.util.Scanner;

import service.AgendaService;

public class ProgramaAgenda {

	public static void main(String[] args) {
		/*Agenda de contactos
		1.-Nuevo contactos
		2.-Buscar contacto
		3.-Eliminar contacto
		4.-Mostrar todos los nombres
		5.-Salir
		Un contacto tiene como valor el nombre y clave su email.
		1.- Se pide el nombre y el email. Si no existe un contacto
		con ese email, se guarda, si ya existe, mensaje de error
		2.- Se pide el email del contacto y se muestra el nombre
		correspondiente. Si no hay contacto con ese email, mensaje
		3.-Se pide el email y se elimina el contacto. Si no existe, mensaje
		4. Muestra todos los nombres de contactos*/
		
		AgendaService agendaService=new AgendaService();
		
		mostrarMenu();
		Scanner sc=new Scanner(System.in);
		int opcion=sc.nextInt();;
		
		
		
		do {
		mostrarMenu();
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:	
			//pedirContacto(;)
			break;
		case 2:
			buscarContacto();
			String email;
			String nombre;
			System.out.println("Introduce el email del nuevo contacto: ");
			Scanner scContacto=new Scanner(System.in);
			email=scContacto.nextLine();
			nombre=agendaService.buscar(email);
			System.out.println(nombre);
			break;
		case 3:
			eliminarContacto();
			break;
		case 4:
			break;
		case 5:
			break;
		}
	} while(opcion!=5);

		
	}
	
	
	static void mostrarMenu(){
		System.out.println("1. Agregar contacto");
		System.out.println("2. Buscar contacto");
		System.out.println("3. Eliminar contacto");
		System.out.println("4. Mostrar contactos");
		System.out.println("5. Salir");
	}
	
	
	static void buscarContacto() {
		
	}
	static void eliminarContacto() {
		Scanner scContacto=new Scanner(System.in);
		String email;
		System.out.println("Introduce el email: ");
	}
	

}
