package fr.umlv.fight;

public class Arena {
	public Robot fight(Robot bot1, Robot bot2) {
		
		while(!bot1.isDead() && !bot2.isDead()) {
			bot1.fire(bot2);
			if(!bot2.isDead()) {
				bot2.fire(bot1);
			}
		}
		
		return ( bot1.isDead() ? bot2 : bot1);
	}
}
