package constantes;

import java.io.File;

public class LocalDoArquivo {
	
	final String user = System.getProperty("user.home");
	public final File folder = new File(user + File.separator + "accessLog" + File.separator);
	

}
