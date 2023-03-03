package com.educacionit.entidades;

import com.educacionit.utilidades.Contadores;

public class Usuario {
	private int id = 9;// 1 2 3 4
	private String correo = "rafa";
	private static int contadorID = 0;

	public Usuario() {
		contadorID++;// 1
		id = contadorID;
	}

	public String mostrarDatos() {
		String datos = id + " de " + contadorID + " - " + correo;
		return datos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
