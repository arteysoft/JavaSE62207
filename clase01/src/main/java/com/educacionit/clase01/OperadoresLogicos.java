package com.educacionit.clase01;

public class OperadoresLogicos {
	public static void main(String[] args) {

		String colorCabello = "amarillo";
		int diaSemana = 7;

		// Promocion Hamburguesa Personas Coloradas/PeliRojas y Jueves
		// && -> & -> y -> and
		// || -> | -> o -> or
		System.out.println(colorCabello.equals("rojo"));
		System.out.println(diaSemana == 4);

		System.out.println(colorCabello.equals("rojo") && diaSemana == 4);

		// colorCabello.equals("rojo") & mayorEdad() --> 39
		System.out.println("**********************");
		// Promocion Ham Cabello Negro o los sabados
		System.out.println(colorCabello.equals("negro"));
		System.out.println(diaSemana == 6);

		System.out.println(colorCabello.equals("negro") | diaSemana == 6);

	}
}
