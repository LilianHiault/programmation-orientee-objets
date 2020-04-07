package variable;

import noeud.*;
import java.util.*;
import affectation.*;

public class Variable extends Noeud {
  private String nom;
  private Double valeur;

  public Variable(String n) {
    this.nom = n;
  }

  public void affect (Affectation aff){
      this.valeur = aff.affect(this.nom) ;
  }


  public double resoudre() {
    if (this.valeur == null){
    throw new IllegalArgumentException("On ne peut pas résoudre une variable !");
    }
    else{
      return this.valeur;
    }
  }

  public String toString() {
    return this.nom;
  }
}
