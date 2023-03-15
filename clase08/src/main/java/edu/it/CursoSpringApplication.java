package edu.it;

import java.util.Objects;
import java.util.concurrent.Callable;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase7.Ejecutable;
import edu.it.clase7.genericos.EjemploColecciones;
import edu.it.clase7.genericos.EjemploMapa;
import edu.it.clase7.genericos.EjemploNumerosPrimos;
import edu.it.clase7.genericos.EjemploPreComputo;
import edu.it.clase7.ppt.ElementoJuego;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		Boolean z = new EjemploNumerosPrimos(9999999L).esPrimo();
		if (z) {
			System.out.print("Es primo");
		}
	}
}
