package view;

import javax.imageio.ImageIO;
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
	public BufferedImage miImage;
	private JMenu mnJuegos;
	private JMenuItem mntmJuegoDeCapitales;
	private JMenuItem mntmTextos;
	private JMenuItem mntmCreaArchivoDe;

	public FrmPrincipal() {

		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setAlwaysOnTop(true);
		lblLanzadorDeApp = new JLabel("Lanzador de Apps");
		lblLanzadorDeApp.setFont(new Font("Dialog", Font.BOLD , 20));
		lblLanzadorDeApp.setBounds(113, 5, 233, 22);
		getContentPane().add(lblLanzadorDeApp);
		
		//Obtengo la imagen de la ruta relativa del proyecto
		try {
			miImage = ImageIO.read(new File("img/fondo.jpg"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		//Creo un objeto Image y lo instancio con la imagen y lo redimesiono a la vez
		Image imageEscalada = new ImageIcon(miImage).getImage().getScaledInstance(420, 199, Image.SCALE_DEFAULT);
		lblImagen = new JLabel(new ImageIcon(imageEscalada));			
		lblImagen.setBounds(7, 38, 420, 199);
		getContentPane().add(lblImagen);
		
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
		
		JMenuItem mntmConversorBinarioA = new JMenuItem("Conversor binario a decimal");
		mntmConversorBinarioA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanzaCoversorBinADeci();
			}
		});
		mnAplicaciones.add(mntmConversorBinarioA);
		
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
		
		mntmTextos = new JMenuItem("Textos");
		mnTextos.add(mntmTextos);
		
		mntmCreaArchivoDe = new JMenuItem("Crea Archivo de Texto");
		mnTextos.add(mntmCreaArchivoDe);
		
		JMenuItem mntmMezclaCadenas = new JMenuItem("Mezcla Cadenas");
		mntmMezclaCadenas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanzaMezclaCadenas();
			}
		});
		mnTextos.add(mntmMezclaCadenas);
		
		mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		mntmJuegoDeCapitales = new JMenuItem("Juego de capitales");
		mntmJuegoDeCapitales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanzaJuegoCapitales();
			}
		});
		mnJuegos.add(mntmJuegoDeCapitales);
		mntmTextos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanzAppCadenas();
			}
		});
		
		mntmCreaArchivoDe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CtrPrincipal.lanzaCreaArchTxt();
			}
		});
		setVisible(true);
	}
}
