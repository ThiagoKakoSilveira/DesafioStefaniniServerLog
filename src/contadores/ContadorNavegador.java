package contadores;
import java.util.Arrays;
import java.util.Collections;

public class ContadorNavegador {
	
	private int contMozilla, contChrome, contMSIE, contSafari, contOpera;
	
	public void usarContador(String linha){
		if(linha.indexOf("Firefox")!=-1){
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
		apresentacaoDoContador.append("OS navegadores encotrados no Log s�o: \n");
		
		Integer[] navegadores = {contChrome,contMozilla,contMSIE,contOpera,contSafari};
		
		
		Arrays.sort(navegadores, Collections.reverseOrder());
		
		for (int i = 0; i < navegadores.length; i++) {
			if(navegadores[i]==contMozilla)apresentacaoDoContador.append("Mozilla: "+contMozilla+"\n");
			
			if(navegadores[i]==contSafari)apresentacaoDoContador.append("Safari: "+contSafari+"\n");
			
			if(navegadores[i]==contChrome)apresentacaoDoContador.append("Chrome: "+contChrome+"\n");
			
			if(navegadores[i]==contMSIE)apresentacaoDoContador.append("Internet Explorer: "+contMSIE+"\n");
			
			if(navegadores[i]==contOpera)apresentacaoDoContador.append("Opera: "+contOpera+"\n");
		}
		return apresentacaoDoContador.toString();
	}
	
	
}
