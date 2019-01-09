package Procesos;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Procesos3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		Process lsProc = rt.exec("ls ./src/Procesos/"); 
		InputStream in = lsProc.getInputStream(); 
		Process grepProc = rt.exec("grep java"); 
		OutputStream out = grepProc.getOutputStream(); 
		int b; 
		while((b = in.read()) != -1) 
		  out.write(b); 
		lsProc.waitFor(); 
		in.close(); 
		out.close(); 
		in = grepProc.getInputStream(); 
		while((b = in.read()) != -1) 
		  System.out.write(b); 
		grepProc.waitFor(); 
		in.close(); 
	}
}
