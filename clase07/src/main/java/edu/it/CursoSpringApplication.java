package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase7.EjemploMultiplesExceptions;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {		
			new EjemploMultiplesExceptions().run();
	}
}
