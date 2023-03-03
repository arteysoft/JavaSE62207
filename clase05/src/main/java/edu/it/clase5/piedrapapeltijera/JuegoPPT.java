package edu.it.clase5.piedrapapeltijera;

public class JuegoPPT {
	public void run() {
		// Instanciar jugador1
		// Instanciar jugador2
		// ReglasDelJuego.jugar(jugador1, jugador2) -> 0 Empate, 1 Gana 1, 2 Gana 2
		// Imprimir por pantalla el ganador
		Jugador j1 = new JugadorPersona();
		Jugador j2 = new JugadorMaquina();
		
		Integer i = ReglasDelJuego.jugar(j1, j2);
		
		switch (i) {
		
		}
	}
}
