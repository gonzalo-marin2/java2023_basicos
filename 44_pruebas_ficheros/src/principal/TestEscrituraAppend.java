package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraAppend {

	public static void main(String[] args) {
		//vamos a añadir, no a sustituir
		FileOutputStream fos=null;
		PrintStream out=null;
		try {
			//hace falta un objeto para configurar la forma de escritura
			fos=new FileOutputStream("c:\\temp\\dias.txt", true);//este objeto me permite decir dónde puedo escribir
			//a partir del objeto anterior creamos el PrintStream. Este sí puede añadir
			out=new PrintStream(fos);//se usa doble barra pq la barra tiene un significado especial
			out.println("jueves");
			out.println("viernes");
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out!=null) {
				out.close();
			}
			if(fos!=null) {
				try {
					fos.close();//el método close() tb puede provocar una excepción
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
