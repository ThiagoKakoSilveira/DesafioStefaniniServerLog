package controladores;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import modelos.Intervalo;

import java.util.List;

import constantes.Constantes;

public class ControladorDeIntervalo implements Constantes {
	private long intervalo;	
	private List<Intervalo> intervalos;
	private LocalDateTime dataAntiga = null;
	
	public ControladorDeIntervalo(){
		intervalos = new ArrayList<>();		
	}
	
	public void usarControlador(LocalDateTime data){
		if(dataAntiga != null){
			intervalo = (intervaloEntreDatas(dataAntiga, data));
			intervalos.add(new Intervalo(intervalo, dataAntiga));
		}
		dataAntiga = data;		
	}
	
	public long intervaloEntreDatas(LocalDateTime antiga, LocalDateTime nova){
		Duration duracao = Duration.between(antiga, nova);
		return duracao.toMillis();
	}
	

}
