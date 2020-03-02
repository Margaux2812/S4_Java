package fr.umlv.fight;

public class Main {
	public static void main(String[] args) {
		Robot bob = new Robot("Bob");
		Fighter marie = new Fighter("Marie", 3);
		Fighter jane = new Fighter("Jane", 1);
	    System.out.println(marie);
	    
	    Arena arena = new Arena();
	    
	    System.out.println(arena.fight(jane, marie) + " est le vainqueur !");
	}
	
	
}
