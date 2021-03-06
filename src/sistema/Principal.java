package sistema;

import java.io.File;
import java.util.Scanner;
import contadores.*;
import controladores.ControladorDeAcesso;
import conversores.ConversorDeData;
import controladores.ControladorDeIntervalo;


public class Principal {
	
	private String linha;
//	public List<String> listaString = new ArrayList<>();
	private ContadorNavegador contNavegador;
	private ContadorSistemaOperacional contSO;
	private ConversorDeData convertData;
	private Scanner ler, lerIp;
	private ControladorDeAcesso controlAcessos;
	private ControladorDeIntervalo controlIntervalo;
	private Cronometro cronometro;
	private ContadorDeBandaPorExtensao contBanda;
			
	public static void main(String[] args) {
		new Principal();

	}

	public Principal() {
		cronometro = new Cronometro();
		cronometro.begin();
		try {
			String user = System.getProperty("user.home");
			File folder = new File(user + File.separator + "accessLog" + File.separator);
			contNavegador = new ContadorNavegador();
			contSO = new ContadorSistemaOperacional();
			convertData = new ConversorDeData();
			controlAcessos = new ControladorDeAcesso();
			controlIntervalo = new ControladorDeIntervalo();	
			contBanda = new ContadorDeBandaPorExtensao();
			for (File file : folder.listFiles()) {
				if (file.getName().endsWith(".log")) {
//					System.out.println(file);					
					ler = new Scanner(file);
					ler.useDelimiter("\\n");
					while(ler.hasNext()){
						String linhaInicial = ler.next();
						linha = linhaInicial.substring(15);
						contNavegador.usarContador(linha);
						contSO.usarContador(linha);
						convertData.usarConversor(linha);
						lerIp = new Scanner(linha);
						lerIp.useDelimiter("- -");
						String ip = lerIp.next().trim();
						controlAcessos.adcionaNoMap(ip, convertData.entregaDate());
						controlIntervalo.usarControlador(convertData.entregaLocalDate());						
						contBanda.usarContador(linha);						
					}	
				}	
			}
//			System.out.println(contBanda);
			System.out.println(controlIntervalo.imprimeLista());		
			System.out.println(contSO);
			System.out.println(contNavegador);
			System.out.println(controlAcessos.getContAcessos());
			System.out.println("\nSegue abaixo linha com extens�o e quantidade de banda consumida em bits:\n");
			System.out.println(contBanda.getBandas().imprimir());			
			cronometro.close();	
		} catch (Exception e) {
			System.out.println("ferro o principal");
			e.printStackTrace();
		} finally {
			ler.close();
			
		}
	}
}