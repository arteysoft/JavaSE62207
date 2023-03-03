package com.educacionit.clase04;

import com.educacionit.entidades.Alumno;
import com.educacionit.entidades.Persona;
import com.educacionit.entidades.Profesor;

public class PruebaPersona {
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setTipoDocumento("DNI");
		persona.setNumeroDocumento(12);
		persona.setNombre("Octavio");
		persona.setApellido("Robleto");
		persona.setFechaNacimiento("1900-01-01");

		Alumno alumno = new Alumno();
		alumno.setTipoDocumento("PAS");
		alumno.setNumeroDocumento(13);
		alumno.setNombre("Barbara");
		alumno.setApellido("Silva");
		alumno.setFechaNacimiento("1900-01-01");
		//alumno.

		Profesor profesor = new Profesor();
		profesor.setTipoDocumento("LE");
		profesor.setNumeroDocumento(14);
		profesor.setNombre("Nicolas");
		profesor.setApellido("Rapetti");
		profesor.setSueldo(2000000);
		profesor.setFechaNacimiento("1902-01-01");
		profesor.setFechaIngreso("2023-01-01");
		//profesor.
		/*
		 * String[] cursos = {"Java", "Python"}; profesor.setCursos(cursos);
		 */
		profesor.setCursos(new String[] { "Java", "Python" });

		System.out.println(persona.mostrarDatos());
		System.out.println(alumno.mostrarDatos());
		System.out.println(profesor.mostrarDatos());

	}
}
