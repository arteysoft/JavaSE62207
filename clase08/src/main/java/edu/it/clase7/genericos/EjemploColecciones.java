package edu.it.clase7.genericos;

import java.util.ArrayList;
import java.util.List;

import edu.it.clase7.Ejecutable;

public class EjemploColecciones implements Ejecutable {
	public void run() {
		List<Integer> lista = new ArrayList<>();
		
		lista.add(3);
		lista.add(8);
		lista.add(44);
		
		for (Integer z : lista) {
			System.out.println(z);
		}
		
		List listaDeObjetos = new ArrayList();
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}	
}
