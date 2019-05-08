package control;

// JDBC   Java databases conection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class BaseDatos {
	private String host;   // lugar donde se encuentra el servidor
	private String dbName;
	private String dbUser;
	private String dbPassword;
	private Connection connection;
	

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
		
		
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen_db?&serverTimezone=UTC&"  + "user=root&password=1q2w3e4r"); //Cadena de conexión
			//connection = DriverManager.getConnection("jdbc:mysql://localhost/feedback?"  + "user=sqluser&password=sqluserpw");
			
			
			//this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen_db?&serverTimezone=UTC&"  + "user=root&password=1q2w3e4r"); //Cadena de conexión
			
			this.connection = DriverManager.getConnection("jdbc:mysql://" + host +"/" + dbName + "?&user=" + dbUser + "&password=" + dbPassword + "&serverTimezone=UTC"); //Cadena de conexión
			
			
			
			System.out.println("conectado..");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
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
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
