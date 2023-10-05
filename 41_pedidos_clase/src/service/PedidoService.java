package service;

import java.util.ArrayList;
import java.util.Date;

import model.Pedido;

public class PedidoService {
	ArrayList<Pedido> pedidos=new ArrayList<>();
	

	public void guardarPedido(String producto, Date fechaPedido,double precio) {
		pedidos.add(new Pedido(producto,fechaPedido,precio));
	}
	
	public Pedido pedidoMasReciente() {
		Pedido pedido=pedidos.get(0);
		Date fechaReciente=pedido.getFechaPedido();
		for(Pedido p:pedidos) {
			if(p.getFechaPedido().after(fechaReciente)) { //si encontramos una fecha más reciente, actualizamos variables
				fechaReciente=p.getFechaPedido();
				pedido=p;
			}
		}
		return pedido;
	}
	
	public ArrayList<Pedido> pedidosPrecio(double precioMax) {
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			if(p.getPrecio()<precioMax) {
				resultado.add(p);
			}
		}
		return resultado;
	}

}
