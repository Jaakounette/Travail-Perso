package com.LearningSoulsGame.Characters;
import java.util.Scanner;

public class Hero {
	
	private String name;
	
	private int life = 100;
	
	private int maxLife = 100;
	
	private int stamina = 50;
	
	private int maxStamina = 50;
	

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

	public Hero(String name) {
		this.name = name;
	}

	public Hero() {
		name = "Gregooninator";
	}
	
	public void printStats() {
		System.out.println(this.toString());
	}
	
	public String toString(){
		return ("[ Hero ] "+name+"    LIFE: "+getLife()+"   STAMINA: "+ getStamina()+" ("+isAlive()+")"+"\t");
	}
	
	public String isAlive() {
		if(getLife() <= 0) {
			return "DEAD";
		}
		else {
			return "ALIVE";
		}
	}
}






