package com.educacionit.entidades;
// Object
public class Persona{
	private String tipoDocumento; // DNI - PAS - CI
	private int numeroDocumento;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;


	public Persona() {
		
	}
	public Persona(String tipoDocumento, int numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public Persona(String tipoDocumento, int numeroDocumento, String nombre, String apellido) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String mostrarDatos() {
		String datos = tipoDocumento + " " + numeroDocumento + " " + nombre + " " + apellido + " " + fechaNacimiento;
		return datos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
