package model;

public class Nbasket extends Article {
	
	private String competition;
	private String club;

	public Nbasket(String title, String competition, String club) {
		super(title);
		this.competition = competition;
		this.club = club;
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

		@Override
		public void CalculatePrice() {
		int totalPrice=250;
			
		if (competition.equalsIgnoreCase("Eurolliga")) {
			totalPrice += 75;
		}

		if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
			totalPrice += 75;
		}

		System.out.println("The price is : "+totalPrice+".");
		super.setPrice (totalPrice);
			
		}

		@Override
		public void CalculatePuntuation() {
			int totalPuntuation = 4;
			
			if (competition.equalsIgnoreCase("Eurolliga")) {
				totalPuntuation += 3;
			}
			if (competition.equalsIgnoreCase("ACB")) {
				totalPuntuation += 2;
			}

			if (club.equalsIgnoreCase("Madrid")||club.equalsIgnoreCase("Barça")) {
				totalPuntuation += 1;
			}
			
			System.out.println("The puntuation of this new is: "+totalPuntuation+".");
			super.setPuntuation(totalPuntuation);
		}

		@Override
		public String toString() {
			return "Article basket. Title= "+ super.getTitle()+ "[competition=" + competition + ", club=" + club
					+ ", Price="+super.getPrice()+", Puntuation= "+super.getPuntuation()+"]";
		}
}
