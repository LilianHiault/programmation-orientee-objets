package TD3ex2;

abstract class Animal {
    private final String nom;

    Animal(String nom) {
        this.nom = nom;
    }

    public String nom() {
        return this.nom;
    }

    public void courir() {
        System.out.format("%s est en train de courir !!\n", this.nom());
    }

    public abstract void crier();
}
