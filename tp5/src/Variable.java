package variable;

import noeud.*;
import java.util.*;

public class Variable extends Noeud {
  private String nom;

  public Variable(String n) {
    this.nom = n;
  }

  public double resoudre() {
    throw new IllegalArgumentException("On ne peut pas résoudre une variable !");
  }

  public String toString() {
    return this.nom;
  }
}
