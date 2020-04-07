package expression;

import constante.*;
import operateur.*;
import variable.*;
import noeud.*;
import affectation.*;


public class Expression {
  Noeud racine;

  // Constructeur
  public Expression (Noeud r) {
    this.racine = r;
  }


  public void affect(Affectation aff){
  this.racine.affect (aff);
  }

  public double resoudre () {

    return racine.resoudre();
  }

  public String toString () {
    return racine.toString();
  }
}
