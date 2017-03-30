package biblioteka;

import java.util.HashMap;
import java.util.TreeSet;

public class Library {

	private HashMap<ChetivoType, HashMap<IType, TreeSet<Chetivo>>> catalog;

	Library() {

		this.catalog = new HashMap<>();
		this.catalog.put(ChetivoType.BOOK, new HashMap<>());
		this.catalog.put(ChetivoType.MAGAZINE, new HashMap<>());
		this.catalog.put(ChetivoType.TEXTBOOK, new HashMap<>());
	}

	void addChetivo(Chetivo chetivo) {

		if (chetivo != null) {
			System.out.println(this.catalog.get(chetivo.getType()));
			//.put(chetivo.getType(), new TreeSet<>());
			System.out.println(this.catalog.get(chetivo.getTypeOfChetivo()));
			//.get(chetivo.getType()).add(chetivo);
			System.out.println("Dobavih chetivo "
					+ (this.catalog.get(chetivo.getTypeOfChetivo()).get(chetivo.getType()).first().getName()));
		}
	}

}
