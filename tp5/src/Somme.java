package symbole;

import operateur.*;
import noeud.*;

public class Somme extends Operateur {

  public Somme(Noeud n1, Noeud n2) {
    super(n1, n2);
  }

  public double resoudre() {
    return this.enfant1.resoudre() + this.enfant2.resoudre();
  }
}
