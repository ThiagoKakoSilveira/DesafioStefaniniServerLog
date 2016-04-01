package teste;
import conversores.ConversorDeData;

public class Teste {
	
	private static String testeLinha = "177.44.240.52 - 46.165.197.142 - - [05/Jul/2015:09:03:16 -0300] ahjdkshajksdhueafe";
	private static ConversorDeData converte;

	public static void main(String[] args) {
		converte = new ConversorDeData(testeLinha);
		
	}

}
