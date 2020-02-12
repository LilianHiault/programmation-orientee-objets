import java.io;
import Mot.*;

public class Main {
  public static void main(String[] args) {
    String mot = null;
    try {
      Reader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      mot = br.readLine();
    }
    catch (IOException e) {
    }
  }
}
