package controller;


import view.FrmCadena;
import view.FrmCalculaIMC;
import view.FrmCalculadora;
import view.FrmConversorBinarioADecimal;
import view.FrmCreaArcText;
import view.FrmJuegoCapitales;
import view.FrmMezclaCadenas;
import view.FrmNumaleatorios;

public class CtrPrincipal {

	public static void lanazAppNumAleatorio() {
		new FrmNumaleatorios();
	}

	public static void lanazAppCalIMC() {
		new FrmCalculaIMC();
	}
	
	public static void lanzAppCadenas() {
		new FrmCadena();
	}
	
	public static void lanzaCalculadora() {
		new FrmCalculadora();
	}
	
	public static void lanzaJuegoCapitales() {
		new FrmJuegoCapitales();
	}
	public static void lanzaCoversorBinADeci() {
		new FrmConversorBinarioADecimal();
	}
	public static void cerrarApp() {
		System.exit(0);
	}

	public static void lanzaCreaArchTxt() {
		new FrmCreaArcText();
		
	}

	public static void lanzaMezclaCadenas() {
		new FrmMezclaCadenas();
	}

	

}
