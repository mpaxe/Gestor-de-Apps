package app;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

import view.FrmPrincipal;

public class Start {

	public static void main(String[] args) {
		Start myApp = new Start();
		myApp.inicio();

	}

	private void inicio() {
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new FrmPrincipal();
	}
}
