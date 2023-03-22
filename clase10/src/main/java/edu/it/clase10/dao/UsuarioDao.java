package edu.it.clase10.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import edu.it.clase10.model.UsuarioDTO;

public class UsuarioDao {
	private Connection conn;
	
	public UsuarioDao(Connection conn) {
		this.conn = conn;
	}
	public void insert(UsuarioDTO u) {
		try {
			PreparedStatement prep = conn.prepareStatement("INSERT usuarios (id, nombre, apellido, calle, calleNumero, estado, pais" 
					+ ") values (?,?,?,?,?,?,?)");
			
			prep.setString(1, u.id);
			prep.setString(2, u.nombre);
			prep.setString(3, u.apellido);
			prep.setString(4, u.calle);
			prep.setString(5, u.calleNumero);
			prep.setString(6, u.estado);
			prep.setString(7, u.pais);
			
			prep.execute();
			prep.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void update(UsuarioDTO u) {
		// UPDATE usuarios SET calle = 'calle'
	}
	public void delete(String id) {
		try {
			PreparedStatement prep = conn.prepareStatement("DELETE FROM usuarios WHERE id = ?");			
			prep.setString(1, id);
			
			prep.execute();
			prep.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
