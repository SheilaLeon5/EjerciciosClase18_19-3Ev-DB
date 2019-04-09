package modelo;

import java.io.Serializable;

public class Equipo implements Serializable /*Comparable<Equipo>*/ {
	private int idEquipo;
	private String nombreCorto;
	private String nombre;
	
	
	private int puntos;
	private int pj;
	private int pg;
	private int pe;
	private int pp;
	private int gf;
	private int gc;
	
	
	public Equipo() {
		//Constructor vacío
	}
	
	
	public Equipo(int idEquipo, String nombreCorto, String nombre) {
		super();
		this.idEquipo = idEquipo;
		this.nombreCorto = nombreCorto;
		this.nombre = nombre;
	}
	
	


	// Redefinimos el método toString de Object   30/01/2019
	@Override
	public String toString() {
		return this.nombre;
	}
	

	

/*		
	// 06/02/2018
	@Override
	public int compareTo(Equipo o) {
		if (this.getIdEquipo() > o.getIdEquipo()) {
			return 1;  // Devolvemos un número positivo
			
		}else if(this.getIdEquipo() < o.getIdEquipo()) {
			return -1;
		 }	
		else {
			return 0;
		}
	}
	*/

/*	@Override
	public int compareTo(Equipo eq) {
		if (this.getPuntos() > eq.getPuntos())
			return -1;
		if (this.getPuntos() < eq.getPuntos())
			return 1;
		if((this.getGf() - this.getGc()) > (eq.getGf() - eq.getGc()))
			return -1;
		if((this.getGf() - this.getGc()) < (eq.getGf() - eq.getGc()))
			return 1;
		if (this.getGf() > eq.getGf())
			return -1;
		return -1;
	}
	*/
	
	
	
	
	public int getIdEquipo() {
		return idEquipo;
	}


	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}


	public String getNombreCorto() {
		return nombreCorto;
	}


	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public int getPg() {
		return pg;
	}


	public int getPe() {
		return pe;
	}


	public int getPp() {
		return pp;
	}


	public int getGf() {
		return gf;
	}


	public int getGc() {
		return gc;
	}

	public int getPuntos() {
		return puntos;
	}
	
	public void setPg(int pg) {
		this.pg = pg;
	}


	public void setPe(int pe) {
		this.pe = pe;
	}


	public void setPp(int pp) {
		this.pp = pp;
	}


	public void setGf(int gf) {
		this.gf = gf;
	}


	public void setGc(int gc) {
		this.gc = gc;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public int getPj() {
		return pj;
	}


	public void setPj(int pj) {
		this.pj = pj;
	}






	
	
}
