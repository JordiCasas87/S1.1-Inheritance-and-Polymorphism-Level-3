package n1excercici1nivel3;

import model.*;
//import model.Nbasket;
//import model.Nfootball;
//import model.NF1;
//import model.NMoto;
//import model.Ntenis;

import java.util.ArrayList;
import java.util.Scanner;

public class N1excercici1nivel3Main {
	
	static ArrayList <Editor> listEditors = new ArrayList<Editor>();
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Editor reda1 = new Editor("Pepe","123456D");
		Editor reda2 = new Editor("Martia","876345O");
        listEditors.add(reda1);
        listEditors.add(reda2);
		System.out.println(reda1.toString());
		System.out.println(reda2.toString());
		
		//check static setter in class, all salarys change
		Editor.setSalary(3000);
		
		//check getters
		System.out.println(reda1.getDni());
		System.out.println(reda1.getName());
		System.out.println(reda1.getListArticles());
		
		//futbol article
		Nfootball futbol1 = new Nfootball("Barça wins!","Lliga champions","Barça","Benzema");
		Nfootball futbol2 = new Nfootball("Benzema fired!","No competition","Barça","Benzema");
        reda1.setListArticles(futbol2);
		reda2.setListArticles(futbol1);
		
		System.out.println(futbol1.toString());
		System.out.println(futbol2.toString());
		
		futbol1.CalculatePrice();
		futbol1.CalculatePuntuation();
		System.out.println();
		System.out.println(futbol1.toString());
		System.out.println();
		futbol2.CalculatePrice();
		futbol2.CalculatePuntuation();
		System.out.println();
		System.out.println(futbol2.toString());
		System.out.println();
		
		//Basket article
		Nbasket nbasket1 = new Nbasket("the Best triples!", "acb", "Madrid");
		System.out.println(nbasket1.toString());
		nbasket1.CalculatePrice();
		nbasket1.CalculatePuntuation();
		System.out.println(nbasket1.toString());
		System.out.println();
		
		//Tenis article
		Ntenis tenis1 = new Ntenis ("the champions in Basket!","CopaRei","Nadal y Federer");
		System.out.println(tenis1.toString());
		tenis1.CalculatePrice();
		tenis1.CalculatePuntuation();
		System.out.println(tenis1.toString());
		System.out.println();

		// F1 article
		NF1 formula1 = new NF1 ("Run RUn Run!","Ferrari");
		System.out.println(formula1.toString());
		formula1.CalculatePrice();
		formula1.CalculatePuntuation();
		System.out.println(formula1.toString());
		System.out.println();
		
		//Moto article
		NMoto moto1 = new NMoto("Best motos in the world","Honda");
		System.out.println(moto1.toString());
		moto1.CalculatePrice();
		moto1.CalculatePuntuation();
		System.out.println(moto1.toString());
		System.out.println();
		
		reda1.setListArticles(nbasket1);
		reda2.setListArticles(tenis1);
		reda1.setListArticles(formula1);
		reda2.setListArticles(moto1);
        System.out.println();

		// MENU Y METODOS
		int option =0;
		String answer = "";
		String name,dni;

