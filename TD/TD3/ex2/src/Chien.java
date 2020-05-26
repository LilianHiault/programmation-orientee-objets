package TD3ex2;

public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println("Waffe...\n");
    }
}
