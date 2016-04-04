package controladores;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import constantes.Constantes;


public class ControladorDeAcesso implements Constantes{
	
	
	private int contAcessos;
	
		
	private Map<String, Date> acessos;
	
	public ControladorDeAcesso() {
		acessos = new HashMap<String, Date>();
		contAcessos = 0;		
	}	
	
	public void adcionaNoMap(String ip, Date horaDoAcesso){		
		long intervaloAtual = horaDoAcesso.getTime();
		if(acessos.isEmpty()){
			acessos.put(ip, horaDoAcesso);
			contAcessos++;
		}
		if(acessos.containsKey(ip)){
			long dataSomadaTeste = acessos.get(ip).getTime() + INTERVALOEMMILLIS;		
			if(acessos.containsKey(ip) && dataSomadaTeste <= intervaloAtual) {
				acessos.put(ip, horaDoAcesso);
				contAcessos++;
			}			
		}		
		else{
			acessos.put(ip, horaDoAcesso);
			contAcessos++;
		}
	}

	public int getContAcessos() {
		return contAcessos;
	}

	public Map<String, Date> getAcessos() {
		return acessos;
	}	
}
