package com.LearningSoulsGame.weapons;

public class Weapon {
	
	protected String name;
	
	protected int minDamage;
	
	protected int maxDamage;
	
	protected int stamCost;
	
	private int durability;
	
	public String getName() {
		return this.name;
	}
	
	public int getMinDamage() {
		return this.minDamage;
	}

	public int getMaxDamage() {
		return this.maxDamage;
	}
	
	public int getStamCost() {
		return this.stamCost;
	}
	
	public int getDurability() {
		return this.durability;
	}
	
	public void setDurability(int newDurability) {
		this.durability = newDurability;
	}
	
	public void use() {
		setDurability(-1);
	}
	
	public boolean isBroken() {
		if(getDurability()<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString(){
		return (String.format("%-10s",this.name)+String.format("(min: %-5s",this.minDamage)+String.format("max: %-5s",this.maxDamage)+String.format("stam: %-5s",this.stamCost)+String.format("dur: %-5s)",this.durability)+"\t");
	}
	
	public Weapon(String name, int minDamage, int maxDamage, int stamCost, int durability) {
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	
}
