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

        /* - - - Test traduction - - - */

        System.out.println("TP5 - VALLET Baptiste & HIAULT Lilian\n");

        System.out.println("- - -\n\"Pour entrer un calcul vous devez d\'abord rentrer son expression par exemple :\n(a * (1 + (2.0/x)))\nIl vous sera ensuite demandé de rentrer une affectation des variables. Ici, prenons :\na = 2.5, x = 4\nPuis l'expression sera résolue en fonction des variables.\"\n- - -\n");

        Scanner scan = new Scanner(System.in);

        /* Expression */
        System.out.println("Entrez une expression : ");
        String strExp = scan.nextLine();

        /* Transformer la string en expression */
        String strExpPref = Traduire.reecriture(strExp); // Transforme en notation préfixée
        System.out.format("- - -\nExpression préfixée : %s%n", strExpPref);

        Noeud racine = Traduire.traduction(strExpPref);
        Expression exp = new Expression(racine);
        System.out.format("Expression enregistrée :  %s%n- - -%n", exp.toString());

        /* Affectation */
        System.out.println("Entrez une affectation : ");
        String strAff = scan.nextLine();

        String[] allVariables = strAff.trim().split(","); // Chaque case contient une affecation de variable (a=1, b=2, c=3)
        Affectation aff = new Affectation();
        String[] affVar;
        for (String var : allVariables) // var : a=1
        {
            affVar = var.trim().split("=");
            aff.addCouple(affVar[0].trim(), Double.parseDouble(affVar[1].trim()));
        }
        System.out.format("- - -%nAffectation enregistrée :%s%n", aff.toString());

        /* Evaluer l'expression */
        exp.eval(aff);

        /* Résoudre l'expression */
        double resultat = exp.resoudre();
        System.out.format("- - -%nLe résultat de l'opération est : %f.%n", resultat);
    }
}
