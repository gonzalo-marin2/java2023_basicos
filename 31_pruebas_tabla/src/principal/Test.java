package principal;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> dias=new HashMap<>();
		dias.put(125, "lunes");//Introducimos los valores
		dias.put(300, "martes");
		dias.put(400, "miércoles");
		dias.put(200, "jueves");
		/*dias.put(300, "viernes");
		System.out.println(dias.get(300));
		dias.remove(200);*/
		var valores=dias.values();//Usamos el método value() para recoger los valores pero no las claves
		for(String s:valores) {//Recorremos la variable valores para que nos devuelva los valores introducidos anteriormente
			System.out.println(s);
		}
	}

}
