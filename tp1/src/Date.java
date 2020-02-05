package date;

public class Date {
  private int jour;
  private int mois;
  private int annee;

  public Date(int j, int m, int a) {
    if (j < 1 || j > 31) {
      throw new IllegalArgumentException("j doit être compris entre 1 et 31");
    }
    if (m < 1 || m > 12) {
      throw new IllegalArgumentException("m doit être compris entre 1 et 12");
    }
    if (a < 0) {
      throw new IllegalArgumentException("a doit être supérieure ou égale à 0");
    }
    this.jour = j;
    this.mois = m;
    this.annee = a;
  }

  public int getJour() {
    return this.jour;
  }

  public int getMois() {
    return this.mois;
  }

  public int getAnnee() {
    return this.annee;
  }

  public String afficheDate() {
    return this.jour + "/" + this.mois + "/" + this.annee;
  }

  public int compareTo(Date autreDate) {
    if (this.annee > autreDate.annee) {
      return 1;
    }
    else if (this.annee < autreDate.annee) {
      return -1;
    }

    else if (this.mois > autreDate.mois) {
      return 1;
    }
    else if (this.mois < autreDate.mois) {
      return -1;
    }

    else if (this.jour > autreDate.jour) {
      return 1;
    }
    else if (this.jour < autreDate.jour) {
      return -1;
    }

    else {
      return 0;
    }
  }
}
