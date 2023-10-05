package service;

import java.util.HashMap;

public class AgendaService {
	HashMap<String,String> agenda=new HashMap<String, String>();
	
	public boolean agregar(String email, String nombre) {
		//si el email no está, añadimos contacto
		//y devolvemos true
		if(!agenda.containsKey(email)) {
			agenda.put(email, nombre);
			return true;
		}
		return false;
	}
	
	public boolean eliminar(String email) {
		//si el email no está, añadimos contacto
		//y devolvemos true
		if(agenda.containsKey(email)) {
			agenda.remove(email);
			return true;
		}
		return false;
	}
	
	public String buscar(String email) {
		//a partir de la clave, devuelve el nombre,
		//si no existiera, devuelve directamente null
		return agenda.get(email);
	}
	
	public String[] nombres() {
		/*String[] datos=new String[agenda.size()];
		var nombres=agenda.values();
		int cont=0;
		for(String n:nombres) {
			datos[cont]=n;
			cont++;
		}
		return datos;*/
		//el método toArray de collection devuelve un array con los datos
		//de la colección, a partir de un array vacío
		return agenda.values().toArray(new String[0]);
	}
	
	
	
}
