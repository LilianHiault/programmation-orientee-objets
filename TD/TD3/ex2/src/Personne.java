package TD3ex2;

public class Personne {
    private final String nom;
    private Set<Animal> animaux = new HashSet<>();
    private Vehicule vehicule;

    public Personne(String nom) {
        this.nom = nom;
    }

    public String nom() {
        return this.nom;
    }
}
