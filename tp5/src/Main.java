import expression.*;
import noeud.*;
import constante.*;
import variable.*;
import opeFormelles.*;
import operateur.*;
import symbole.*;

import java.util.*;

class Main {
  public static void main(String[] args) {

    Constante n1 = new Constante(1); // 1
    Constante n2 = new Constante(2); // 2
    Somme plus = new Somme(n1, n2); // 3
    Difference moins = new Difference(n1, plus); // -2
    Multiplication mult = new Multiplication(n2, plus); // 6
    Division div = new Division(mult, moins); // -3

    Fonction f = new Fonction("f", div);
    Expression exp = new Expression(div);

    System.out.println(exp.toString());
    System.out.println(exp.resoudre());
    System.out.println(f.toString());

    Map<String, Double> test = new HashMap();
    test.put("x", 1.2);
    test.put("y", 3);
    Affectation aff = new Affectation(test);
    System.out.println(aff.toString);
  }
}
