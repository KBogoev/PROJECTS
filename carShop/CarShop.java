package car.shop;

public class CarShop {

	private Car[] cars;
	private int capacity;

	CarShop(int capacity) {

		if (capacity > 0) {
			this.capacity = capacity;
			cars = new Car[capacity];
		}

		System.out.println("Dobre doshli v nashiq avtopark s " + this.capacity + " na broi koli");
	}

	void addCar(Car car) {

		if (car != null) {

			for (int index = 0; index < capacity; index++) {

				if (this.cars[index] == null) {

					this.cars[index] = car;
					System.out.println("Dobavena e kolata " + this.cars[index].getModel() + " v avtoparka");

					break;
				}
			}
		}

	}

	Car getNextCar() {

		Car car = null;
		for (int index = 0; index < capacity; index++) {

			if (this.cars[index] != null) {

				car = this.cars[index];
				break;
			}
		}

		return car;
	}

	void sellNextCar(Person buyer) {

		this.getNextCar().setBuyer(buyer);
		this.getNextCar().getBuyer().setCar(this.getNextCar());

		System.out.println(
				"Prodadohme kolata " + this.getNextCar().getModel() + " na " + this.getNextCar().getBuyer().getName());
		remooveCar();
	}

	void remooveCar() {

		this.setNextCar(null);
	}

	void setNextCar(Car car) {

		for (int index = 0; index < capacity; index++) {

			if (this.cars[index] != null) {

				this.cars[index] = car;
				break;
			}
		}
	}
}
