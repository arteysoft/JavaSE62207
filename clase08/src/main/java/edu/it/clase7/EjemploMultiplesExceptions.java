package edu.it.clase7;

import java.util.Scanner;

import edu.it.clase7.errores.AVazquezException;
import edu.it.clase7.errores.CantidadDeDigitosIncorrectaException;
import edu.it.clase7.errores.DigitosNoNumericosException;

public class EjemploMultiplesExceptions implements Ejecutable {
	private Boolean esConvertibleAInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}
		catch (Exception ex) {
			return false;
		}
	}
	private Integer ingresarPorTeclado() {
		Scanner scn = null;
		Integer i = 0;
		
		try {
			scn = new Scanner(System.in);
			String linea = scn.nextLine();
			if (linea.length() > 4 || linea.length() < 3) {
				throw new edu.it.clase7.errores.CantidadDeDigitosIncorrectaException();
			}
			if (esConvertibleAInteger(linea) == false) {
				throw new edu.it.clase7.errores.DigitosNoNumericosException();
			}
			i = Integer.parseInt(linea);
		}
		finally {
			System.out.println("Llamando a close");
			scn.close();
		}		
		return i;
	}
	
	public void run() {
		try {
			int z = ingresarPorTeclado();
			if (3000 == z) {
				return;
			}
			System.out.println("Es distinto de 3000");
		}
		catch (AVazquezException ex) {
			System.out.println(ex.getMessage());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("SE EJECUTA SIEMPRE");
		}
	}
}
