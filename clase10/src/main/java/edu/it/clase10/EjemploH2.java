package edu.it.clase10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EjemploH2 {
	public void run() throws Exception {
		// spring.datasource.driverClassName=org.h2.Driver		
		// spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

		Connection conn = DriverManager.getConnection("jdbc:h2:mem:cursoJava", "sa", "password");
		conn.createStatement().execute("CREATE TABLE numeros_primos (\n"
				+ "				  numero_encontrado BIGINT NOT NULL\n" 
				+ "				)");

		conn.createStatement().execute("INSERT INTO numeros_primos (numero_encontrado) VALUES (2)");		
		conn.createStatement().execute("INSERT INTO numeros_primos (numero_encontrado) VALUES (3)");
		conn.createStatement().execute("INSERT INTO numeros_primos (numero_encontrado) VALUES (5)");

		ResultSet rs = conn.prepareStatement("SELECT * FROM numeros_primos").executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1));
		}

		conn.close();
		// PRIMARY KEY (`numero_encontrado`));
	}
}
