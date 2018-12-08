package logic;


import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;

import view.FrmJuegoCapitales;


public class LogJuegoCapitales {
	public static List<String> listaPaises = new ArrayList<String>();
	public static List<String> listaCapitales = new ArrayList<String>();
	public static List<String> listaPaisesMix = new ArrayList<String>();
	public static List<String> listaCapitalesMix = new ArrayList<String>();
	public static DefaultListModel<String> modelPaises = new DefaultListModel<String>();
	public static DefaultListModel<String> modelCapitales = new DefaultListModel<String>();
	
	public static void generaListaPaises() {
		listaPaises.add("España");
		listaPaises.add("Portugal");
		listaPaises.add("Francia");
		listaPaises.add("Italia");
		listaPaises.add("Alemania");
		listaPaises.add("Bélgica");
		listaPaises.add("Reino Unido");
		listaPaises.add("Países Bajos");
		listaPaises.add("Suiza");
		listaPaises.add("Dinamarca");
	}
	
	public static void generaListaCapitales() {
		listaCapitales.add("Madrid");
		listaCapitales.add("Lisboa");
		listaCapitales.add("París");
		listaCapitales.add("Roma");
		listaCapitales.add("Berlín");
		listaCapitales.add("Brusela");
		listaCapitales.add("Londres");
		listaCapitales.add("Amsterdam");
		listaCapitales.add("Berna");
		listaCapitales.add("Copenhague");
	}

	public static void generaModeloPais() {
		generaListaPaises();
		for(String cad: listaPaises) {
			listaPaisesMix.add(cad);
		}
		Collections.shuffle(listaPaisesMix);
		for(String cad: listaPaisesMix) {
			if(!modelPaises.contains(cad)) {
				modelPaises.addElement(cad);				
			}
		}
	}

	public static void generaModeloCapital() {
		generaListaCapitales();
		for(String cad: listaCapitales) {
			listaCapitalesMix.add(cad);
		}
		Collections.shuffle(listaCapitalesMix);
		for(String cad: listaCapitalesMix) {
			if(!modelCapitales.contains(cad)) {
				modelCapitales.addElement(cad);				
			}
		}		
	}
	public static void comprombarResultado() {
		String pais = FrmJuegoCapitales.lstPais.getSelectedValue();
		String capital = FrmJuegoCapitales.lstCapital.getSelectedValue();
	
		int posPais = listaPaises.indexOf(pais);
		int posCapital = listaCapitales.indexOf(capital);

		if(posPais == posCapital && (posPais!=-1 || posCapital!=-1)) {
			FrmJuegoCapitales.lblResult.setText("ACIERTO");
			FrmJuegoCapitales.lblResult.setForeground(Color.GREEN);
		}else {
			FrmJuegoCapitales.lblResult.setText("FALLO");
			FrmJuegoCapitales.lblResult.setForeground(Color.RED);
		}
	}
	
}
