package com.LearningSoulsGame.Characters;
import java.util.Scanner;

public class Monster extends Character{
	
	protected String name;
	
	protected int life = 10;
	
	protected int maxLife = 10;
	
	protected int stamina = 10;
	
	protected int maxStamina = 10;
	
	protected static int instances_Count = 0;

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
	
	public Monster(String name) {
		this.name = name;
	}

	public Monster() {
		name = "Monstre";
	}
}