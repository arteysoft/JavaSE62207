package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase10.selenium.Ejemplo1;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		new Ejemplo1().run();
	}	
}
