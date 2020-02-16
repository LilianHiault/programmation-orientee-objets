package mot;

public class Mot {
  private String word;

  public Mot(String m) {
    this.word = m;
  }

  public String toString() {
    String chaine = "";
    chaine += this.word;
    return chaine;
  }

  public void afficheVoyelles() {
    String voyelles = "aeiouyéèàAEIOUYÉÈÀ";
    String listeVoyelles = "";
    int taille = this.word.length();
    char carac;
    int i;
    for(i = 0; i < taille; i++) {
      carac = this.word.charAt(i);
      if (voyelles.indexOf(carac) != -1) {
        listeVoyelles += carac;
      }
    }
    System.out.println(listeVoyelles);
  }

  public boolean estPalindrome() {
    boolean estPal = true;
    int i;
    int taille = this.word.length();
    for (i = 0; i < taille/2; i++) {
      if (this.word.charAt(i) != this.word.charAt(taille - 1 - i)) {
        estPal = false;
      }
    }
    return estPal;
  }

  public boolean estContenu(String autre) {
    return this.word.contains(autre);
  }

  public void triMot() {
    // Voir StringBuilder
    int i;
    int k = 0; // Indice de la partie triée du tableau
    int taille = this.word.length();
    List
    while (k < taille) {
      for (i = 0; i < taille; i++) {
        if (this.word.charAt(i) < this.word.charAt(k))
      }
    }
  }
}
