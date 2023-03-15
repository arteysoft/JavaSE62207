package edu.it.clase7.genericos;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class EjemploMapa implements Runnable {
	public void run() {
		Map<String, String> mapa = new HashMap<String, String>();
		
		mapa.put("-", "HYPHEN-MINUS");
		mapa.put("0", "DIGIT ZERO");
		mapa.put("=", "EQUALS SIGN");
		mapa.put("=", "SIGNO IGUAL");
		
		// System.out.println(mapa.get("-"));
		// System.out.println(mapa.containsKey(new Date(2222)));
		
		for (String z : mapa.keySet()) {
			System.out.println(z);
			System.out.println(mapa.get(z));
		}
	}
}
