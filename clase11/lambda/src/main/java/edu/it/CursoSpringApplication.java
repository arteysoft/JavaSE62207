package edu.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.function.Predicate;

import javax.persistence.Tuple;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase11.dto.Choffer;
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
		
		Operacion ope = dosVal -> (dosVal.x == dosVal.y);
		
		System.out.println(ope.test(new DosValores(3,4)));
		System.out.println(ope.test(new DosValores(4,4)));
		System.out.println(ope.test(new DosValores(55,55)));
		
		var poblarChoferes = new PoblarArrayChoferes();
				
		var listaChoffer = poblarChoferes.run();
		var filtroChoferes = new FiltroChoferes(listaChoffer);
		
		for (Choffer c : filtroChoferes.obtChoferesLesgustaSuTrabajoSinAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesNoLesgustaSuTrabajoSinAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesLesgustaSuTrabajoConAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesNoLesgustaSuTrabajoConAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesConNombreSalvador()) {
			System.out.println(c);
		}
		System.out.println();
	}
}
