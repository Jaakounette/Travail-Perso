package com.m2s.tp1;

public class Arguments2 {

	public static void main(String args[]) {
		
		System.out.println(args);
		

		String one = args[0];
		String two = args[1];
		String tree = args[2];
		
		System.out.println( (args[2]!=null) ?  one + two + tree : "Erreur");
	}
}
