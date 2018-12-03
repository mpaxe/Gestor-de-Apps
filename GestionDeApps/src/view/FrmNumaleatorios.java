package view;


import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import controller.CtrNumAleatorios;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmNumaleatorios extends JDialog{

	public static final long serialVersionUID = 1L;
	public static JTextField txtNumGen;
	public static JLabel lblNumero1;
	public static JSpinner sprNum1;
	public static JLabel lblNumero2;
	public static JSpinner sprNum2;
	public static JLabel lblNmeroGenerado;
	public static JButton btnGenerar;
	public static SpinnerNumberModel spModel1, spModel2;


	public FrmNumaleatorios() {
		
		setResizable(false);
		setTitle("Calculadora de números aleatorios");
		setBounds(100, 100, 404, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
	
		
		lblNumero1 = new JLabel("Número 1");
		lblNumero1.setBounds(46, 34, 70, 15);
		getContentPane().add(lblNumero1);
		
		lblNumero2 = new JLabel("Número 2");
		lblNumero2.setBounds(46, 102, 70, 15);
		getContentPane().add(lblNumero2);
		
		spModel1 = new SpinnerNumberModel(0, 0, 100, 1);
		sprNum1 = new JSpinner(spModel1);
		sprNum1.setBounds(238, 32, 117, 20);
		getContentPane().add(sprNum1);
		
		spModel2 = new SpinnerNumberModel(0, 0, 100, 1);
		sprNum2 = new JSpinner(spModel2);
		sprNum2.setBounds(238, 100, 117, 20);
		getContentPane().add(sprNum2);
		
		lblNmeroGenerado = new JLabel("Número generado");
		lblNmeroGenerado.setBounds(46, 166, 142, 15);
		getContentPane().add(lblNmeroGenerado);
		
		txtNumGen = new JTextField();
		txtNumGen.setEditable(false);
		txtNumGen.setHorizontalAlignment(JTextField.CENTER);
		txtNumGen.setBounds(238, 164, 117, 19);
		getContentPane().add(txtNumGen);
		txtNumGen.setColumns(10);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNumGen.setText(CtrNumAleatorios.calcularAleatorio().toString());
			}
		});
		btnGenerar.setBounds(141, 214, 124, 36);
		getContentPane().add(btnGenerar);
		setModal(true);
		setVisible(true);
	}
	
	
}
