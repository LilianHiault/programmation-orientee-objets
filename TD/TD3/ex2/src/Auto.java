package TD3ex2;

public class Auto implements Vehicule {
    private int passagers = 0;

    public Auto() {

    }

    public int capacite_max() {
        return 4;
    }

    public boolean avancer() {
        if not (this.estVide()) {
            System.out.println("Vroum !\n");
            return True;
        } else {
            return False;
        }
    }

    boolean entrer(Personne p) {
        if not (this.estPlein()) {
            this.passagers ++;
            return True;
        } else {
            return False;
        }
    }

    boolean sortir(Personne p) {
        if not(this.estVide()) {
            this.passagers --;
            return True;
        } else {
            return False;
        }
    }

    boolean estPlein() {
        return this.passagers == capacite_max();
    }

    boolean estVide() {
        return this.passagers == 0;
    }
}
