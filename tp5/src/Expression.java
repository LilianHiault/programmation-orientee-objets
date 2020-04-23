package expression;

import constante.*;
import operateur.*;
import variable.*;
import noeud.*;
import affectation.*;


public class Expression {
    Noeud racine;

    // Constructeur
    public Expression (Noeud r) {
        this.racine = r;
    }


    public void eval(Affectation aff){
        this.racine.eval (aff);
    }

    public double resoudre () {

        return racine.resoudre();
    }

    public String toString () {
        return racine.toString();
    }
}
