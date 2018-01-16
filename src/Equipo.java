
public class Equipo {
	
	private String nombre_equipo;
	private Jugador equipo_local;
	private Jugador equipo_visitante;
	private Jugador capitan;
	private Jugador[] jugadores;

	
	
	
	public Jugador getEquipo_local() {
		return equipo_local;
	}
	public void setEquipo_local(Jugador equipo_local) {
		this.equipo_local = equipo_local;
	}
	public Jugador getEquipo_visitante() {
		return equipo_visitante;
	}
	public void setEquipo_visitante(Jugador equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}
	public Jugador[] getJugadores() {
		return jugadores;
	}
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	public String getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}
	public Jugador getCapitan() {
		return capitan;
	}
	public void setCapitan(Jugador capitan) {
		capitan = capitan;
	}
	
	

}
