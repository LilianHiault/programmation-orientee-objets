import carte.*;
import couleur.*;
import paquet.*;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Carte test = new Carte(Couleur.PIQUE, 3);
		Carte gobelin = new Carte(Couleur.PIQUE, 14);
		//System.out.println(gobelin.compare(test));
		Paquet jeu1 = new Paquet();
		jeu1.ajouterCarte(test);
		jeu1.ajouterCarte(gobelin);
		System.out.println(jeu1.toString());

		// Random rand = new Random();
		// rand.ints();
		// System.out.format("%d\n", Integer.valueOf(rand.nextInt(10)));
	}
}
