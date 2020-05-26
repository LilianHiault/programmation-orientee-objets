package TD3ex2;

interface Vehicule {
    int capacite_max();
    boolean avancer();
    boolean entrer(Personne p);
    boolean sortir(Personne p);
    boolean estPlein();
    boolean estVide();
}
