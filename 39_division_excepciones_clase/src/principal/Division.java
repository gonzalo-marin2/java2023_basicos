package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int s=a/b;
			System.out.println("División: "+s);
		}catch(InputMismatchException ex){
			 System.out.println("Número incorrecto");
		}
		catch(ArithmeticException ex){
			 System.out.println("División por 0");
		}
		/*catch(Exception ex) {
			System.out.println("Error inesperado");//no recomendable, si es una excepción runtime, no sabemos qué tipo de error es
			ex.printStackTrace();//pinta las trazas del error
		}*/
		finally {//bloque opcional, siempre se ejecuta tanto si hay excpción como sino
			System.out.println("Fin del programa");
		}
	}

}
