package TD3ex2;

public class Cheval extends Animal implements Vehicule {
    public Cheval(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println("Hiiiiiiiiiii !\n");
    }
}
