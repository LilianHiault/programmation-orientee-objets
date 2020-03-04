package joueur;

import carte.*;
import paquet.*;
import couleur.*;

public abstract class Joueur {
	private String nom;
	protected Paquet paqueto;

	// Constructeur
	public Joueur(String n) {
		this.nom = n;
	}

	// Méthodes
	public final void nouveauJeu() {
		this.paqueto = new Paquet(); // Crée un paquet
	}

	public final Carte jouer() {
		// Retire la carte choisise du paquet et retourne la carte
		// return this.paqueto.retirerCarte(this.paqueto.choisirCarte());
		return new Carte(Couleur.PIQUE, 3);
	}

	public abstract Carte choisirCarte();

	public void recupererCarte(Carte c) {
		// Ajoute une nouvelle carte dans le paquet
		this.paqueto.ajouterCarte(c);
	}

	public Boolean aPerdu() {
		// A perdu au jeu
		if (this.paqueto.getNombreCartes() == 0) {return true;}
		else {return false;}
	}

	public String toString() {
		return this.nom + "\n" + this.paqueto.toString();
	}
}
