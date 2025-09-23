package model;

public class Nfootball extends Article {

	private String competition;
	private String club;
	private String player;

	public Nfootball(String title, String competition, String club, String player) {
		super(title);
		this.competition = competition;
		this.club = club;
		this.player = player;
	}

	public String getCompetition() {
		return this.competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getClub() {
		return this.club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getPlayer() {
		return this.player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}


	@Override
	public void CalculatePrice() {
		int totalPrice =300;
		if (competition.equalsIgnoreCase("Lliga champions")) {
			totalPrice += 100;
		}
		if (club.equalsIgnoreCase("Barça")||club.equalsIgnoreCase("Madrid")) {
			totalPrice += 100;
		}

		if (player.equalsIgnoreCase("Ferran Torres")||player.equalsIgnoreCase("Benzema")) {
			totalPrice +=50;
		}

		System.out.println("“The price of this football news is:”"+totalPrice+".");
		super.setPrice (totalPrice);
	}

	@Override
	public void CalculatePuntuation() {

		int totalPuntuation = 5;
		if (competition.equalsIgnoreCase("Lliga champions")) {
			totalPuntuation += 3;
		}
		if (competition.equalsIgnoreCase("Lliga")) {
			totalPuntuation += 2;
		}

		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			totalPuntuation += 1;
		}

		if (player.equalsIgnoreCase("Ferran Torres")||player.equalsIgnoreCase("Benzema")) {
			totalPuntuation +=1;
		}

		System.out.println("The puntuation of this tennis news is: "+totalPuntuation+".");
		super.setPuntuation(totalPuntuation);
	}


	@Override
	public String toString() {
		return "Nfutbol. Title= "+ super.getTitle()+ ", competition= " + competition + ", club=" + club + ", player=" + player +
				", Price="+super.getPrice()+", Puntuation= "+super.getPuntuation()+"]";
	}
}
