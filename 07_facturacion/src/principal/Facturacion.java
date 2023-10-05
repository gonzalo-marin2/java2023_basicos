package principal;

public class Facturacion {

	public static void main(String[] args) {
		//Calcular el precio final
		double precio=4.5;
		int unidades=3;
		//si compramos 5, 6 o 7 unidades, 10% de descuento
		//si compramos 3 o 4, 5%
		//si compramos 1 o 2, ningún descuento
		
		switch(unidades) {
		case 5,6,7:
			System.out.println("Precio total: " + precio*unidades*0.9);
			break;
		case 3,4:
			System.out.println("Precio total: " + precio*unidades*0.95);
			break;
		case 1,2:
			System.out.println("Precio total: " + precio*unidades);
			break;
		}
		
		//Solución utilizando expresiones switch de Java 17. Obliga a poner un valor default
		double pFinal=switch(unidades) {
		case 5,6,7->precio*unidades*0.9;
		case 3,4->precio*unidades*0.95;
		case 1,2->precio*unidades;
		default->-1;
		};
		System.out.println("Precio total: "+pFinal);

	}

}
