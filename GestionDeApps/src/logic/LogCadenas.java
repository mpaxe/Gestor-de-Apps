package logic;

import view.FrmCadena;

public class LogCadenas {

	public static void calculaLongCadena() {
		Integer longitud = FrmCadena.txtCadena.getText().length();
		FrmCadena.lblResult.setText(longitud.toString());
	}

	public static void convierteMayusculas() {
		FrmCadena.lblResult.setText(FrmCadena.txtCadena.getText().toUpperCase());
		
	}

	public static void invertirElTexto() {
		String cad = FrmCadena.txtCadena.getText();
		String res = "";
		for(int i = cad.length() - 1; 0 <= i ;res += cad.charAt(i), i--);
		FrmCadena.lblResult.setText(res);
	}

	public static void convierteMinusculas() {
		FrmCadena.lblResult.setText(FrmCadena.txtCadena.getText().toLowerCase());
		
	}

	
}
