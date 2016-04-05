package controladores;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

import modelos.Intervalo;

import java.util.List;
import java.util.stream.Collectors;

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
	
	public String imprimeLista(){
		return intervalos.stream().sorted(Comparator.comparing(Intervalo::getIntervalo).reversed()).limit(3).collect(Collectors.toList()).toString();		
	}
	

}
