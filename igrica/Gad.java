package igrica;

public class Gad {

	private String name;
	private int blood;
	private int damage;
	private Item item;

	Gad(String name, int blood, int damage, Item item) {

		if (blood >= 0 && damage >= 0) {

			this.blood = blood;
			this.damage = damage;
		}

		if (item != null && name != null && !name.equals("")) {

			this.name = name;
			this.item = item;
		}
	}

	int getDamage() {

		return this.damage;
	}

	void setBlood(int blood) {

		this.blood = blood;
	}

	int getBlood() {

		return this.blood;
	}

	String getName() {

		return this.name;
	}

	Item getItem() {

		return this.item;
	}
}
