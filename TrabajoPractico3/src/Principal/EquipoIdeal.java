package Principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EquipoIdeal {
	protected ListaDeJugadores jugadores;
	protected ArrayList<Jugador> equipoFinal;
	
	EquipoIdeal(){
		jugadores= new ListaDeJugadores();
		equipoFinal= new ArrayList<Jugador>();
	}
	
	public boolean excedeAmarillas(){
		int amarillas=0;
		for(int i=0;i<equipoFinal.size();i++){
			if(equipoFinal.get(i).isAmarilla())
				amarillas++;
		}
		if(amarillas>=3)
			return false;
		return true;
	}
	
	public boolean excedeRojas(){
		int rojas=0;
		for(int i=0;i<equipoFinal.size();i++){
			if(equipoFinal.get(i).isRoja())
				rojas++;
		}
		if(rojas>=1)
			return false;
		return true;
	}
	
	public boolean excedePais(Jugador jugador ){// controla que no haya 5 jugadores del mismo pais
		int cont=0;
		for(int i=0;i<equipoFinal.size();i++){
			if(jugador.getSeleccion().equals(equipoFinal.get(i).getSeleccion()))
				cont++;
		}
		if(cont>=5)
			return true;
		return false;
	}
	
	public boolean controlarParametros(ArrayList<Jugador> jugadores, int indiceDeJugador){
		if(!excedePais(jugadores.get(indiceDeJugador))){
			if((excedeRojas() || !excedeRojas() && !jugadores.get(indiceDeJugador).isRoja()) && 
					(excedeAmarillas() || !excedeAmarillas() && !jugadores.get(indiceDeJugador).isAmarilla())){
				return true;
			}
		}
		return false;
	}
	
	void agregarJugador(ArrayList<Jugador> jugadores, int indiceDeJugador){
		equipoFinal.add(jugadores.get(indiceDeJugador));
	}
	
	void eliminarJugador(ArrayList<Jugador> jugadores, int indiceDeJugador){
		jugadores.remove(indiceDeJugador);
	}
	
	void crearEquipoIdealPorPuntos(ArrayList<Jugador> jugadores){
		int posicionJugador = 0;
		while (equipoFinal.size()<11){
			if (posicionJugador == 4)
				posicionJugador = 1;
			for(int i=0;i<jugadores.size();i++){
				if(jugadores.get(i)!=null){
					if (posicionJugador == 0 && jugadores.get(i).getPosicion().equals("arquero")) {
						if(controlarParametros(jugadores, i)){
								agregarJugador(jugadores,i);
								eliminarJugador(jugadores,i);
								posicionJugador++;
								break;
					}
				}
					if (posicionJugador == 1 && jugadores.get(i).getPosicion().equals("defensor")) {
						if(controlarParametros(jugadores, i)){
							agregarJugador(jugadores,i);
							eliminarJugador(jugadores,i);
							posicionJugador++;
							break;
						}
				}
					if (posicionJugador == 2 && jugadores.get(i).getPosicion().equals("volante")) {
						if(controlarParametros(jugadores, i)){
							agregarJugador(jugadores,i);
							eliminarJugador(jugadores,i);
							posicionJugador++;
							break;
						}
				}
					if (posicionJugador == 3 && jugadores.get(i).getPosicion().equals("delantero")) {
						if(controlarParametros(jugadores, i)){
							agregarJugador(jugadores,i);
							eliminarJugador(jugadores,i);
							posicionJugador++;
							break;
						}
					}
				}
			}
		}
	}
	public void guardarEnTxt(String archivoConExtension ,String contenido){
		gEnTxt(archivoConExtension,contenido);
	}
	
	private void gEnTxt(String archivoConExtension ,String contenido){
		File f;
		FileWriter archivoEscritor;
		try{
			f=new File(archivoConExtension);
			archivoEscritor= new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(archivoEscritor);
			PrintWriter salida = new PrintWriter(bw);
			salida.write(contenido);
			salida.close();
			bw.close();
		}catch(IOException e){
	        System.out.println("Error:"+e.getMessage());
		}
	}
	public void mostrarJugador(int indice,JLabel nombre, JLabel seleccion,JLabel amarilla,JLabel roja){
		moJu(indice,nombre,seleccion,amarilla,roja);
	}
	
	private void moJu(int indice,JLabel nombre, JLabel seleccion,JLabel amarilla,JLabel roja){
		nombre.setText(equipoFinal.get(indice).getNombre());
		if(equipoFinal.get(indice).isAmarilla()){amarilla.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/amarilla.png")));}
		if(equipoFinal.get(indice).isRoja()){roja.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/roja.png")));}
		if(equipoFinal.get(indice).getSeleccion()==("Argentina")){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Argentina.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Bolivia"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Bolivia.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Paraguay"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Paraguay.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Uruguay"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Uruguay.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Brasil"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource(("/Imagenes/Escudo Brazil.png"))));
		}else if(equipoFinal.get(indice).getSeleccion()=="Chile"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Chile.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Colombia"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Colombia.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Ecuador"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Ecuador.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Peru"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Peru.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Venezuela"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo venezuela.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Jamaica"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Jamaica.png")));
		}else if(equipoFinal.get(indice).getSeleccion()=="Mexico"){
			seleccion.setIcon(new ImageIcon(Ventana_Equipo_Ideal.class.getResource("/Imagenes/Escudo Mexico.png")));
		}
	}
	
	
};
