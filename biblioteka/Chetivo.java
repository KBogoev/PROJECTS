package biblioteka;

public abstract class Chetivo {

	private String name;
	private String izdatelstvo;
	private ChetivoType typeOfChetivo;
	private IType categoryThemeOrGenre;

	Chetivo(String name, String izdatelstvo, ChetivoType typeOfChetivo, IType categoryThemeOrGenre) {

		if (name != null && !name.isEmpty()) {

			this.name = name;
		}

		if (izdatelstvo != null && !name.isEmpty()) {

			this.izdatelstvo = izdatelstvo;
		}

		this.typeOfChetivo = typeOfChetivo;
	}

	public ChetivoType getTypeOfChetivo() {
		return this.typeOfChetivo;
	}

	IType getType() {
		return this.categoryThemeOrGenre;
	}

	public String getName() {
		return this.name;
	}
}
