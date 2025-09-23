package model;

public abstract class Article {

		
	private String title;
	private String text;
	private int puntuation;
	private int price;
	

	public Article(String title) {
		this.title = title;
		this.puntuation = puntuation;
		this.price = price;
		this.text = "";
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String texto) {
		this.text = text;
	}

	public int getPuntuation() {
		return this.puntuation;
	}

	public void setPuntuation(int newPuntuation) {
		this.puntuation = newPuntuation;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int newPrice) {
		this.price = newPrice;
	}

	public abstract void CalculatePrice();
	
	public abstract void CalculatePuntuation();
	

	@Override
	public String toString() {
		return "Article [title=" + title + ", text" + text + ", puntuation=" + puntuation + ", price=" + price
				+ "]";
	}

}
