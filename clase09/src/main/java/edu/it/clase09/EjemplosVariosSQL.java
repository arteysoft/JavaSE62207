package edu.it.clase09;

import java.sql.*;

public class EjemplosVariosSQL implements Runnable {
	private Connection conn = null;
	
	private void insertarNuevoNumeroEncontrado(Long nuevoNumero) {
		try {
			String strSQL = "INSERT INTO numeros_primos (numero_encontrado) VALUES (?)";
			PreparedStatement prep = conn.prepareStatement(strSQL);
			prep.setLong(1, nuevoNumero);
			prep.execute();
			prep.close();
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			throw new RuntimeException("NO SE PUDO INSERTAR NUMERO PRIMO");
		}
	}
	
	private MiRespuesta abrirConexion() {
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/JavaSE62207", "root", "");
			return new MiRespuesta(null);
		}
		catch (Exception ex) {
			return new MiRespuesta(ex.getClass().toString(), ex.getStackTrace());
		}
	}
	
	private MiRespuesta<Long> obtenerCantidadItemsEncontrados(long x) {
		// ver cuantas veces encontro el item x
		PreparedStatement prep = null;
		
		try {
			String strSQL = "SELECT COUNT(*) FROM numeros_primos where numero_encontrado = (?)";
			prep = conn.prepareStatement(strSQL);
			prep.setLong(1, x);
			ResultSet rs = prep.executeQuery();
			
			rs.next();
			return new MiRespuesta<Long>(rs.getLong(1));
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			return new MiRespuesta<Long>(ex.getMessage(), ex.getStackTrace());
		}
		finally {
			try { prep.close();	} catch (Exception ex2) {}
		}
	}
	
	private Boolean esDivisiblePorAlgunoDeLosNumerosDeLaTabla(Long dividendo) {
		PreparedStatement prep = null;
		
		try {
			String strSQL = "SELECT * FROM numeros_primos";
			prep = conn.prepareStatement(strSQL);			
			ResultSet rs = prep.executeQuery();
			
			while (rs.next()) {
				Long divisor = rs.getLong(1);
				
				if (dividendo % divisor == 0L) {
					return true;
				}
			}
			return false;
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			throw new RuntimeException();
		}
		finally {
			try { prep.close();	} catch (Exception ex2) {}
		}
	}
	private void obtenerNumerosPrimos() {
		Long incrementador = 2L;
		
		for (;;) {
			if (esDivisiblePorAlgunoDeLosNumerosDeLaTabla(incrementador) == false) {
				// INSERTARLO EN LA TABLA X Q ES PRIMO TB
				insertarNuevoNumeroEncontrado(incrementador);
				System.out.println(incrementador);
			}
			incrementador++;
		}
	}
	
	@Override
	public void run() {
		// 1) Un api comun para acceder a cualquier base de datos, ese api se llama JDBC
		// 2) Muchos Drivers que implementan ese api jdbc
		// 3) Un connection string que es una specificacion para indiciarle IP, PUERTO, TIPO BASE, etc
		// en el package java.sql esta el api de JDBC
		
		MiRespuesta resp = abrirConexion();
		if (resp.fueSatisfactoria == false) {
			System.out.println(resp.tipoException);
			return;
		}
		
		try {
			obtenerNumerosPrimos();
			conn.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
