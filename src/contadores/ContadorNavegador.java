package contadores;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ContadorNavegador {
	
	private static int contMozilla, contChrome, contMSIE, contSafari, contOpera;
	
	public ContadorNavegador(String linha){
		if(linha.indexOf("Mozilla")!=-1){
			contMozilla++;
		}
		if(linha.indexOf("Chrome")!=-1){
			contChrome++;
		}
		if(linha.indexOf("MSIE")!=-1){
			contMSIE++;
		}
		if(linha.indexOf("Safari")!=-1){
			contSafari++;
		}
		if(linha.indexOf("Opera")!=-1){
			contOpera++;
		}
	}

	@Override
	public String toString() {
		StringBuilder apresentacaoDoContador = new StringBuilder();
		apresentacaoDoContador.append("OS navegadores encotrados no Log são: \n");
		
		Integer[] navegadores = {contChrome,contMozilla,contMSIE,contOpera,contSafari};
		
		
		Arrays.sort(navegadores, Collections.reverseOrder());
		
		for (int i = 0; i < navegadores.length; i++) {
			
		}
		apresentacaoDoContador.append("Mozilla: "+contMozilla+"\n");
		apresentacaoDoContador.append("Chrome: "+contChrome+"\n");
		apresentacaoDoContador.append("Internet Explorer: "+contMSIE+"\n");
		apresentacaoDoContador.append("Safari: "+contSafari+"\n");
		apresentacaoDoContador.append("Opera: "+contOpera+"\n");
		return apresentacaoDoContador.toString();
	}
	
	
}
