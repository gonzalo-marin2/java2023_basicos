package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String> dias=new ArrayList<>();
		//otra forma de declarar==>var otra=new ArrayList<String>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add(1, "Miércoles");
		System.out.println(dias.size());
		System.out.println(dias.get(2));
		dias.remove(0);
		System.out.println(dias.get(2));//dará error, out of bounds
		

	}

}
