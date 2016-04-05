package contadores;

import java.util.HashMap;
import java.util.Map;

public class BandasSomadas {
	private Map<String, Integer> bandas = new HashMap<>();
	
	final void adcionarSoma(String extensao, int valor){
		Integer valorAtual = bandas.get(extensao);
		bandas.put(extensao, (valorAtual != null ? valorAtual:0)+valor);		
	}

}
