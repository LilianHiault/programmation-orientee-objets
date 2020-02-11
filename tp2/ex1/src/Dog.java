package animal;

// Sous classe
public class Dog extends Animal {
  // @Override
  public Dog(String nom) {
    super(nom);
  }

  // public String toString() {
  //   return this.name;
  // }

  public void woof() {
    System.out.println("WAF !");
  }
}
