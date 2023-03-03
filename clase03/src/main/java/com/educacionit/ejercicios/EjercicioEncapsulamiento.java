package com.educacionit.ejercicios;

import com.educacionit.entidades.Moderadora;

public class EjercicioEncapsulamiento {
	public static void main(String[] args) {
		Moderadora moderadora = new Moderadora();
		moderadora.setNombre("Maria del carmen");
		System.out.println(moderadora.getNombre());
		moderadora.setEdad(15);

		Moderadora moderadora2 = new Moderadora("Isabel", -25);

	}
}
