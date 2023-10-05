package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas="4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		String[] valores=notas.split(",");//convertimos la cadena en un array
		//Generar métodos para calcular media, nota más alta y baja y número de aprobados	
		
		System.out.println("La media es: "+media(valores)+" desde llamada a métodos");
		System.out.println("La media es: "+String.format("%.2f",media(valores))+" desde llamada a métodos");//lo muestra con dos decimales
		System.out.println("Total de aprobados: "+aprobados(valores)+" desde llamada a métodos");
		System.out.println("La nota más alta es: "+mayor(valores)+" desde llamada a métodos");
		System.out.println("La nota más baja es: "+menor(valores)+" desde llamada a métodos");
	}
	
	static double media(String [] datos) {
		double r=0;
		for(String n:datos) {
			r+=Double.parseDouble(n);
		}
		return r/datos.length;
	}
	
	static int aprobados(String [] datos) {
		int total=0;
		for(String n:datos) {
			if(Double.parseDouble(n)>=5) {
				total++;
			}
		}
		return total;
	}
	
	static double mayor(String [] datos) {
		double mayor=Double.parseDouble(datos[0]);
		for(String n:datos) {
			if(Double.parseDouble(n)<mayor) {
				mayor=Double.parseDouble(n);
			}
		}
		return mayor;
		
	}
	
	static double menor(String [] datos) {
		double menor=Double.parseDouble(datos[0]);
		for(String n:datos) {
			if(Double.parseDouble(n)>menor) {
				menor=Double.parseDouble(n);
			}
		}
		return menor;
	}

}
