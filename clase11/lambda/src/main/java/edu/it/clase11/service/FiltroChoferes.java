package edu.it.clase11.service;

import java.util.ArrayList;
import java.util.List;

import edu.it.clase11.dto.Choffer;

public class FiltroChoferes {
	private List<Choffer> listChoffer = null;
	
	public FiltroChoferes(List<Choffer> listChoffer) {
		this.listChoffer = listChoffer;
	}
	
	public List<Choffer> obtChoferesSegunCriterio(CriterioFiltroChofer criterioFiltro) {
		var listaAux = new ArrayList<Choffer>();
		for (Choffer c : listChoffer) {
			if (criterioFiltro.aplicarCriterio(c)) {
				listaAux.add(c);
			}
		}
		return listaAux;
	}
	
	public List<Choffer> obtChoferesLesgustaSuTrabajoSinAccidentes() {
		var listaAux = new ArrayList<Choffer>();
		CriterioFiltroChofer criterioFiltro = (Choffer c) -> {
			if (c.getLeGustaSuTrabajo() && c.getCantidadDeAccidentes() == 0) {
				return true;
			}
			else {
				return false;
			}
		};
		
		return obtChoferesSegunCriterio(criterioFiltro);
	}
	public List<Choffer> obtChoferesNoLesgustaSuTrabajoSinAccidentes() {
		var listaAux = new ArrayList<Choffer>();
		for (Choffer c : listChoffer) {
			if (c.getLeGustaSuTrabajo() == false && c.getCantidadDeAccidentes() == 0) {
				listaAux.add(c);
			}
		}
		return listaAux;
	}
	public List<Choffer> obtChoferesLesgustaSuTrabajoConAccidentes() {
		var listaAux = new ArrayList<Choffer>();
		for (Choffer c : listChoffer) {
			if (c.getLeGustaSuTrabajo() && c.getCantidadDeAccidentes() > 0) {
				listaAux.add(c);
			}
		}
		return listaAux;
	}
	public List<Choffer> obtChoferesNoLesgustaSuTrabajoConAccidentes() {
		var listaAux = new ArrayList<Choffer>();
		for (Choffer c : listChoffer) {
			if (c.getLeGustaSuTrabajo() == false && c.getCantidadDeAccidentes() > 0) {
				listaAux.add(c);
			}
		}
		return listaAux;		
	}
}
