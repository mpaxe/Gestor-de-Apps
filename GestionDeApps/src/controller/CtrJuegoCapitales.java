package controller;

import logic.LogJuegoCapitales;
import view.FrmJuegoCapitales;

public class CtrJuegoCapitales {


	public static void creaListaPais() {
		LogJuegoCapitales.generaModeloPais();
	}

	public static void creaListaCapital() {
		LogJuegoCapitales.generaModeloCapital();
	}

	public static void muestraListas() {
		FrmJuegoCapitales.lstPais.setModel(LogJuegoCapitales.modelPaises);
		FrmJuegoCapitales.lstCapital.setModel(LogJuegoCapitales.modelCapitales);
	}

	public static void comprobar() {
		LogJuegoCapitales.comprombarResultado();
	}
}
