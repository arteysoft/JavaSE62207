package com.educacionit.clase01;

import java.util.Scanner;

public class OperadoresRelacionales {
	public static void main(String[] args) {
		System.out.println(5 > 4);// true
		System.out.println(5 < 4); // false
		System.out.println(5 == 5); // true
		System.out.println(5 >= 5);// true
		System.out.println(5 <= 6);// true
		System.out.println(6 != 0);// true

		String cadena1 = "cadena";
		String cadena2 = "cadena";

		System.out.println("********Cadenas*********");
		System.out.println(cadena1 == cadena2);
		System.out.println(cadena1 != cadena2);

		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String palabraUsuario1 = teclado.next();
		System.out.print("Escribe otra palabra: ");
		String palabraUsuario2 = teclado.next();

		System.out.println("Palabra1 : " + palabraUsuario1);
		System.out.println("Palabra2 : " + palabraUsuario2);
		System.out.println(palabraUsuario1 == palabraUsuario2);
		// equals -> ==
		System.out.println(palabraUsuario2.equals(palabraUsuario1));
		// ignora mayusculas y minusculas o no es sencible a may y min
		System.out.println(palabraUsuario1.equalsIgnoreCase(palabraUsuario2));

	}
}
