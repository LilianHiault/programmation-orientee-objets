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
			for(Carte i : this.paquet) {
				strJeu = strJeu + i.toString() + "\n";
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
			Paquet paquetilini = new Paquet();
			for(Carte c : this.paquet) {
				// OUI
			}
	}
}
