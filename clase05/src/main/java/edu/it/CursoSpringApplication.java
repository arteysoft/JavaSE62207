package edu.it;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase5.casteo.EjemploCasteo;
import edu.it.clase5.polimorfismo.EjemploPolimorfismo;
import edu.it.clase5.sobrecarga.EjemploSobreCarga;


@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		new EjemploSobreCarga().run();
	}
}
