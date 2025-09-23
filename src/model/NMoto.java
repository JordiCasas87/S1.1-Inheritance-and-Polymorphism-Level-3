package model;

public class NMoto extends Article {

	//atributo
	private String equipo;

	
	//constructor
	public NMoto(String titular, String equipo) {
		super(titular);
		this.equipo = equipo;
	}


	// getter y setter
	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	//metodos
	
	/*Notícies de motociclisme:
		Preu inicial: 100 €
		Honda o Yamaha: 50 €
		*/
	
	@Override
	public void CalcularPrecio() {
		
		int totalPrecio = 100;

		if (equipo.equalsIgnoreCase("Honda")||
				equipo.equalsIgnoreCase("Yamaha"))
			totalPrecio += 50;

		System.out.println("El precio de esta noticia de Motociclismo es: "+totalPrecio+".");
		super.setPrecio (totalPrecio);
	}
		

	/*Notícies de Motociclisme:
		3 punts
		Honda o Yamaha: 3 punts*/
	
	@Override
	public void CalcularPuntuacion() {
		int totalPuntuacion = 3;

		if (equipo.equalsIgnoreCase("Honda")||
				equipo.equalsIgnoreCase("Yamaha"))
			totalPuntuacion += 3;

		System.out.println("La puntuacion de esta noticia de Motociclismo es: "+totalPuntuacion+".");
		super.setPuntuacion (totalPuntuacion);
		
	}
	
	//to string
	@Override
	public String toString() {
		return "Noticia Motociclismo. Titular= "+ super.getTitular()+ "[Equipo=" + equipo + " Precio=" 
	+super.getPrecio()+", Puntuacion= "+super.getPuntuacion()+"]";
	}
	

}
