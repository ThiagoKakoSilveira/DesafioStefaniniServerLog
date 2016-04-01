package conversores;

import constantes.Constantes;

public class TrocaMesToNumeral implements Constantes{
	private String[]dataSplitada;
		
	public TrocaMesToNumeral(String dataMes) {
		dataSplitada = dataMes.split("/");
		
		switch (dataSplitada[1]) {
		
		case MES1:
			dataSplitada[1]= "01";
			break;
		case MES2:
			dataSplitada[1] = "02";
			break;
		case MES3:
			dataSplitada[1] = "03";
			break;
		case MES4:
			dataSplitada[1] = "04";
			break;
		case MES5:
			dataSplitada[1] = "05";
			break;
		case MES6:
			dataSplitada[1] = "06";
			break;
		case MES7:
			dataSplitada[1] = "07";
			break;
		case MES8:
			dataSplitada[1] = "08";
			break;
		case MES9:
			dataSplitada[1] = "09";
			break;
		case MES10:
			dataSplitada[1] = "10";
			break;
		case MES11:
			dataSplitada[1] = "11";
			break;
		case MES12:
			dataSplitada[1] = "12";
			break;			

		default:
			break;
		}
		
	}
	
	public String entregaDataAlterada(){
		StringBuilder montandoData = new StringBuilder();
		for (String string : dataSplitada) {
			montandoData.append(string+"/");
		}
		return montandoData.replace(montandoData.lastIndexOf("/"), montandoData.length(), "").toString();
	}
}
