package model;

import java.util.ArrayList;

public class Editor {
	
	//atributos
	
	private String nom;
	private final String dni;
	static int sueldo =1500;
	private ArrayList <Article> listaArticles;
	
	
	//cosntructor
	
	public Editor(String nom, String dni) {
		
		this.nom = nom;
		this.dni = dni;
		this.listaArticles = new ArrayList <Article>();
		
	}
	
	//getter y setter

	public String getNom() {
		return this.nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public static int getSueldo() {
		return sueldo;
	}


	public static void setSueldo(int sueldo) {
		Editor.sueldo = sueldo;
	}


	public ArrayList<Article> getListaNoticias() {
		return listaArticles;
	}


	public void setListaNoticias(Article article) {
		listaArticles.add(article);
		System.out.println("Noticia agregada");
	}


	public String getDni() {
		return this.dni;
	}
	
	//to string

	
	@Override
	public String toString() {
		return "Redactor [nom=" + nom + ", dni=" + dni +", Sou= "+sueldo +", ListaNoticias=" + listaArticles + "]";
	}
	
		

}
