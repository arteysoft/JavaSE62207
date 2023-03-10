package edu.it.clase7;

import java.io.File;
import java.io.IOException;
import edu.it.clase7.errores.MiIOException;

public class PasarDeChequedUnchequed {
	public void escribirArchivo() {
		try {
			org.apache.commons.io.FileUtils.writeStringToFile(
					new File("/var/2023_03_10/hola.txt"), 
					"hola" + System.currentTimeMillis(), 
					"utf8");
		}
		catch (IOException ex) {
			throw new MiIOException();
		}
	}
	public void run() {
		try {
			escribirArchivo();
		}
		catch (Exception ex) {
			System.out.println("No se pudo escribir el archivo");
			ex.printStackTrace();
		}
		
	}
}
