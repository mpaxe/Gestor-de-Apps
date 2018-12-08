package controller;

import javax.swing.JButton;

import logic.LogCalculadora;

public class CtrCalculadora {

	public static void imprimeNumero(JButton btn) {
		LogCalculadora.impresionPantalla(btn);
	}

	public static void borraPantalla() {
		LogCalculadora.borraPantallaLog();
	}

	public static void borraUltimoNum() {
		LogCalculadora.borraUltimoNumLog();
	}

	public static void operacion(JButton btn) {
		LogCalculadora.operacionLog(btn);
	}
	
}
