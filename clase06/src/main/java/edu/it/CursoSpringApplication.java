package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase6.ejercicioDeLaPila.PilaStack;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		Runnable r = new PilaStack();
		r.run();
	}
}
