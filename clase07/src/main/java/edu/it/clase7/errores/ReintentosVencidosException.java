package edu.it.clase7.errores;

public class ReintentosVencidosException extends AVazquezException {
	public ReintentosVencidosException() {
		super("Se ha vencido la cantidad de reintentos");
	}
}
