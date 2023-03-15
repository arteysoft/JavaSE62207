package edu.it.clase7.genericos;

import java.util.ArrayList;
import java.util.List;

public class EjemploNumerosPrimos {
	private Long numeroAveriguar = 0L;
	private List<Long> numerosPrimos = new ArrayList<Long>();
	
	public EjemploNumerosPrimos(Long numeroAveriguar) {
		this.numeroAveriguar = numeroAveriguar;
		
	}
	private Boolean esDivisiblePorAlgunoDeLosNumerosDelArrayList(Long dividendo) {
		for (Long divisor : numerosPrimos) {
			if (dividendo % divisor == 0L) {
				return true;
			}
		}
		return false;
	}
	public Boolean esPrimo() {
		Long incrementador = 3L;
		
		if (numeroAveriguar == 2L) {
			return true;
		}
		numerosPrimos.add(2L);
		
		while (numeroAveriguar > incrementador) {
			// si incrementador es disivisble por alguno de los numeros que hay en el arrayList ?
			// NO ES PRIMO
			// ELSE: ES PRIMO
			if (esDivisiblePorAlgunoDeLosNumerosDelArrayList(incrementador) == false) {
				numerosPrimos.add(incrementador);
				System.out.println(incrementador);
			}
			incrementador++;
		}

		return numerosPrimos.contains(incrementador);
	}
}
