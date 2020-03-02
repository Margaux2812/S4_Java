package fr.umlv.fight;

import java.util.Random;

public class Robot {
	private final String name;
	private int lifeCount;

	public Robot(String name) {
		super();
		this.name = name;
		this.lifeCount = 10;
	}
	
	public String getName() {
		return this.name;
	}

	public String toString() {
		return "Robot " + name;
	}
	
	public void fire(Object target) {
		if(!((Robot)target).isDead()) {
			if(this.rollDice()) {
				((Robot)target).lifeCount -= 2;
				System.out.println(((Robot)target).getName() + " a été touché par " + name + " !");
			}else {
				System.out.println(((Robot)target).getName() + " n'a pas été touché par " + name + " !");
			}			
		}else {
			throw new IllegalStateException("You shot a dead enemy");
		}
	}
	
	protected boolean rollDice() {
		if(this instanceof Fighter) {
			return ((Fighter)this).getRandom().nextBoolean(); 
		}else{
			return true;
		}
	}
	
	public boolean isDead() {
		return (this.lifeCount > 0 ? false : true);
	}
}
