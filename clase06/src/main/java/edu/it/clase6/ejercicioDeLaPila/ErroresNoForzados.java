package edu.it.clase6.ejercicioDeLaPila;

import java.io.File;
import java.io.FileNotFoundException;

// Estas se llaman Checked Exceptions derivan de Exception

public class ErroresNoForzados implements Runnable {

	private void m6(int x) throws FileNotFoundException, Exception {
		if (x == 0) {
			throw new Exception("Guarda que estan intentando dividir por zero");
		}
		File f = new File("c:/var/keys/hola.txt");
		if ((f.exists() && f.canRead()) == false) {
			throw new java.io.FileNotFoundException(); 
		}
		
		System.out.println(10000 / x);
	}
	
	private void m5(int x) throws Exception {
		m6(x + 1);
	}
	
	private void m4(int x) throws Exception {
		m5(x + 1);
	}
	
	private void m3(int x) throws Exception {
		try {
			m4(x + 1);
		}
		catch (Exception ex) {
			throw ex;
		}
	}
	
	private void m2(int x) throws Exception {
		m3(x + 1);
	}
	
	private void m1(int x) throws Exception {
		m2(x + 1);
	}
	@Override
	public void run() {
		try {
			m1(4);
			System.out.println("UBER PEDIDO CORRECTAMENTE");
		}
		catch (java.io.FileNotFoundException ex) {
			System.out.println("Guarda que no existe el archivo");
		}
		catch (java.io.IOException ex) {
			
		}		
		catch (Exception ex) {
			System.out.println("Aritmeticamente imposible");
		}		
	}	
}
