package model;

public class Nbasket extends Article {
	
	private String competicion;
	private String club;
	

	//constructor
	public Nbasket(String titular, String competicion, String club) {
		super(titular);
		this.competicion = competicion;
		this.club = club;
		
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
		
		//metodos
		
		/*
		 * Notícies de bàsquet:
		Preu inicial: 250 €
		Eurolliga: 75 €
		Barça o Madrid: 75 €
		 */
		
		@Override
		public void CalcularPrecio() {
		int totalPrecio=250;
			
		if (competicion.equalsIgnoreCase("Eurolliga")) {
			totalPrecio += 75;
		}

		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			totalPrecio += 75;
		}


		System.out.println("El precio de esta noticia de Basquet es: "+totalPrecio+".");
		super.setPrecio (totalPrecio);
			
		}

		/*
		 * Notícies de bàsquet:
			4 punts
			Eurolliga: 3 punts
			ACB: 2 punts
			Barça o Madrid: 1 punt
		 */
		
		@Override
		public void CalcularPuntuacion() {
			int totalPuntuacion = 4;
			
			if (competicion.equalsIgnoreCase("Eurolliga")) {
				totalPuntuacion += 3;
			}
			if (competicion.equalsIgnoreCase("ACB")) {
				totalPuntuacion += 2;
			}

			if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
				totalPuntuacion += 1;
			}
			
			System.out.println("La puntuacion de esta noticia de Basquet es: "+totalPuntuacion+".");
			super.setPuntuacion(totalPuntuacion);
			
		}
		
		
		//to string

		@Override
		public String toString() {
			return "Noticia basquet. Titular= "+ super.getTitular()+ "[competicion=" + competicion + ", club=" + club 
					+ ", Precio="+super.getPrecio()+", Puntuacion= "+super.getPuntuacion()+"]";
		}
		
		
		

}
