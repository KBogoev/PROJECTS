package car.shop;

public class Person {

	private Car car;
	private String name;
	private int years;

	Person(String name, int years) {

		if (name != null && !name.equals("") && years > 0) {

			this.name = name;
			this.years = years;
		}
	}

	String getName() {

		return this.name;
	}

	void setCar(Car car) {

		if (car != null) {

			this.car = car;
		}
	}
}
