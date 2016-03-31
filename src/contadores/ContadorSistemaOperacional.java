package contadores;
import java.util.Arrays;

public class ContadorSistemaOperacional {
	
	private static int contWin, contIphone, contLinux, contAndroid, contMac;
	
	public ContadorSistemaOperacional(String linha){
		if(linha.indexOf("Windows")!=-1){
			contWin++;
		}
		if(linha.indexOf("iPhone")!=-1){
			contIphone++;
		}
		if(linha.indexOf("Linux")!=-1){
			contLinux++;
		}
		if(linha.indexOf("Android")!=-1){
			contAndroid++;
		}
		if(linha.indexOf("Macintosh")!=-1){
			contMac++;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder apresentacaoDoContador = new StringBuilder();
		apresentacaoDoContador.append("OS Sistemas Operacionais encotrados no Log são: \n");
		
		int[]sistemas = {contWin,contAndroid,contIphone,contLinux,contMac};
		
		Arrays.sort(sistemas);
		
		for (int i = 0; i < sistemas.length; i++) {
			System.out.println(sistemas[i]);
			if(sistemas[i]==contWin)apresentacaoDoContador.append("Windows: "+contWin+"\n");				
			
			if(sistemas[i]==contLinux)apresentacaoDoContador.append("Linux: "+contLinux+"\n");
			
			if(sistemas[i]==contAndroid)apresentacaoDoContador.append("Android: "+contAndroid+"\n");
			
			if(sistemas[i]==contMac)apresentacaoDoContador.append("Macintosh: "+contMac+"\n");
			
			if(sistemas[i]==contIphone)apresentacaoDoContador.append("iPhone: "+contIphone+"\n");				
		}
		return apresentacaoDoContador.toString();
	}
}
