package affectation;

import opeFormelles.*;
import java.util.*;

public class Affectation extends OpeFormelles{
  private HashMap<String, Double> affect;

  public Affectation(HashMap<String, Double> aff) {
    this.affect = aff;
  }

  public double resoudre() {
    return 0;
  }

  public String toString() {
    if (this.affect == null) {
      throw new NullPointerException();
    } else {
      String aff = "";
      for (String nom : this.affect.keySet()) {
        aff = aff + nom + "=" + this.affect.get(nom) + ", ";
      }
      return aff;
    }
  }
}
