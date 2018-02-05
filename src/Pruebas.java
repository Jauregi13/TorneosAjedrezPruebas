
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import Excepciones.EloNegativo;
import Excepciones.Excepcion;

public class Pruebas {
	public static void main(String[] args){
		
		
	}
	
	@Test
	public void testMayorElo() {
		Equipo gros = new Equipo();
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
		jugador3.setElo(1700);
		
		jugadores.add(jugador3);
		try {
			int elo_esperado = 1800;
			assertEquals(gros.mayorElo(),elo_esperado);
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}	
	}
	
	@Test
	public void testMediaElo(){
		Equipo gros = new Equipo();
		//crear la lista de jugadores y añadirla al equipo creado
		ArrayList<Jugador> jugadores = new ArrayList();
		gros.setJugadores(jugadores);
		
		//Crear los objetos jugador1, jugador2 y jugador3 y añadir a la lista de jugadores
		Jugador jugador1 = new Jugador();
		jugador1.setNombre("Jon");
		jugador1.setApellidos("Jauregi");
		jugador1.setElo(2000);
		
		jugadores.add(jugador1);
		
		Jugador jugador2 = new Jugador();
		jugador2.setNombre("Ivan");
		jugador2.setApellidos("Iturralde");
		jugador2.setElo(2100);
		
		jugadores.add(jugador2);
		
		Jugador jugador3 = new Jugador();
		jugador3.setNombre("Josu");
		jugador3.setApellidos("Manterola");
		jugador3.setElo(2050);
		
		jugadores.add(jugador3);
		
		try {
			try {
				gros.mediaElo();
			} catch (EloNegativo e) {
				// SALTARA LA EXCEPCION CUANDO ALGUN VALOR DEL ELO SEA NEGATIVO
				System.out.println(e.getMessage());;
			}
		} catch (Excepcion e) {
			// SALTARA LA EXCEPCION CUANDO LA MEDIA SEA MAYOR DE 2000
			System.out.println(e.getMessage());
		}
	}

}
