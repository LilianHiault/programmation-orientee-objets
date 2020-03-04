package couleur;

public enum Couleur {
	PIQUE (3), COEUR (2), CARREAU (1), TREFLE (0);

	private int valeur;

	// Constructeur
	private Couleur(int v) {
		this.valeur = v;
	}

	// Méthodes
	public String toString() {
		if (this == null) {return "TU ES NULL";}

		switch (this) {
			case PIQUE:
				return "Pique";
			case COEUR:
				return "Coeur";
			case CARREAU:
				return "Carreau";
			case TREFLE:
				return "Trèfle";
			default:
				return "Ouais c'est pas faux";
		}
	}

	public int compare(Couleur autre) {
		return Integer.compare(this.valeur, autre.valeur);
	}
}
