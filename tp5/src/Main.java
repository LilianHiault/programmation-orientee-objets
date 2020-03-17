import expression.*;
import noeud.*;
import constante.*;
import variable.*;
import opeFormelles.*;
import operateur.*;
import symbole.*;

class Main {
  public static void main(String[] args) {
    Constante n1 = new Constante(1);
    Constante n2 = new Constante(2);
    Somme plus = new Somme(n1, n2);
    Expression exp = new Expression(plus);
    System.out.println(exp.resoudre());
  }
}
