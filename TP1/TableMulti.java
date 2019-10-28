package com.m2s.tp1;
import java.util.Scanner;

public class TableMulti {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Table de ? >");
		int tailleTable = scan.nextInt();

		for(int i = 0; i < tailleTable+1; i++) {
			for(int j = 0; j < tailleTable+1; j++) {
				System.out.print("  "+i*j+"  ");
			}
			System.out.println("");
		}
	}
}
