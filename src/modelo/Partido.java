package modelo;

public class Partido {
	private int idPartido;
	private int jornada;
	private String equipoLocal;
	private int golesLocal;
	private String equipoVisitante;
	private int golesVisitante;
	
	
	
	
	
	public Partido() {
		super();
	}


	public Partido(int idPartido, int jornada, String equipoLocal, int golesLocal, String equipoVisitante,
			int golesVisitante) {
		super();
		this.idPartido = idPartido;
		this.jornada = jornada;
		this.equipoLocal = equipoLocal;
		this.golesLocal = golesLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesVisitante = golesVisitante;
	}





	
	
	
	public int getIdPartido() {
		return idPartido;
	}





	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}





	public int getJornada() {
		return jornada;
	}





	public void setJornada(int jornada) {
		this.jornada = jornada;
	}





	public String getEquipoLocal() {
		return equipoLocal;
	}





	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}





	public int getGolesLocal() {
		return golesLocal;
	}





	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}





	public String getEquipoVisitante() {
		return equipoVisitante;
	}





	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}





	public int getGolesVisitante() {
		return golesVisitante;
	}





	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	
	
	
	
}
