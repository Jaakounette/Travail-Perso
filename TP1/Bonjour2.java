package com.m2s.tp1;
import java.util.Scanner;
public class Bonjour2 {

	public static void main(String[] args) {
		final String FRANCAIS = "BONJOUR !";
		final String ANGLAIS = "HELLO !";
		
		int lu;
		String message;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("(1) Français / (Autre) Anglais > ");
		lu = scan.nextInt();

		if (lu==1) {
			message = FRANCAIS;
		}
		else {
			message = ANGLAIS;
		}
	
		System.out.println( message );
	}
}
