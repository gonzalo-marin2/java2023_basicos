package principal;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		LocalDate ld1=LocalDate.of(2022, 11, 28);
		LocalDate ld2=LocalDate.of(2022, 8, 23);
		if(ld1.isBefore(ld2)) {
			System.out.println("La más antigua es "+ld1);
			System.out.println("La más reciente es "+ld2);
		}else {
			System.out.println("La más antigua es "+ld2);
			System.out.println("La más reciente es "+ld1);
		}
		//formateado de fechas
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld1.format(dtf));
		System.out.println(ld2.format(dtf));
		
		//parseado de fechas
		String f="30/07/2021";
		LocalDate ld3=LocalDate.parse(f, dtf);
		/*System.out.println(ld3);
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(ld3.format(dtf2));*/
		//obtener valores individuales de la fecha
		System.out.println("Año: "+ld3.getYear());
		System.out.println("Mes: "+ld3.getMonthValue());//muestra el mes en número. ej:julio=>7
		System.out.println("Mes: "+ld3.getMonth());//muestra el nombre del mes
		System.out.println("Día: "+ld3.getDayOfMonth());
		
		//obtener fechas posteriores/anteriores a ciertos valores
		System.out.println(ld3.plusMonths(6));
		System.out.println(ld3.minusMonths(3));
		System.out.println(ld3);
		//block de notas COMPILACIONES FECHA
		//LocalDate l1=LocalDate.of(2010,13,20);
		//LocalDate l8=LocalDate.of(2200, Month.APRIL, 4); ==> otra forma de usar of
		//LocalDate l2=LocalDate.now();
		//LocalDate l6=LocalDate.now().of(3000,10,10);
		//System.out.println(l6);
	}

}
