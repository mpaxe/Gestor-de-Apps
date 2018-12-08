package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.CtrMezclaCadenas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class FrmMezclaCadenas extends JDialog{

	private static final long serialVersionUID = 1L;
	public static JTextField txtCad1;
	public static  JTextField txtCad2;
	public static JTextField txtReult;
	private JLabel lblCadena;
	private JLabel lblCadena_1;
	private JButton btnMezclarCadenas;
	private JButton btnLimpiarCampos;

	public FrmMezclaCadenas() {
		
		setBounds(100, 100, 399, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblCadena = new JLabel("Cadena 1:");
		lblCadena.setBounds(30, 30, 80, 22);
		getContentPane().add(lblCadena);
		
		lblCadena_1 = new JLabel("Cadena 2:");
		lblCadena_1.setBounds(30, 64, 80, 22);
		getContentPane().add(lblCadena_1);
		
		txtCad1 = new JTextField();
		txtCad1.setBounds(116, 30, 227, 21);
		getContentPane().add(txtCad1);
		txtCad1.setColumns(10);
		
		txtCad2 = new JTextField();
		txtCad2.setColumns(10);
		txtCad2.setBounds(116, 64, 227, 21);
		getContentPane().add(txtCad2);
		
		btnMezclarCadenas = new JButton("Mezclar Cadenas");
		btnMezclarCadenas.setBounds(152, 113, 155, 36);
		getContentPane().add(btnMezclarCadenas);
		
		btnMezclarCadenas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CtrMezclaCadenas.gestionaCadenas();
			}
		});
		
		JLabel lblResultadoCadena = new JLabel("Resultado:");
		lblResultadoCadena.setBounds(30, 176, 80, 22);
		getContentPane().add(lblResultadoCadena);
		
		txtReult = new JTextField();
		txtReult.setColumns(10);
		txtReult.setBounds(116, 177, 227, 21);
		getContentPane().add(txtReult);
		
		btnLimpiarCampos = new JButton("Limpiar Campos");
		btnLimpiarCampos.setBounds(152, 210, 155, 36);
		getContentPane().add(btnLimpiarCampos);
		
		btnLimpiarCampos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CtrMezclaCadenas.limpiaCamposTxt();
			}
		});
		
		setModal(true);
		setVisible(true);
	}
}
