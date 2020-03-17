package expression;

import constante.*;
import operateur.*;
import variable.*;
import noeud.*;


public class Expression {
  Noeud racine;

  // Constructeur
  public Expression (Noeud r) {
    this.racine = r;
  }

  public double resoudre () {
    return racine.resoudre();
  }

  public String toString () {
    return racine.toString();
  }
}
