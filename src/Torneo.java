import java.util.ArrayList;
import java.util.Date;

public class Torneo {
	
	private String nombre_torneo;
	private Date fecha;
	private String local_juego;
	private ArrayList partidas_ajedrez;
	private ArrayList equipos;
	
	public ArrayList getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList equipos) {
		this.equipos = equipos;
	}

	public Torneo(){
		
	}
	
	public Torneo(String nombre_torneo){
		
		this.nombre_torneo = nombre_torneo;
		
	}
	
	
	
	
	public String getNombre_torneo() {
		return nombre_torneo;
	}
	public void setNombre_torneo(String nombre_torneo) {
		this.nombre_torneo = nombre_torneo;
	}
	public ArrayList getPartidas_ajedrez() {
		return partidas_ajedrez;
	}
	public void setPartidas_ajedrez(ArrayList partidas_ajedrez) {
		this.partidas_ajedrez = partidas_ajedrez;
	}
	public String getNombre() {
		return nombre_torneo;
	}
	public void setNombre(String nombre) {
		this.nombre_torneo = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getLocal_juego() {
		return local_juego;
	}
	public void setLocal_juego(String local_juego) {
		this.local_juego = local_juego;
	}

}
