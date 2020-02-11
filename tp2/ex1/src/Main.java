import animal.*;

public class Main {
  public static void main(String[] args) {
    Dog galoup = new Dog("Galoup");
    Animal pilus = new Cat("Pilus");

    System.out.println(galoup.toString());
    System.out.println(pilus.toString());

    galoup.woof();
    ((Cat)pilus).meow();
  }
}
