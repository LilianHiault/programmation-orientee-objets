package variable;

import noeud.*;
import java.util.*;

public class Variable extends Noeud { // Utiliser Map <String, Double> ?
  private String nom;
  private double valeur;

  public Variable(String n) {
    this.nom = n;
  }

  public double resoudre() {
    // if (this.valeur == null) {
    //   throw new NullPointerException("Une variable n'a pas d'affectation");
    // }
    return this.valeur;
  }

  public String toString() {
    return this.nom;
  }

  public void affecter(double val) {
    this.valeur = val;
  }
}
