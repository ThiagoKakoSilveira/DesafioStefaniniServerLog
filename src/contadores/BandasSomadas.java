package contadores;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BandasSomadas {
	private Map<String, Long> bandas = new HashMap<>();
	
	final void adcionarSoma(String extensao, Long valor){
		Long valorAtual = bandas.get(extensao);
		bandas.put(extensao, (valorAtual != null ? valorAtual:0)+valor);		
	}
	
	public final String imprimir(){
		StringBuilder impressao = new StringBuilder();
		
		impressao.append(
				bandas.entrySet().stream().sorted(Map.Entry.<String, Long> comparingByValue().reversed())
						.map(e -> (e.getKey() + ": " + e.getValue())).collect(Collectors.toList()));
		
		return impressao.toString();
	}

}
