import expression.*;
import noeud.*;
import constante.*;
import variable.*;
import opeFormelles.*;
import opera.*;
import symbole.*;

class Main {
  public static void main(String[] args) {
    n1 = new Constante(1);
    n2 = new Constante(2);
    plus = new Somme(n1, n2);
    exp = new Expression(plus);
    System.out.println(exp.resoudre());
  }
}
