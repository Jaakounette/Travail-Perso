package com.LearningSoulsGame.helpers;
import java.util.Random;

public class Dice {
	
	protected int faces;
	protected java.util.Random random;
	
	public int getFaces() {
		return faces;
	}

	
	public Dice(int nbrFaces) {
		this.faces = nbrFaces;
	}
	
	final int roll() {
		int roll = (int) (Math.random() * this.getFaces()) +1;
		return roll;
	}

	
	public static void main(String[] args) {
    }
}

