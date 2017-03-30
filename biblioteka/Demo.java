package biblioteka;

public class Demo {

	public static void main(String[] args) {

		Chetivo kniga = new Book("Voina i mir", "Ciela", "Tolstoi", "12.06.1986", Genre.DRAMA);
		Chetivo spisanie = new Magazine("Avtomobili", "Data Map", Category.LIFESTYLE, "04.04.2016", (byte) 16);
		Chetivo uchebnik = new TextBook("SItoriq i civilizaciq", "Prosveta", "Georgi Georgiev", Theme.HISTORY);

		Library biblioteka = new Library();
		biblioteka.addChetivo(kniga);
	}
}
