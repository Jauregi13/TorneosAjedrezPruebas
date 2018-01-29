import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainAjedrez {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner lector = new Scanner(System.in);
		File fichero = new File("C:/Users/Jon Jauregi/Documents/Ejercicios eclipse/TorneoAjedrez/torneoAjedrez.txt");
		Scanner scan = new Scanner(fichero);
		Torneo open_donostia = new Torneo("Open Donostia");
		ArrayList<Equipo> equipos = new ArrayList();
		ArrayList<PartidaAjedrez> partidas = new ArrayList();
		open_donostia.setPartidas_ajedrez(partidas);

		final int AÑADIR_EQUIPO = 1;
		final int MOSTRAR_EQUIPOS = 2;
		final int AÑADIR_JUGADOR = 7;
		final int AÑADIR_PARTIDA = 3;
		final int MOSTRAR_PARTIDAS = 4;
		final int SALIR = 6;
		final int SALIR_2 = 8;
		final int MAYOR_ELO = 5;
		while (scan.hasNextLine()) {
			String linea = scan.nextLine();
			Equipo equipo = new Equipo();
			equipo.setNombre_equipo(linea);
			equipos.add(equipo);
			ArrayList<Jugador> jugadores = new ArrayList();
			equipo.setJugadores(jugadores);
			while (scan.hasNextLine()) {
				String linea2 = scan.nextLine();
				if(equipo.getJugadores().size() != 4){
					String[] partes = linea2.split(", ");
					Jugador jugador = new Jugador();
					jugador.setNombre(partes[0]);
					jugador.setApellidos(partes[1]);
					jugador.setElo(Integer.parseInt(partes[2]));
					equipo.getJugadores().add(jugador);
				}
				

			}

		}

		int opcion = 0;
		do {
			System.out.println("------MENU DEL OPEN DE DONOSTIA 2018 --------");
			System.out.println(AÑADIR_EQUIPO + ". Añadir un equipo al torneo.");
			System.out.println(MOSTRAR_EQUIPOS + ". Mostrar todos los equipos apuntados.");
			System.out.println(AÑADIR_PARTIDA + ". Añadir el emparejamiento de 2 equipos");
			System.out.println(MOSTRAR_PARTIDAS + ". Mostrar las partidas del open");
			System.out.println(MAYOR_ELO + ". Mostrar el jugador de cada equipo de mayor elo");
			System.out.println(SALIR + ". Salir del programa");

			opcion = Integer.parseInt(lector.nextLine());

			switch (opcion) {
			case AÑADIR_EQUIPO:
				System.out.println("El nombre del equipo:");
				String nombre_equipo = lector.nextLine();

				Equipo equipo1 = new Equipo();
				equipo1.setNombre_equipo(nombre_equipo);
				equipos.add(equipo1);

				ArrayList<Jugador> jugadores = new ArrayList();
				equipo1.setJugadores(jugadores);

				do {
					System.out.println("------MENU AÑADIR JUGADORES A " + nombre_equipo + "------");
					System.out.println(AÑADIR_JUGADOR + ". Añadir jugador al equipo " + nombre_equipo);
					System.out.println(SALIR_2 + ". Salir.");
					opcion = Integer.parseInt(lector.nextLine());

					switch (opcion) {
					case AÑADIR_JUGADOR:

						System.out.println("Escribe el nombre del jugador:");
						String nombre = lector.nextLine();

						System.out.println("Escribe los apellidos:");
						String apellidos = lector.nextLine();

						System.out.println("Escribe el elo FIDE del jugador:");
						int elo = Integer.parseInt(lector.nextLine());
						Jugador jugador = new Jugador();
						jugador.setNombre(nombre);
						jugador.setApellidos(apellidos);
						jugador.setElo(elo);

						anadirJugador(nombre, apellidos, elo, equipos, nombre_equipo);
						break;

					default:
						break;
					}
				} while (opcion != SALIR_2);

				break;

			case MOSTRAR_EQUIPOS:
				mostrarEquipos(equipos);
				break;

			case AÑADIR_PARTIDA:

				System.out.println("Escribe el nombre del equipo local:");

				String equipo_local = lector.nextLine();

				System.out.println("Escribe el nombre del equipo visitante:");

				String equipo_visitante = lector.nextLine();

				añadirEmparejamiento(equipo_local, equipo_visitante, equipos, partidas);

				break;

			case MOSTRAR_PARTIDAS:

				mostrarPartidas(partidas);

				break;

			case MAYOR_ELO:
				
				System.out.println("Introduce el nombre del equipo que desea saber el jugador con mayor elo:");
				
				String nombre = scan.nextLine();
				Iterator<Equipo> i = equipos.iterator();
				while(i.hasNext()){
					Equipo equipo = i.next();
					if(equipo.getNombre_equipo().equals(nombre)){
						equipo.mayorElo(nombre);
					}
				}
				


				break;

			case SALIR:
				System.out.println("Guardar información en fichero y saliendo del programa...");

				guardarLista(equipos, partidas);
				break;

			default:
				break;
			}

		} while (opcion != SALIR);

	}

	private static void guardarLista(ArrayList<Equipo> equipos, ArrayList<PartidaAjedrez> partidas) {
		FileWriter fileWriter;
		Iterator<Equipo> i = equipos.iterator();
		try {
			fileWriter = new FileWriter(
					"C:/Users/Jon Jauregi/Documents/Ejercicios eclipse/TorneoAjedrez/torneoAjedrez.txt");
			PrintWriter printWriter = new PrintWriter(fileWriter);

			while (i.hasNext()) {
				Equipo equipo = i.next();
				ArrayList<Jugador> jugadores = equipo.getJugadores();
				printWriter.println(equipo.getInfo() + ": ");
				Iterator<Jugador> iterador = jugadores.iterator();

				while (iterador.hasNext()) {
					Jugador jugador = iterador.next();
					printWriter.println(jugador.getInfo());
				}
				printWriter.println("");
			}

			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Equipo anadirEquipo(String nombre_equipo, ArrayList<Equipo> equipos) {
		Equipo equipo1 = new Equipo();
		equipo1.setNombre_equipo(nombre_equipo);
		equipos.add(equipo1);

		return equipo1;
	}

	public static void mostrarEquipos(ArrayList<Equipo> equipos) {
		Iterator<Equipo> iterador = equipos.iterator();

		while (iterador.hasNext()) {
			Equipo equipo1 = iterador.next();
			equipo1.mostrar();
		}
	}

	public static void anadirJugador(String nombre_jugador, String apellidos, int elo, ArrayList<Equipo> equipos,
			String nombre_equipo) {

		for (int i = 0; i < equipos.size(); i++) {
			if (equipos.get(i).getNombre_equipo().equals(nombre_equipo)) {
				if (equipos.get(i).getJugadores().size() == 4) {
					System.out.println("El equipo está completo");
				} else {
					Jugador jugador1 = new Jugador(nombre_jugador, apellidos, elo);
					equipos.get(i).getJugadores().add(jugador1);
					break;
				}

			}
		}

	}

	public static void añadirEmparejamiento(String equipo_local, String equipo_visitante, ArrayList<Equipo> equipos,
			ArrayList<PartidaAjedrez> partidas) {

		PartidaAjedrez partida1 = new PartidaAjedrez();
		partidas.add(partida1);

		for (int i = 0; i < equipos.size(); i++) {

			if (equipo_local.equals(equipos.get(i).getNombre_equipo())) {
				partida1.setLocal(equipos.get(i));
			}

			else if (equipo_visitante.equals(equipos.get(i).getNombre_equipo())) {
				partida1.setVisitante(equipos.get(i));
			} else {
				System.out.println("Uno de los nombres de equipo no existe o está mal escrito");
			}

		}

	}

	public static void mostrarPartidas(ArrayList<PartidaAjedrez> partidas) {

		Iterator<PartidaAjedrez> i = partidas.iterator();

		while (i.hasNext()) {

			PartidaAjedrez partida1 = i.next();
			partida1.mostrar();
		}

	}

}
