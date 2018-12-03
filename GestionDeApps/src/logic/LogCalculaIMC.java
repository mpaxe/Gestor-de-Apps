package logic;

import view.FrmCalculaIMC;

public class LogCalculaIMC {
	
	public static double calculoIMC(int peso, double altura) {
		return 0;
	}
	
	public static String caluloIMCtxt(double imcVal) {
		return "";
	}

	public static void imprimeMensaje(Double i) {
		if(i < 16) {
			FrmCalculaIMC.lblMensaje.setText("Delgadez severa");
		}else if(i < 17) {
			FrmCalculaIMC.lblMensaje.setText("Delgadez moderada");
		}else if(i < 19) {
			FrmCalculaIMC.lblMensaje.setText("Delgadez aceptable");
		}else if(i < 25) {
			FrmCalculaIMC.lblMensaje.setText("Peso normal");
		}else if(i < 30) {
			FrmCalculaIMC.lblMensaje.setText("Sobre peso");
		}else if(i < 35) {
			FrmCalculaIMC.lblMensaje.setText("Obeso tipo I");
		}else if(i < 40) {
			FrmCalculaIMC.lblMensaje.setText("Obeso tipo II");
		}else {
			FrmCalculaIMC.lblMensaje.setText("Obeso tipo III");
		}
	}
}
