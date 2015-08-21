package Fondo;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoVentanaEquipoIdeal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FondoVentanaEquipoIdeal(){
		this.setSize(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		Dimension tamaño=getSize();
		ImageIcon FondoInterface=new ImageIcon(getClass().getResource("/Imagenes/FondoInterface.jpg"));
		g.drawImage(FondoInterface.getImage(),0,0,tamaño.width,tamaño.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
	

	
	
	
};


