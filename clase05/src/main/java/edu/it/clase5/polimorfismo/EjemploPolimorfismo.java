package edu.it.clase5.polimorfismo;

/*
 * El polimorfismo es la parte 2 de la abstraccion porque va un paso mas alla
 */


/*
abstract class ObjetoVolador {
	abstract public void despegar();
	abstract public void volar();
	abstract public void aterrizar();
}
*/

interface ObjetoVolador {
	void despegar();
	void volar();
	void aterrizar();
}

class Helicoptero implements ObjetoVolador {

	@Override
	public void despegar() {
		System.out.println("Se eleva en altura lineal");
	}

	@Override
	public void volar() {
		System.out.println("Viaja a max 80 km/h");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterriza en forma lineal");
	}	
}

class HelicopteroPresidencial extends Helicoptero {

	@Override
	public void despegar() {
		System.out.println("Se eleva en altura lineal... con la seguridad presente");
	}

	@Override
	public void volar() {
		System.out.println("Viaja a max 80 km/h... con la seguridad presente");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterriza en forma lineal... con la seguridad presente");
	}	
}



class Ovni implements ObjetoVolador {

	@Override
	public void despegar() {
		System.out.println("No sabemos de donde salio");
		
	}

	@Override
	public void volar() {
		System.out.println("Hay miedo de que vengan enanos verdes");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("Nos conquistan");
	}
}

class Piedrazo implements ObjetoVolador {

	@Override
	public void despegar() {
		System.out.println("Sale de una mano misteriosa");
		
	}

	@Override
	public void volar() {
		System.out.println("Va dirijido a un orador del palco");
		
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterrizaje lamentable");
	}
	
}

public class EjemploPolimorfismo  {
	public void hacerVolarLoQueVenga(ObjetoVolador...arrObjetoVolador) {
		for (ObjetoVolador ov : arrObjetoVolador) {
			ov.despegar();
			ov.volar();
			ov.aterrizar();
		}
	}
	public void run(String nombreDeLaClase) {
		// hacerVolarLoQueVenga(new Ovni(), new Piedrazo(), new Helicoptero());
		
		// Try Catch Clase Siguiente
		// Class.forName // No entra en el curso
		
		try {
			System.out.println("Instanciando ..." + nombreDeLaClase);
			ObjetoVolador ob = (ObjetoVolador)Class.forName(nombreDeLaClase)
								.newInstance();
			
			ob.despegar();
			ob.volar();
			ob.aterrizar();
		}
		catch (Exception ex) {
			System.out.println("Exception");
			System.out.println(ex.getMessage());
		}
	}
}
