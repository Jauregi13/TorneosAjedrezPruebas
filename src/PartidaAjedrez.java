
public class PartidaAjedrez implements mostrador{
	
	private int num_mesa;
	private Jugador blancas;
	private Jugador negras;
	private String resultado;
	private String movimiento_blancas;
	private String movimiento_negras;
	
	
	
	public PartidaAjedrez(){
		
	}
	
	
	
	public String getMovimiento_blancas() {
		return movimiento_blancas;
	}


	public void setMovimiento_blancas(String movimiento_blancas) {
		this.movimiento_blancas = movimiento_blancas;
	}


	public String getMovimiento_negras() {
		return movimiento_negras;
	}


	public void setMovimiento_negras(String movimiento_negras) {
		this.movimiento_negras = movimiento_negras;
	}



	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	

	public Jugador getJugador1() {
		return blancas;
	}

	public void setJugador1(Jugador jugador1) {
		this.blancas = jugador1;
	}

	public Jugador getJugador2() {
		return negras;
	}

	public void setJugador2(Jugador jugador2) {
		this.negras = jugador2;
	}

	public int getNum_mesa() {
		return num_mesa;
	}

	public void setNum_mesa(int num_mesa) {
		this.num_mesa = num_mesa;
	}

	public void mostrar(){
		
	}
	

}
