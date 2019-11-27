package com.LearningSoulsGame.Characters;
import java.util.Scanner;

public class Hero extends Character{
	
	protected String name;
	
	protected int life = 100;
	
	protected int maxLife = 100;
	
	protected int stamina = 50;
	
	protected int maxStamina = 50;
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int newLife) {
		this.life = newLife;
	}

	public int getMaxLife() {
		return maxLife;
	}

	public void setMaxLife(int newMaxLife) {
		this.maxLife = newMaxLife;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int newStamina) {
		this.stamina = newStamina;
	}

	public int getMaxStamina() {
		return maxStamina;
	}

	public void setMaxStamina(int newMaxStamina) {
		this.maxStamina = newMaxStamina;
	}
	
	public void printStats() {
		System.out.println(this.toString());
	}
	public Hero(String name) {
		this.name = name;
	}
	
	public Hero() {
		name = "Gregooninator";
	}

	
}





