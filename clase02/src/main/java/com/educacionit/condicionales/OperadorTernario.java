package com.educacionit.condicionales;

public class OperadorTernario {
	public static void main(String[] args) {

		int edad = 12;
		String mensaje;
		// mensaje = edad >= 18 ? "Es mayor de edad" : "Es menor de Edad";

		/*
		 * 
		 * if (edad >= 18) { mensaje = "Es mayor de edad"; } else { mensaje =
		 * "Es menor de edad"; }
		 */

		boolean esMayor = edad >= 18;
		char caracter = edad >= 18 ? 'M' : 'm';

		/*
		 * if (edad>=18) { esMayor = true; }else { esMayor = false; }
		 */
		System.out.println(esMayor);

	}
}
