package affectation;

import opeFormelles.*;
import java.util.*;

public class Affectation extends OpeFormelles{
  private Map<String, double> affect;

  public Affectation(Map<String, double> affec) {
    this.affect = affect;
  }

  public double resoudre() {
    return 0;
  }

  public String toString() {
    String aff = "";
    for (String nom : this.affect) {
      aff = aff + nom + "=" + this.affect.get(nom) + ", ";
    }
    return aff;
  }
}
