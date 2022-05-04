package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
     private static Connection connection; 
     
     static {
    	 try {
			Class.forName("com.mysql.jdbc.Driver");   //charger driver
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tracker?serverTimezone=UTC","root","");// se connecter avec base donn� il doit etre creer dans local host
		} catch (ClassNotFoundException e) {
			System.out.println("impossible de charger le driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Impossible d'etablir la connexion");
			e.printStackTrace();
		}
    	 
     }

	public static Connection getConnection() {
		return connection;
	}
     
     
}
