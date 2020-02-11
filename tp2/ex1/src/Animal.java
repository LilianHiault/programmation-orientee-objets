package animal;

public class Animal {
  private final String name;

  // Constructeur
  public Animal(String nom) {
    this.name = nom;
  }

  // Accesseurs
  public String getNom() {
    return this.name;
  }

  // Méthodes
  public String toString() {
    return this.name;
  }
}
