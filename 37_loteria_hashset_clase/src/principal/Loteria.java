package principal;

import java.util.HashSet;

public class Loteria {

	public static void main(String[] args) {
		HashSet<Integer> combinacion=new HashSet<>();
		while(combinacion.size()<6) {
			combinacion.add((int)(Math.random()*49+1));
		}
		for(int n:combinacion) {
			System.out.println(n+",");
		}

	}

}
