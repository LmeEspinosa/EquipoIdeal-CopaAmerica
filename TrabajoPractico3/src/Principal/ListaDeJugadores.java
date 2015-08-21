package Principal;

import java.util.ArrayList;

public class ListaDeJugadores {
	private ArrayList<Jugador> listaDeJugadores;
	private ArrayList<Jugador> listaDeJugadoresOrdenada;
	
	ListaDeJugadores(){
		listaDeJugadores = new ArrayList<Jugador>();
		listaDeJugadoresOrdenada = new ArrayList<Jugador>();
		crearListaDeJugadores();
		tarjetasAlAzar(listaDeJugadores);
		puntajesAlAzar(listaDeJugadores);
		ordenarListaPorPuntos();
	}
	
	public ArrayList<Jugador> getListaDeJugadoresOrdenada() {
		return listaDeJugadoresOrdenada;
	}

	public ArrayList<Jugador> getListaDeJugadores() {
		return listaDeJugadores;
	}

	void crearListaDeJugadores(){
		listaDeJugadores.add(new Jugador("Sergio Romero","Argentina","arquero",7.9,true,false));
		listaDeJugadores.add(new Jugador("Mariano Andujar","Argentina","arquero",7.9,false,false));
		listaDeJugadores.add(new Jugador("Nahuel Guzman","Argentina","arquero",7.9,false,false));
		listaDeJugadores.add(new Jugador("Milton Casco","Argentina","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Martin Demichelis","Argentina","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Ezequiel Garay","Argentina","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Nicolas Otamendi","Argentina","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Marcos Rojo","Argentina","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Facundo Roncaglia","Argentina","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Pablo Zabaleta","Argentina","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Ever Banega","Argentina","volante",7.9,false,false));
		listaDeJugadores.add(new Jugador("Lucas Biglia","Argentina","volante",7.9,false,false));
		listaDeJugadores.add(new Jugador("Angel Di Maria","Argentina","volante",7.9,false,false));
		listaDeJugadores.add(new Jugador("Fernando Gago","Argentina","volante",7.9,false,false));
		listaDeJugadores.add(new Jugador("Javier Mascherano","Argentina","volante",7.9,false,false));
		listaDeJugadores.add(new Jugador("Javier Pastore","Argentina","volante",7.9,false,false));
		listaDeJugadores.add(new Jugador("Roberto Pereyra","Argentina","volante",7.9,false,false));
		listaDeJugadores.add(new Jugador("Sergio Aguero","Argentina","delantero",0,false,false));
		listaDeJugadores.add(new Jugador("Gonzalo Higuain","Argentina","delantero",8,false,false));
		listaDeJugadores.add(new Jugador("Erik Lamela","Argentina","delantero",8,false,false));
		listaDeJugadores.add(new Jugador("Ezequiel Lavezzi","Argentina","delantero",8,false,false));
		listaDeJugadores.add(new Jugador("Lionel Messi","Argentina","delantero",8,false,false));
		listaDeJugadores.add(new Jugador("Carlos Tevez","Argentina","delantero",8,false,false));
		
		listaDeJugadores.add(new Jugador("Alfredo Aguilar","Paraguay","arquero",7.9,false,true));
		listaDeJugadores.add(new Jugador("Antony Silva","Paraguay","arquero",7.9,false,false));
		listaDeJugadores.add(new Jugador("Justo Villar","Paraguay","arquero",7.9,false,true));
		listaDeJugadores.add(new Jugador("Pablo Aguilar","Paraguay","defensor",7.9,false,false));
		listaDeJugadores.add(new Jugador("Eduardo Aranda","Paraguay","defensor",8,false,true));
		listaDeJugadores.add(new Jugador("Fabian Balbuena","Paraguay","defensor",9,false,false));
		listaDeJugadores.add(new Jugador("Marcos Caceres","Paraguay","defensor",9,false,false));
		listaDeJugadores.add(new Jugador("Paulo Da Silva","Paraguay","defensor",9,false,false));
		listaDeJugadores.add(new Jugador("Ivan Piris","Paraguay","defensor",9,false,false));
		listaDeJugadores.add(new Jugador("Bruno Valdez","Paraguay","defensor",9,false,false));
		listaDeJugadores.add(new Jugador("Victor Caceres","Paraguay","volante",9,false,false));
		listaDeJugadores.add(new Jugador("Osvaldo Martinez","Paraguay","volante",9,false,false));
		listaDeJugadores.add(new Jugador("Osmar Molinas","Paraguay","volante",9,false,false));
		listaDeJugadores.add(new Jugador("Nestor Ortigoza","Paraguay","volante",9,false,false));
		listaDeJugadores.add(new Jugador("Richard Ortiz","Paraguay","volante",9,false,false));
		listaDeJugadores.add(new Jugador("Miguel Samudio","Paraguay","volante",9,false,false));
		listaDeJugadores.add(new Jugador("Lucas Barrios","Paraguay","delantero",9,false,false));
		listaDeJugadores.add(new Jugador("Edgar Benitez","Paraguay","delantero",9,false,false));
		listaDeJugadores.add(new Jugador("Raul Bobadilla","Paraguay","delantero",9,false,false));
		listaDeJugadores.add(new Jugador("Derlis Gonzales","Paraguay","delantero",9,false,false));
		listaDeJugadores.add(new Jugador("Oscar Romero","Paraguay","delantero",9,false,false));
		listaDeJugadores.add(new Jugador("Roque Santa Cruz","Paraguay","delantero",9,false,false));

		listaDeJugadores.add(new Jugador("Jefferson","Brasil","arquero",9,false,false));//6,false,true));
		listaDeJugadores.add(new Jugador("Marcelo Grohe","Brasil","arquero",10,false,true));
		listaDeJugadores.add(new Jugador("Neto","Brasil","arquero",9,false,true));//10,false,true));
		listaDeJugadores.add(new Jugador("Danilo","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("David Luiz","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("Fabinho","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("Felipe Luis","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("Geferson","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("Marquinhos","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("Miranda","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("Thiago Silva","Brasil","defensor",10,false,true));
		listaDeJugadores.add(new Jugador("Daniel Alves","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Casemiro","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Philippe Coutinho","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Douglas Costa","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Elias","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Everton Ribeiro","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Fernandinho","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Roberto Firmino","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Fred","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("William","Brasil","volante",10,false,true));
		listaDeJugadores.add(new Jugador("Neymar","Brasil","delantero",10,false,true));
		listaDeJugadores.add(new Jugador("Robhino","Brasil","delantero",10,false,true));
		listaDeJugadores.add(new Jugador("Diego Tardelli","Brasil","delantero",10,false,true));

		listaDeJugadores.add(new Jugador("Jose Penarrieta","Bolivia","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Romel Quiñonez","Bolivia","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Hugo Suarez","Bolivia","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Martin Bejarano","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Cristian Coimbra","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Ronald Eguino","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Miguel Angel Hurtado","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Leonel Morales","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Ronald Raldes","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Edemir Rodriguez","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Edward Zenteno","Bolivia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Danny Bejarano","Bolivia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jhasmani Campos","Bolivia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Pablo Escobar","Bolivia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Sebastian Gamarra","Bolivia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Damir Miranda","Bolivia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Walter Veizaga","Bolivia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Alejandro Chumacero","Bolivia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Damian Lizio","Bolivia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Marcelo Moreno","Bolivia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Ricardo Pedriel","Bolivia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Alcides Peña","Bolivia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Martin Smedberg-dalence","Bolivia","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Claudio Bravo","Chile","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Paulo Garces","Chile","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Johnny Herrera","Chile","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Mauricio Isla","Chile","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Gonzalo Jara","Chile","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Gary Medel","Chile","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Eugenio Mena","Chile","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Jose Manuel Rojas","Chile","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Arturo Vidal","Chile","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Miko Albornoz","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Charles Aranguiz","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jean Beausejour","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Marcelo Diaz","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Matias Fernandez","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jose Pedro Fuenzalida","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Felipe Guitierrez","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("David Pizarro","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Francisco Silva","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jorge Valdivia","Chile","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Angelo Henriquez","Chile","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Mauricio Pinilla","Chile","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Alexis Sanchez","Chile","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Eduardo Vargas","Chile","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Cristian Bonilla","Colombia","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("David Ospina","Colombia","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Camilo Vargas","Colombia","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Darwin Andrade","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Santiago Arias","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Pablo Armero","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Pedro Franco","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Jeison Murillo","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Valdes","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Cristian Zapata","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Zuñiga","Colombia","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Edwin Cardona","Colombia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Cuadrado","Colombia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Alexander Mejia","Colombia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("James Rodriguez","Colombia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Sanchez","Colombia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Edwin Valencia","Colombia","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Bacca","Colombia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Radamel Falcao","Colombia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Teofilo Gutierrez","Colombia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Victor Ibarro","Colombia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Jackson Martinez","Colombia","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Luis Muriel","Colombia","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Librado Azcona","Ecuador","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Alexander Dominguez","Ecuador","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Esteban Dreer","Ecuador","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Gabriel Achilier","Ecuador","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Oscar Bagui","Ecuador","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Frickson Erazo","Ecuador","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("John Narvaez","Ecuador","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Mario Pineida","Ecuador","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Walter Ayovi","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Cazares","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jonathan Gonzales","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Pedro Larrea","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Osbaldo Lastra","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Arturo Mina","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jefferson Montero","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Christian Noboa","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Pedro Quiñonez","Ecuador","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Daniel Angulo","Ecuador","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Miller Bolaños","Ecuador","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Renato Ibarra","Ecuador","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Fidel Martinez","Ecuador","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Paredes","Ecuador","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Enner Valencia","Ecuador","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Duwayne Kerr","Jamaica","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Dwayne Miller","Jamaica","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Ryan Thompson","Jamaica","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Michael Hector","Jamaica","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Lance Laing","Jamaica","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Kemar Lawrence","Jamaica","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Adrian Mariappa","Jamaica","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Wes Morgan","Jamaica","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Jermaine Taylor","Jamaica","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Rodolph Austin","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Daniel Gordon","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Joel Grant","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Hughan Gray","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Renae LLoyd","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Joel Mcanuff","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Allan Ottey","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Romeo Parkes","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Je-vaughn Watson","Jamaica","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Giles Barnes","Jamaica","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Deshorn Brown","Jamaica","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Simon Dawkins","Jamaica","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Darren Mattocks","Jamaica","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Garath Mccleary","Jamaica","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Jose De Jesus Corona","Mexico","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Edgar Hernandez","Mexico","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Alfredo Talavera","Mexico","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Adrian Aldrete","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Hugo Ayala","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Yasser Corona","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("George Corral","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Cesar Dominguez","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Jerry Flores","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Rafael Marquez","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Salcedo","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Efrain Velarde","Mexico","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Javier Aquino","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Marco Fabian","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Erick Gutierrez","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Javier Guemez","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Hirving lozano","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Carlos medina","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jesus Molina","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Luis Montes","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Mario Osuna","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Orbelin Pineda","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Carlos Valenzuela","Mexico","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jesus Corona","Mexico","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Enrique Esqueda","Mexico","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Eduardo Herrera","Mexico","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Raul Jimenez","Mexico","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Matias Vuoso","Mexico","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Pedro Gallese","Peru","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Salomon Libman","Peru","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Diego Penny","Peru","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Luis Advincula","Peru","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Ascues","Peru","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Christian Ramos","Peru","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Pedro Requema","Peru","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Hansell Riojas","Peru","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Vargas","Peru","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Zambrano","Peru","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Josepmir Ballon","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Andre Carrillo","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Christian Cueva","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jair Cespedes Zegarra","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Paolo Hurtado","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Lobaton","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Edwin Retamoso","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Yordy Reyna","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Joel Sanchez","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Yoshimar Yotun","Peru","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Jefferson Farfan","Peru","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Paolo Guerrero","Peru","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Claudio Pizarro","Peru","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Fernando Muslera","Uruguay","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Rodrigo Muñoz","Uruguay","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Martin Silva","Uruguay","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Sebastian Coates","Uruguay","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Jorge Fucile","Uruguay","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Jose Gimenez","Uruguay","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Diego Godin","Uruguay","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Maxi Pereira","Uruguay","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Gaston Silva","Uruguay","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Egidio Arevalo Rios","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Matias Corujo","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Alvaro Gonzalez","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Nicolas Lodeiro","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Guzman Pereira","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Alvaro Pereira","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Cristian Rodriguez","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Carlos Sanchez","Uruguay","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Edinson Cavani","Uruguay","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Giogian De Arrascaeta","Uruguay","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Abel Hernandez","Uruguay","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Jonathan Rodriguez","Uruguay","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Diego Rolan","Uruguay","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Christian Stuani","Uruguay","delantero",6,false,false));

		listaDeJugadores.add(new Jugador("Alain Baroja","Venezuela","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Wuilker Fariñez","Venezuela","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Dani Hernandez","Venezuela","arquero",6,false,false));
		listaDeJugadores.add(new Jugador("Fernando Amorebieta","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Gabriel Cichero","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Franklin Lucena","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("John Murillo","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Grenddy Perozo","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Roberto Rosales","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Andres Tuñez","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Oswaldo Vizcarrondo","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Wilker Angel","Venezuela","defensor",6,false,false));
		listaDeJugadores.add(new Jugador("Rafael Acosta","Venezuela","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Cesar Gonzalez","Venezuela","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Alejandro Guerra","Venezuela","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Tomas Rincon","Venezuela","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Luis Manuel Seijas","Venezuela","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Ronald Vargas","Venezuela","volante",6,false,false));
		listaDeJugadores.add(new Jugador("Juan Arango","Venezuela","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Nicolas Fedor","Venezuela","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Josef Martinez","Venezuela","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Gelmin Rivas","Venezuela","delantero",6,false,false));
		listaDeJugadores.add(new Jugador("Jose Rondon","Venezuela","delantero",6,false,false));
	}

	void ordenarListaPorPuntos(){
		int indice = listaDeJugadores.size();
		while(listaDeJugadoresOrdenada.size()<indice){
			int jugadorAAgregar=0;
			double max=0;
			for(int i=0; i<listaDeJugadores.size(); i++){
				if(listaDeJugadores.get(i)!=null){
					if(max==0){
					max=listaDeJugadores.get(i).getPuntos();
					jugadorAAgregar=i;
					}
				if(listaDeJugadores.get(i).mejorJugadorQue(listaDeJugadores.get(jugadorAAgregar))){
					max=listaDeJugadores.get(i).getPuntos();
					jugadorAAgregar=i;
					}
				}
			}
			listaDeJugadoresOrdenada.add(listaDeJugadores.get(jugadorAAgregar));
			listaDeJugadores.set(jugadorAAgregar, null);
		}
	}
	
	public void setListaDeJugadores(ArrayList<Jugador> listaDeJugadores) {
		this.listaDeJugadores = listaDeJugadores;
	}
	
	private void pAlAzar(ArrayList<Jugador> arrayList){
		for(Jugador j:listaDeJugadores){
			double random=0;
			random=(double) (Math.random()*11);
			j.setPuntos(random);
		}
	}
	public void puntajesAlAzar(ArrayList<Jugador> arrayList){
		pAlAzar(arrayList);
	}
	
	public void tarjetasAlAzar(ArrayList<Jugador> arrayList){
		tAlAzar(arrayList);
	}
	
	private void tAlAzar(ArrayList<Jugador> arrayList){
		for(Jugador j:listaDeJugadores){
		int	amarilla=0;
		int roja=0;
			amarilla=(int) (Math.random()*2);
			roja=(int) (Math.random()*2);
			if(amarilla==1){j.setAmarilla(true);}
			else{j.setAmarilla(false);}
			if(roja==1){j.setRoja(true);}
			else{j.setRoja(false);}
			}
		}
	

    public String toString( ArrayList<Jugador> lista) {
		String ret = "";
		for(int i=0;i<lista.size();i++){
			ret= ret + lista.get(i).toString() + "\n";
		}
		return ret;
	}
}
