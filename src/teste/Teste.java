package teste;
import java.util.Scanner;

import contadores.*;

public class Teste {
	
	private static String testeLinha = "177.44.240.52 - 177.97.91.238 - - [05/Jul/2015:21:32:52 -0300] \"GET /wp-content/themes/dominio/style.css HTTP/1.0\" 200 4022 \"http://www.dominio.com.br/nota-dominio-sobre-o-fies/";
	private static ContadorDeBandaPorExtensao contBanda;

	public static void main(String[] args) {
//		System.out.println(testeLinha.split("200")[1].substring(1));
//		Scanner ler = new Scanner(testeLinha.split("200")[1]);
//		ler.useDelimiter("\"");
//		System.out.println(ler.next().trim());
		String linhaNova = testeLinha.substring(30);
		System.out.println(linhaNova);
		
	}

}
