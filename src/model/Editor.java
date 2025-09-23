package model;

import java.util.ArrayList;

public class Editor {

	private String name;
	private final String dni;
	static int salary =1500;
	private ArrayList <Article> listArticles;
	

	public Editor(String name, String dni) {
		
		this.name = name;
		this.dni = dni;
		this.listArticles = new ArrayList <Article>();
	}

	public String getName() {
		return this.name;
	}

	public void setNom(String name) {
		this.name= name;
	}

	public static int getSalary() {
		return salary;
	}

	public static void setSalary(int salary) {
		Editor.salary = salary;
	}

	public ArrayList<Article> getListArticles() {
		return listArticles;
	}

	public void setListArticles(Article article) {
		listArticles.add(article);
		System.out.println("New article agree");
	}

	public String getDni() {
		return this.dni;
	}

	@Override
	public String toString() {
		return "Redactor [name=" + name + ", dni=" + dni +", Sou= "+salary +", ListArticles="  + listArticles + "]";
	}

}
