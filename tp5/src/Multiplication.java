package symbole;

import operateur.*;
import noeud.*;

public class Multiplication extends Operateur {

  public Multiplication(Noeud n1, Noeud n2) {
    super(n1, n2);
  }

  public double resoudre() {
    return this.enfant1.resoudre() * this.enfant2.resoudre();
  }

  public String toString() {
    return "(" + this.enfant1.toString() + " * " + this.enfant2.toString() + ")";
  }
}
