import java.util.Comparator;

public class EloComparator implements Comparator<Jugador> {

	public int compare(Jugador jug1, Jugador jug2) {
		if(jug1.getElo() > jug2.getElo()){
			return -1;
		}
		else if(jug1.getElo() < jug2.getElo()){
			return 1;
		}
		else {
			return 0;
		}
	}

}
