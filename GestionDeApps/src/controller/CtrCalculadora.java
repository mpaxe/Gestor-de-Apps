package controller;

import logic.LogCalculadora;

public class CtrCalculadora {

	public static void imprimeNumero(String num) {
		LogCalculadora.impresionPantalla(num);
	}

	public static void borraPantalla() {
		LogCalculadora.borraPantallaLog();
	}

	public static void borraUltimoNum() {
		LogCalculadora.borraUltimoNumLog();
	}

	public static void operacion(String op) {
		LogCalculadora.operacionLog(op);
	}
	
}
