package jeu;

import couleur.*;
import carte.*;
import paquet.*;
import joueur.*;
import ordi.*;
import humain.*;

public class Jeu {
	private Joueur joueur1;
	private Joueur joueur2;
	private Paquet paquetito;

	// Constructeur
	public Jeu(Joueur j1, Joueur j2) {
		// Créer 2 joueurs et leurs paquets
		this.joueur1 = j1;
		this.joueur2 = j2;
	}

	// Méthodes
	private void jouerCoup() {
		Carte carte1 = joueur1.choisirCarte();
		Carte carte2 = joueur2.choisirCarte();
		System.out.format("%s a joué %s.\n", joueur1.getNom(), carte1.toString());
		System.out.format("%s a joué %s.\n", joueur2.getNom(), carte2.toString());

		if (carte1.compare(carte2) > 0) {
			joueur1.recupererCarte(carte1);
			joueur1.recupererCarte(carte2);
			System.out.format("%s a gagné le coup !\n\n", joueur1.getNom());
		}
		else
		{
			joueur2.recupererCarte(carte1);
			joueur2.recupererCarte(carte2);
			System.out.format("%s a gagné le coup !\n\n", joueur2.getNom());
		}

	}

	private void creerNouveauPaquet() {
		// Paquet de carte à distribuer
		this.paquetito = new Paquet();

		int v;
		for (Couleur c : Couleur.values()) {
			for (v = 2; v < 15; v++) {
				this.paquetito.ajouterCarte(new Carte(c, v));
			}
		}
		this.paquetito.melanger();
	}

	private void distribuerPaquet() {
		joueur1.nouveauJeu();
		joueur2.nouveauJeu();
		// On a un paquet de cartes (mélangé j'espère) qu'on distribue
		for(int i = 0; i < this.paquetito.getNombreCartes(); i += 2){
			joueur1.recupererCarte(paquetito.getCarte(i));
			if(i + 1 != this.paquetito.getNombreCartes()){
				joueur2.recupererCarte(paquetito.getCarte(i + 1));
			}
		}
	}

	private void jouerPartie() {
		while(!joueur1.aPerdu() && !joueur2.aPerdu()){
			jouerCoup();
		}
		if (joueur2.aPerdu()) {
			System.out.format("%s a gagné la partie ! Bravo !\n", joueur1.getNom());
		}
		else {
			System.out.format("%s a gagné la partie ! Bravo !\n", joueur2.getNom());
		}
	}

	public static void main(String[] args) {
		Joueur baptou = new Ordinateur("Baptman");
		Joueur lilianus = new Ordinateur("YO");
		Jeu	juego = new Jeu(baptou, lilianus);
		juego.creerNouveauPaquet();
		juego.distribuerPaquet();
		// System.out.println(juego.paquetito.toString());
		// System.out.println(baptou.toString());
		// System.out.println(lilianus.toString());
		juego.jouerPartie();
		// System.out.println(baptou.toString());
		// System.out.println(lilianus.toString());

		// System.out.println(lilianus.paqueto.toString());
	}
}
