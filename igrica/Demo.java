package igrica;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		Gad wolf = new Gad("Wolf", 100, 2, Item.HELMET);
		Gad lion = new Gad("Lion", 100, 17, Item.SWORD);
		Gad wildBore = new Gad("Wild Bore", 100, 15, Item.ARMOUR);
		Gad witch = new Gad("Witch", 100, 14, Item.SHIELD);
		Gad darkMagician = new Gad("Dark Magician", 100, 6, Item.SHIELD);
		Gad bear = new Gad("Bear", 100, 5, Item.ARMOUR);
		Gad zombie = new Gad("zombie", 100, 8, Item.HELMET);

		ArrayList<Gad> gadove = new ArrayList<>();
		gadove.add(wolf);
		gadove.add(lion);
		gadove.add(wildBore);
		gadove.add(witch);
		gadove.add(darkMagician);
		gadove.add(bear);
		gadove.add(zombie);

		Forest forest = new Forest(gadove);
		Pub pub = new Pub();
		Hero spas = new Hero("Spas_TheBrave_Warrior", forest, pub, 100, 69);

		do {

			if (spas.isHeroAlive()) {

				spas.fight();
			} else {

				System.out.println("They killed me, the game should start from the beginning.");
				break;
			}
			if (forest.getGadove().isEmpty()) {

				System.out.println("I killed oll the monsters.");
				break;
			}

		} while (true);
	}

}
