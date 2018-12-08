package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JDialog;

import controller.CtrJuegoCapitales;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmJuegoCapitales extends JDialog{

	public static final long serialVersionUID = 1L;
	public static JList<String> lstCapital;
	public static JList<String> lstPais;
	public static JButton btnComprobra;
	public static JLabel lblResult;
	public static JLabel lblPais;
	public static JLabel lblCapital;
	public static JScrollPane scroll;

	public FrmJuegoCapitales() {
		inicio();
		CtrJuegoCapitales.creaListaPais();
		CtrJuegoCapitales.creaListaCapital();
		CtrJuegoCapitales.muestraListas();
		setVisible(true);
	}
	
	private void inicio() {
		setBounds(100, 100, 395, 356);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblPais = new JLabel("País");
		lblPais.setFont(new Font("Dialog", Font.BOLD, 18));
		lblPais.setBounds(58, 12, 70, 22);
		getContentPane().add(lblPais);
		
		lblCapital = new JLabel("Capital");
		lblCapital.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCapital.setBounds(240, 12, 86, 22);
		getContentPane().add(lblCapital);
			
		lstPais = new JList<String>();
		scroll = new JScrollPane(lstPais);
		scroll.setBounds(30, 59, 126, 122);
		getContentPane().add(scroll);
			
		lstCapital = new JList<String>();
		scroll = new JScrollPane(lstCapital);
		scroll.setBounds(220, 59, 126, 122);
		getContentPane().add(scroll);
		
		btnComprobra = new JButton("Comprobra");
		btnComprobra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrJuegoCapitales.comprobar();
			}
		});
		btnComprobra.setBounds(134, 269, 117, 36);
		getContentPane().add(btnComprobra);
		
		lblResult = new JLabel("");
		lblResult.setBounds(134, 206, 150, 47);
		lblResult.setFont(new Font("Serif", Font.BOLD, 25));
		getContentPane().add(lblResult);
		
		setModal(true);
	}
}
