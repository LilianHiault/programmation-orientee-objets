package ordi;

import java.util.Random;
import carte.*;
import paquet.*;
import joueur.*;

public class Ordinateur extends Joueur {
	private Random random;

	// Constructeur
	public Ordinateur() {
		super("Ordinatueur");
		this.random = new Random();
	}

	// Méthodes
	public Carte choisirCarte() {
		// Choisit une carte, la supprime du jeu et la renvoie
		this.random.ints();
		int randIndex = Integer.valueOf(this.random.nextInt(this.paqueto.getNombreCartes()));
		Carte c = this.paqueto.getCarte(randIndex);
		this.paqueto.retirerCarte(randIndex);
		return c;
	}
}
