package comparadores;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ControladorDeAcesso {
	
	private static Map<String, Date> acessos = new HashMap<String, Date>();
	
	public ControladorDeAcesso(String ip, Date horaDoAcesso) {
		acessos.put(ip, horaDoAcesso);		
	}
	

}
