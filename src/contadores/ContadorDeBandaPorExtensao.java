package contadores;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;

import constantes.Constantes;
import contadores.BandasSomadas;

public class ContadorDeBandaPorExtensao implements Constantes{
//	Long bandaDocx, bandaTxt, bandaCsv, bandaPng, bandaJpg, bandaGif, bandaCss, bandaJs, bandaI;
	BandasSomadas bandas = new BandasSomadas();
	
	
	
	public void usarContador(String linha){
		if(linha.contains(CSS)){
			int posicaoDaExtensao = linha.indexOf(CSS)+CSS.length();
			int posicaoInicialDaBanda = posicaoDaExtensao + 15;
			if(linha.substring(posicaoDaExtensao, posicaoInicialDaBanda).contains("200")){
				String banda = linha.substring(posicaoInicialDaBanda, linha.length()).split(" ",2)[0];	
				System.out.println(banda);
				Integer bandaValida = Integer.valueOf(banda);
//				if(bandaValida!=null){					
					bandas.adcionarSoma(CSS, bandaValida);
//				}
			}					
		}
					
		
//		if(comArquivo.contains(TXT)){
//			bandaTxt += Long.parseLong(comBanda.next().trim());
//		}
//		if(comArquivo.contains(CSV)){
//			bandaCsv += Long.parseLong(comBanda.next().trim());
//		}
//		if(comArquivo.contains(PNG)){
//			bandaPng += Long.parseLong(comBanda.next().trim());
//		}
//		if(comArquivo.contains(JPG)){
//			bandaJpg += Long.parseLong(comBanda.next().trim());
//		}
//		if(comArquivo.contains(JS)){
//			bandaJs += Long.parseLong(comBanda.next().trim());
//		}
//		if(comArquivo.contains(GIF)){
//			bandaGif += Long.parseLong(comBanda.next().trim());
//		}
//		if(comArquivo.contains(DOCX)){
//			bandaDocx += Long.parseLong(comBanda.next().trim());
//		}
//		if(comArquivo.contains(I)){
//			bandaI += Long.parseLong(comBanda.next().trim());
//		}

	}


//	@Override
//	public String toString() {
//		return "Arquivo com extensão .docx consumiu esse total de bit: " + bandaDocx +
//		       "Arquivo com extensão .txt consumiu esse total de bit: " + bandaTxt + 
//			   "Arquivo com extensão .csv consumiu esse total de bit: "+ bandaCsv + 
//			   "Arquivo com extensão .png consumiu esse total de bit: " + bandaPng + 
//			   "Arquivo com extensão .jpg consumiu esse total de bit: " + bandaJpg + 
//			   "Arquivo com extensão .gif consumiu esse total de bit: " + bandaGif + 
//			   "Arquivo com extensão .css consumiu esse total de bit: " + bandaCss + 
//			   "Arquivo com extensão .js consumiu esse total de bit: " + bandaJs + 
//			   "Arquivo com extensão .i consumiu esse total de bit: " + bandaI;
//	}
	

}
