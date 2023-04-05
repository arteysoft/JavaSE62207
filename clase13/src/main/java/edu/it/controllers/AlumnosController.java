package edu.it.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import edu.it.basededatos.AlumnoDTO;
import edu.it.basededatos.ConnectionCreator;
import edu.it.basededatos.ConnectionCreatorMariaDB;
import edu.it.basededatos.PruebaBaseDeDatos;
import edu.it.basededatos.UtilesAlumno;
import edu.it.dao.AlumnoDao;

public class AlumnosController extends HttpServlet {
	Logger logger = Logger.getLogger(getClass());
	
	private Connection obtenerConexion() {
		ConnectionCreator creator = new ConnectionCreatorMariaDB();
    	return creator.crearConexion();
	}
    private void insertarEnLaBD(AlumnoDTO alumno) throws Exception {
    	var conn = obtenerConexion();
    	new AlumnoDao(conn).insert(alumno);
    }
	private List<AlumnoDTO> traerAlumnosBaseDeDatos() throws Exception {
		var conn = obtenerConexion();
		return new AlumnoDao(conn).select();
    }
	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            
            try {
            	var listaAlu = traerAlumnosBaseDeDatos();
            	String json = new Gson().toJson(listaAlu);
                
                out.println(json);
                response.setStatus(200);
            }
            catch (Exception ex) {
            	throw new IOException(ex.getMessage());
            }
    }
	public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
		
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        try {
        	// 1) Desserializar lo que venga en el cuerpo del HTTP Request
        	// Convertir de JSON a Objeto
        	
            var lector = new BufferedReader(new InputStreamReader(request.getInputStream()));
            var strBld = new StringBuilder();
        	
            for (String leido = lector.readLine(); leido != null; leido = lector.readLine()) {
            	strBld.append(leido);
            }
            
            System.out.println(strBld);
            
            var alumno = new Gson().fromJson(strBld.toString(), AlumnoDTO.class);
        	
        	// 2) Una vez deserializado, crear la conexion e insertar en la base SQL
            insertarEnLaBD(alumno);
        }
        catch (Exception ex) {
        	logger.error(ex.getMessage());
        	throw new IOException();
        }
        
        ArrayList<Object> mapa =
        		new ArrayList<>();
        
        mapa.add("Alumno");
        mapa.add("Creado");
        
        String json = new Gson().toJson(mapa);
        
        out.println(json);
        response.setStatus(201);
	}
	public void doDelete(HttpServletRequest request, HttpServletResponse response)
	        throws IOException, ServletException {
		
		response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        
        try {
        	var id = request.getPathInfo().replace("/", "");
        	new AlumnoDao(obtenerConexion()).delete(id);
        	
        	response.setStatus(200);
        }
        catch (Exception ex) {
        	response.setStatus(500);
        }
		
		System.out.println();
		
	}
}
