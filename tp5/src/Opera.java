package opera;

public abstract class Opera extends Noeud {
  // Un opératuer mathématique
  private Noeud enfant1;
  private Noeud enfant2;

  // Méthodes
  public Opera (Noeud n1, Noeud n2) {
    this.enfant1 = n1;
    this.enfant2 = n2;
  }

  public abstract double resoudre();
}
