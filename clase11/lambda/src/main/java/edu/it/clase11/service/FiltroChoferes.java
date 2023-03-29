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
	
	public List<Choffer> obtChoferesConNombreSalvador() {
		CriterioFiltroChofer crit = c -> c.getNombre().equals("Salvador");
		return obtChoferesSegunCriterio(crit);
	}
	
	public List<Choffer> obtChoferesLesgustaSuTrabajoSinAccidentes() {
		CriterioFiltroChofer criterioFiltro = c -> (c.getLeGustaSuTrabajo() && c.getCantidadDeAccidentes() == 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
	public List<Choffer> obtChoferesNoLesgustaSuTrabajoSinAccidentes() {
		CriterioFiltroChofer criterioFiltro = c -> (c.getLeGustaSuTrabajo() == false && c.getCantidadDeAccidentes() == 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
	public List<Choffer> obtChoferesLesgustaSuTrabajoConAccidentes() {
		CriterioFiltroChofer criterioFiltro = c -> (c.getLeGustaSuTrabajo() && c.getCantidadDeAccidentes() > 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
	public List<Choffer> obtChoferesNoLesgustaSuTrabajoConAccidentes() {
		CriterioFiltroChofer criterioFiltro = c -> (c.getLeGustaSuTrabajo() == false && c.getCantidadDeAccidentes() > 0);
		return obtChoferesSegunCriterio(criterioFiltro);
	}
}
