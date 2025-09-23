package model;

public class Ntenis extends Article {

	private String competition;
	private String players;


	public Ntenis(String title, String competition, String players) {
		super(title);
		this.competition = competition;
		this.players = players;
	}

	public String getCompetition() {
		return competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getPlayers() {
		return players;
	}

	public void setPlayers(String players) {
		this.players = players;
	}
	
	@Override
	public void CalculatePrice() {

		int totalPrice=150;
		
		if (players.toLowerCase().contains("federer")||
				players.toLowerCase().contains("nadal")||
				players.toLowerCase().contains("djokovic")) {
			totalPrice += 100;
		}

		System.out.println("The price of this tennis news is: "+totalPrice+".");
		super.setPrice (totalPrice);
	}

	@Override
	public void CalculatePuntuation() {
		
		int totalPuntuation = 4;
		
		if (players.toLowerCase().contains("federer")||
				players.toLowerCase().contains("nadal")||
				players.toLowerCase().contains("djokovic")) {
			totalPuntuation += 3;
		}

		System.out.println("“The puntuation of this tennis news is:”"+totalPuntuation+".");
		super.setPuntuation(totalPuntuation);
	}
	
	@Override
	public String toString() {
		return "Ntenis. Title= "+ super.getTitle()+"[competition=" + competition + ", players =" + players
				+ ", Price="+super.getPrice()+", Puntuation= "+super.getPuntuation()+"]";
	}

}
