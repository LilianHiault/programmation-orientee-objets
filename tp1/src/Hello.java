package premierspas;

public class Hello {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Aucun nom donné en argument.");
    }
    else {
      System.out.println("Bonjour " + args[0] + " !");
    }
  }
}
