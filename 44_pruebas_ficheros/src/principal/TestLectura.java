package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		FileReader f=null;
		BufferedReader bf=null;
		try {
			f= new FileReader("c:\\temp\\dias.txt");
			bf=new BufferedReader(f);
			String dia=bf.readLine();//guardamos el contenido de la línea en una variable
			while(dia!=null) {//mientras la variable sea distinta de null
				System.out.println(dia);//imprime dia
				dia=bf.readLine();//vuelve a llamar para leer la siguiente línea
			}
			//System.out.println("Línea 1: "+bf.readLine());
			//System.out.println("Línea 2: "+bf.readLine());
		}
		/*catch(FileNotFoundException ex) {//ioexception es padre de filenotfound, por lo que no necesitamos esta exception
			ex.printStackTrace();
		}*/
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(bf!=null) {
				try {
					bf.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(f!=null) {
				try {
					f.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
