package constante;

import affectation.*;
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


  public void affect (Affectation aff){
  }

  public String toString() {
    return String.valueOf(this.valeur);
  }
}
