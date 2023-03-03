package com.educacionit.clase01;

public class OperadoresLogicos2 {
	public static void main(String[] args) {
		int diaSemana = 4;
		String colorCabello = "amarillo";
		// System.out.println(colorCabello.equals("rojo"));
		// System.out.println(diaSemanaOferta(diaSemana));
		System.out.println("Es Color Rojo y es Jueves? "+(colorCabello.equals("rojo") & diaSemanaOferta(diaSemana)));
	}

	public static boolean diaSemanaOferta(int dia) {
		System.out.println("Bienvenido");
		// algoritmos
		return dia == 4;
	}

}
