package principal;

public class PruebasString {

	public static void main(String[] args) {
		String cad1="hola";
		String cad2=" adios";
		String cad3=cad1.toUpperCase();
		//concatenación
		cad1=cad1+cad2;//"hola adios"
		System.out.println(cad1);
		System.out.println(cad1.length());
		System.out.println(cad1.toUpperCase());//todo en mayúsculas
		System.out.println("El caracter de la posición es: "+cad1.charAt(2));
		System.out.println(cad3);

	}

}
