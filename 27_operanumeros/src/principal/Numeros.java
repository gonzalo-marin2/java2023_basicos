package principal;
import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		//Realizar un programa que vaya solicitando la introducción de números enteros y los irá guardando
		//Cada vez que pida un número y lo guarde, preguntará al usuario si desea introducir otro.
		//Cuando diga que no quiere seguir introduciendo números, se mostrará la suma de todos los números introducidos
		
		ArrayList<Integer> lista=new ArrayList<>();//var lista=new ArrayList<Integer>();
		Scanner scNumeros=new Scanner(System.in);
		int num;
		Scanner scTextos=new Scanner(System.in);
		String resp;
		int suma=0;
		
		do {
			System.out.println("Introduce un número");
			num=scNumeros.nextInt();
			lista.add(num);
			System.out.println("¿Quieres introducir otro número?(si/no)");
			resp=scTextos.nextLine();
		}while((resp.equals("si")));
		for(int n:lista) {
			suma+=n;
		}
		System.out.println("La suma es: "+suma);
	}
}
