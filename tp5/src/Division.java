package symbole;

import operateur.*;
import noeud.*;

public class Division extends Operateur{

    public Division(Noeud n1, Noeud n2) {
        super(n1, n2);
    }

    public double resoudre() {
        if (this.enfant2.resoudre() == 0) {
            throw new IllegalArgumentException("Il y a une division par zéro !");
        }
        return this.enfant1.resoudre() / this.enfant2.resoudre();
    }

    public String toString() {
        return "(" + this.enfant1.toString() + " / " + this.enfant2.toString() + ")";
    }
}
