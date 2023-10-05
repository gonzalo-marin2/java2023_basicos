package principal;

public class Verificar {

	public static void main(String[] args) {
		String cursos="Ofimática,Java básico,JavaEE,Spring Boot,Angular,Programación avanzada en Java";
		//¿Cuántos cursos sobre Java hay?
		String[] nombres=cursos.toLowerCase().split(",");//el orden es importante!! Primero ponemos en minúsculas y luego creamos el array
		int contador=0;
		for(String n:nombres) {
			if(n.contains("java")) {
				contador++;
			}
		}
		System.out.println("Cursos de Java: "+contador);
	}

}
