package biblioteka;

import java.util.Comparator;

public class Book extends Chetivo {

	private String author;
	private String releaseDate;
	private Genre genre;

	Book(String name, String izdatelstvo, String author, String releaseDate, Genre genre) {

		super(name, izdatelstvo, ChetivoType.BOOK, genre);
		if (author != null && !author.isEmpty()) {

			this.author = author;
		}

		if (releaseDate != null && !releaseDate.isEmpty()) {

			this.releaseDate = releaseDate;
		}

	}

	String getGenre() {

		return this.genre.name();
	}

}
