package principal;

public class Notas {

	public static void main(String[] args) {
		
		/*En función de la nota muestra calificación:
		 * Entre 1 y 4: Suspenso
		 * 5 y 6: aprobado
		 * 7 y 8 notable
		 * 9 y 10 sobresaliente
		 * otro valor, nota no válida
		 */
		
		// ¡¡Solución de Java 17!!
		int nota=6;
		switch(nota) {
			case 1,2,3,4:
				System.out.println("Suspenso");
				break;
			case 5,6:
				System.out.println("Aprobado");
				break;
			case 7,8:
				System.out.println("Notable");
				break;
			case 9,10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Nota no válida");
		}
		
		//Solución antes de Java 17 => Caso por caso:
		/*
		  switch(nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			case 5:
			case 6:
				System.out.println("Aprobado");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Nota no válida");
		}
		 */

	}

}
