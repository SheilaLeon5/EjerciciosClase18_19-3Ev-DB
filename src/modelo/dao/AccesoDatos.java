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

	//--------ACTIVIDAD: Conectarse a una base de datos y mostrar por pantalla -----------------------------------------
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
				//System.out.println(rS.getString("first_name") + "\t\t" + rS.getString(2));
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
	public void insertTeamFromFile(String teamRoute) {
		try {
			BufferedReader file;
			file = new BufferedReader(new FileReader(teamRoute));
			String registry;
			
			BaseDatos bd = new BaseDatos("localhost","liga","root","1q2w3e4r");
			Connection conecction = bd.getConnection();
			Statement stmt = conecction.createStatement();
					
			
			
			while ((registry = file.readLine()) != null) {
				String[] campos = registry.split("#");
				int idEquipo = Integer.parseInt(campos[0]);
				String nombreCorto = campos[1];
				String nombre= campos[2];
				
				String sql= "INSERT INTO equipos (idEquipo,nombreCorto,nombre) VALUES";
				sql += "("+ idEquipo+ ",\""+nombreCorto +"\",\""+nombre+"\")";
				System.out.println(sql);
				stmt.executeUpdate(sql);	
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
	
	
	
	
	//--------ACTIVIDAD: Leer fichero y añadir contenido a tabla -----------------------------------------02/05/2019
	public void getColumnName() {
		try {
			BaseDatos bd = new BaseDatos("localhost","liga","root","1q2w3e4r");
			Connection conecction = bd.getConnection();
			Statement stmt = conecction.createStatement(); // permite hacer consultas
			ResultSet rS = stmt.executeQuery("SELECT * FROM equipos ");  // Empiezan por numero 1 los resultSet
			ResultSetMetaData mD = rS.getMetaData(); // COMPROBAR
			
			
			for (int i = 1; i < mD.getColumnCount(); i++) {
				System.out.println(i + " -> " + mD.getColumnName(i));
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
	
	
	
	//--------ACTIVIDAD: Obtener para cualquier tabla un encabezado con el nombre de sus columnas-----------------------------------------02/05/2019
		public void getColumnNameShowInTheTable(String dataBase, String table) {
			try {
				BaseDatos bd = new BaseDatos("localhost",dataBase,"root","1q2w3e4r");
				Connection conecction = bd.getConnection();
				Statement stmt = conecction.createStatement(); // permite hacer consultas
				ResultSet rS = stmt.executeQuery("SELECT * FROM " + table + " WHERE 1");  // Empiezan por numero 1 los resultSet
				ResultSetMetaData mD = rS.getMetaData(); // COMPROBAR
				String[] header = null;
				
				for (int i = 1; i < mD.getColumnCount(); i++) {
					System.out.print(mD.getColumnName(i)+ "\t  ");
					header[i]= mD.getColumnName(i);
				}

				while (rS.next()) {
					for (int i = 0; i < header.length; i++) {
						//System.out.println(rS.getMetaData(header[i]));
						//System.out.println(rS.getString(mD.getColumnName(header[i])) + "\t\t");
					}
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
	
	
	
	
	
	
	
	
	// mostrar todas las columnas y sus datos ?????????????????
	// sacar una lista de objetos
	
	//jfx basic example
	
	
	

}
