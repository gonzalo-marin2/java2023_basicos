package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		PrintStream out=null;
		try {
			out=new PrintStream("c:\\temp\\dias.txt");//se usa doble barra pq la barra tiene un significado especial
			out.println("lunes");
			out.println("martes");
			out.println("miércoles");
			//si se vuelve a ejecutar, sobreescribe lo que hay, no se añaden cosas nuevas
			
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out!=null) {//Si es distinto de null, para evitar la nullpointerexception
				out.close();//Cerramos el objeto
			}
		}

	}

}
