package principal;

public class LanzarDado {

	public static void main(String[] args) {
		//Hacer un programa que simule el lanzamiento de un dado
		//double num=Math.random()*6+1; //nos daría un decimal entre 1 y 6,99999
		/*int dado=(int)(Math.random()*6+1);
		System.out.println("El número es: "+dado);*/
		//System.out.println("El número es: "+num);
		//Lanzar el dado 10000 veces y mostraremos los porcentajes de cada cara
		
		int [] contadores = new int[6];
		
		for(int i=1; i<=10000; i++) {
			int dado=(int)(Math.random()*6+1);
			/*switch(dado) {
			case 1:
				contadores[0]++;
				break;
			case 2:
				contadores[1]++;
				break;
			case 3:
				contadores[2]++;
				break;
			case 4:
				contadores[3]++;
				break;
			case 5:
				contadores[4]++;
				break;
			case 6:
				contadores[5]++;
				break;
			}*/
			//Siempre se incrementa la posición del array cuyo índice es el valor del dado menos 1
			contadores[dado-1]++;//Nos ahorramos el switch, pq rellenamos la posición 0, 1, 2 etc... 
		}
		
		for(int i=0;i<contadores.length;i++) {
			System.out.println("Porcentaje de "+(i+1)+": "+contadores[i]*100.0/10000);
			//i+1 para que nos saque la cara correcta del dado, ya que la posición 0 corresponde al número 1, etc...
		}
		
	}

}
