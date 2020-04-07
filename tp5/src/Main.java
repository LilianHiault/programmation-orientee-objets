import expression.*;
import noeud.*;
import constante.*;
import variable.*;
import opeFormelles.*;
import operateur.*;
import symbole.*;
import affectation.*;
import traduction.*;

import java.util.*;

class Main {

  public static void main(String[] args) {

    Constante n1 = new Constante(1); // 1
    Constante n2 = new Constante(2); // 2
    Somme plus = new Somme(n1, n2); // 3
    Somme plus2 = new Somme(n2, plus); // 3
    Somme plus3 = new Somme(n2, plus2); // 3
    Difference moins = new Difference(n1, plus); // -2
    Multiplication mult = new Multiplication(n2, plus); // 6
    Division div = new Division(mult, moins); // -3

    Fonction f = new Fonction("f", div);
    Expression exp = new Expression(div);
    Expression exp6 = new Expression(div);

    System.out.println(exp.toString());
    System.out.println(exp.resoudre());
    System.out.println(f.toString());


    System.out.println("\nTraducteur\n");

    String str1 = new String(exp6.toString());

    System.out.println("str 1 = " +str1);
    str1 = str1.substring(1);
    String strtrad = new String(Traduire.reecriture(str1));
    System.out.println(" strtrad = " + strtrad + "\n");


    Expression exp2 = new Expression(Traduire.traduction(strtrad));
    System.out.println("exp2 = "+ exp2.toString());
    System.out.println("exp2 = "+ exp2.resoudre());

    //System.out.println("trouveChamps " + trouveChamps("(12,+(465,-(65)))").toString());

    Affectation aff = new Affectation();
    aff.addCouple("x", 1.2);
    aff.addCouple("y", 3.0);
    System.out.println(aff.toString());
  }
}
