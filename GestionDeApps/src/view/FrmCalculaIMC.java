package view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

import controller.CtrCalculaIMC;

import javax.swing.event.ChangeEvent;

public class FrmCalculaIMC extends JDialog{

	private static final long serialVersionUID = 1L;
	
	public static JLabel lblPeso;
	public static JSlider sldPeso;
	public static JLabel lblAltura;
	public static JLabel lblImc;
	public static JLabel lblResPeso;
	public static JLabel lblResAlt;
	public static JLabel lblMensaje;
	public static JSlider sldAltura;

	public FrmCalculaIMC() {
		
		setBounds(100, 100, 328, 280);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(111, 12, 70, 22);
		getContentPane().add(lblPeso);

		sldPeso = new JSlider();
		sldPeso.setValue(30);
		sldPeso.setMinimum(30);
		sldPeso.setMaximum(150);
		sldPeso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CtrCalculaIMC.calculaImc();
			}
		});
		sldPeso.setBounds(30, 44, 200, 16);
		getContentPane().add(sldPeso);

		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(111, 80, 70, 22);
		getContentPane().add(lblAltura);

		lblImc = new JLabel("IMC:");
		lblImc.setBounds(30, 181, 101, 22);
		getContentPane().add(lblImc);

		lblResPeso = new JLabel("");
		lblResPeso.setBounds(240, 44, 70, 16);
		getContentPane().add(lblResPeso);

		lblResAlt = new JLabel("");
		lblResAlt.setBounds(240, 128, 70, 16);
		getContentPane().add(lblResAlt);

		lblMensaje = new JLabel("");
		lblMensaje.setBounds(154, 181, 131, 22);
		getContentPane().add(lblMensaje);

		sldAltura = new JSlider();
		sldAltura.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CtrCalculaIMC.calculaImc();
			}
		});
		sldAltura.setMaximum(250);
		sldAltura.setMinimum(50);
		sldAltura.setBounds(30, 128, 200, 16);
		getContentPane().add(sldAltura);
		setModal(true);
		setVisible(true);
	}
}
