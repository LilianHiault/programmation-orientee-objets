package animal;

// Sous classe de Animal
public class Cat extends Animal {
  // @Override
  public Cat(String nom) {
    super(nom);
  }

  // public String toString() {
  //   return this.name;
  // }

  public void meow() {
    System.out.println("Miaouuuuuuuuuuuuuuuuuuuu");
  }
}
