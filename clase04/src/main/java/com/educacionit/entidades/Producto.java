package com.educacionit.entidades;

// Cuenta corriente - Caja de Ahorro - Plazo Fijo
// Productos P, Productos kilo, productos unidas, Servicio
public class Producto {
	// private o protected
	private byte sucursal;
	private String codigoPostal;//
	private int numero;
	private String tipo;
	private float saldo;
	public static byte banco = (byte) 126;// comafi

	public Producto() {
		super();
	}

	public Producto(byte sucursal, String codigoPostal, int numero, String tipo, float saldo) {
		super();
		this.sucursal = sucursal;
		this.codigoPostal = codigoPostal;
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public byte getSucursal() {
		return sucursal;
	}

	public void setSucursal(byte sucursal) {
		if (sucursal < 0 || sucursal > 5) {
			System.out.println("No es una sucursal valida"); // generar advertencia
		}
		this.sucursal = sucursal;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

//Producto.numeroProducto() ;
	public static String numeroProducto() {
		String numeroProducto = String.format("%010d", aleatorio());
		return numeroProducto;
	}
	// instancia

	private static int aleatorio() {
		return ((int) (Math.random() * 1000));
	}

}
