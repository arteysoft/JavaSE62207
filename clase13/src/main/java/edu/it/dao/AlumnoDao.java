package edu.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.it.basededatos.AlumnoDTO;

public class AlumnoDao {
	private Connection conn;
	
	public AlumnoDao(Connection conn) {
		this.conn = conn;
	}
	public List<AlumnoDTO> select() {
		
		List<AlumnoDTO> lstRet = new ArrayList<AlumnoDTO>();
		
		try {
			PreparedStatement prep = conn.prepareStatement("SELECT * FROM usuarios ");
			
			ResultSet rs = prep.executeQuery();
			
			for (;rs.next();) {
				AlumnoDTO a = new AlumnoDTO();
				a.id = rs.getString("id");
				a.nombre = rs.getString("nombre");
				a.apellido = rs.getString("apellido");
				a.calle = rs.getString("calle");
				a.calleNumero = rs.getString("calle_numero");
				a.estado = rs.getString("estado");
				a.pais = rs.getString("pais");
				
				lstRet.add(a);
			}
			
			prep.close();
			
			return lstRet;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex.getMessage());
		}
	}
	public void insert(AlumnoDTO u) {
		try {
			PreparedStatement prep = conn.prepareStatement("INSERT usuarios (id, nombre, apellido, calle, calle_numero, estado, pais" 
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
	public void update(AlumnoDTO u) {
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
