package com.educacionit.condicionales;

import javax.swing.JOptionPane;

public class CondicionalSimple {
	public static void main(String[] args) {
		System.out.println("Inicio");
		String colorCabello = "verde";
		int diaSemana = 6;
		if (colorCabello.equals("rojo") && diaSemana == 4) {
			JOptionPane.showMessageDialog(null, "Felicitaciones tienes un descuento");
			System.out.println("se le dio el descuento");
		}
		System.out.println("Fin");
	}
}
