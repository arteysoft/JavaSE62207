package edu.it.clase09;

public class MiRespuesta<T> {
	public final boolean fueSatisfactoria;
	public T datos;
	public final String tipoException;
	public final StackTraceElement[] stackTrace;
	
	public MiRespuesta(T t) {
		this.datos = t;
		this.fueSatisfactoria = true;
		this.tipoException = null;
		this.stackTrace = null;
	}
	
	public MiRespuesta(String tipoException, StackTraceElement[] stackTrace) {
		this.fueSatisfactoria = false;
		this.tipoException = tipoException;
		this.stackTrace = stackTrace;
	}
}
