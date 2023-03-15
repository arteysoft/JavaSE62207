package edu.it.clase7.ppt;

public class ReglasDelJuego {
	public static Integer jugar(Jugador jugador1, Jugador jugador2) {
		// Aca escribir toda la logica de como son las reglas
		// Ejemplo
		ElementoJuego jugadaJugador1 = jugador1.obtenerJugada();
		ElementoJuego jugadaJugador2 = jugador2.obtenerJugada();
		
		if (jugadaJugador1 == ElementoJuego.PIEDRA && jugadaJugador2 == ElementoJuego.TIJERA) {
			return 1;
		}
		
		return 0;
	}
}
