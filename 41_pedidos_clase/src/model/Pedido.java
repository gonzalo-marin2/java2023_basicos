package model;

import java.util.Date;

/*Aplicación de pedidos

Un pedido se caracteriza por: producto,fechaPedido,precio

1.- Alta pedido
2.- Pedido más reciente
3.- Pedidos por precio inferior
4.- Salir*/

public class Pedido {
	private String producto;
	private Date fechaPedido;
	private double precio;
	
	public Pedido(String producto, Date fechaPedido, double precio) {
		this.producto=producto;
		this.fechaPedido=fechaPedido;
		this.precio=precio;
		
	}
	
	public Pedido() {
		
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}


