package edu.it.clase5.casteo;

/*
 * Con esto ? vimos casteo pero mas importante vimos abstraccion parte1
 */

public class EjemploCasteo {
	public void inivisibilizarTodosLosElementos(Elemento... arrElemento) {
		for (Elemento t : arrElemento) {
			t.setVisible(false);
		}
	}
	public void invisibilizarTodo(Object... todos) {
		for (Object t : todos) {
			Elemento elem = (Elemento)t;
			elem.setVisible(false);
		}
	}
	public void run() {
		Button btnAceptar = new Button();
		btnAceptar.setVisible(true);
		Button btnRechazar = new Button();
		btnRechazar.setVisible(false);
		RadioGroup rdMultipleChoice = new RadioGroup();
		invisibilizarTodo(btnAceptar, btnRechazar, rdMultipleChoice);
	}
}
