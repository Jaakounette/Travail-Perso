package com.m2s.tp1;
import java.util.Scanner;
public class Bonjour {

	public static void main(String[] args) {
		final String FRANCAIS = "BONJOUR !";
		final String ANGLAIS = "HELLO !";
		
		int lu;
		String message;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("(1) Français / (Autre) Anglais > ");
		lu = scan.nextInt();
		/* L'utilisateur doit rentrer un chiffre */
		message = (lu == 1) ? FRANCAIS : ANGLAIS ;
		/* Variable avec condition, si 1 alors Francais, sinon Anglais */
		System.out.println( message );
	}
}
