package edu.it.clase10.componentes;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionCreatorMariaDB {
	public Connection crearConexion() {
		try {
			// Class.forName ("org.mariadb.jdbc.Driver");
			String connStr = "jdbc:mariadb://localhost:3306/JavaSE62207";
			Connection conn = java.sql.DriverManager.getConnection(connStr, "root", "");

			return conn;
		}
		catch (SQLException ex) {
			throw new RuntimeException(ex.getMessage());
		}
		catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

}
