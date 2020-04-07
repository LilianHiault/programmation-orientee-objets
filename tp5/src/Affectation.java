package affectation;

import opeFormelles.*;
import java.util.*;

public class Affectation extends OpeFormelles{
  private HashMap<String, Double> affect;

  public Affectation() {
    this.affect = new HashMap<String, Double>();
  }

  public void addCouple(String key,Double value){
    this.affect.put(key,value);
  }

  public double resoudre() {
    return 0;
  }

  public String toString() {
    if (this.affect == null) {
      throw new NullPointerException("Il n'y a pas d'affectation !");
    } else {
      String aff = "";
      for (String nom : this.affect.keySet()) {
        aff = aff + nom + "=" + this.affect.get(nom) + ", ";
      }
      return aff;
    }
  }
}
