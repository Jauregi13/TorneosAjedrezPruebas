
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class Pruebas {
	Scanner lector = new Scanner(System.in);
	@Test
	public void testMayorElo() {
		try{
			// Crear el objeto de equipo añadiendole el nombre
			System.out.println("Escribe el nombre del equipo:");
			
			Equipo gros = new Equipo();
			gros.setNombre_equipo("Gros Xake Taldea");
			
			//crear la lista de jugadores y añadirla al equipo creado
			ArrayList<Jugador> jugadores = new ArrayList();
			gros.setJugadores(jugadores);
			
			//Crear los objetos jugador1, jugador2 y jugador3 y añadir a la lista de jugadores
			Jugador jugador1 = new Jugador();
			jugador1.setNombre("Jon");
			jugador1.setApellidos("Jauregi");
			jugador1.setElo(1800);
			
			jugadores.add(jugador1);
			
			Jugador jugador2 = new Jugador();
			jugador2.setNombre("Ivan");
			jugador2.setApellidos("Iturralde");
			jugador2.setElo(1750);
			
			jugadores.add(jugador2);
			
			Jugador jugador3 = new Jugador();
			jugador3.setNombre("Josu");
			jugador3.setApellidos("Manterola");
			jugador3.setElo(1850);
			
			jugadores.add(jugador3);
			
			gros.mayorElo();
		}
		catch(NullPointerException e){
			fail("Excepción no esperada");
			
		}
		
	}

}
