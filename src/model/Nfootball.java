package model;

public class Nfootball extends Article {


	//atributos
	private String competicion;
	private String club;
	private String jugador;


	//constructor
	public Nfootball(String titular, String competicion, String club, String jugador) {
		super(titular);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;
	}



	//getters y setters

	public String getCompeticion() {
		return this.competicion;
	}


	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}


	public String getClub() {
		return this.club;
	}


	public void setClub(String club) {
		this.club = club;
	}


	public String getJugador() {
		return this.jugador;
	}


	public void setJugador(String jugador) {
		this.jugador = jugador;
	}


	//datos precios noticias futbol:
	/*Notícies de futbol: 
		Preu inicial: 300 €
		Lliga de Campions: 100 €
		Barça o Madrid: 100 €
		Ferran Torres o Benzema: 50 €
	 */



	@Override
	public void CalcularPrecio() {
		int totalPrecio =300;
		if (competicion.equalsIgnoreCase("Lliga champions")) {
			totalPrecio += 100;
		}
		if (club.equalsIgnoreCase("Barça")||club.equalsIgnoreCase("Madrid")) {
			totalPrecio += 100;
		}


		if (jugador.equalsIgnoreCase("Ferran Torres")||jugador.equalsIgnoreCase("Benzema")) {
			totalPrecio +=50;
		}


		System.out.println("El precio de esta noticia de Futbol es: "+totalPrecio+".");
		super.setPrecio (totalPrecio);
	}



	//datos puntuacion

	/*Notícies de futbol:
		5 Punts.
		Lliga de Campions: 3 punts
		Lliga: 2 punts
		Barça o Madrid: 1 punt
		Ferran Torres o Benzema: 1 pun
	 */

	@Override
	public void CalcularPuntuacion() {

		int totalPuntuacion = 5;
		if (competicion.equalsIgnoreCase("Lliga champions")) {
			totalPuntuacion += 3;
		}
		if (competicion.equalsIgnoreCase("Lliga")) {
			totalPuntuacion += 2;
		}

		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			totalPuntuacion += 1;
		}


		if (jugador.equalsIgnoreCase("Ferran Torres")||jugador.equalsIgnoreCase("Benzema")) {
			totalPuntuacion +=1;
		}

		System.out.println("La puntuacion de esta noticia de Futbol es: "+totalPuntuacion+".");
		super.setPuntuacion(totalPuntuacion);
	}


	//to string

	@Override
	public String toString() {
		return "Nfutbol. Titular= "+ super.getTitular()+ ", Competicion= " + competicion + ", club=" + club + ", jugador=" + jugador +
				", Precio="+super.getPrecio()+", Puntuacion= "+super.getPuntuacion()+"]";
	}


}
