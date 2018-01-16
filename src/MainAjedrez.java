import java.util.Scanner;

public class MainAjedrez {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Torneo open_donostia = new Torneo("Open Donostia");
		
		final int AÑADIR_EQUIPO = 1;
		final int AÑADIR_JUGADOR = 2;
		final int SALIR = 3;
		
		
		
		int opcion = 0;
		do{
			System.out.println("------MENU DEL TORNEO --------");
			System.out.println(AÑADIR_EQUIPO + ". Añadir un equipo al torneo.");
			System.out.println(SALIR + ". Salir del programa");
			
			opcion = Integer.parseInt(lector.nextLine());
			
			switch (opcion) {
			case AÑADIR_EQUIPO:
				
				break;
				
			case SALIR:

			default:
				break;
			}
			
		}
		while(opcion != SALIR);
		
		

	}

}
