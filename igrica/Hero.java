package igrica;

import java.util.ArrayList;
import java.util.Random;

public class Hero {

	private String name;
	private Forest forest;
	private Pub pub;
	private ArrayList<Item> items = new ArrayList<>();
	private int blood;
	private int damage;
	private boolean isHeroAlive = true;

	Hero(String name, Forest forest, Pub pub, int blood, int damage) {

		if (forest != null && pub != null && name != null && !name.equals("")) {
			this.name = name;
			this.forest = forest;
			this.pub = pub;
		}

		if (blood >= 0 && damage >= 0) {

			this.blood = blood;
			this.damage = damage;
		}

		System.out.println("A new hero named " + this.name + " has been created!!!");
	}

	Random rand = new Random();

	boolean isInForest() {

		int probabilityToBeInTheForest = rand.nextInt(10) + 1;
		if (probabilityToBeInTheForest <= 7) {

			return true;
		}

		return false;
	}

	boolean isInThePub() {

		if (this.isInForest()) {

			return false;
		}

		return true;
	}

	void fight() {

		if (this.isInForest()) {

			System.out.println("Az sum spas i si hodq prez gorata!!!");
			System.out.println("Vzimam edin gad i pochvam da go biq");
			Gad gad = this.forest.getNextGad();
			do {

				int whoBeatsFirst = rand.nextInt(10) + 1;
				if (whoBeatsFirst <= 5) {

					this.blood -= gad.getDamage();
				} else {

					gad.setBlood(gad.getBlood() - this.damage);
				}

				if (gad.getBlood() <= 0) {

					System.out.print("Ubih " + gad.getName());
					if (!this.items.contains(gad.getItem())) {
						this.items.add(gad.getItem());
						System.out.print(" i vzeh itema " + gad.getItem());
					}
					System.out.println(", produljavam napred!!!");
					this.forest.getGadove().remove(this.forest.getGadove().size() - 1);
					break;
				}

				if (this.blood <= 0) {

					this.isHeroAlive = false;
					break;
				}

			} while (true);
		} else {

			System.out.println("Az sum spas i vlizam v kruchmata da piq edna rakiq!!!");

			if (this.blood < 100) {

				this.blood = 100;
				System.out.println("Piinah samo edna, kolkoto da prezaredq kravta");
			} else {

				int possibilityToGetDrunkLikeAPig = rand.nextInt(10) + 1;

				if (possibilityToGetDrunkLikeAPig <= 7) {// tova 7 syvsem
															// sluchaino go
															// reshih :D

					this.blood -= 10;
					System.out.println("Brat, taka se otrqzah, che mi padna kruvta s 10.");
				} else {

					System.out.println("Malee, za malko da prekalq s pitietata i da mi sa zeme 10 ot kruvta");
				}
			}
		}
	}

	boolean isHeroAlive() {

		return this.isHeroAlive;
	}
}
