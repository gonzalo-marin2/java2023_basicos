package principal;

public class Temperaturas {

	public static void main(String[] args) {
		double [] temps = {12.4,23.3,17.9,30.1,22.4,17,8};
		//Indicar cuantas temperaturas son superiores a la media
		double media=0;
		int contador=0;
		//Calcular la media
		for(double t:temps) {
			media+=t;
		}
		media/=temps.length;
		//Volvemos a recorrer el array y contamos las temperaturas superiores a la media
		for(double t:temps) {
			if(t>media) {
				contador++;
			}
		}
		System.out.println("Total superiores media: "+contador);
	}

}
