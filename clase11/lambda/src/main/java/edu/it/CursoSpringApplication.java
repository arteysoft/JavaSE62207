package edu.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.function.Predicate;

import javax.persistence.Tuple;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase11.dto.Choffer;
import edu.it.clase11.service.EjemploFiltroChofer;
import edu.it.clase11.service.FiltroChoferes;
import edu.it.clase11.service.PoblarArrayChoferes;

class DosValores {
	public final int x; 
	public final int y;
	
	public DosValores(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

@FunctionalInterface
interface Operacion extends Predicate<DosValores> {
	
}

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
		
		EjemploFiltroChofer.presentacionOptional();
	}
}
