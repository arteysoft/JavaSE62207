package edu.it.clase7.genericos;

import java.util.Date;

class AlmacenObjeto<T> {
	public T item = null;
}

class Usuario {
	public final String nombre;

	public Usuario(String nombre) {
		this.nombre = nombre;
	}
}

class Cliente extends Usuario {
	public Cliente() {
		super("EL NOMBRE LO SOBREESCRIBO");
	}
}

public class EjemploGenericos {
	public void run() {
		AlmacenObjeto<String> almacenString = new AlmacenObjeto<>();
		almacenString.item = "hola";
		
		AlmacenObjeto<Usuario> almacenCliente = new AlmacenObjeto<>();
		almacenCliente.item = new Cliente();
		
		//////////////////////////////////////////////////////
		
		System.out.println(  almacenString.item  );
		System.out.println(  almacenCliente.item.nombre   );
	}
}
