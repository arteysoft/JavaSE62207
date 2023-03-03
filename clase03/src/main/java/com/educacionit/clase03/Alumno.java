package com.educacionit.clase03;

// plantilla de alumnos
class Alumno {
// caracteristicas o atributos (variables y/o constantes)
	String nombre;
	String apellido;
	boolean activo; // false
	String[] cursos;

	// comportamientos o Algoritmos (metodos) ENviar Mensaje

	void imprimir() {
		System.out.println("Imprimiendo..." + nombre + " - " + apellido + " - " + activo);
	}

	void guardar() {
		System.out.println("Guardando..." + nombre + " - " + apellido);
	}

}
