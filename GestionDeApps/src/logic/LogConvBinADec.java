package logic;

import view.FrmConversorBinarioADecimal;

public class LogConvBinADec {
	public static int total = 0;
	public static String convADecimal() {
		//num =  Integer.parseInt(FrmConversorBinarioADecimal.txtNum.getText(), 2); Método alternativo usando Integer.parseInt
		String cad = FrmConversorBinarioADecimal.txtNum.getText();
		for(int i = 0; i < cad.length(); i++) {
			total += Integer.parseInt(""+cad.charAt(i)) * Math.pow(2, (cad.length() -1) -i);
		}
		return total+"";
	}

}
