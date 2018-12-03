package view;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import controller.*;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame{


	public static final long serialVersionUID = 1L;
	public JMenuItem mntmNmerosAleatorios;
	public JMenu mnAplicaciones;
	public JMenuItem mntmCalculaImc;
	public JLabel lblLanzadorDeApp;
	public JMenuItem mntmSalir;
	public JMenuBar menuBar;
	public JLabel lblImagen;
	public JMenuItem mntmCalculadora;

	public FrmPrincipal() {

		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setAlwaysOnTop(true);
		lblLanzadorDeApp = new JLabel("Lanzador de Apps");
		lblLanzadorDeApp.setFont(new Font("Dialog", Font.BOLD , 20));
		lblLanzadorDeApp.setBounds(113, 5, 233, 22);
		getContentPane().add(lblLanzadorDeApp);
		
		//Obtengo la imagen, tengo que poner ruta absoluta
		ImageIcon img = new ImageIcon("/home/alvaro/eclipse-workspace/Avante/GestionDeApps/img/fondo.jpg");
		//Escalo la imagen para que se ajuste al Jlabel
		Image imagen = img.getImage().getScaledInstance(420, 199, Image.SCALE_DEFAULT);
		//Creo un objeto imageIcon y lo instancio con la imagen redimesionada
		ImageIcon imgRedimensionado = new ImageIcon(imagen);
		lblImagen = new JLabel("");
		
		lblImagen.setBounds(7, 38, 420, 199);
		getContentPane().add(lblImagen);
		//Añado la image al Jlabel
		lblImagen.setIcon(imgRedimensionado);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAplicaciones = new JMenu("Operaciones");
		menuBar.add(mnAplicaciones);
		
		mntmNmerosAleatorios = new JMenuItem("Números aleatorios");
		mntmNmerosAleatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanazAppNumAleatorio();
			}
		});
		
		mntmCalculadora = new JMenuItem("Calculadora");
		mntmCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanzaCalculadora();
			}
		});
		mnAplicaciones.add(mntmCalculadora);
		mnAplicaciones.add(mntmNmerosAleatorios);
		
		mntmCalculaImc = new JMenuItem("Calcula IMC");
		mntmCalculaImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanazAppCalIMC();
			}
		});
		mnAplicaciones.add(mntmCalculaImc);
		
		JSeparator separator = new JSeparator();
		mnAplicaciones.add(separator);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.cerrarApp();
			}
		});
		mnAplicaciones.add(mntmSalir);
		
		JMenu mnTextos = new JMenu("Textos");
		menuBar.add(mnTextos);
		
		JMenuItem mntmTextos = new JMenuItem("Textos");
		mnTextos.add(mntmTextos);
		mntmTextos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanzAppCadenas();
			}
		});
		setVisible(true);
	}
}
