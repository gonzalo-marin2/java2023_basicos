package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas="4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		//programa que calcule:
		//nota media, nota más alta, nota más baja, total de aprobados

		String[] valores=notas.split(",");//convertimos la cadena en un array
		double media=0;
		int aprobados=0;
		double mayor=Double.parseDouble(valores[0]);
		double menor=Double.parseDouble(valores[0]);
		for(String s:valores) {
			double nota=Double.parseDouble(s);//Convertimos en double los valores del array
			media+=nota;
			if(nota>=5) {
				aprobados++;
			}
			if(nota>mayor) {
				mayor=nota;
			}
			if(nota<menor) {
				menor=nota;
			}
		}
		System.out.println("La media es: "+media/valores.length);
		System.out.println("La media es: "+String.format("%.2f",media/valores.length));//lo muestra con dos decimales
		System.out.println("Total de aprobados: "+aprobados);
		System.out.println("La nota más alta es: "+mayor);
		System.out.println("La nota más baja es: "+menor);
	}

}
