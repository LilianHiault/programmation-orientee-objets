import mot.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {

    String mot = null;
    System.out.println("Entrez un mot : ");
    try {
      Reader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      mot = br.readLine();
    }
    catch (IOException e) {
    }

    Mot gobelin  = new Mot(mot);
    gobelin.afficheVoyelles();
    System.out.println(gobelin.estPalindrome());
    System.out.println(gobelin.estContenu("Gobelinable"));
  }
}
