package expression;

import constante.*;
import operateur.*;
import variable.*;
import noeud.*;


public class Expression {
  Noeud racine;

  // Constructeur
  public Expression (Symbole symb) {
    this.racine = new Noeud(symb);
  }

  public double resoudre () {
    return racine.resoudre();
  }
}
