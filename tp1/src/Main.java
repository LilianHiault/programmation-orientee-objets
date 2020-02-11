import date.*;
import personne.*;

public class Main {
  public static void main(String[] args) {
    Date naissBeren = new Date(23, 12, 432);
    Date  naissLuthien = new Date(04,02,400);

    // System.out.println(maDate.afficheDate());
    // System.out.println(maDate.compareTo(date2));

    Personne beren = new Personne("Erchamion", "Beren", 'm', naissBeren);
    Personne luthien = new Personne("Tinùviel", "Lùthien", 'f', naissLuthien);
    Date berenLuthienMari = new Date(27, 07, 458);
    beren.mariage(luthien, berenLuthienMari);

    Date naissThingol = new Date(07, 12, 200);
    Personne thingol = new Personne("Thingol", "Elu", 'm', naissThingol);
    luthien.premParent(thingol);

    Date naissLilian = new Date(23, 12, 2000);
    Personne lilian = new Personne("Hiault", "Lilian", 'm', naissLilian);
    lilian.premParent(thingol);
    System.out.println(luthien.estFraternel(lilian));
  }
}
