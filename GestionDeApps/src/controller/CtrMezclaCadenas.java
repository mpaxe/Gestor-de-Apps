package controller;

import logic.LogMezclaCadenas;
import view.FrmMezclaCadenas;

public class CtrMezclaCadenas {

	public static void gestionaCadenas() {
		FrmMezclaCadenas.txtReult.setText(LogMezclaCadenas.mezclaCadenas(FrmMezclaCadenas.txtCad1.getText(), FrmMezclaCadenas.txtCad2.getText()));
	}

	public static void limpiaCamposTxt() {
		FrmMezclaCadenas.txtCad1.setText(null);
		FrmMezclaCadenas.txtCad2.setText(null);
		FrmMezclaCadenas.txtReult.setText(null);
	}

	
}
