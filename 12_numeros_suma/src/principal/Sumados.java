package principal;

public class Sumados {

	public static void main(String[] args) {
		//¿Cuántos números empezando por 1, tenemos que sumar hasta alcanzar o superar 1000?
		var suma=0;
		var i=0;
		while(suma<=1000) {
			i++;//importante incrementar antes de sumar, sino, no hace la operación
			suma+=i;
			System.out.println(i);
		}
		System.out.println("Hay que sumar hasta: "+i);

	}

}
