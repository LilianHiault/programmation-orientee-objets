package symbole;

import opeFormelles.*;
import noeud.*;

public class Fonction extends OpeFormelles{
  private String nom;
  private Noeud expression;

  public Fonction(String nom, Noeud expr) {
    this.nom = nom;
    this.expression = expr;
  }

  public String toString() {
    return nom + "() <- " + expression.toString();
  }

  public double resoudre() {
    return expression.resoudre();
  }
}
