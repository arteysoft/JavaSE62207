package edu.it.clase11.dto;

public class Choffer {
	private String nombre;
	private Boolean leGustaSuTrabajo;
	private Integer cantidadDeAccidentes;
	
	public Choffer(String nombre, Boolean leGustaSuTrabajo, Integer cantidadDeAccidentes) {
		this.nombre = nombre;
		this.leGustaSuTrabajo = leGustaSuTrabajo;
		this.cantidadDeAccidentes = cantidadDeAccidentes;
	}

	public Choffer() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public Choffer setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public Boolean getLeGustaSuTrabajo() {
		return leGustaSuTrabajo;
	}

	public Choffer setLeGustaSuTrabajo(Boolean leGustaSuTrabajo) {
		this.leGustaSuTrabajo = leGustaSuTrabajo;
		return this;
	}

	public Integer getCantidadDeAccidentes() {
		return cantidadDeAccidentes;
	}

	public Choffer setCantidadDeAccidentes(Integer cantidadDeAccidentes) {
		this.cantidadDeAccidentes = cantidadDeAccidentes;
		return this;
	}

	@Override
	public String toString() {
		return "Choffer [nombre=" + nombre + ", leGustaSuTrabajo=" + leGustaSuTrabajo + ", cantidadDeAccidentes="
				+ cantidadDeAccidentes + "]";
	}
}
