package noeud;

import affectation.*;

public abstract class Noeud {
  // Noeud d'un arbre

  public abstract double resoudre (); // Valeur du noeud

  public abstract void eval (Affectation aff); // Affiche l'expression

  public abstract String toString (); // Affiche l'expression
}
