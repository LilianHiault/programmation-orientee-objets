package carte;

import couleur.*;

public class Carte {
	private Couleur couleur;
	private int valeur;

	// Constructeur
	public Carte(Couleur c, int v) {
		if (v < 2 || v > 14) {
			throw new IllegalArgumentException("Pas de 26 de trèfle par pitié...");
		}
		this.couleur = c;
		this.valeur = v;
	}

	// Méthodes
	public String toString(){
		return String.valueOf(this.valeur) + " de " + this.couleur.toString();
	}

	public Couleur getCouleur(){
		return this.couleur;
	}

	public int getValeur() {
		return this.valeur;
	}

	public int compare(Carte autre){
		int test = Integer.compare(this.valeur, autre.valeur);
		if (test == 0) {
			return this.couleur.compare(autre.couleur);
		}
		return test;
	}
}
