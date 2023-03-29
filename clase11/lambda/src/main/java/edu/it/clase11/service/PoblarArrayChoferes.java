package edu.it.clase11.service;

import java.util.ArrayList;
import java.util.List;

import edu.it.clase11.dto.Choffer;

public class PoblarArrayChoferes {
	public List<Choffer> run() {
		var listaChoferes = new ArrayList<Choffer>();
		
		listaChoferes.add(new Choffer("Ramon", true, 0));
		listaChoferes.add(new Choffer("Ignacio", true, 3));
		listaChoferes.add(new Choffer("Estela", true, 0));
		listaChoferes.add(new Choffer("Nicolas", true, 5));
		
		listaChoferes.add(new Choffer("Dani", false, 1));
		listaChoferes.add(new Choffer("Salvador", false, 0));
		listaChoferes.add(new Choffer("Helena", false, 4));
		listaChoferes.add(new Choffer("Augusto", false, 0));
		
		return listaChoferes;
	}
}
