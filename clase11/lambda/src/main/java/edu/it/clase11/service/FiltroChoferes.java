package edu.it.clase11.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import edu.it.clase11.dto.Choffer;

public class FiltroChoferes {
	private List<Choffer> listChoffer = null;
	
	public FiltroChoferes(List<Choffer> listChoffer) {
		this.listChoffer = listChoffer;
	}
	
	public List<Choffer> obtChoferesSegunCriterio(Predicate<Choffer> criterioFiltro) {
		var listaAux = new ArrayList<Choffer>();
		for (Choffer c : listChoffer) {
			if (criterioFiltro.test(c)) {
				listaAux.add(c);
			}
		}
		return listaAux;
	}
	
	public List<Choffer> obtChoferesConNombreSalvador() {
		Predicate<Choffer> crit = c -> c.getNombre().equals("Salvador");
		return obtChoferesSegunCriterio(crit);
	}
	
	public List<Choffer> obtChoferesLesgustaSuTrabajoSinAccidentes() {
		Predicate<Choffer> criterioFiltro = c -> (c.getLeGustaSuTrabajo() && c.getCantidadDeAccidentes() == 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
	public List<Choffer> obtChoferesNoLesgustaSuTrabajoSinAccidentes() {
		Predicate<Choffer> criterioFiltro = c -> (c.getLeGustaSuTrabajo() == false && c.getCantidadDeAccidentes() == 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
	public List<Choffer> obtChoferesLesgustaSuTrabajoConAccidentes() {
		Predicate<Choffer> criterioFiltro = c -> (c.getLeGustaSuTrabajo() && c.getCantidadDeAccidentes() > 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
	public List<Choffer> obtChoferesNoLesgustaSuTrabajoConAccidentes() {
		Predicate<Choffer> criterioFiltro = c -> (c.getLeGustaSuTrabajo() == false && c.getCantidadDeAccidentes() > 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
}
