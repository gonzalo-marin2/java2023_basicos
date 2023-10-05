package principal;

public class ComprobarTextos {

	public static void main(String[] args) {
		String productos="Detergente,Vino,Pan,Agua,Leche,Harina,Mantequilla,Arroz";
		//Crear una nueva cadena de caracteres que contenga los productos que empiezan por A
		String[] datos=productos.split(",");//Convertimos la cadena en Array
		StringBuilder resultado=new StringBuilder();//aquí añadimos los productos que cumplan la condición
		for(String p:datos) {//recorremos el array
			if(p.startsWith("A")) {//comprobamos la condición
				resultado.append(p);//si es afirmativo, lo agregamos al array
				resultado.append(",");//agregamos una coma después del producto
			}
		}
		System.out.println(resultado.delete(resultado.length()-1, resultado.length()));
	}

}
