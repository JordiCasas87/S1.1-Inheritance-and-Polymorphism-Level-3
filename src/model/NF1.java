package model;

public class NF1 extends Article {
	
	//atributos
	private String escuderia;

	
	//constructor
	public NF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}
	
	
	// getter y setter
	public String getEscuderia() {
		return this.escuderia;
	}


	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	
	
	/*Notícies d'F1:
	Preu inicial: 100 €
	Ferrari o Mercedes: 50 €
	*/

	@Override
	public void CalcularPrecio() {
		int totalPrecio = 100;

		if (escuderia.equalsIgnoreCase("Ferrari")||
				escuderia.equalsIgnoreCase("Mercedes"))
			totalPrecio += 50;

		System.out.println("El precio de esta noticia de Formula 1 es: "+totalPrecio+".");
		super.setPrecio (totalPrecio);
	}

/*puntuacion
	Notícies F1:
	4 punts
	Ferrari o Mercedes: 2 punts
	// calculo noticia precio
	 */


	//calculo puntuacion
	@Override
	public void CalcularPuntuacion() {
		
		int totalPuntuacion = 4;
		
		if (escuderia.equalsIgnoreCase("Ferrari")|| 
				escuderia.equalsIgnoreCase("Mercedes")) {
			totalPuntuacion += 2;
		}

		
		System.out.println("La puntuacion de esta noticia de Formula 1 es: "+totalPuntuacion+".");
		super.setPuntuacion(totalPuntuacion);
	}



	@Override
	public String toString() {
		return "Noticia F1. Titular= "+ super.getTitular()+ "[escuderia=" + escuderia + " Precio=" 
	+super.getPrecio()+", Puntuacion= "+super.getPuntuacion()+"]";
	}
	
	

}
