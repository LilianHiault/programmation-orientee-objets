package symbole;

import opera.*;

public class Somme extends Opera {
  public double resoudre() {
    return this.enfant1.resoudre() + this.enfant2.resoudre();
  }
}
