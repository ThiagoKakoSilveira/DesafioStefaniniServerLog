package sistema;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import contadores.*;

//import constantes.*;

public class Principal {
	
	public String linha;
	public List<String> listaString = new ArrayList<>();
	ContadorNavegador contNavegador;
	ContadorSistemaOperacional contSO;
		
	public static void main(String[] args) {
		new Principal();

	}

	public Principal() {
		try {
			String user = System.getProperty("user.home");
			File folder = new File(user + File.separator + "accessLog" + File.separator);
			for (File file : folder.listFiles()) {
				if (file.getName().endsWith(".log")) {
//					System.out.println(file);
					
					Scanner ler = new Scanner(file);
					ler.useDelimiter("\\n");
					while(ler.hasNext()){
						linha = ler.next();
						contNavegador = new ContadorNavegador(linha);
						contSO = new ContadorSistemaOperacional(linha);
						
//						listaString.add(linha);
//						System.out.println(linha);					
					}										
				}				
			}
			System.out.println(contSO);
			System.out.println(contNavegador);
		} catch (Exception e) {

		}

	}
}