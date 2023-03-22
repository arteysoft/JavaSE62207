package edu.it.clase10.utiles;

import java.util.UUID;

import com.github.javafaker.Faker;
import edu.it.clase10.model.UsuarioDTO;

public class UtilesUsuario{
	public static UsuarioDTO generarUsuarioRandom() {
		Faker fkr = new Faker();
		
		return new UsuarioDTO(
				UUID.randomUUID().toString(),
	            fkr.address().firstName(),
	            fkr.address().lastName(),
	            fkr.address().streetName(),
	            fkr.address().streetAddressNumber(),
	            fkr.address().state(),
	            fkr.address().country()
	        );
	}
}
