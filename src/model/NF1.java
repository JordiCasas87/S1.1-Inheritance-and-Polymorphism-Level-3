package model;

public class NF1 extends Article {

	private String house;

	public NF1(String title, String house) {
		super(title);
		this.house = house;
	}

	public String getHouse() {
		return this.house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	@Override
	public void CalculatePrice() {
		int totalPrice = 100;

		if (house.equalsIgnoreCase("Ferrari")||
				house.equalsIgnoreCase("Mercedes"))
			totalPrice += 50;

		System.out.println("The price of this Formula 1 news is ”: "+totalPrice+".");
		super.setPrice (totalPrice);
	}

	@Override
	public void CalculatePuntuation() {
		
		int totalPuntuation = 4;
		
		if (house.equalsIgnoreCase("Ferrari")||
				house.equalsIgnoreCase("Mercedes")) {
			totalPuntuation += 2;
		}

		System.out.println("The puntuation of this Formula 1 news is …”: "+totalPuntuation+".");
		super.setPuntuation(totalPuntuation);
	}

	@Override
	public String toString() {
		return "News F1. Title= "+ super.getTitle()+ "[house=" + house + " Price="
	+super.getPrice()+", Puntuation= "+super.getPuntuation()+"]";
	}
	
	

}
