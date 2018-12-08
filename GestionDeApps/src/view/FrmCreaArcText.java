package view;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import controller.CtrCreaArcTxt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class FrmCreaArcText extends JDialog{

	private static final long serialVersionUID = 1L;
	private JButton btnGuardar, btnAbrir;
	public static JTextPane txtPanel;


	public FrmCreaArcText() {
	
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtPanel = new JTextPane();
		txtPanel.setBounds(7, 12, 420, 213);
		getContentPane().add(txtPanel);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(80, 237, 117, 25);
		getContentPane().add(btnGuardar);
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.setBounds(233, 237, 117, 25);
		getContentPane().add(btnAbrir);
		
		btnGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CtrCreaArcTxt.archivoTxt();
			}
		});
		
		btnAbrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CtrCreaArcTxt.abreTxt();
			}
		});
		setModal(true);
		setVisible(true);
	}
}
