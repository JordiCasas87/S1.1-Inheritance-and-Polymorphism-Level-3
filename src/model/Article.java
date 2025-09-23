package model;

public abstract class Article {
	
	//atributos
		
	private String titular;
	private String texto;
	private int puntuacion;
	private int precio;
	
	//constructor
	
	public Article(String titular) {
		
		this.titular = titular;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.texto = "";
	}

	
	//getter y setter
	
	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	//metodos
	
	public abstract void CalcularPrecio();
	
	public abstract void CalcularPuntuacion();
	
	
	//to string
	@Override
	public String toString() {
		return "Noticia [titular=" + titular + ", texto=" + texto + ", puntuacion=" + puntuacion + ", precio=" + precio
				+ "]";
	}



}
