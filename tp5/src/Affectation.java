package affectation;

import opeFormelles.*;
import java.util.*;

public class Affectation extends OpeFormelles{
  private HashMap<String, Double> affMap;

  public Affectation() {
    this.affMap = new HashMap<String, Double>();
  }

  public void addCouple(String key,Double value){
    this.affMap.put(key,value);
  }

  public double resoudre() {
    return 0;
  }
   public double affect(String nom) {
    return this.affMap.get(nom);
  }

  public String toString() {
    if (this.affMap == null) {
      throw new NullPointerException();
    } else {
      String affStr = "";
      for (String nom : this.affMap.keySet()) {
        affStr = affStr + nom + "=" + this.affMap.get(nom) + ", ";
      }
      return affStr;
    }
  }
}
