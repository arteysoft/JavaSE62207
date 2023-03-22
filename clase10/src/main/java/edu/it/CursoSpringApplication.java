package edu.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase10.EjemploH2;
import edu.it.clase10.GeneradorUsuariosRandom;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		new GeneradorUsuariosRandom().run();
	}
}
