package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		//try con recursos, cierra los objetos
		try(FileReader f= new FileReader("c:\\temp\\dias.txt");
				BufferedReader bf=new BufferedReader(f)) {
			/*String dia=bf.readLine();//guardamos el contenido de la línea en una variable
			while(dia!=null) {//mientras la variable sea distinta de null
				System.out.println(dia);//imprime dia
				dia=bf.readLine();//vuelve a llamar para leer la siguiente línea
			}*/
			String dia;
			while((dia=bf.readLine())!=null) {//asignamos y comparamos en una línea, no hace falta volver a llamar al laectura de la línea
				System.out.println(dia);
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
