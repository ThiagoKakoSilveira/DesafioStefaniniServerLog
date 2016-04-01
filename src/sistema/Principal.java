package sistema;

import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
import contadores.*;
import conversores.ConversorDeData;
import comparadores.ControladorDeAcesso;

public class Principal {
	
	public String linha;
//	public List<String> listaString = new ArrayList<>();
	ContadorNavegador contNavegador;
	ContadorSistemaOperacional contSO;
	ConversorDeData converData;
	Scanner ler;
	ControladorDeAcesso acessos;
		
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
					ler = new Scanner(file);
					ler.useDelimiter("\\n");
					while(ler.hasNext()){
						String linhaInicial = ler.next();
						linha = linhaInicial.substring(15);
						contNavegador = new ContadorNavegador(linha);
						contSO = new ContadorSistemaOperacional(linha);
						converData = new ConversorDeData(linha);
						//colocar a classe controlador mas antes pega da linha inicial o ip
						
						
						
//						System.out.println(converData.entregaDate());
//						listaString.add(linha);
//						System.out.println(linha);					
					}	
				}	
			}
			System.out.println(contSO);
			System.out.println(contNavegador);			
		} catch (Exception e) {
			System.out.println("ferro o principal");
			e.printStackTrace();
		} finally {
			ler.close();			
		}

	}
}