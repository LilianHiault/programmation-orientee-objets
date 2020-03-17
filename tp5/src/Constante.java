package constante;

import noeud.*;

public class Constante extends Noeud {
  // Une constante
  private final double valeur;

  // Constructeur
  public Constante (double val) {
    this.valeur = val;
  }

  public double resoudre() {
    return this.valeur;
  }

  public String toString() {
    return String.valueOf(this.valeur);
  }
}
