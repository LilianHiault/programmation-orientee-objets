package paquet;

import carte.*;
import couleur.*;
import java.util.*;


public class Paquet {
	public ArrayList <Carte> paquet = new ArrayList <Carte> (52);


	// Méthodes
	public String toString() { // Affiche la paquet du joueur
		String strJeu = "";
		if (this.paquet == null || getNombreCartes() == 0){
			strJeu = "Jeu vide";
		}
		else{
			int comp = 0;
			for(Carte i : this.paquet) {
				strJeu = strJeu  + comp + " " + i.toString() + "\n";
				comp++;
			}
		}
		return strJeu;
	}

	public void ajouterCarte(Carte nouv) { // Ajoute Carte dans le paquet
		this.paquet.add(nouv);
	}

	public Carte retirerCarte(int index) { // retire la carte à la position index
		return this.paquet.remove(index);
	}

	public Carte retirerCarte(Carte c) { // retire la carte c
		this.paquet.remove(c);
		return c;
	}

	public Carte getCarte(int index) { // Donne la carte à la position index
		return this.paquet.get(index);
	}

	public int getNombreCartes() { // Donne le nombre de cartes du paquet
		return this.paquet.size();
	}

	public void melanger() { // Mélange le paquet
		// Créer un nouveau paquet, mettre les cartes prises à un indice aléatoire
		// du paquet initial vers le nouveau
		Random rand = new Random();
		rand.ints();
		int randIndex;
		int i = 0;
		int nbMelanges = this.getNombreCartes() * 2;
		while (i < nbMelanges) {
			randIndex = Integer.valueOf(rand.nextInt(this.getNombreCartes()));
			this.ajouterCarte(this.retirerCarte(randIndex));
			i++;
		}
	}
}
