import java.util.ArrayList;
import java.util.Iterator;

import Excepciones.EloNegativo;
import Excepciones.Excepcion;

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
	
	public int mayorElo() throws NullPointerException {
			Jugador jugMaxElo = getJugadores().get(0);
			ArrayList<Jugador> jugadores = getJugadores();
			Iterator<Jugador> iterador = jugadores.iterator();
			while (iterador.hasNext()) {
				Jugador jugador = iterador.next();
				if(jugador.getElo() == 0){
					throw new NullPointerException("El elo tiene que tener un valor");
				}
				if (jugador.getElo() > jugMaxElo.getElo()) {
					jugMaxElo = jugador;
				}
			}
		return jugMaxElo.getElo();
		}
	
	public double mediaElo() throws Excepcion, EloNegativo{
		Iterator<Jugador> i = this.jugadores.iterator();
		double media_elo = 0;
		int suma_elo = 0;
		while(i.hasNext()){
			Jugador jugador = i.next();
			if(jugador.getElo() < 0){
				throw new EloNegativo("El elo nunca puede ser negativo");
			}
			suma_elo = suma_elo + jugador.getElo();
		}
		media_elo = (double)suma_elo / this.jugadores.size();
		
		if(media_elo > 2000){
			throw new Excepcion("La media del elo es superior a la esperada");
		}
		return media_elo;
	}
	

}
