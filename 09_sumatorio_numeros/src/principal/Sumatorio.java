package principal;
import java.util.Scanner;
public class Sumatorio {

	public static void main(String[] args) {
		//Calcular la suma de los números comprendidos entre dos números, sin saber cuál es el mayor
		//int a=30;
		//int b=5;
		//Cambiar programa para que los números se den por teclado por el usuario
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int a=sc.nextInt();
		System.out.println("Introduce el segundo número");
		int b=sc.nextInt();
		int suma=0;
		//Usamos clase Math para calcular el mayor y el menor en vez del ternario
		int mayor=Math.max(a, b);//a>b?a:b;
		int menor=Math.min(a, b);//a>b?b:a;
		for(int n=menor; n<=mayor; n++) {
				suma=suma+n;//suma+=n	
		}
		System.out.println("La suma es: " + suma);
	}

}
