package modelo;

import java.time.LocalDate;
import java.util.Random;

public class Persona implements Comparable<Persona>, Humano {  // Comparable es una interfaz de java  --- 31/01/2019
	
	private String nif;
	private String nombre;
	private int longitudPaso;
	private String fecha_nac; // AAAAMMDD
	private char sexo; // 'M' 'F'


	public Persona() {
		this.nif = "12345678F";
		this.nombre="Anónimo";
		this.fecha_nac="20190115";
		this.longitudPaso=33;
		
	}

	
	
	// Redefinimos el método toString de Object   30/01/2019
	@Override
	public String toString() {
		return this.getNombre();
	}
	
	
	@Override                   // ... Lo que empieza por @ es una Anotación   ---31/01/2019   
	public int compareTo(Persona otro) {  //# INTERFACE 
		if(this.longitudPaso > otro.longitudPaso)
		return 1;
		else if (this.longitudPaso > otro.longitudPaso)
			return -1;
			else
				return 0;
	}

	
	
	
	public Persona(String nif, String nombre, int longitudPaso, String fecha_nac , char sexo ) {
		this.nif = nif;
		this.nombre = nombre;
		this.longitudPaso = longitudPaso;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
	}
	 
	 public int caminar (int numPasos) {
		 
		 double a=9.0;
		 double raiz = Math.sqrt(a);
		 
		 Random miRandom = new Random(); // Crea un objeto de la clase "Random"
		 
		 int valor = miRandom.nextInt();
		 
		 return numPasos * longitudPaso / 100;
		 
	 }

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;  // -- nif de la derecha es que se pasa por parámetro. Es diferente a la propiedad nif
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLongitudPaso() {
		return longitudPaso;
	}

	public void setLongitudPaso(int longitudPaso) {
		this.longitudPaso = longitudPaso;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	
	// Métodos implementados por la interfaz Humano
	@Override
	public boolean dormir(int horas) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float alimentarse(int calorias) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
