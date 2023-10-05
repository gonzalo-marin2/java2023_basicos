package principal;

public class Comprobar {

	public static void main(String[] args) {
		int [] nums= {3,5,11,2,-3,7,23,-4};
		//¿Hay algún número negativo en el array?
		boolean negativo=false;
		for(var n:nums){
			if(n<0) {
				negativo=true;
				break;//si ya encontramos un negativo, dejamos de mirar
			}
		}
		if(negativo) {//equivale a negativo==true
			System.out.println("Había negativo");
		}else {
			System.out.println("No había negativo");
		}
		System.out.println(negativo);
	}

}
