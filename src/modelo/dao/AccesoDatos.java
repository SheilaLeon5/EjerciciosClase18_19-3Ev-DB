package modelo.dao;

import java.sql.Connection;

import control.BaseDatos;

public class AccesoDatos {

	//mostrar por consola todos los "actores" (La BD 'Sakila')
	public void recorreTabla() {
		
		//1.-CONECTAR A LA BD
		BaseDatos bd = new BaseDatos("localhost","sakila","root","1q2w3e4r");
		Connection conecction = bd.getConnection();
		// = conecction.createStatement(); // permite hacer consultas
		
	}
	
	
	
	
	// mostrar todas las columnas y sus datos
}
