package biblioteka;

public class TextBook extends Chetivo {

	private String author;
	private Theme theme;

	TextBook(String name, String izdatelstvo, String author, Theme theme) {
		super(name, izdatelstvo, ChetivoType.TEXTBOOK,theme);

		if (author != null && !author.isEmpty()) {

			this.author = author;
		}
	}
}
