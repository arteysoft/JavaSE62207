package edu.it.controllers;

import java.io.IOException;
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

public class PruebaController extends HttpServlet {
	Logger logger = Logger.getLogger(getClass());

	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            try {
            	out.println("<h1>");
                out.println("Hola amigos: " + System.currentTimeMillis());
                out.println("</h1>");
                response.setStatus(200);
            }
            catch (Exception ex) {
            	throw new IOException(ex.getMessage());
            }
    }
}
