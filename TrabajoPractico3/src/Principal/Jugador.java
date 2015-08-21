package Principal;

public class Jugador {
	private String nombre;
	private String seleccion;
	private String posicion;
	private double puntos;
	private boolean amarilla;
	private boolean roja;

	Jugador(String nombre, String seleccion, String posicion, double puntos,
			boolean amarilla, boolean roja) {
		this.nombre = nombre;
		this.seleccion = seleccion;
		this.posicion = posicion;
		this.puntos = puntos;
		this.amarilla = amarilla;
		this.roja = roja;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getSeleccion() {
		return seleccion;
	}
	public String getPosicion() {
		return posicion;
	}
	public double getPuntos() {
		return puntos;
	}
	public boolean isAmarilla() {
		return amarilla;
	}
	public boolean isRoja() {
		return roja;
	}

	public boolean mejorJugadorQue(Jugador jugador2){
		if(this.puntos>jugador2.puntos || this.puntos==jugador2.puntos && (this.amarilla==jugador2.amarilla || this.amarilla==false) && (this.roja==jugador2.roja || this.roja==false))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		String ret = "";
		for(int i=0;i<5;i++){
			ret= "[" + this.nombre + ", " + this.seleccion + ", " + this.posicion + ", " + this.puntos + ", " + this.amarilla + ", " + this.roja + "]";
		}
		return ret;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	public void setAmarilla(boolean amarilla) {
		this.amarilla = amarilla;
	}

	public void setRoja(boolean roja) {
		this.roja = roja;
	}
}
