package personne;
import date.*;

public class Personne {
  private String nom;
  private String prenom;
  private char sexe;
  private Date naissance;
  private boolean estMarie;
  private Date mariage;
  private Personne parent1;
  private Personne parent2;

  // Setters
  public void setNom(String nvNom) {
    this.nom = nvNom;
  }
  public void setPrenom(String nvPrenom) {
    this.prenom = nvPrenom;
  }
  // Getters
  public String getNom() {
    return this.nom;
  }
  public String getPrenom() {
    return this.prenom;
  }
  public char getSexe() {
    return this.sexe;
  }

  // Méthodes
  public Personne(String monNom, String monPrenom,char s, Date dateNaissance) {
    if (s != 'm' & s != 'f') {
      throw new IllegalArgumentException("Le sexe doit être 'm' ou 'f'.");
    }
    this.nom = monNom;
    this.prenom = monPrenom;
    this.sexe = s;
    this.naissance = dateNaissance;
    this.estMarie = false;
  }

  public void mariage(Personne autre, Date dateMariage) {
    if ((this.naissance.compareTo(dateMariage) > 0) || (autre.naissance.compareTo(dateMariage) > 0)) {
      throw new IllegalArgumentException("la naissance doit être antérieur à la date du mariage !");
    } else {
      this.estMarie = true;
      this.mariage = dateMariage;

      autre.estMarie  = true;
      autre.mariage = dateMariage;
    }
  }

  public void premParent(Personne p1) {
    if (this.naissance.compareTo(p1.naissance) < 0) {
      throw new IllegalArgumentException("La personne est née avant son parent !");
    } else {
      this.parent1 = p1;
    }
  }

  public void deuxParent(Personne p2) {
    if (this.naissance.compareTo(p2.naissance) < 0) {
      throw new IllegalArgumentException("La personne est née avant son parent !");
    } else {
      this.parent2 = p2;
    }
  }

  public boolean memePerso(Personne autre) {
    if ((this.nom == autre.nom) && (this.prenom == autre.prenom) && (this.sexe == autre.sexe) && (this.naissance.compareTo(autre.naissance) == 0)) {
      return true;
    }
    return false;
  }

  public boolean estFraternel(Personne autre) {
    boolean estFrere = false;
    if(this.parent1 != null && autre.parent1 != null) {
      // System.out.println("Parents1 non nuls");
      if(this.parent1.memePerso(autre.parent1)) {
        // System.out.println("estFrere parent1");
        estFrere = true;
      }
    } else if((this.parent2 != null) && (autre.parent2 != null)) {
      // System.out.println("Parents2 non nuls");
      if(this.parent2.memePerso(autre.parent2)) {
        estFrere = true;
        // System.out.println("estfrere parent2");
      } else {
        estFrere = false;
        // System.out.println("Non frere");
      }
    }
    return estFrere;
  }
}
