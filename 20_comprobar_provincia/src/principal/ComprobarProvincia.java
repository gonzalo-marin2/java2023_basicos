package principal;

public class ComprobarProvincia {

	public static void main(String[] args) {
		String localidad="Alcalá de Henares(Madrid)";
		//Mostrar la provincia a la que pertenece esa localidad
		int a,b;
		/*a=localidad.indexOf("(");
		b=localidad.indexOf(")");
		System.out.println("La provincia es: "+localidad.substring(a+1,b));*/
		
		System.out.println("La provincia de la localidad es: " + localidad.substring(localidad.indexOf("(")+1, localidad.indexOf(")")));

	}

}
