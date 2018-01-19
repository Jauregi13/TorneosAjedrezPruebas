import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) {
		
		ArrayList<Equipo> equipos = new ArrayList();
		
		ArrayList<Jugador> jugadores = new ArrayList();
		
		Equipo equipo1 = new Equipo();
		
		equipo1.setNombre_equipo("Gros Xake Taldea");
		
		equipos.add(equipo1);
		
		equipo1.setJugadores(jugadores);
		
		Jugador jugador1 = new Jugador("Jon", "jauregi", 1713);
		
		equipo1.getJugadores().add(jugador1);
		
		Equipo equipo2 = new Equipo();
		
		equipos.add(equipo2);
		
		equipo2.setJugadores(jugadores);
		
		Jugador jugador2 = new Jugador("Elvis", "Hernandez", 2300);
		
		equipo2.setNombre_equipo("Easo");
		
		equipo2.getJugadores().add(jugador2);
		
		equipo1.mostrar();

	}

}
