package car.shop;

public class CarDemo {

	public static void main(String[] args) {

		CarShop kapitolia = new CarShop(12);
		Car astra = new Car("Opel Astra");
		Car zil150 = new Car("Zil 150");
		Car naLilitoPasata = new Car("VW passat");
		Car naKolioGklasata = new Car("G 550 AMG");
		Car ladaNiva = new Car("LADA 2103");
		Car naIvanAudito = new Car("Audi A4");

		kapitolia.addCar(astra);
		kapitolia.addCar(zil150);
		kapitolia.addCar(naLilitoPasata);
		kapitolia.addCar(naKolioGklasata);
		kapitolia.addCar(ladaNiva);
		kapitolia.addCar(naIvanAudito);

		System.out.println(kapitolia.getNextCar().getModel());

		Person pesho = new Person("Петър Петров", 22);
		kapitolia.sellNextCar(pesho);
		System.out.println("Sledvashta kola za prodavane e " + kapitolia.getNextCar().getModel());

		Person gosho = new Person("Georgi", 23);
		kapitolia.sellNextCar(gosho);
		System.out.println("Sledvashta kola za prodavane e " + kapitolia.getNextCar().getModel());

		Person krasi = new Person("Krasi", 28);
		kapitolia.sellNextCar(krasi);
		System.out.println("Sledvashta kola za prodavane e " + kapitolia.getNextCar().getModel());

	}
}
