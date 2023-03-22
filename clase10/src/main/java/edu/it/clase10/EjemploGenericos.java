package edu.it.clase10;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

class Cliente {
	String id;
	String nombre;
}

class ClienteImpuestoFull extends Cliente {
	
}

class Repuesto {
	String id;
	String nombre;
}

class ObjetoDao<T, Z> {
	// Datos de la tabla, nombre
	
	public List<T> obtenerRegistros(String where) {
		// acceso a la base de datos
		return new ArrayList<T>();
	}
	public void insertar(T c) {
		// Inserta en la base de datos
	}
	public void actualizar(T c) {
		// Actualiza en la base de datos
	}
	public void borrar(Z id) {
		// DELETE FROM TABLA_CLIENTES WHERE ID = id
	}
}


@Component
public class EjemploGenericos implements CommandLineRunner {
	public void run(String... args) throws Exception {
		Collection<String> coleccion1 = new ArrayList<>();
		Collection<Cliente> coleccion2 = new ArrayList<>();
		
		Integer x = 2;
		Object o = x;
		System.out.println("Ahora si");
	}
}
