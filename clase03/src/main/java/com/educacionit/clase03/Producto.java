package com.educacionit.clase03;

class Producto {
	float precio; // 0.0
	boolean activo;// false
	String descripcion; // null
	int cantidad; // inventario -> 0

	// constructor -> forma de inicializar un objeto
	Producto() {
		System.out.println("inicializando un producto");
	}

	Producto(float precio) {
		this.precio = precio;
	}

	Producto(int cantidad) {
		this.cantidad = cantidad;
	}

	Producto(float precio, String descripcion, boolean activo, int cantidad) {
		this.precio = precio;
		this.descripcion = descripcion;
		this.activo = activo;
		this.cantidad = cantidad;
	}

	// todos los metodos tienen la capacidad de recibir parametros

	// metodos de tipo procedimiento
	void cambiarEstado(boolean activo) {// true 1 = 1
		// float activo;
		this.activo = activo;
	}
	/*
	 * void activar() { activo = true; }
	 * 
	 * void desactivar() { activo = false; }
	 */
	// metodos de tipo funcion

	float oferta(float porcentaje) {

		// cambiar el valor del precio y devolver el nuevo precio
		precio *= porcentaje;
		System.out.println("Nuevo precio de " + this.descripcion + " es " + this.precio);

		return precio;

	}

	/**
	 * Resta del inventario (cantidad) el valor enviado en el parametro venta
	 * 
	 * @param venta es entero
	 */
	void vender(int venta) {
		cantidad -= venta;
	}

	/**
	 * Resta al inventario (cantidad) de uno en uno
	 */
	void vender() {
		cantidad--;
	}

	String datos() {
		// mas lineas de codigo
		return "Datos: " + descripcion + ", " + precio + ", " + activo + ", " + cantidad;
	}

}
