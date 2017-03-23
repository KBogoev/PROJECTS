package car.shop;

public class Car {

	private Person buyer;
	private String model;

	Car(String model) {

		if (model != null && !model.equals("")) {

			this.model = model;
		}
		System.out.println("Suzdadena e nova kola");
	}

	String getModel() {

		return this.model;
	}

	void setBuyer(Person buyer) {

		if (buyer != null) {

			this.buyer = buyer;
		}
	}

	Person getBuyer() {

		return this.buyer;
	}
}
