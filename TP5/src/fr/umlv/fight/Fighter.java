package fr.umlv.fight;

import java.util.Random;

public class Fighter extends Robot {

	private Random random;
	
	public Fighter(String name, long seed) {
		super(name);
		this.random = new Random(seed);
		// TODO Auto-generated constructor stub
	}
	
	public Random getRandom() {
		return random;
	}
	
	public String toString() {
		return "Fighter " + this.getName();
	}

}
