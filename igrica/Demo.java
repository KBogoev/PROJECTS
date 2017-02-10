package igrica;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		Gad mimi = new Gad("Mimi_Zombito", 100, 2, Item.HELMET);
		Gad vanya = new Gad("Vanya_Ubiicata", 100, 17, Item.SWORD);
		Gad elena = new Gad("Gadnata_Elena", 100, 15, Item.ARMOUR);
		Gad eva = new Gad("Eva_chainika", 100, 14, Item.SHIELD);
		Gad teodora = new Gad("Zlata_Teodora", 100, 6, Item.SHIELD);
		Gad mariq = new Gad("Loshata_Mariq", 100, 5, Item.ARMOUR);
		Gad karina = new Gad("Bezsurdechnata_Karina", 100, 8, Item.HELMET);

		ArrayList<Gad> gadoveVeshtici = new ArrayList<>();
		gadoveVeshtici.add(teodora);
		gadoveVeshtici.add(eva);
		gadoveVeshtici.add(elena);
		gadoveVeshtici.add(karina);
		gadoveVeshtici.add(mariq);
		gadoveVeshtici.add(mimi);
		gadoveVeshtici.add(vanya);

		Forest forest = new Forest(gadoveVeshtici);
		Pub pub = new Pub();
		Hero spas = new Hero("Spas_Smeliq_Voin", forest, pub, 100, 69);

		do {

			if (spas.isHeroAlive()) {

				spas.fight();
			} else {

				System.out.println("Ubiha me, trqbva igrata da zapochne otnachalo.");
				break;
			}
			if (forest.getGadove().isEmpty()) {

				System.out.println("Izbih vsichki gadove.");
				break;
			}

		} while (true);
	}

}
