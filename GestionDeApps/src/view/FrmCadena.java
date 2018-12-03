package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CtrCadenas;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCadena extends JDialog{

	public static final long serialVersionUID = 1L;
	public static JTextField txtCadena;
	public JLabel lblTexto;
	public static JLabel lblResult;
	public JButton btnLongitud;
	public JButton btnInvertir;
	public JButton btnMayusculas;
	public JButton btnMinsculas;

	public FrmCadena() {

		setBounds(100, 100, 319, 281);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblTexto = new JLabel("Texto:");
		lblTexto.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTexto.setBounds(26, 16, 70, 27);
		getContentPane().add(lblTexto);
		
		txtCadena = new JTextField();
		txtCadena.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtCadena.setBounds(115, 16, 155, 27);
		getContentPane().add(txtCadena);
		txtCadena.setColumns(10);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("Dialog", Font.BOLD, 20));
		lblResult.setBounds(113, 75, 132, 33);
		getContentPane().add(lblResult);
		
		btnLongitud = new JButton("Longitud");
		btnLongitud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCadenas.mostrarLogitud();
			}
		});
		btnLongitud.setBounds(26, 153, 117, 25);
		getContentPane().add(btnLongitud);
		
		btnMayusculas = new JButton("Mayúsculas");
		btnMayusculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCadenas.pasaMayusculas();
			}
		});
		btnMayusculas.setBounds(26, 200, 117, 25);
		getContentPane().add(btnMayusculas);
		
		btnInvertir = new JButton("Invertir");
		btnInvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCadenas.invietreTexto();
			}
		});
		btnInvertir.setBounds(167, 153, 117, 25);
		getContentPane().add(btnInvertir);
		
		btnMinsculas = new JButton("Minúsculas");
		btnMinsculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCadenas.pasaMinisculas();
			}
		});
		btnMinsculas.setBounds(167, 200, 117, 25);
		getContentPane().add(btnMinsculas);
		
		setModal(true);
		setVisible(true);
	}
}
