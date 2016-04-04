package conversores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConversorDeData {
	private String dataString;
	private Date data;
	private TrocaMesToNumeral troca;
	
		
	final String DELIMITADOR = "- - ";
	
	public void usarConversor(String linha){
		SimpleDateFormat dataFormatada =  new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");
		
		dataString = linha.split(DELIMITADOR)[1].substring(1, 21);
		troca = new TrocaMesToNumeral(dataString);		
		
		try {
			data = dataFormatada.parse(troca.entregaDataAlterada());
		} catch (ParseException e) {
			System.out.println("Erro na conversão");
			e.printStackTrace();
		}		
	}
	
	public Date entregaDate(){
		return data;		
	}
	
	public LocalDateTime entregaLocalDate(){
		return Instant.ofEpochMilli(data.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

	@Override
	public String toString() {
		return "A data convertida é: "+ data;
	}
}
