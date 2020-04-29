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

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez 1 pour écrire une expression.\nEntrez 2 pour utiliser l'écriture préfixée.");
        int answer = Integer.parseInt(scan.nextLine());

        if (answer == 1) {
            System.out.println("\n- - -\n\"Pour entrer un calcul vous devez d\'abord rentrer son expression par exemple : (a * (1 + (2.0/x)))\nIl vous sera ensuite demandé de rentrer une affectation des variables. Ici, prenons : a = 2.5, x = 4\nPuis l'expression sera résolue en fonction des variables.\"\n- - -\n");
        } else if (answer == 2) {
            System.out.println("\n- - -\n\"Pour entrer un calcul vous devez d\'abord rentrer son expression en écriture préfixée par exemple : *(a,+(1.0,/(2.0,x))))\nIl vous sera ensuite demandé de rentrer une affectation des variables. Ici, prenons : a = 2.5, x = 4\nPuis l'expression sera résolue en fonction des variables.\"\n- - -\n");
        } else {
            System.out.println("La réponse n'est pas valide.");
        }

        /* Expression */
        System.out.println("Entrez une expression : ");
        String strExp = scan.nextLine();

        /* Transformer la string en expression */
        String strExpPref;
        if (answer == 1) {
            strExpPref = Traduire.reecriture(strExp); // Transforme en notation préfixée
            System.out.format("- - -\nExpression préfixée : %s%n", strExpPref);
        } else {
            strExpPref = strExp;
        }

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
