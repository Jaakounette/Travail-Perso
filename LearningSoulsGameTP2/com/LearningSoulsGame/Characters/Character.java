package com.LearningSoulsGame.Characters;

public class Character {
	
	protected String name;

	protected int life;

	protected int maxLife;

	protected int stamina;

	protected int maxStamina;


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

	public Character(String name) {
		
	}
	
	public void printStats() {

		System.out.println(this.toString());
	}

	
	public String toString(){
		String className = this.getClass().getSimpleName(); 
		return (String.format("[%-8s]",className)+String.format(" %-20s ",this.name)+String.format("Life: %-10d ",this.life)+String.format("Stamina: %-5d",this.stamina)+" ("+isAlive()+")"+"\t");
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

