package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase6.ejercicioDeLaPila.ErroresForzados;
import edu.it.clase6.ejercicioDeLaPila.ErroresNoForzados;
import edu.it.clase6.ejercicioDeLaPila.PilaStack;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		Runnable r = new ErroresNoForzados();
		r.run();
		
		/*
		 * https://www.toptal.com/spring/los-10-errores-mas-comunes-de-spring-framework
		 */
	}
}
