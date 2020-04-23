package opeFormelles;

import affectation.*;
import noeud.*;

public abstract class OpeFormelles extends Noeud {
  private String enfant1;
  private Noeud enfant2;

  public abstract double resoudre();

  public void eval (Affectation aff){
  }
}
