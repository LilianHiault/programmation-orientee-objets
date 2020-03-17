package humain;

import carte.*;
import paquet.*;
import joueur.*;

import java.util.Scanner;

public class Humain extends Joueur {
  // Constructeur
  public Humain(String nom) {
    super(nom);
  }

  // Méthodes
  public Carte choisirCarte() {
    // Affiche le jeu
    // Demande la carte à jouer
    System.out.println(paqueto.toString());
    System.out.println("Donnez l'indice de la carte que vous souhaitez jouer : ");
    Scanner scan = new Scanner(System.in);
  //  String s = scan.next();
    int indice = scan.nextInt();
    return this.paqueto.retirerCarte(indice);
  }
}
