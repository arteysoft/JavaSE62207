package edu.it.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class StateLessController extends HttpServlet {
	Logger logger = Logger.getLogger(getClass());
	Map<String, String> mapa = new HashMap<String, String>();
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            
            try {
            	String idUsu = request.getParameter("idUsuario");
            	String valor = mapa.get(idUsu);
            	Integer cuenta = 0;
            	
            	if (valor == null) {
            		cuenta = 1000;
            	}
            	else {
            		cuenta = Integer.parseInt(mapa.get(idUsu));
            		cuenta++;
            		
            	}
            	mapa.put(idUsu, cuenta+"");
            	
            	var strOut = new Gson().toJson(mapa);
            	
            	out.println(strOut);
                response.setStatus(200);
            }
            catch (Exception ex) {
            	throw new IOException(ex.getMessage());
            }
    }
}
