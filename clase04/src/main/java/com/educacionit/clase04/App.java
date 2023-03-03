package com.educacionit.clase04;

import com.educacionit.entidades.Producto;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		// System.out;
		/*System.out.println(Math.PI);
		Math mate = new Math();
		mate.PI;
		*/
		System.out.println(Producto.banco);
		Producto.banco = 88;
		System.out.println(Producto.banco);

		Producto producto = new Producto();
		producto.setSucursal((byte) 5);
		// producto.banco = (byte) 14;

		System.out.println(producto.getSucursal() + " - " + producto.banco);
		Producto producto2 = new Producto();
		producto2.setSucursal((byte) 4);
		// producto2.banco = (byte) 15;

		System.out.println(producto2.getSucursal() + " - " + producto2.banco);
		
		System.out.println(Producto.numeroProducto());
	}
}
