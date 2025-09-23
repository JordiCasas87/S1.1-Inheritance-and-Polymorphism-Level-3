package model;

public class NMoto extends Article {

	private String team;

	public NMoto(String title, String team) {
		super(title);
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public void CalculatePrice() {
		
		int totalPrice = 100;

		if (team.equalsIgnoreCase("Honda")||
				team.equalsIgnoreCase("Yamaha"))
			totalPrice += 50;

		System.out.println("The price of this moto news is:”: "+totalPrice+".");
		super.setPrice (totalPrice);
	}

	@Override
	public void CalculatePuntuation() {
		int totalPuntuation = 3;

		if (team.equalsIgnoreCase("Honda")||
				team.equalsIgnoreCase("Yamaha"))
			totalPuntuation += 3;

		System.out.println("The puntuation of this moto news is:" +totalPuntuation+ ".");
		super.setPuntuation (totalPuntuation);
	}

	@Override
	public String toString() {
		return "Article Moto. Title= "+ super.getTitle()+ "[team=" + team + " Price="
	+super.getPrice()+", Puntuation= "+super.getPuntuation()+"]";
	}

}
