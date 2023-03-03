package com.educacionit.clase03;

// DEAFULT 
public class Profesor {
	public String nombre;
	private String apellido;
	protected int edad;

	final String CARGO = "PROFESOR";// NO SE MODIFIQUE

	protected Profesor() {
		// System.out.println(datos());
	}

	private Profesor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Profesor(String nombre) {
		this.nombre = nombre;
	}

	public String datos() {
		String datos = "Nombre: " + nombre + ", Apellido: " + apellido + " - " + inicialNombre();
		return datos;
	}

	private char inicialNombre() {
		return nombre.charAt(0);
	}

	protected String apellidoMayuscula() {
		return apellido.toUpperCase();
	}

}
