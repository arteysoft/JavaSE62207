package edu.it.clase7.ppt;

import java.util.Objects;

public class Jugada {
	public final ElementoJuego jugador1;
	public final ElementoJuego jugador2;
	public final String saludo = "hola";
	
	public Jugada(ElementoJuego jugador1, ElementoJuego jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(jugador1, jugador2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugada other = (Jugada) obj;
		
		return jugador1 == other.jugador1 && jugador2 == other.jugador2;
	}
}
