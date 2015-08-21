package Principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import Fondo.FondoVentanaEquipoIdeal;

import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.Timer;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.Color;

import javax.swing.SwingConstants;



public class Ventana_Equipo_Ideal extends JFrame {

	private Timer tick;
	private int maxBarraProgres;
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Equipo_Ideal frame = new Ventana_Equipo_Ideal();
					FondoVentanaEquipoIdeal fondo=new FondoVentanaEquipoIdeal();
					fondo.setEnabled(true);
					fondo.setVisible(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_Equipo_Ideal() {
		
		setTitle("Equipo Ideal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		FondoVentanaEquipoIdeal f = new FondoVentanaEquipoIdeal();
		f.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(f);
		f.setLayout(null);
		
		JLabel RojaDef3 = new JLabel("");
		RojaDef3.setBounds(225, 295, 22, 32);
		f.add(RojaDef3);
		
		JLabel RojaDel2 = new JLabel("");
		RojaDel2.setBounds(667, 222, 22, 32);
		f.add(RojaDel2);
		
		JLabel AmarillaDel3 = new JLabel("");
		AmarillaDel3.setBounds(548, 380, 15, 32);
		f.add(AmarillaDel3);
		
		JLabel AmarillaVol1 = new JLabel("");
		AmarillaVol1.setBounds(377, 389, 15, 32);
		f.add(AmarillaVol1);
		
		JLabel RojaDel3 = new JLabel("");
		RojaDel3.setBounds(559, 380, 22, 32);
		f.add(RojaDel3);
		
		JLabel RojaDef4 = new JLabel("");
		RojaDef4.setBounds(225, 432, 22, 32);
		f.add(RojaDef4);
		
		JLabel AmarillaDef4 = new JLabel("");
		AmarillaDef4.setBounds(214, 432, 15, 32);
		f.add(AmarillaDef4);
		
		JLabel RojaVol3 = new JLabel("");
		RojaVol3.setBounds(383, 40, 22, 32);
		f.add(RojaVol3);
		
		JLabel AmarillaVol2 = new JLabel("");
		AmarillaVol2.setBounds(372, 236, 15, 32);
		f.add(AmarillaVol2);
		
		JLabel AmarillaDef3 = new JLabel("");
		AmarillaDef3.setBounds(214, 295, 15, 32);
		f.add(AmarillaDef3);
		
		JLabel RojaDel1 = new JLabel("");
		RojaDel1.setBounds(578, 90, 22, 32);
		f.add(RojaDel1);
		
		JLabel AmarillaDel2 = new JLabel("");
		AmarillaDel2.setBounds(656, 222, 15, 32);
		f.add(AmarillaDel2);
		
		JLabel RojaVol2 = new JLabel("");
		RojaVol2.setBounds(383, 236, 22, 32);
		f.add(RojaVol2);
		
		JLabel AmarillaDel1 = new JLabel("");
		AmarillaDel1.setBounds(567, 90, 15, 32);
		f.add(AmarillaDel1);
		
		JLabel RojaVol1 = new JLabel("");
		RojaVol1.setBounds(388, 389, 22, 32);
		f.add(RojaVol1);
		
		JLabel AmarillaVol3 = new JLabel("");
		AmarillaVol3.setBounds(372, 40, 15, 32);
		f.add(AmarillaVol3);
		
		JLabel AmarillaDef2 = new JLabel("");
		AmarillaDef2.setBounds(214, 142, 15, 32);
		f.add(AmarillaDef2);
		
		JLabel RojaDef2 = new JLabel("");
		RojaDef2.setBounds(225, 142, 22, 32);
		f.add(RojaDef2);
		
		JLabel RojaDef1 = new JLabel("");
		RojaDef1.setBounds(215, 22, 22, 32);
		f.add(RojaDef1);
		
		JLabel AmarillaDef1 = new JLabel("");
		AmarillaDef1.setBounds(204, 22, 15, 32);
		f.add(AmarillaDef1);
		
		JLabel Roja = new JLabel("");
		Roja.setIcon(null);
		Roja.setBounds(74, 240, 22, 32);
		f.add(Roja);
		
		JLabel Amarilla = new JLabel("");
		Amarilla.setIcon(null);
		Amarilla.setBounds(63, 240, 15, 32);
		f.add(Amarilla);
		
		JProgressBar progressBar = new JProgressBar(0,200);
		progressBar.setBounds(319, 491, 146, 23);
		f.add(progressBar);
		
		
		tick = new Timer(60, new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (maxBarraProgres == 200) {
					tick.stop();
				}else{
					maxBarraProgres++;
					progressBar.setValue(maxBarraProgres);
				}
			
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Pelota.gif")));
		label.setBounds(215, 404, 68, 84);
		f.add(label);
		label.setVisible(false);

		
		JLabel Escudo_Bolivia = new JLabel("");
		Escudo_Bolivia.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Bolivia.png")));
		Escudo_Bolivia.setBounds(279, 29, 68, 79);
		f.add(Escudo_Bolivia);
		
		JLabel Escudo_Argentina = new JLabel("");
		Escudo_Argentina.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Argentina.png")));
		Escudo_Argentina.setBounds(357, 209, 68, 79);
		f.add(Escudo_Argentina);
		
		JLabel Escudo_Brazil = new JLabel("");
		Escudo_Brazil.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Brazil.png")));
		Escudo_Brazil.setBounds(357, 119, 68, 79);
		f.add(Escudo_Brazil);
		
		JLabel Escudo_Chile = new JLabel("");
		Escudo_Chile.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Chile.png")));
		Escudo_Chile.setBounds(357, 285, 68, 79);
		f.add(Escudo_Chile);
		
		JLabel Escudo_Colombia = new JLabel("");
		Escudo_Colombia.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Colombia.png")));
		Escudo_Colombia.setBounds(513, 29, 68, 79);
		f.add(Escudo_Colombia);
		
		JLabel Escudo_Ecuador = new JLabel("");
		Escudo_Ecuador.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Ecuador.png")));
		Escudo_Ecuador.setBounds(112, 29, 68, 79);
		f.add(Escudo_Ecuador);
		
		JLabel Escudo_Jamaica = new JLabel("");
		Escudo_Jamaica.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Jamaica.png")));
		Escudo_Jamaica.setBounds(39, 29, 68, 79);
		f.add(Escudo_Jamaica);
		
		JLabel Escudo_Mexico = new JLabel("");
		Escudo_Mexico.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Mexico.png")));
		Escudo_Mexico.setBounds(190, 29, 68, 79);
		f.add(Escudo_Mexico);
		
		JLabel Escudo_Paraguay = new JLabel("");
		Escudo_Paraguay.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Paraguay.png")));
		Escudo_Paraguay.setBounds(665, 29, 68, 79);
		f.add(Escudo_Paraguay);
		
		JLabel Escudo_Peru = new JLabel("");
		Escudo_Peru.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Peru.png")));
		Escudo_Peru.setBounds(587, 29, 68, 79);
		f.add(Escudo_Peru);
		
		JLabel Escudo_Urugay = new JLabel("");
		Escudo_Urugay.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Uruguay.png")));
		Escudo_Urugay.setBounds(357, 29, 68, 79);
		f.add(Escudo_Urugay);
		
		JLabel Escudo_Venezuela = new JLabel("");
		Escudo_Venezuela.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Venezuela.png")));
		Escudo_Venezuela.setBounds(435, 29, 68, 79);
		f.add(Escudo_Venezuela);
		
		JButton btnGenerar = new JButton("Generar ");
		btnGenerar.setFont(new Font("Ravie", Font.PLAIN, 14));
		btnGenerar.setBounds(309, 420, 169, 50);
		f.add(btnGenerar);
		
		JLabel Seleccion_Arquero = new JLabel("");
		Seleccion_Arquero.setIcon(null);
		Seleccion_Arquero.setHorizontalAlignment(SwingConstants.LEFT);
		Seleccion_Arquero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		Seleccion_Arquero.setBounds(48, 244, 68, 79);
		f.add(Seleccion_Arquero);
		
		JLabel Nombre_Arquero = new JLabel("");
		Nombre_Arquero.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre_Arquero.setForeground(Color.BLACK);
		Nombre_Arquero.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		Nombre_Arquero.setBounds(10, 334, 141, 14);
		f.add(Nombre_Arquero);
		
		JLabel selecDef1 = new JLabel("");
		selecDef1.setHorizontalAlignment(SwingConstants.LEFT);
		selecDef1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecDef1.setBounds(189, 26, 68, 79);
		f.add(selecDef1);
		
		JLabel nombreDef1 = new JLabel("");
		nombreDef1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreDef1.setForeground(Color.BLACK);
		nombreDef1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreDef1.setBounds(151, 116, 141, 14);
		f.add(nombreDef1);
		
		JLabel selecDef2 = new JLabel("");
		selecDef2.setHorizontalAlignment(SwingConstants.LEFT);
		selecDef2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecDef2.setBounds(199, 146, 68, 79);
		f.add(selecDef2);
		
		JLabel nombreDef2 = new JLabel("");
		nombreDef2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreDef2.setForeground(Color.BLACK);
		nombreDef2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreDef2.setBounds(161, 236, 141, 14);
		f.add(nombreDef2);
		
		JLabel selecDef3 = new JLabel("");
		selecDef3.setHorizontalAlignment(SwingConstants.LEFT);
		selecDef3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecDef3.setBounds(199, 299, 68, 79);
		f.add(selecDef3);
		
		JLabel nombreDef3 = new JLabel("");
		nombreDef3.setHorizontalAlignment(SwingConstants.CENTER);
		nombreDef3.setForeground(Color.BLACK);
		nombreDef3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreDef3.setBounds(161, 389, 141, 14);
		f.add(nombreDef3);
		
		JLabel selecDef4 = new JLabel("");
		selecDef4.setHorizontalAlignment(SwingConstants.LEFT);
		selecDef4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecDef4.setBounds(199, 436, 68, 79);
		f.add(selecDef4);
		
		JLabel nombreDef4 = new JLabel("");
		nombreDef4.setHorizontalAlignment(SwingConstants.CENTER);
		nombreDef4.setForeground(Color.BLACK);
		nombreDef4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreDef4.setBounds(161, 526, 141, 14);
		f.add(nombreDef4);
		
		JLabel selecVol1 = new JLabel("");
		selecVol1.setHorizontalAlignment(SwingConstants.LEFT);
		selecVol1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecVol1.setBounds(362, 393, 68, 79);
		f.add(selecVol1);
		
		JLabel nombreVol1 = new JLabel("");
		nombreVol1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreVol1.setForeground(Color.BLACK);
		nombreVol1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreVol1.setBounds(324, 483, 141, 14);
		f.add(nombreVol1);
		
		JLabel selecVol2 = new JLabel("");
		selecVol2.setHorizontalAlignment(SwingConstants.LEFT);
		selecVol2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecVol2.setBounds(357, 240, 68, 79);
		f.add(selecVol2);
		
		JLabel nombreVol2 = new JLabel("");
		nombreVol2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreVol2.setForeground(Color.BLACK);
		nombreVol2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreVol2.setBounds(319, 330, 141, 14);
		f.add(nombreVol2);
		
		JLabel selecVol3 = new JLabel("");
		selecVol3.setHorizontalAlignment(SwingConstants.LEFT);
		selecVol3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecVol3.setBounds(357, 44, 68, 79);
		f.add(selecVol3);
		
		JLabel nombreVol3 = new JLabel("");
		nombreVol3.setHorizontalAlignment(SwingConstants.CENTER);
		nombreVol3.setForeground(Color.BLACK);
		nombreVol3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreVol3.setBounds(319, 134, 141, 14);
		f.add(nombreVol3);
		
		JLabel selecDel1 = new JLabel("");
		selecDel1.setHorizontalAlignment(SwingConstants.LEFT);
		selecDel1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecDel1.setBounds(552, 94, 68, 79);
		f.add(selecDel1);
		
		JLabel nombreDel1 = new JLabel("");
		nombreDel1.setHorizontalAlignment(SwingConstants.CENTER);
		nombreDel1.setForeground(Color.BLACK);
		nombreDel1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreDel1.setBounds(514, 184, 141, 14);
		f.add(nombreDel1);
		
		JLabel selecDel2 = new JLabel("");
		selecDel2.setHorizontalAlignment(SwingConstants.LEFT);
		selecDel2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecDel2.setBounds(641, 226, 68, 79);
		f.add(selecDel2);
		
		JLabel nombreDel2 = new JLabel("");
		nombreDel2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreDel2.setForeground(Color.BLACK);
		nombreDel2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreDel2.setBounds(603, 316, 141, 14);
		f.add(nombreDel2);
		
		JLabel selecDel3 = new JLabel("");
		selecDel3.setHorizontalAlignment(SwingConstants.LEFT);
		selecDel3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		selecDel3.setBounds(533, 384, 68, 79);
		f.add(selecDel3);
		
		JLabel nombreDel3 = new JLabel("");
		nombreDel3.setHorizontalAlignment(SwingConstants.CENTER);
		nombreDel3.setForeground(Color.BLACK);
		nombreDel3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		nombreDel3.setBounds(495, 474, 141, 14);
		f.add(nombreDel3);
		
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				maxBarraProgres = 0;
				tick.start();
				progressBar.setValue(0);
				progressBar.setStringPainted(true);
			}
		});
		
		progressBar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(progressBar.getValue()!=200){
				MovimientoDeFiguras mov=new MovimientoDeFiguras();
				label.setVisible(true);
				mov.moverEscudos(Escudo_Argentina,2,4);
				mov.moverEscudos(Escudo_Brazil,2,4);
				mov.moverEscudos(Escudo_Chile,2,4);
				mov.moverEscudos(Escudo_Urugay,2,4);
				mov.moverEscudos(Escudo_Bolivia,3,4);
				mov.moverEscudos(Escudo_Venezuela,3,4);
				mov.moverEscudos(Escudo_Mexico,3,2);
				mov.moverEscudos(Escudo_Colombia,3,3);
				mov.moverEscudos(Escudo_Peru,3,3);
				mov.moverEscudos(Escudo_Ecuador,2,3);
				mov.moverEscudos(Escudo_Jamaica,3,3);
				mov.moverEscudos(Escudo_Paraguay,3,3);
				EquipoIdeal equipo = new EquipoIdeal();
				equipo.crearEquipoIdealPorPuntos(equipo.jugadores.getListaDeJugadoresOrdenada());
				equipo.guardarEnTxt("EquipoIdeal.txt", equipo.jugadores.toString(equipo.equipoFinal));
				
				}else{
						EquipoIdeal equipo=new EquipoIdeal();
						equipo.crearEquipoIdealPorPuntos(equipo.jugadores.getListaDeJugadoresOrdenada());
						tick.stop();
						label.setVisible(false);
						equipo.mostrarJugador(0, Nombre_Arquero, Seleccion_Arquero,Amarilla,Roja);
						equipo.mostrarJugador(1, nombreDef1, selecDef1,AmarillaDef1,RojaDef1);
						equipo.mostrarJugador(2, nombreVol1, selecVol1,AmarillaVol1,RojaVol1);
						equipo.mostrarJugador(3, nombreDel1, selecDel1,AmarillaDel1,RojaDel1);
						equipo.mostrarJugador(4, nombreDef2, selecDef2,AmarillaDef2,RojaDef2);
						equipo.mostrarJugador(5, nombreVol2, selecVol2,AmarillaVol2,RojaVol2);
						equipo.mostrarJugador(6, nombreDel2, selecDel2,AmarillaDel2,RojaDel2);
						equipo.mostrarJugador(7, nombreDef3, selecDef3,AmarillaDef3,RojaDef3);
						equipo.mostrarJugador(8, nombreVol3, selecVol3,AmarillaVol3,RojaVol3);
						equipo.mostrarJugador(9, nombreDel3, selecDel3,AmarillaDel3,RojaDel3);
						equipo.mostrarJugador(10, nombreDef4, selecDef4,AmarillaDef4,RojaDef4);
						btnGenerar.setVisible(false);
						progressBar.setVisible(false);
						
				}
			}
		});
		
	}
};
