import java.util.ArrayList;
import java.util.Iterator;

public class Equipo implements mostrador{
	
	private String nombre_equipo;
	private Jugador capitan;
	private ArrayList<Jugador> jugadores;
	

	
	
	
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
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
	
	public void mostrar() {
		EloComparator comparador = new EloComparator();
		jugadores.sort(comparador);
		System.out.println(this.nombre_equipo);
		
		Iterator<Jugador> i = jugadores.iterator();
		
		while (i.hasNext()){
			Jugador jugador1 = i.next();
			
			System.out.println("\t" +jugador1.getNombre() + " " + jugador1.getApellidos() + " ("
					+ jugador1.getElo() + ")");
		}
		
	}
	
	public String getInfo(){
		
		return this.nombre_equipo;

	}
	
	public Jugador mayorElo(String nombre) {
		Jugador jugMaxElo = getJugadores().get(0);
			ArrayList<Jugador> jugadores = getJugadores();
			Iterator iterador = jugadores.iterator();
			while (iterador.hasNext()) {
				Jugador jugador = (Jugador) iterador.next();
				if (jugador.getElo() > jugMaxElo.getElo()) {
					jugMaxElo = jugador;
				}
			}
		return jugMaxElo;
	}
	
	

}
