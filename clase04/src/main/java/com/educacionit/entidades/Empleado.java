package com.educacionit.entidades;

public class Empleado extends Persona {
	private double sueldo;
	private String fechaIngreso;
	
	public Empleado() {
		
	}

	public Empleado(String tipoDocumento, int numeroDocumento, String nombre, String apellido, double sueldo,
			String fechaIngreso) {
		super(tipoDocumento, numeroDocumento, nombre, apellido);
		
		this.sueldo = sueldo;
		this.fechaIngreso = fechaIngreso;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
