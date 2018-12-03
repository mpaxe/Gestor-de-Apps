package controller;

import logic.LogCalculaIMC;
import view.FrmCalculaIMC;

public class CtrCalculaIMC {

	public static void calculaImc() {
		Integer peso = FrmCalculaIMC.sldPeso.getValue();
		Double altura = FrmCalculaIMC.sldAltura.getValue()*0.01;
		
		Double imc = peso/Math.pow(altura, 2);
		String imcTxt= String.format("%.2f", imc);
		
		FrmCalculaIMC.lblResPeso.setText(peso.toString());
		FrmCalculaIMC.lblResAlt.setText(altura.toString());
		FrmCalculaIMC.lblImc.setText("IMC: "+imcTxt);
		LogCalculaIMC.imprimeMensaje(imc);
	}
}
