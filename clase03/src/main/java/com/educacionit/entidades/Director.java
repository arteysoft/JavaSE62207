package com.educacionit.entidades;

public class Director {
	private String nombre;
	private boolean activo;
	private int edad;
	private float sueldo;

	public Director() {

	}

	public Director(String nombre, boolean activo, int edad, float sueldo) {
		super();
		this.nombre = nombre;
		this.activo = activo;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
