package principal;

public class Dividir {

	public static void main(String[] args) {
		int a=3, b=10;
		//muestra el resultado de dividir el mayor entre el menor
		/*if(a>b) {
			System.out.println("El resultado es: " + a/b + ".");
		} else {
			System.out.println("El resultado es: " + b/a + ".");
		}*/
		
		//alternativa con operador ternario
		int r=a>b ? a/b:b/a;
		System.out.println("El resultado es: " + r);

	}

}
