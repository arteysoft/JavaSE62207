package edu.it.clase5.sobrecarga;

class SobreEscribeAlgo extends Object {
	@Override
	public String toString() {
		return "HOLA MUNDO SOBREESCRITURA";
	}
}

public class EjemploSobreCarga {
	private Integer suma(Integer x, Integer y, Integer z) {
		return x + y + z;
	}
	private Integer suma(Integer x, Integer y) {
		return x + y;
	}
	public void run() {
		Object z = new SobreEscribeAlgo();
		System.out.println(z);
	}
}
