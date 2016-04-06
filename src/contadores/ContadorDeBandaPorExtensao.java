package contadores;

import constantes.Constantes;
import contadores.BandasSomadas;

public class ContadorDeBandaPorExtensao implements Constantes{
	Long bandaDocx, bandaTxt, bandaCsv, bandaPng, bandaJpg, bandaGif, bandaCss, bandaJs, bandaI;
	BandasSomadas bandas = new BandasSomadas();
	
	
	
	public void usarContador(String linha){
		
		if(linha.contains(CSS)){
			catarBanda(linha, CSS, bandaCss);
		}
		
		if(linha.contains(TXT)){
			catarBanda(linha, TXT, bandaTxt);
		}
		if(linha.contains(CSV)){
			catarBanda(linha, CSV, bandaCsv);
		}
		if(linha.contains(PNG)){
			catarBanda(linha, PNG, bandaPng);
		}
		if(linha.contains(JPG)){
			catarBanda(linha, JPG, bandaJpg);
		}
		if(linha.contains(JS)){
			catarBanda(linha, JS, bandaJs);
		}
		if(linha.contains(GIF)){
			catarBanda(linha, GIF, bandaGif);
		}
		if(linha.contains(DOCX)){
			catarBanda(linha, DOCX, bandaDocx);
		}
		if(linha.contains(I)){
			catarBanda(linha, I, bandaI);
		}

	}		
	
	public BandasSomadas getBandas() {
		return bandas;
	}

	public void catarBanda(String linha, String extensao, Long extensaoBanda){
		
		if(linha.contains(extensao)){
			int posicaoDaExtensao = linha.indexOf(extensao)+extensao.length();
			int posicaoInicialDaBanda = posicaoDaExtensao + 15;
			try {
				if(linha.substring(posicaoDaExtensao, posicaoInicialDaBanda).contains("200")){
					String banda = linha.substring(posicaoInicialDaBanda, linha.length()).split(" ",2)[0].trim();	
//					System.out.println(banda);
//					Integer bandaValida = Integer.valueOf(banda);
					Long bandaValida = Long.valueOf(banda);
//					if(bandaValida!=null)extensaoBanda+=bandaValida;
//					else extensaoBanda +=0;
					bandas.adcionarSoma(extensao, bandaValida);
				}					
			} catch(Exception e){
			}
		}
	}


	@Override
	public String toString() {
		return "Arquivo com extensão .docx consumiu esse total de bit: " + bandaDocx +"\n"+
		       "Arquivo com extensão .txt consumiu esse total de bit: " + bandaTxt + "\n"+
			   "Arquivo com extensão .csv consumiu esse total de bit: "+ bandaCsv + "\n"+
			   "Arquivo com extensão .png consumiu esse total de bit: " + bandaPng + "\n"+
			   "Arquivo com extensão .jpg consumiu esse total de bit: " + bandaJpg + "\n"+
			   "Arquivo com extensão .gif consumiu esse total de bit: " + bandaGif + "\n"+
			   "Arquivo com extensão .css consumiu esse total de bit: " + bandaCss + "\n"+
			   "Arquivo com extensão .js consumiu esse total de bit: " + bandaJs + "\n"+
			   "Arquivo com extensão .i consumiu esse total de bit: " + bandaI +"\n";
	}
	

}
