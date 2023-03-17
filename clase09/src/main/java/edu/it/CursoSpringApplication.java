package edu.it;

import java.util.Objects;
import java.util.concurrent.Callable;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase09.EjemplosVariosSQL;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		new EjemplosVariosSQL().run();
	}
}
