package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase7.EjemploMultiplesExceptions;
import edu.it.clase7.genericos.EjemploColecciones;
import edu.it.clase7.genericos.EjemploGenericos;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {		
			new EjemploColecciones().run();
	}
}
