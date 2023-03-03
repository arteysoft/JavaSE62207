package com.educacionit.entidades;

import javax.swing.JOptionPane;

public class Moderadora {
	private String nombre;
	private int edad;

	public Moderadora() {

	}

	public Moderadora(String nombre, int edad) {
		super();
		this.nombre = nombre;
		setEdad(edad);
		/*
		 * if (edad<1) { JOptionPane.showMessageDialog(null,
		 * "No puede ser una edad negativa... "); } this.edad = edad;
		 */
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 1) {
			JOptionPane.showMessageDialog(null, "No puede ser una edad negativa... " + edad);
		}
		this.edad = edad;
	}

	// getter and setter

}
