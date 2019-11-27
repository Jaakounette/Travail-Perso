package com.LearningSoulsGame;
import com.LearningSoulsGame.Characters.Hero;
import com.LearningSoulsGame.Characters.Monster;
import com.LearningSoulsGame.helpers.Dice;;

public class leaningSoulsGame {
	
	public static void main(String[] args) {
		
		Hero hero1 = new Hero();
		Hero hero2 = new Hero("Vieux Chevalier");
		Monster monster1 = new Monster();
		Monster monster2 = new Monster();
		
		hero1.printStats();
		hero2.printStats();
		monster1.printStats();
		monster2.printStats();
		
	}
	

	
}