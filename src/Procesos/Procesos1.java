package Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Procesos1 {
	
	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime(); //unica instancia
		Process process = runtime.exec("ping www.google.es -c2"); 
		InputStream input = process.getInputStream(); //salida del comando para java
		BufferedReader in =  
		     new BufferedReader(new InputStreamReader(input));//procesar la entrada, ya puedo leer
		String linea; 
		while ((linea = in.readLine()) != null) 
		  System.out.println(linea); 
		in.close();
	}
	 
}
