package edu.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.it.clase11.dto.Choffer;
import edu.it.clase11.service.FiltroChoferes;
import edu.it.clase11.service.PoblarArrayChoferes;

@SpringBootApplication
public class CursoSpringApplication {
	public static void main(String... params) throws Exception {
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
