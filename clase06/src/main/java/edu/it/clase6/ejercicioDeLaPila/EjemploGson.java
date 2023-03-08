package edu.it.clase6.ejercicioDeLaPila;

import java.io.File;
import java.nio.charset.Charset;
import com.google.gson.Gson;

public class EjemploGson implements Runnable {

	@Override
	public void run() {
		new Gson().toJson("Hola mundo");
		
		
	}

}
