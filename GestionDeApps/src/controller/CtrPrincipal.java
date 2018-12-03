package controller;


import view.FrmCadena;
import view.FrmCalculaIMC;
import view.FrmCalculadora;
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

	public static void cerrarApp() {
		System.exit(0);
	}

}
