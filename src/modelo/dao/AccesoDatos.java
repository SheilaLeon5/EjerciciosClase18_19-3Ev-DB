package modelo.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


import control.BaseDatos;

public class AccesoDatos {

	//mostrar por consola todos los "actores" (La BD 'Sakila')
	public void recorreTabla() {
		
		//1.-CONECTAR A LA BD
		
		
		try {
			BaseDatos bd = new BaseDatos("localhost","sakila","root","1q2w3e4r");
			Connection conecction = bd.getConnection();
			Statement stmt; // permite hacer consultas
			stmt = conecction.createStatement(); 
			ResultSet rS = stmt.executeQuery("SELECT * FROM actor ");
			ResultSetMetaData mD = rS.getMetaData(); // COMPROBAR
			

			while (rS.next()) {
				System.out.println(rS.getString("first_name") + "\t\t" + rS.getString(2));
			}
			rS.close();
			stmt.close();
			conecction.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (NullPointerException e) {
			System.out.println("Error de conexión");
		}
	
	}
	
	
	//--------ACTIVIDAD: Leer fichero y añadir contenido a tabla -----------------------------------------30/04/2019
	public void insetTeamFromFile(String teamRoute) {
		try {
			BufferedReader file;
			file = new BufferedReader(new FileReader(teamRoute));
			String registry;
			
			BaseDatos bd = new BaseDatos("localhost","sakila","root","1q2w3e4r");
			Connection conecction = bd.getConnection();
			Statement stmt = conecction.createStatement();
					
			
			
			while ((registry = file.readLine()) != null) {
				String[] campos = registry.split("#");
				int idEquipo = Integer.parseInt(campos[0]);
				String nombreCorto = campos[1];
				String nombre= campos[2];
				String sql= "INSERT INTO equipos  VALUES (idEquipo, nombreCorto, nombre)";
				//sql += "(" + idEquipo + ",\""+ nombreCorto + "\"" +  nombre + ")";
				sql += "(" + idEquipo + ", \""+ nombreCorto +"\", \""+nombre+"\")";
				System.out.println(sql);
				//stmt.executeUpdate(sql);
			//	ResultSet rS = stmt.executeQuery("insert into equipos(idEquipo,nombreCorto,nombre) values (idEquipo + nombreCorto + nombre);
	
			}
		
			file.close();
			System.out.println("Fin de la lectura del fichero");
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
	
	
	
	// mostrar todas las columnas y sus datos ?????????????????
	
	
	
	
	
	

}
