package principal;

public class CalculosEdades {

	public static void main(String[] args) {
		int [] edades = {34,19,28,55,61,40};
		//var [] edades = new int[]{34,19,28,55,61,40};
		//calcular la media de edad
		//mostrar la edad mayor y la menor
		
		double suma=0;
		var mayor=edades[0];
		var menor=edades[0];
		/*for(var i=0; i<edades.length; i++) {
			suma+=edades[i];
			if(edades[i]>mayor) {
				mayor = edades[i];
			}
			if(edades[i]<menor) {
				menor = edades[i];
			}
		}*/
		
		//Usando for each o enhanced for:;
		for(int e:edades) {
			suma+=e;
			if(e>mayor) {
				mayor=e;
			}
			if(e<menor) {
				menor=e;
			}
		}
		System.out.println("La suma de los valores del array es: "+suma);
		System.out.println("La media de edad del array es: " + suma/edades.length);
		System.out.println("El valor mayor es: "+mayor);
		System.out.println("El valor menor es: "+menor);	
	}

}
