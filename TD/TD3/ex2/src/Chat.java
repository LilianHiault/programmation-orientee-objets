package TD3ex2;

public class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println("Miaaaaaaaaaaou !\n");
    }
}
