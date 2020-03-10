package constante;

public class Constante extends Noeud {
  // Une constante
  private final double valeur;

  // Constructeur
  public Constante (double val) {
    this.valeur = val;
  }

  public double resoudre () {
    return this.valeur;
  }
}
