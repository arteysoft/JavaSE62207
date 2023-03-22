package edu.it.clase10;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import edu.it.clase10.componentes.ConectorJPA;
import edu.it.clase10.componentes.ConnectionCreatorMariaDB;
import edu.it.clase10.dao.UsuarioDao;
import edu.it.clase10.model.UsuarioDTO;
import edu.it.clase10.utiles.UtilesUsuario;

public class GeneradorUsuariosRandom {
	public void run() {
		// ConnectionCreatorMariaDB connectionCreator = new ConnectionCreatorMariaDB();
		// UsuarioDao usuarioDao = new UsuarioDao(connectionCreator.crearConexion());
		
		EntityManager em = new ConectorJPA().getEntityManager();
		
		try {
			for (int x = 1; x <= 10; x++) {
				UsuarioDTO usuario = UtilesUsuario.generarUsuarioRandom();
				// 	usuarioDao.insert(usuario);			
			
				EntityTransaction tx = em.getTransaction();
				tx.begin();
				em.persist(usuario);
				tx.commit();
				
				System.out.println(usuario);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
