package com.educacionit.clase04;

import com.educacionit.entidades.Usuario;
import com.educacionit.utilidades.Contadores;

public class PruebaUsuario {
	public static void main(String[] args) {

		Usuario usuario1 = new Usuario();
		System.out.println(usuario1.mostrarDatos());
		
		usuario1.setCorreo("user1");
		System.out.println(usuario1.mostrarDatos());

		Usuario usuario2 = new Usuario();
		usuario2.setCorreo("user2");
		System.out.println(usuario2.mostrarDatos());

		System.out.println("***************************");
		System.out.println(usuario1.mostrarDatos());
		System.out.println(usuario2.mostrarDatos());

		// System.out.println("Proximo Usuario: " + (Usuario. + 1));
		/*
		 * Usuario usuario1 = new Usuario(); usuario1.setCorreo("user1");
		 * usuario1.setId(Usuario.contadorID);//1
		 * System.out.println(usuario1.mostrarDatos());
		 * 
		 * Usuario.contadorID++;//2
		 * 
		 * Usuario usuario2 = new Usuario(); usuario2.setCorreo("user2");
		 * usuario2.setId(Usuario.contadorID);//2
		 * 
		 * System.out.println(usuario2.mostrarDatos()); Usuario.contadorID++;//3
		 * Usuario.contadorID++;//4 Usuario.contadorID++;//5 Usuario.contadorID++;//6
		 * Usuario.contadorID++;//7
		 * 
		 * System.out.println("***************************");
		 * System.out.println(usuario1.mostrarDatos());
		 * System.out.println(usuario2.mostrarDatos());
		 * 
		 */
	}
}
