package view;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.CtrCalculadora;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCalculadora extends JDialog{

	private static final long serialVersionUID = 1L;
	public static JTextField txtPantalla;
	public static JButton btn1;
	public static JButton btn2;
	public static JButton btn3;
	public static JButton btnAC;
	public static JButton btn4;
	public static JButton btn5;
	public static JButton btn6;
	public static JButton btnDEL;
	public static JButton btn7;
	public static JButton btn8;
	public static JButton btn9;
	public static JButton btnDiv;
	public static JButton btn0;
	public static JButton btnPunto;
	public static JButton btnSuma;
	public static JButton btnMulti;
	public static JButton btnRaiz;
	public static JButton btnPorce;
	public static JButton btnResta;
	public static JButton btnIgual;

	public FrmCalculadora() {
		setResizable(false);
		setBounds(100, 100, 361, 347);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtPantalla = new JTextField();
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtPantalla.setBounds(12, 12, 335, 57);
		getContentPane().add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 69, 335, 48);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("1");	
			}
		});
		panel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("2");
			}
		});
		panel.add(btn2);
		
		btn3= new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("3");
			}
		});
		panel.add(btn3);
		
		btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.borraPantalla();
			}
		});
		panel.add(btnAC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 117, 335, 48);
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("4");
			}
		});
		panel_1.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("5");
			}
		});
		panel_1.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("6");
			}
		});
		panel_1.add(btn6);
		
		btnDEL = new JButton("DEL");
		btnDEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.borraUltimoNum();
			}
		});
		panel_1.add(btnDEL);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 165, 335, 48);
		getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("7");
			}
		});
		panel_2.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("8");
			}
		});
		panel_2.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("9");
			}
		});
		panel_2.add(btn9);
		
		btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.operacion("÷");
			}
		});
		panel_2.add(btnDiv);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 213, 335, 48);
		getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero("0");
			}
		});
		panel_3.add(btn0);
		
		btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.imprimeNumero(".");
			}
		});
		panel_3.add(btnPunto);
		
		btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.operacion("+");
			}
		});
		panel_3.add(btnSuma);
		
		btnMulti = new JButton("×");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.operacion("×");
			}
		});
		panel_3.add(btnMulti);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 261, 335, 48);
		getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnRaiz = new JButton("√");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.operacion("√");
			}
		});
		panel_4.add(btnRaiz);
		
		btnPorce = new JButton("%");
		btnPorce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.operacion("%");
			}
		});
		panel_4.add(btnPorce);
		
		btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.operacion("-");
			}
		});
		panel_4.add(btnResta);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrCalculadora.operacion("=");
			}
		});
		panel_4.add(btnIgual);
		
		setModal(true);
		setVisible(true);
	}
}
