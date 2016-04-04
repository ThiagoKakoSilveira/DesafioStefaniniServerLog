package modelos;

import java.time.LocalDateTime;

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
		return "Intervalo [intervalo=" + intervalo + ", data=" + data + "]";
	}
	
	
	
}
