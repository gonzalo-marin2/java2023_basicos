package principal;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//ejemplo excepción ==> este error es del programador
		/*int [] nums= {5,1,33,10};
		for(int i=0;i<=4;i++) {
			System.out.println(nums[i]);
		}*/
		
		//otro ejemplo ==> error que no se puede controlar
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce edad: ");
		int edad=sc.nextInt();
		System.out.println("Tienes "+edad+" años");

	}

}
