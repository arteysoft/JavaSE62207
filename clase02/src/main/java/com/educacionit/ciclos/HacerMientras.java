package com.educacionit.ciclos;

import java.util.Scanner;

public class HacerMientras {
	public static void main(String[] args) {
		System.out.println("Adivina el numero...");
		// adivinar un numero del 1 al 10
		long numeroAleatorio = Math.round((Math.random() * 10));
		System.err.println(numeroAleatorio);
		int numeroUsuario;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Indica un numero entre 1 y 10: ");
			numeroUsuario = teclado.nextInt();

			if (numeroUsuario > numeroAleatorio) {
				System.out.println("Intenta un numero menor");
			} else if (numeroUsuario < numeroAleatorio) {
				System.out.println("Intenta un numero mayor");
			}

		} while (numeroUsuario != numeroAleatorio);

		System.out.println("Felicidades Advinaste");

		teclado.close();

	}
}
