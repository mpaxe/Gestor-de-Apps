package controller;

import logic.LogCreaArcTxt;
import view.FrmCreaArcText;

public class CtrCreaArcTxt {

	public static void archivoTxt() {
		LogCreaArcTxt.generaArcTxt(FrmCreaArcText.txtPanel.getText());
	}

	public static void abreTxt() {
		FrmCreaArcText.txtPanel.setText(LogCreaArcTxt.abreArcTxt()); 
	}

}
