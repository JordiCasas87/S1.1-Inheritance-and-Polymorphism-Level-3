package n1excercici1nivel3;

import model.*;
import model.Nbasket;
import model.Nfootball;
import model.NF1;
import model.NMoto;
import model.Ntenis;


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
		
		//prueba de que el setter es static de la clase,cambia todos los sueldos
		
		Editor.setSueldo(3000);
		
		//llamada a getters
		System.out.println(reda1.getDni());
		System.out.println(reda1.getNom());
		System.out.println(reda1.getListaNoticias());
		
		//noticia futbol
		
		Nfootball futbol1 = new Nfootball("El Barça gana!","Lliga champions","Barça","Benzema");
		Nfootball futbol2 = new Nfootball("Benzema expulsado!","No competicion","Barça","Benzema");
		reda1.setListaNoticias(futbol2);
		reda2.setListaNoticias(futbol1);
		
		System.out.println(futbol1.toString());
		System.out.println(futbol2.toString());
		
		futbol1.CalcularPrecio();
		futbol1.CalcularPuntuacion();
		System.out.println();
		System.out.println(futbol1.toString());
		System.out.println();
		futbol2.CalcularPrecio();
		futbol2.CalcularPuntuacion();
		System.out.println();
		System.out.println(futbol2.toString());
		System.out.println();
		
		//noticia basquet
		Nbasket nbasket1 = new Nbasket("Los mejores triples!", "acb", "Madrid");
		System.out.println(nbasket1.toString());
		nbasket1.CalcularPrecio();
		nbasket1.CalcularPuntuacion();
		System.out.println(nbasket1.toString());
		System.out.println();
		
		//noticia tenis
		
		Ntenis tenis1 = new Ntenis ("Los campeonatos de Basquet!","CopaRei","Nadal y Federer");
		System.out.println(tenis1.toString());
		tenis1.CalcularPrecio();
		tenis1.CalcularPuntuacion();
		System.out.println(tenis1.toString());
		System.out.println();
		
		
		//noticias F1
		
		NF1 formula1 = new NF1 ("A correr!","Ferrari");
		System.out.println(formula1.toString());
		formula1.CalcularPrecio();
		formula1.CalcularPuntuacion();
		System.out.println(formula1.toString());
		System.out.println();
		
		//noticia motos
		
		NMoto moto1 = new NMoto("Las Motos están calentando","Honda");
		System.out.println(moto1.toString());
		moto1.CalcularPrecio();
		moto1.CalcularPuntuacion();
		System.out.println(moto1.toString());
		System.out.println();
		
		reda1.setListaNoticias(nbasket1);
		reda2.setListaNoticias(tenis1);
		reda1.setListaNoticias(formula1);
		reda2.setListaNoticias(moto1);
		
		
		// INICIO MENU Y METODOS
		
		int opcion =0;
		String respuesta = "";
		String nombre,dni;
		
		
		do {
			
			System.out.println("***AGENCIA DE NOTICIAS***\n\n"
					+ "Escoge una opcion:\n"
					+ "0.- Salir.\n"
					+ "1.- Introduir redactor/a.\n"
					+ "2.- Eliminar redactor/a.\n"
					+ "3.- Introduir notícia a un redactor/a.\n"
					+ "4.- Eliminar notícia (ha de demanar redactor/a i titular de la notícia).\n"
					+ "5.- Mostrar totes les notícies per redactor/a.\n"
					+ "6.- Calcular puntuación de la notícia.\n"
					+ "7.- Calcular precio de la notícia.");
			
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			
			case 0:
				
				respuesta = "Adios! gracias por utilizar nuestro programa de Noticias.\n";
				break;
				
			case 1:
				System.out.println("Introdruce el nombre de tu nuevo redactor: ");
				nombre = sc.nextLine();
				System.out.println("Introduce el Dni:");
				dni = sc.nextLine();
				respuesta = introducirRedactor(nombre,dni);
				break;
				
			case 2:
				System.out.println("Introduce el Dni del redactor que quieres eliminar:");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getNom() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				respuesta = eliminarRedactor(dni);
				break;
				
			case 3:
				System.out.println("Que redactor (dni) va a introducir un nueva noticia? ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getNom() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				respuesta = nuevaNoticia(dni);
				break;
				
			case 4:
				System.out.println("De que redactor (dni) quieres eliminar noticia ?: ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getNom() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				respuesta = eliminarNoticia(dni);
				
				break;
				
			case 5:
				System.out.println("De que redactor (dni) quieres mostrar las noticias ?: ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getNom() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				mostrarNoticias(dni);
				System.out.println();
				respuesta = "";
				break;
				
			case 6:
				
				System.out.println("De que redactor (dni) quieres calcular la puntuacion de las noticias ?: ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getNom() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				respuesta = calcularPuntuacion(dni);
				break;
			
				
			case 7:
					
				System.out.println("De que redactor (dni) quieres calcular el precio de las noticias ?: ");
				for (int i = 0; i < listEditors.size();i++) {
					System.out.println(listEditors.get(i).getNom() +" "+ listEditors.get(i).getDni());
				}
				dni = sc.nextLine();
				respuesta = calcularPrecio(dni);
				break;
				
			default:
				respuesta = "Opción incorrecta!\n";
			}
			 System.out.println(respuesta);
			
		}while (opcion !=0);
		
		
	}
	
	public static Editor buscarRedactor (String dni) {
		
		for (Editor editor : listEditors) {
			if (editor.getDni().equalsIgnoreCase(dni)) {
				return editor;
			}
		}
		return null;
	}
	
	public static String introducirRedactor (String nombre,String dni) {
		Editor nuevoEditor = new Editor(nombre,dni);
		String respuesta = "Redactor "+ nombre+" , creado con éxito.\n";
        listEditors.add(nuevoEditor);

		return respuesta;
	}
	
	public static String eliminarRedactor (String dni) {
		Editor editorEncontrado = buscarRedactor(dni);
		if ( editorEncontrado != null) {
            listEditors.remove(editorEncontrado);
		}else {
			return "Redactor no encontrado!\n";
		}
		
		return "Redactor eliminado!.\n";
	}
	
	public static String nuevaNoticia (String dni) {
		String respuesta = "";
		Editor editorEncontrado = buscarRedactor(dni);
		if ( editorEncontrado != null) {
			System.out.println("Que tipo de noticia quieres crear?: \n"
					+ "1.- Futbol.\n"
					+ "2.- Basquet.\n"
					+ "3.- Tenis.\n"
					+ "4.- Formula1.\n"
					+ "5.- Motociclismo.\n");
			
			int opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
				case 1: 
					System.out.println("Introduce tu titular: ");
					String titular = sc.nextLine();
					System.out.println("Introduce la competición: ");
					String competicion = sc.nextLine();
					System.out.println("Introduce el club: ");
					String club = sc.nextLine();
					System.out.println("Introduce el jugador: ");
					String jugador = sc.nextLine();
					Nfootball futbolNueva = new Nfootball(titular,competicion,club,jugador);
					
					editorEncontrado.setListaNoticias(futbolNueva);
					respuesta = "Nueva noticia Futbol creada.\n ";
					
					break;
				
				case 2:
					System.out.println("Introduce tu titular: ");
					String titularb = sc.nextLine();
					System.out.println("Introduce la competición: ");
					String competicionb = sc.nextLine();
					System.out.println("Introduce el club: ");
					String clubb = sc.nextLine();
					Nbasket basquetNueva = new Nbasket(titularb,competicionb,clubb);
					editorEncontrado.setListaNoticias(basquetNueva);
					respuesta = "Nueva noticia de Basquet creada.\n";
					break;
				case 3:
					System.out.println("Introduce tu titular: ");
					String titulart = sc.nextLine();
					System.out.println("Introduce la competición: ");
					String competiciont = sc.nextLine();
					System.out.println("Introduce los tenistas: ");
					String tenistas = sc.nextLine();
					Ntenis tenisNueva = new Ntenis (titulart,competiciont,tenistas);
					editorEncontrado.setListaNoticias(tenisNueva);
					respuesta = "Nueva noticia de Tenis creada.\n";
					break;
				case 4:
					System.out.println("Introduce tu titular: ");
					String titularf = sc.nextLine();
					System.out.println("Introduce la escuderia: ");
					String escuderiaf = sc.nextLine();
					
					NF1 formula1Nueva = new NF1 (titularf, escuderiaf);
					editorEncontrado.setListaNoticias(formula1Nueva);
					respuesta = "Nueva noticia de Formula 1 creada.\n";
					break;
				case 5:
					
					System.out.println("Introduce tu titular: ");
					String titularm = sc.nextLine();
					System.out.println("Introduce el equipo: ");
					String equipom = sc.nextLine();
						
					NMoto motociclismoNueva = new NMoto(titularm, equipom);
					editorEncontrado.setListaNoticias(motociclismoNueva);
					respuesta = "Nueva noticia de motociclismo creada.\n";
					break;
			}
		}else {
			respuesta = "Redactor no Encontrado!";
		}
		return respuesta;
		
	}
	

	public static String eliminarNoticia (String dni) {
		String respuesta = "";
		Editor editorEncontrado = buscarRedactor(dni);
		if ( editorEncontrado != null) {
			ArrayList <Article> listaArticles = editorEncontrado.getListaNoticias();
			System.out.println("Que noticia quieres eliminar de este redactor?");
			for (int i = 0; i< listaArticles.size(); i++) {
				System.out.println(i+". "+ listaArticles.get(i).getTitular());
			}
			int opcion = sc.nextInt();
			sc.nextLine();
			listaArticles.remove(opcion);
			respuesta = "Noticia eliminada!";
		}else {
			respuesta = "Redactor no encontrado!";
		}
		return respuesta;
	}
	
	public static void mostrarNoticias (String dni) {
	
		Editor editorEncontrado = buscarRedactor(dni);
		if ( editorEncontrado != null) {
			ArrayList <Article> listaArticles = editorEncontrado.getListaNoticias();
			System.out.println("Estas son las noticias de, "+ editorEncontrado.getNom()+":");
			for (Article article : listaArticles) {
				System.out.println(article.toString());
			}
		}
	}

	public static String calcularPrecio (String dni) {

		String respuesta = "";
		Editor editorEncontrado = buscarRedactor(dni);
		if ( editorEncontrado != null) {
			ArrayList <Article> listaArticles = editorEncontrado.getListaNoticias();
			System.out.println("De que noticia quieres calcular el precio?");
			for (int i = 0; i< listaArticles.size(); i++) {
				System.out.println(i+". "+ listaArticles.get(i).getTitular());
			}
			int opcion = sc.nextInt();
			sc.nextLine();
			listaArticles.get(opcion).CalcularPrecio();
		}
		respuesta = "Calculo relizado!\n";
		return respuesta;
	}

	public static String calcularPuntuacion (String dni) {

		String respuesta = "";
		Editor editorEncontrado = buscarRedactor(dni);
		if ( editorEncontrado != null) {
			ArrayList <Article> listaArticles = editorEncontrado.getListaNoticias();
			System.out.println("De que noticia quieres calcular la puntuación?");
			for (int i = 0; i< listaArticles.size(); i++) {
				System.out.println(i+". "+ listaArticles.get(i).getTitular());
			}
			int opcion = sc.nextInt();
			sc.nextLine();
			listaArticles.get(opcion).CalcularPuntuacion();
		}
		respuesta = "Calculo relizado!\n";
		return respuesta;
	}
}
