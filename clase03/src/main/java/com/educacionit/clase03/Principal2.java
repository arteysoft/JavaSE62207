package com.educacionit.clase03;

import javax.swing.JOptionPane;

public class Principal2 {
	public static void main(String[] args) {

		Producto miProducto;
		miProducto = new Producto();

		miProducto.descripcion = "Chocolate EduIT";
		miProducto.precio = 26.3f;
		miProducto.cantidad = 30;

		String datos = miProducto.datos();
		System.out.println(datos);

		miProducto.cambiarEstado(true);
		System.out.println(miProducto.datos());
		miProducto.cambiarEstado(false);
		JOptionPane.showMessageDialog(null, miProducto.datos());
		float precioProductoNuevo = miProducto.oferta(0.90f);

		System.out.println(precioProductoNuevo);
		System.out.println(miProducto.precio);
		miProducto.datos();
		System.out.println(miProducto.oferta(0.70f));
		miProducto.datos();
		
		
		Producto producto2 = new Producto(5.6f);
		System.out.println(producto2.datos());
		
		Producto producto3 = new Producto(39.36f, "Barra de Turron", true, 7);
		System.out.println(producto3.datos());

	}
}
