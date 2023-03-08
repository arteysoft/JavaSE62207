package edu.it.clase6.ejercicioDeLaPila;

public class PilaStack implements Runnable {
	private void m6(String s) {
		System.out.println("Llegue a m6");
		System.out.println(s);
	}
	private void chequearStringNuloOVacio(String s) {
		if ((s == null ) || ("".equals(s))) {
			throw new RuntimeException("El string no puede ser vacio");
		}
	}
	private CodigoReserva generarCodigoDeReserva(int x) {
		StringBuilder strBld = new StringBuilder();
		for (int z = 1; z < x; z++) {
			strBld.append("z");
		}
		try {
			chequearStringNuloOVacio(strBld.toString());
			m6("Resultado: ".concat(strBld.toString()));
			
			CodigoReserva codReserva = new CodigoReserva();
			codReserva.codigoStr = strBld.toString();
			return codReserva;
		}
		catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
			throw new RuntimeException("No se pudo crear la reserva");
		} 
	}
	private CodigoReserva m3(int x) {
		System.out.println("Antes de llamar a m4");
		CodigoReserva resultado = generarCodigoDeReserva(x + 1);
		System.out.println("Despues de llamar a m4");
		return resultado;
	}
	private CodigoReserva m2(int x) {
		CodigoReserva resultado = m3(x + 2);
		return resultado;
	}
	private CodigoReserva realizarReserva(int x) {
		CodigoReserva resultado = m2(x + x);
		return resultado;
	}
	public void run() {
		try {
			CodigoReserva codReserva = realizarReserva(-2);
			System.out.println("La reserva se realizo correctamente");
			System.out.println("Su código es el: " + codReserva.codigoStr);
		}
		catch (Exception ex) {
			System.out.println("NO se pudo realizar la reserva");
		}
	}
}
