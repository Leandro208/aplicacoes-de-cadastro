package telas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LerEscrever {
	
	public static void escrever(String caminho, String texto) 
	throws FileNotFoundException{
		
		File arquivo = new File(caminho);
		PrintWriter pw = new PrintWriter(arquivo);
		pw.write(texto);
		pw.close();
		
	}
	
	
	public static String ler(String caminho)
	throws IOException{
		
		String texto = "";
		String str = "";
		File arquivo = new File(caminho);
		BufferedReader in = new BufferedReader(new FileReader(arquivo));
		while((str = in.readLine()) !=null) {
			texto = texto + str + "\n";
		}
		
		in.close();
		return texto;
	}

}
