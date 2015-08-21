package Principal;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.JLabel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EquipoIdealTest {
	private EquipoIdeal equipoIdeal = new EquipoIdeal();
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testControlarParametrosPais() {
		jugadores.add(new Jugador("Sergio Romero","Argentina","arquero",7.9,true,false));
		jugadores.add(new Jugador("Mariano Andujar","Argentina","arquero",7.9,false,false));
		jugadores.add(new Jugador("Nahuel Guzman","Argentina","arquero",7.9,false,false));
		equipoIdeal.agregarJugador(jugadores,0);
		equipoIdeal.agregarJugador(jugadores,1);
		equipoIdeal.agregarJugador(jugadores,2);
		assertTrue(equipoIdeal.controlarParametros(jugadores,2));
		jugadores.add(new Jugador("Sergio Romero2","Argentina","arquero",7.9,true,false));
		jugadores.add(new Jugador("Mariano Andujar2","Argentina","arquero",7.9,false,false));
		equipoIdeal.agregarJugador(jugadores,3);
		equipoIdeal.agregarJugador(jugadores,4);
		assertFalse(equipoIdeal.controlarParametros(jugadores, 2));
	}

	@Test
	public void testControlarParametrosRojas() {
		jugadores.add(new Jugador("Sergio Romero","Argentina","arquero",7.9,true,true));
		jugadores.add(new Jugador("Mariano Andujar","Argentina","arquero",7.9,false,true));
		jugadores.add(new Jugador("Nahuel Guzman","Argentina","arquero",7.9,false,false));
		equipoIdeal.agregarJugador(jugadores,0);
		assertFalse(equipoIdeal.controlarParametros(jugadores, 1));
		assertTrue(equipoIdeal.controlarParametros(jugadores, 2));
		equipoIdeal.agregarJugador(jugadores,2);
	}
	
	@Test
	public void testControlarParametrosAmarillas() {
		jugadores.add(new Jugador("Sergio Romero","Argentina","arquero",7.9,true,false));
		jugadores.add(new Jugador("Mariano Andujar","Argentina","arquero",7.9,true,false));
		jugadores.add(new Jugador("Nahuel Guzman","Argentina","arquero",7.9,true,false));
		equipoIdeal.agregarJugador(jugadores,0);
		equipoIdeal.agregarJugador(jugadores,1);
		assertTrue(equipoIdeal.controlarParametros(jugadores, 2));
		equipoIdeal.agregarJugador(jugadores,2);
		assertFalse(equipoIdeal.controlarParametros(jugadores, 2));
		
	}
	
	@Test
	public void testAgregarJugador() {
		jugadores.add(new Jugador("Sergio Romero","Argentina","arquero",7.9,true,false));
		jugadores.add(new Jugador("Mariano Andujar","Argentina","arquero",7.9,false,false));
		jugadores.add(new Jugador("Nahuel Guzman","Argentina","arquero",7.9,false,false));
		equipoIdeal.agregarJugador(jugadores,1);
	}
	
	@Test
	public void testBorrarJugador() {
		jugadores.add(new Jugador("Sergio Romero","Argentina","arquero",7.9,true,false));
		jugadores.add(new Jugador("Mariano Andujar","Argentina","arquero",7.9,false,false));
		jugadores.add(new Jugador("Nahuel Guzman","Argentina","arquero",7.9,false,false));
		equipoIdeal.agregarJugador(jugadores,0);
		equipoIdeal.agregarJugador(jugadores,1);
		equipoIdeal.eliminarJugador(jugadores,1);
	}
	
	@Test
	public void testCrearEquipoIdealPorPuntos() {
		jugadores.add(new Jugador("Sergio Romero","Argentina","arquero",7.9,true,false));
		jugadores.add(new Jugador("Marcos Rojo","Argentina","defensor",7.9,false,false));
		jugadores.add(new Jugador("Facundo Roncaglia","Argentina","defensor",7.9,false,false));
		jugadores.add(new Jugador("Martin Demichelis","Argentina","defensor",7.9,false,false));
		jugadores.add(new Jugador("David Luis","Brasil","defensor",7.9,false,false));
		jugadores.add(new Jugador("Paulinho","Brasil","volante",8,false,false));
		jugadores.add(new Jugador("Nestor Ortigoza","Paraguay","volante",9,false,false));
		jugadores.add(new Jugador("Angel Di Maria","Argentina","volante",10,false,true));
		jugadores.add(new Jugador("Fernando Gago","Argentina","volante",10,false,true));
		jugadores.add(new Jugador("Richard Ortiz","Paraguay","volante",9,false,false));
		jugadores.add(new Jugador("Lucas Barrios","Paraguay","delantero",9,false,false));
		jugadores.add(new Jugador("Edgar Benitez","Paraguay","delantero",9,false,false));
		jugadores.add(new Jugador("Raul Bobadilla","Paraguay","delantero",9,false,false));
		equipoIdeal.crearEquipoIdealPorPuntos(jugadores);
	}
	
	@Test
	public void testMoJu(){
		equipoIdeal.equipoFinal.add(new Jugador("Ezequiel Garay","Argentina","defensor",7.9,false,false));
		JLabel nombre = new JLabel("Ezequiel Garay");
		JLabel seleccion = new JLabel("Argentina");
		JLabel amarilla=new JLabel("true");
		JLabel roja=new JLabel("false");
		equipoIdeal.mostrarJugador(0, nombre ,seleccion,amarilla,roja);
	}
}
