package logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;

public class LogCreaArcTxt {

	public static String generaArcTxt(String cad) {
		JFileChooser jfl = new JFileChooser();
		jfl.showSaveDialog(null);
		File archivo = jfl.getSelectedFile();
	
		BufferedWriter br;
		try {
			br = new BufferedWriter(new FileWriter(archivo));
			br.write(cad);
			br.close();
		} catch (Exception e) {
			cad = "Error de lectura";
		}	
		return cad;
	}

	public static String abreArcTxt() {
		String texto;
		String res = "";
		JFileChooser jfl = new JFileChooser();
		jfl.showOpenDialog(null);
		File archivo = jfl.getSelectedFile();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(archivo));
			while((texto = br.readLine()) != null) {
				texto += br.readLine();	
				res = texto.replaceAll("null", "");
			}
			
			br.close();
		} catch (Exception e) {
			texto = "Error de lectura";
		}	
		return res;
	}
	
}