		do {
			
			System.out.println("""
                    ***NEWS AGENCY*** \s
                     Choose an option:
                      0.- Exit.
                      1.- Add writer.
                      2.- Remove writer.
                      3.- Add news to a writer.
                      4.- Remove news.
                      5.- Show all news by writer.
                      6.- Calculate news score.
                      7.- Calculate news price.
                    """
            );
			
			option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			
			case 0:
				answer = "Bye thanks!!!.\n";
				break;
				
			case 1:
				System.out.println("Enter the name of your new writer:");
				name = sc.nextLine();
				System.out.println("enter Dni:");
				dni = sc.nextLine();
				answer = newRedactor(name,dni);
				break;
				
			case 2:
				System.out.println("Enter the dni of the writer:");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getName() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				answer = eliminateRedactor(dni);
				break;
				
			case 3:
				System.out.println("Which writer (DNI) will add a new article? ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getName() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				answer = newArticle(dni);
				break;
				
			case 4:
				System.out.println("Enter the writer’s DNI to remove a news article: ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getName() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				answer = eliminateArticle(dni);
				break;
				
			case 5:
				System.out.println("Enter the writer’s DNI to display their news articles:” ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getName() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				showArticle(dni);
				System.out.println();
				answer = "";
				break;
				
			case 6:
				System.out.println(" Enter the writer’s DNI to calculate the score of their news articles:");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getName() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				answer = CalculatePuntuation(dni);
				break;
			
				
			case 7:
				System.out.println("Enter the writer’s ID to calculate the price of their news articles:");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getName() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				answer = CalculatePrice(dni);
				break;
				
			default:
				answer = " incorrect option!\n";
			}
			 System.out.println(answer);
			
		}while (option !=0);
		
		
	}
	
	public static Editor findRedactor (String dni) {
		for (Editor editor : listEditors) {
			if (editor.getDni().equalsIgnoreCase(dni)) {
				return editor;
			}
		}
		return null;
	}
	
	public static String newRedactor (String name,String dni) {
		Editor nuevoEditor = new Editor(name,dni);
		String answer = "Redactor "+ name+" , created.\n";
        listEditors.add(nuevoEditor);

		return answer;
	}
	
	public static String eliminateRedactor (String dni) {
		Editor editorFound = findRedactor(dni);
		if ( editorFound != null) {
            listEditors.remove(editorFound);
		}else {
			return "Redactor not found!\n";
		}
		return "Redactor eliminated!.\n";
	}
	
	public static String newArticle (String dni) {
		String answer = "";
		Editor editorFound = findRedactor(dni);
		if ( editorFound != null) {
			System.out.println("what kind of article you want?: \n"
					+ "1.- Football.\n"
					+ "2.- Basket.\n"
					+ "3.- Tenis.\n"
					+ "4.- Formula1.\n"
					+ "5.- Moto.\n");
			
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
				case 1: 
					System.out.println("write the new title ");
					String title = sc.nextLine();
					System.out.println("write the new competition: ");
					String competition = sc.nextLine();
					System.out.println("write the club ");
					String club = sc.nextLine();
					System.out.println("write the name of the player ");
					String player = sc.nextLine();
					Nfootball newFootball = new Nfootball(title,competition,club,player);
					
					editorFound.setListArticles(newFootball);
					answer = "New football news created. \n ";
					break;
				
				case 2:
					System.out.println("write the new title ");
					String titleb = sc.nextLine();
					System.out.println("write the new competition: ");
					String competitionb = sc.nextLine();
					System.out.println("write the club ");
					String clubb = sc.nextLine();
					Nbasket basketNew = new Nbasket(titleb,competitionb,clubb);
					editorFound.setListArticles(basketNew);
					answer = "New basket news created..\n";
					break;

				case 3:
					System.out.println("write the new title ");
					String titlet = sc.nextLine();
					System.out.println("write the new competition: ");
					String competitiont = sc.nextLine();
					System.out.println("Write the players: ");
					String players = sc.nextLine();
					Ntenis tenisNew = new Ntenis (titlet,competitiont,players);
					editorFound.setListArticles(tenisNew);
					answer = "New tenis news created..\n";
					break;

				case 4:
					System.out.println("writte the new title ");
					String titlef = sc.nextLine();
					System.out.println("Write the House: ");
					String housef = sc.nextLine();
					NF1 formula1Nueva = new NF1 (titlef, housef);
					editorFound.setListArticles(formula1Nueva);
					answer = "New F1 news created..\n";
					break;

				case 5:
					System.out.println("Write the new title ");
					String titlem = sc.nextLine();
					System.out.println("Write the team: ");
					String teamm = sc.nextLine();
					NMoto motoNew = new NMoto(titlem, teamm);
					editorFound.setListArticles(motoNew);
					answer = "New article of motos agreed.\n";
					break;
			}
		}else {
			answer = "Redactor not found!";
		}
		return answer;
	}
	

	public static String eliminateArticle(String dni) {
		String answer = "";
		Editor editorFound = findRedactor(dni);
		if ( editorFound != null) {
			ArrayList <Article> listaArticles = editorFound.getListArticles();
			System.out.println("Que noticia quieres eliminar de este redactor?");
			for (int i = 0; i< listaArticles.size(); i++) {
				System.out.println(i+". "+ listaArticles.get(i).getTitle());
			}
			int option = sc.nextInt();
			sc.nextLine();
			listaArticles.remove(option);
			answer = "Article eliminated!";
		}else {
			answer = "Redactor not found!";
		}
		return answer;
	}
	
	public static void showArticle (String dni) {
		Editor editorFound = findRedactor(dni);
		if ( editorFound != null) {
			ArrayList <Article> listaArticles = editorFound.getListArticles();
			System.out.println("Estas son las noticias de, "+ editorFound.getName()+":");
			for (Article article : listaArticles) {
				System.out.println(article.toString());
			}
		}
	}

	public static String CalculatePrice (String dni) {
		String answer = "";
		Editor editorFound = findRedactor(dni);
		if ( editorFound != null) {
			ArrayList <Article> listaArticles = editorFound.getListArticles();
			System.out.println("De que noticia quieres calcular el precio?");
			for (int i = 0; i< listaArticles.size(); i++) {
				System.out.println(i+". "+ listaArticles.get(i).getTitle());
			}
			int option = sc.nextInt();
			sc.nextLine();
			listaArticles.get(option).CalculatePrice();
		}
		answer = "Calculo relizado!\n";
		return answer;
	}

	public static String CalculatePuntuation (String dni) {
		String answer = "";
		Editor editorFound = findRedactor(dni);
		if ( editorFound != null) {
			ArrayList <Article> listaArticles = editorFound.getListArticles();
			System.out.println("Which news do you want to calculate the score of?");
			for (int i = 0; i< listaArticles.size(); i++) {
				System.out.println(i+". "+ listaArticles.get(i).getTitle());
			}
			int option = sc.nextInt();
			sc.nextLine();
           listaArticles.get(option).CalculatePuntuation();
		}
		answer = "Calculated!\n";
		return answer;
	}
}
