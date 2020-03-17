package variable;

import noeud.*;

public class Variable extends Noeud { // Utiliser Map <String, Double> ?
    private String nom;
    private double valeur;

    public double resoudre() {
      return this.valeur; // Attention null si valeur non affectée
    }

    public String toString() {
      return this.nom;
    }

    public void affecter(double val) {
      this.valeur = val;
    }
}
