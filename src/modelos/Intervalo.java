package modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Intervalo {	
	private long intervalo;
	private LocalDateTime data;
	
	public Intervalo(long intervalo, LocalDateTime data) {		
		this.intervalo = intervalo;
		this.data = data;
	}

	public long getIntervalo() {
		return intervalo;
	}
	
	public LocalDateTime getData() {
		return data;
	}

	@Override
	public String toString() {
		return "O intervalo em minutos é: "+(intervalo/60000)+ " no dia: "+data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))+"\n";
	}
	
	
	
}
