package edu.it.clase5.piedrapapeltijera;

public class ReglasDelJuego {
	public static Integer jugar(Jugador jugador1, Jugador jugador2) {
		// Aca escribir toda la logica de como son las reglas
		// Ejemplo
		String jugadaJugador1 = jugador1.obtenerJugada();
		String jugadaJugador2 = jugador2.obtenerJugada();
		
		if (jugadaJugador1.equals("Piedra") && jugadaJugador2.equals("Tijera")) {
			return 1;
		}
		return 0;
	}
}
