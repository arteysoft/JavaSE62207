package edu.it.clase7.genericos;

import java.util.HashMap;
import java.util.Map;

import edu.it.clase7.ppt.ElementoJuego;
import edu.it.clase7.ppt.Jugada;

import static edu.it.clase7.ppt.ElementoJuego.PIEDRA;
import static edu.it.clase7.ppt.ElementoJuego.PAPEL;
import static edu.it.clase7.ppt.ElementoJuego.TIJERA;

public class EjemploPreComputo {
	private Map<Jugada, Integer> mapaPrecomputo;
	
	public EjemploPreComputo() {
		mapaPrecomputo = new HashMap<Jugada, Integer>();
		
		mapaPrecomputo.put(new Jugada(PIEDRA, PIEDRA), 0);
		mapaPrecomputo.put(new Jugada(PAPEL, PAPEL), 0);
		mapaPrecomputo.put(new Jugada(TIJERA, TIJERA), 0);
		
		mapaPrecomputo.put(new Jugada(PIEDRA, TIJERA), 1);
		mapaPrecomputo.put(new Jugada(PIEDRA, PAPEL), 2);
		
		mapaPrecomputo.put(new Jugada(PAPEL, PIEDRA), 1);
		mapaPrecomputo.put(new Jugada(PAPEL, TIJERA), 2);
		
		mapaPrecomputo.put(new Jugada(TIJERA, PAPEL), 1);
		mapaPrecomputo.put(new Jugada(TIJERA, PIEDRA), 2);
	}
	public Integer jugar(ElementoJuego j1, ElementoJuego j2) {
		return mapaPrecomputo.get(new Jugada(j1, j2));
	}
}
