package edu.it.clase11.service;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import edu.it.clase11.dto.Choffer;

public class EjemploFiltroChofer {
	public static void ejemploNormal() {
		var poblarChoferes = new PoblarArrayChoferes();
				
		var listaChoffer = poblarChoferes.run();
		var filtroChoferes = new FiltroChoferes(listaChoffer);
		
		for (Choffer c : filtroChoferes.obtChoferesLesgustaSuTrabajoSinAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesNoLesgustaSuTrabajoSinAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesLesgustaSuTrabajoConAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesNoLesgustaSuTrabajoConAccidentes()) {
			System.out.println(c);
		}
		System.out.println();
		for (Choffer c : filtroChoferes.obtChoferesConNombreSalvador()) {
			System.out.println(c);
		}
		System.out.println();
	}
	public static void ejemploConStream() {
		var poblarChoferes = new PoblarArrayChoferes();
		
		var listaChoffer = poblarChoferes.run();
		
		var choferesQueContienenLaLetraA = listaChoffer
												.stream()
												.filter(z -> z.getNombre().contains("a") && z.getNombre().contains("o"))
												.filter(z -> z.getCantidadDeAccidentes() > 4)
												.filter(z -> z.getLeGustaSuTrabajo())
												.collect(Collectors.toList());
		
		for (Choffer c : choferesQueContienenLaLetraA) {
			System.out.println(c);
		}
	}
	public static void presentacionFunction() {
		Function<String, Integer> contablizarCaracteres = z -> z.length();
		
		System.out.println(contablizarCaracteres.apply("hola"));
	}
	public static void presentacionMap() {
		var poblarChoferes = new PoblarArrayChoferes();
		
		var listaChoffer = poblarChoferes.run();
		
		listaChoffer
				.stream()
				.filter(z -> z.getCantidadDeAccidentes() > 0)
				.map(z -> new Gson().toJson(z).toString())
				// .peek(z -> System.out.println(z))
				.forEach(json -> { 
					System.out.println(json);
					System.out.println("***********");
				});
	}
	private static Optional<Integer> tomarUnEnteroPorPantalla() {
		try {
			Scanner scn = new Scanner(System.in);
			int x = scn.nextInt();
			return Optional.of(x);
		}
		catch (Exception ex) {
			return Optional.empty();
		}
	}
	public static void presentacionOptional() {
		var poblarChoferes = new PoblarArrayChoferes();
		
		var listaChoffer = poblarChoferes.run();
		
		listaChoffer
				.stream()
				.peek(z -> System.out.println(z.getNombre()))
				.filter(z -> { 
					var opt = tomarUnEnteroPorPantalla();
					if (opt.isEmpty()) {
						return false;
					}
					if (opt.get() == 1) {
						return true;
					}
					if (opt.get() == 2) {
						return false;
					}
					return false;
				})
				.map(z -> new Gson().toJson(z).toString())
				.forEach(json -> { 
					System.out.println(json);
					System.out.println("***********");
				});
	}
}
