package control;

import java.sql.Connection;

public class BaseDatos {
	private String host;   // lugar donde se encuentra el servidor
	private String dbName;
	private String dbUser;
	private String dbPassword;
	private Connection conexion;

	public BaseDatos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public BaseDatos(String host, String dbName, String dbUser, String dbPassword) {
		super();
		this.host = host;
		this.dbName = dbName;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}



	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDbUser() {
		return dbUser;
	}
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}
	public String getDbPassword() {
		return dbPassword;
	}
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	
	
	
	
	
	
	
	
	
	
}
