package operateur;

import noeud.*;

public abstract class Operateur extends Noeud {
  // Un opératuer mathématique
  protected Noeud enfant1;
  protected Noeud enfant2;

  // Méthodes
  public Operateur (Noeud n1, Noeud n2) {
    this.enfant1 = n1;
    this.enfant2 = n2;
  }

  public abstract double resoudre();
}
