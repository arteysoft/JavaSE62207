package edu.it.basededatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import com.github.javafaker.Faker;

public class UtilesAlumno {
	private static Faker fkr;
	
	static {
		fkr = new Faker();
	}
	
	public static AlumnoDTO generarAlumnoRandom() {	
		return new AlumnoDTO(
				UUID.randomUUID().toString(),
	            fkr.address().firstName(),
	            fkr.address().lastName(),
	            fkr.address().streetName(),
	            fkr.address().streetAddressNumber(),
	            fkr.address().state(),
	            fkr.address().country()
	        );
	}
	public static AlumnoDTO mapperRsAlumno(ResultSet rs) throws SQLException {
		var ret = new AlumnoDTO(
				rs.getString("id"),
				rs.getString("nombre"),
				rs.getString("apellido"),
				rs.getString("calle"),
				rs.getString("calleNumero"),
				rs.getString("estado"),
				rs.getString("pais")
	        );
		
		return ret;
	}
}
