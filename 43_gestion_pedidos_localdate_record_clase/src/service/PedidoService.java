package service;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Pedido;

public class PedidoService {
	ArrayList<Pedido> pedidos=new ArrayList<>();
	

	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		pedidos.add(new Pedido(producto,fechaPedido,precio));
	}
	
	public Pedido pedidoMasReciente() {
		Pedido pedido=pedidos.get(0);
		LocalDate fechaReciente=pedido.fechaPedido();
		for(Pedido p:pedidos) {
			if(p.fechaPedido().isAfter(fechaReciente)) { //si encontramos una fecha más reciente, actualizamos variables
				fechaReciente=p.fechaPedido();
				pedido=p;
			}
		}
		return pedido;
	}
	
	public ArrayList<Pedido> pedidosPrecio(double precioMax) {
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			if(p.precio()<precioMax) {
				resultado.add(p);
			}
		}
		return resultado;
	}
	
	public ArrayList<Pedido> anteriores(int meses){
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		//fecha actual
		//LocalDate referencia=LocalDate.now();
		//fecha del pedido
		//LocalDate fechaPedido=fechaHoy.minusMonths(meses);
		//De una vez
		LocalDate referencia=LocalDate.now().minusMonths(meses);
		for(Pedido p:pedidos) {	
			if(p.fechaPedido().isBefore(referencia)) {
			resultado.add(p);
			}
		}
		return resultado;
	}

}
