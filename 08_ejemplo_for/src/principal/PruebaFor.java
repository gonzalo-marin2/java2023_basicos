package principal;

public class PruebaFor {

	public static void main(String[] args) {
		//mostrar la suma de todos los números pares comprendidos entre 1 y 20
		
		int suma=0;
		for(int n=1; n<=20; n++) {
			if(n%2==0) { //¿es par?
				suma=suma+n; //suma+=n
				System.out.println("La suma de los pares es: "+suma);//El mensaje solo se muestra cuando es par
			}
		System.out.println("La suma de los pares es: "+suma + "impares");	//El mensaje aparece repetido cuando es impar	
		}

	}

}
