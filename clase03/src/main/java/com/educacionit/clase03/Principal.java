package com.educacionit.clase03;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Instancia y Objeto

		String cadena = "Hola mundo";
		Scanner teclado = new Scanner(System.in);
		// teclado.next();

		// instancia es cuando le asigno memoria (new)
		Alumno alumno1 = new Alumno();
		Alumno alumno2; // Objeto alumno2 declarado
		alumno2 = new Alumno(); // Objeto alumno2 instanciado

		alumno1.nombre = "Octavio";
		alumno1.apellido = "Robleto";
		alumno1.activo = true;
		alumno1.cursos = new String[2];
		alumno1.cursos[0] = "Java";
		alumno1.cursos[1] = "Python";

		System.out.println(alumno1.nombre);
		System.out.println(Arrays.toString(alumno1.cursos));

		alumno1.imprimir();
		alumno2.imprimir();

		alumno2.nombre = "Jose";
		alumno2.imprimir();
		
		// destruir el objeto es el Garbage Collector

	}
}
