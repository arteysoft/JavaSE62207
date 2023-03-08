package edu.it.clase6.ejercicioDeLaPila;

// Unchecked exceptions derivan de RuntimeException

public class ErroresForzados implements Runnable {

	private void mostrarToString(String str) {
		System.out.println(str.toString());
	}
	private int dividirEnteros(int x, int y) {
		return x / y;
	}
	private int ejemplo1(int[] arrayDeEnteros, int pos) {
		/* Este metodo va a retornar el valor de la posicion indicada en el segundo parametro */
		/* Ahora bien, que pasa si el segundo parametro esta por fuera de los limites del array */
		return arrayDeEnteros[pos];
	}
	
	@Override
	public void run() {
		int z; 
		
		try {
			z = ejemplo1(new int[] {2, 3, 7, 6, 43, 21, 33}, 4);
			z = dividirEnteros(55, 1);
			mostrarToString("Un string");
		}
		catch (RuntimeException ex) {
			ex.printStackTrace();
		}
	}
}
