package service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas=new ArrayList<>();
	
	public void guardarNota(double nota) {
		notas.add(nota);
	}
	public void eliminarNota(int pos) {
		if(pos<notas.size()) {
			notas.remove(pos);
		}
	}
	
	public double media() {
		double res=0;
		for(double d:notas) {
			res+=d;
		}
		return res/notas.size();
	}
	
	public int aprobados() {
		int cont=0;
		for (double d:notas) {
			if(d>5) {
				cont++;
			}
		}
		return cont;
	}
	
	public ArrayList<Double> notas(){
		return notas;
	}
	
	
}
