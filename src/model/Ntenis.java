package model;

public class Ntenis extends Article {
	
	
	//atributos
	private String competicion;
	private String tenistas;
	
	
	//constructor
	public Ntenis(String titular, String competicion, String tenistas) {
		super(titular);
		this.competicion = competicion;
		this.tenistas = tenistas;
	}
	
	
	
	//getters y setters

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getTenistas() {
		return tenistas;
	}

	public void setTenistas(String tenistas) {
		this.tenistas = tenistas;
	}


	//metodos

	/*
	 * Notícies de tenis:
	Preu inicial: 150 € 
	Federer, Nadal o Djokovic: 100 €
	 */
	
	@Override
	public void CalcularPrecio() { // modificar si en el paramtreo hay dos nombres
		//hay que usar Contains
		
		int totalPrecio=150;
		
		if (tenistas.toLowerCase().contains("federer")|| 
				tenistas.toLowerCase().contains("nadal")||
				tenistas.toLowerCase().contains("djokovic")) {
			totalPrecio += 100;
		}

		System.out.println("El precio de esta noticia de Tenis es: "+totalPrecio+".");
		super.setPrecio (totalPrecio);
		
	}

	@Override
	public void CalcularPuntuacion() {
		
		int totalPuntuacion = 4;
		
		if (tenistas.toLowerCase().contains("federer")|| 
				tenistas.toLowerCase().contains("nadal")||
				tenistas.toLowerCase().contains("djokovic")) {
			totalPuntuacion += 3;
		}

		
		System.out.println("La puntuacion de esta noticia de Tenis es: "+totalPuntuacion+".");
		super.setPuntuacion(totalPuntuacion);
		
	}
	
	//to string
	
	@Override
	public String toString() {
		return "Ntenis. Titular= "+ super.getTitular()+"[competicion=" + competicion + ", Tenistas =" + tenistas 
				+ ", Precio="+super.getPrecio()+", Puntuacion= "+super.getPuntuacion()+"]";
	}
	

}
