package edu.it.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import edu.it.basededatos.Alumno;
import edu.it.basededatos.UtilesAlumno;

public class GeneracionAlumnoController extends HttpServlet {
	Logger logger = Logger.getLogger(getClass());
	List<Alumno> lista = new ArrayList<Alumno>();
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            
            try {
            	for (int x : new int[5]) {
            		var alumno = UtilesAlumno.generarAlumnoRandom();
            		lista.add(alumno);
            	}
            	
            	var strOut = new Gson().toJson(lista);
            	
            	out.println(strOut);
                response.setStatus(200);
            }
            catch (Exception ex) {
            	throw new IOException(ex.getMessage());
            }
    }
}
