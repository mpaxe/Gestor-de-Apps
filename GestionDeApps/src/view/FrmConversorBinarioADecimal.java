package view;


import javax.swing.JTextField;

import controller.CtrConverBinDec;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class FrmConversorBinarioADecimal extends JDialog{

	private static final long serialVersionUID = 1L;
	public static JTextField txtNum;
	public static JLabel lblResult;
	private JButton btnConvierte;
	private JLabel lblBinario;


	public FrmConversorBinarioADecimal() {

		setBounds(100, 100, 362, 263);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtNum = new JTextField();
		txtNum.setBounds(96, 16, 221, 26);
		getContentPane().add(txtNum);
		txtNum.setHorizontalAlignment(JTextField.RIGHT);
		
		lblBinario = new JLabel("Binario:");
		lblBinario.setBounds(28, 16, 70, 26);
		lblBinario.setFont(new Font(Font.SERIF, Font.BOLD, 15));
		getContentPane().add(lblBinario);
		
		btnConvierte = new JButton("Convierte");
		btnConvierte.setBounds(148, 80, 117, 38);
		getContentPane().add(btnConvierte);
		
		btnConvierte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CtrConverBinDec.convierteADecimal();
			}
		});
		
		lblResult = new JLabel("Decimal:");
		lblResult.setBounds(75, 159, 180, 31);
		lblResult.setFont(new Font("Arial", Font.BOLD, 20));
		getContentPane().add(lblResult);
		
		setModal(true);
		setVisible(true);
	}
}
