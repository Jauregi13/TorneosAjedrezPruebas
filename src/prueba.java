import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) {
		
		ArrayList<Equipo> equipos = new ArrayList();
		
		Equipo equipo1 = new Equipo();
		
		ArrayList<Jugador> jugadores_equipo1 = new ArrayList();
		
		equipo1.setNombre_equipo("Gros Xake Taldea");
		
		equipo1.setJugadores(jugadores_equipo1);
		
		Jugador jugador1 = new Jugador("Jon", "jauregi", 1713);
		
		equipo1.getJugadores().add(jugador1);
		
		equipos.add(equipo1);
				
		Equipo equipo2 = new Equipo();
		
		ArrayList<Jugador> jugadores_equipo2 = new ArrayList();
				
		equipo2.setJugadores(jugadores_equipo2);
		
		Jugador jugador2 = new Jugador("Elvis", "Hernandez", 2300);
		
		equipo2.setNombre_equipo("Easo");
		
		equipo2.getJugadores().add(jugador2);
		
		equipos.add(equipo2);
		
		equipo1.mostrar();
		
		equipo2.mostrar();
		
	}

}
