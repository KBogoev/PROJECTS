package biblioteka;

public class Magazine extends Chetivo {

	private Category category;
	private String releaseDate;
	private byte numberOfIssue;

	Magazine(String name, String izdatelstvo, Category category, String releaseDate, byte i) {

		super(name, izdatelstvo, ChetivoType.MAGAZINE, category);

		if (releaseDate != null && !releaseDate.isEmpty()) {

			this.releaseDate = releaseDate;
		}

		if (i > 0) {

			this.numberOfIssue = i;
		}

	}
}
