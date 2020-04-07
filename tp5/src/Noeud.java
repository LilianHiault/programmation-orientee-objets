package noeud;

import affectation.*;

public abstract class Noeud {
  // Noeud d'un arbre

  public abstract double resoudre (); // Valeur du noeud

  public abstract void affect (Affectation aff); // Affiche l'expression

  public abstract String toString (); // Affiche l'expression
}
