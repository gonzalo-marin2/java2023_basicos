package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

import model.Pedido;

public class PedidoService {
	String dir="c:\\temp\\pedidos.txt";
	
	//en el constructor comprobamos si el fichero existe, sino, lo creamos
	public PedidoService() {
		File file=new File(dir);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		String linea=producto+","+fechaPedido+","+precio;
		try(
				FileOutputStream fos=new FileOutputStream(dir, true);
				PrintStream out=new PrintStream(fos)){
				out.println(linea);
				
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Pedido pedidoMasReciente() {
		Pedido pedidoReciente=null;
		try(
				FileReader f= new FileReader(dir);
				BufferedReader bf=new BufferedReader(f)){
				String linea=bf.readLine();
				//si el fichero está vacío, salimos
				if(linea==null) {
					return null;
				}
				String[] datos=linea.split(",");
				//variable que va a contener los datos del pedido más reciente
				pedidoReciente=new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
				LocalDate fechaReciente=pedidoReciente.getFechaPedido();
				while((linea=bf.readLine())!=null) {
					datos=linea.split(",");
					Pedido p=new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
					if(p.getFechaPedido().isAfter(fechaReciente)) {
						fechaReciente=p.getFechaPedido();
						pedidoReciente=p;
					}
				}
				
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return pedidoReciente;	
	}
	
	public ArrayList<Pedido> pedidosPrecio(double precioMax) {
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		try(
				FileReader f= new FileReader(dir);
				BufferedReader bf=new BufferedReader(f)){
				String linea;
				while((linea=bf.readLine())!=null) {
					String[] datos=linea.split(",");
					Pedido p=new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
					if(p.getPrecio()<precioMax) {
						resultado.add(p);
					}
				}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;	
	}
	
	public ArrayList<Pedido> anteriores(int meses){
		ArrayList<Pedido> resultado=new ArrayList<Pedido>();
		LocalDate referencia=LocalDate.now().minusMonths(meses);
		try(
				FileReader f= new FileReader(dir);
				BufferedReader bf=new BufferedReader(f)){
				String linea;
				while((linea=bf.readLine())!=null) {
					String[] datos=linea.split(",");
					Pedido p=new Pedido(datos[0],LocalDate.parse(datos[1]),Double.parseDouble(datos[2]));
					if(p.getFechaPedido().isBefore(referencia)) {
						resultado.add(p);
					}
				}
			}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;
		}
		
		//fecha actual
		//LocalDate referencia=LocalDate.now();
		//fecha del pedido
		//LocalDate fechaPedido=fechaHoy.minusMonths(meses);
		//De una vez
		//LocalDate referencia=LocalDate.now().minusMonths(meses);
		
}
