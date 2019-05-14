package modelo.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import control.BaseDatos;
import modelo.Equipo;

public class AccesoDatos {

	//--------ACTIVIDAD: Conectarse a una base de datos y mostrar por pantalla -----------------------------------------
	//mostrar por consola todos los "actores" (La BD 'Sakila')
	public void recorreTabla() {
		//1.-CONECTAR A LA BD
		try {
			BaseDatos bd = new BaseDatos("localhost","liga","root","1q2w3e4r");
			Connection conecction = bd.getConnection();
			Statement stmt; // permite hacer consultas
			stmt = conecction.createStatement(); 
			ResultSet rS = stmt.executeQuery("SELECT * FROM equipos ");
			ResultSetMetaData mD = rS.getMetaData(); // COMPROBAR
			
			System.out.println();
			while (rS.next()) {
				//System.out.println(rS.getString("nombre") + "\t\t" + rS.getString(2));
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
	//Teniendo en cuenta que previamente hemos hecho la tabla
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
			System.out.println("\n Fin de la lectura del fichero");
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	
		
/*	
	//--------ACTIVIDAD: Leer fichero y añadir contenido a tabla (VARIANTE DEL ANTERIOR)-----------------------------------------30/04/2019
	 //En esta actividad hemos creado la tabla
	public void insertTeamFromFile(String teamRoute) {

		
		try {
			// preparar que fichero se va a leer
			BufferedReader file;
			file = new BufferedReader(new FileReader(teamRoute));
			String registry;
			

			//cargar la base de datos
			BaseDatos db = new BaseDatos("localhost","liga","root","1q2w3e4r");
			Connection connection = db.getConnection();     //Obtener la conexión
			Statement stmt = connection.createStatement(); //Para ejecutar la consulta
			
		
			// Creamos la tabla 
			String sqlCreateTable =(
					"create table if not exists equipos(\r\n" + 
					"    idEquipo int(2) PRIMARY KEY,\r\n" + 
					"    nombreCorto varchar(5),\r\n" + 
					"    nombre varchar(50),\r\n" + 
					"	puntos int(2) default 0,\r\n" + 
					"	pj int(2) default 0,\r\n" + 
					"	pg int(2) default 0,\r\n" + 
					"	pe int(2) default 0,\r\n" + 
					"	pp int(2) default 0,\r\n" + 
					"	gf int(2) default 0,\r\n" + 
					"	gc int(2) default 0\r\n" + 
					")"
					+ "");

			stmt.executeUpdate(sqlCreateTable);
	

			//recorrer fichero y obtener los campos
			registry = file.readLine();
			while (registry != null) {
				String[] fields = registry.split("#");  //separamos una string
				int idEquipo = Integer.parseInt(fields[0]);
				String nombreCorto = fields[1];
				String nombre = fields[2];
				


				String sqlAddDatesTable ="INSERT INTO equipos(idEquipo,nombreCorto,nombre) VALUES ("+idEquipo+",\""+nombreCorto+"\",\""+nombre+"\") ";
				stmt.executeUpdate(sqlAddDatesTable);
				registry= file.readLine();
			}
			
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/	
	

	
	
	//--------ACTIVIDAD: Hacer consulta y obtener nombre columnas -----------------------------------------02/05/2019
	public void getColumnName() {
		try {
			BaseDatos bd = new BaseDatos("localhost","liga","root","1q2w3e4r");
			Connection conecction = bd.getConnection();
			Statement stmt = conecction.createStatement(); // permite hacer consultas
			ResultSet rS = stmt.executeQuery("SELECT * FROM equipos ");  // Empiezan por numero 1 los resultSet
			ResultSetMetaData mD = rS.getMetaData(); // COMPROBAR
			
			
			for (int i = 1; i < mD.getColumnCount(); i++) {
				System.out.println(i + " -> " + mD.getColumnName(i));
				//System.out.println(""+i+".- " + mD.getColumnName(i) + "\t\t");
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
	
	
	
	
	

	
	//--------ACTIVIDAD: Obtener para cualquier tabla un encabezado con el nombre de sus columnas(es decir mostrar una tabla)-----------------------------------------02/05/2019
			public void getTable(String dataBase, String table) {
				try {
					BaseDatos bd = new BaseDatos("localhost",dataBase,"root","1q2w3e4r");
					Connection conecction = bd.getConnection();
					Statement stmt;
					stmt = conecction.createStatement();
					ResultSet sql = stmt.executeQuery("select * FROM " + table);
					ResultSetMetaData mD = sql.getMetaData();
					
					for (int i = 1; i < mD.getColumnCount(); i++) {
						System.out.print(String.format("%1$-30s",mD.getColumnName(i)));
						
					}
					System.out.println("\n");
					while(sql.next()) {
						for (int i = 1; i < mD.getColumnCount(); i++) {
							System.out.print(String.format("%1$-30s", sql.getString(i)));  //Recupera el valor del indice de columna designado en la fila actual
							// Añadir espacio String , el guión se quita si los espacios se quieren poner delante--> %1$-24s  
						}
						System.out.println("\n");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

	
			
//--------ACTIVIDAD: Obtener una lista de objetos recorriendo tabla de BD (POR MI CUENTA)-----------------------------------------07/05/2019		
	public static ArrayList<Equipo> getListObjects(String dataBase, String table){
		
		try {
			//Conetarnos a la BD
			BaseDatos bd = new BaseDatos("localhost",dataBase,"root","1q2w3e4r");
			Connection connection= bd.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet sql = stmt.executeQuery("SELECT * from " + table);
			
			ArrayList<Equipo> list = new ArrayList<Equipo>();
			int idEquipo = 0;
			String nombreCorto = null;
			String nombre = null;
			
			while(sql.next()) {
				for (int i = 1; i < sql.getMetaData().getColumnCount(); i++) {  //Recorro toda la fila aunque no necesite todos los datos
					//System.out.println(sql.getString(i));
					 idEquipo = Integer.parseInt(sql.getString(1));
					 nombreCorto = sql.getString(2);
					 nombre = sql.getString(3);	
				}
			list.add(new Equipo(idEquipo,nombreCorto,nombre));
			//System.out.println(list);
			}
			
			for (Equipo equipo : list) {
				System.out.println(equipo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
			
	
	
	
//--------ACTIVIDAD: validar login del 'miprimerFXML' consultando los usuarios en la BD -----------------------------------------14/05/2019			
	public static boolean validateLogin(String usr, String pass) {
		//conectar BD
		//preparar consulta BD liga -> tabla 'usuarios'
		//como saber si existe o no
		
		try {
			BaseDatos bd = new BaseDatos("localhost","usuariosDB","root","1q2w3e4r");
			Connection connection= bd.getConnection();
			Statement stmt = connection.createStatement();
			String query = "SELECT * from login where usuario like '" +  usr  + "' and contrasena like '" + pass + "'";
			ResultSet sql = stmt.executeQuery(query);
			
			int contador = 0;
			while(sql.next()) {
				contador++;
				//System.out.println(query);
			}
			if (contador == 0) {
				return false;
			}
			return true;
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	
	
	
	
	
	//jfx basic example
	
	/*
	  https://docs.oracle.com/javase/8/javafx/get-started-tutorial/get_start_apps.htm#JFXST804
	 
	 */
	/*
	 * ACTIVIDADES PROXIMAS:
	 * -------modelo
	 * - crear tabla jugadores2
	 * - crear tabla a partir de jugadores2.txt
	 * - implementar un método que devuelva una lista/mapa de todos los Equipos a partir de la tabla equipos.
	 * - implementar un método que devuelva una lista/mapa de todos los Jugadores de un equipo dado
	 * 
	 * 
	 * 
	 * --vista
	 * 1. Eb yn control (ListVient, TableView..) , cargar los jugadores de un equipo seleccionado en el comboBox
	 * 
	 */
	

}
