package com.educacionit.ciclos;

public class Mientras2 {
	public static void main(String[] args) {
		// quiero saber en cuantos meses el producto X supera los 500$
		// con una inflacion de 1 digito maximo que debe ser aleatoria
		float precioX = 5.36f;
		int cantidadMeses = 0;
		// 2%

		while (precioX <= 500) {
			cantidadMeses++;
			double random = Math.random();
			double inf = Math.round(random * 1);
			double infAux = (inf / 100) + 1;
			precioX *= infAux;
			//System.out.println(String.format("Inflacion fue del %.2f el Precio Final es de: %.2f", inf, precioX));
		}
		System.out.println("El producto supero los 500$ en " + cantidadMeses + " meses y llego a "
				+ String.format("%.2f $", precioX));

	}

}
