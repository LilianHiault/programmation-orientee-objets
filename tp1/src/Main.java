import date.*;
import personne.*;

public class Main {
  public static void main(String[] args) {
    Date maDate = new Date(23, 12, 2000);
    System.out.println(maDate.afficheDate());
    Date  date2 = new Date(04,02,2020);

    System.out.println(maDate.compareTo(date2));
  }
}
