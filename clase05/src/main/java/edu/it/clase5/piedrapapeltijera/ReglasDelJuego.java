package edu.it.clase5.piedrapapeltijera;

public class ReglasDelJuego {
	public static Integer jugar(Jugador jugador1, Jugador jugador2) {
		// Aca escribir toda la logica de como son las reglas
		// Ejemplo
		if (jugador1.equals("Piedra") && jugador2.equals("Tijera")) {
			return 1;
		}
		return 0;
	}
}
