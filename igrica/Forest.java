package igrica;

import java.util.ArrayList;

public class Forest {

	private ArrayList<Gad> gadove = new ArrayList<>(100);

	Forest(ArrayList<Gad> gadove) {

		this.gadove.addAll(gadove);
	}

	Gad getNextGad() {

		return this.gadove.get(this.gadove.size() - 1);
	}

	ArrayList<Gad> getGadove() {

		return this.gadove;
	}

}
