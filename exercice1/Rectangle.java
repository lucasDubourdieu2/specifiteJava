public class Rectangle {

  /**
   * Largeur du rectangle
   */
  private double largeur;

  /**
   * Hauteur du rectangle
   */
  private double hauteur;

  public Rectangle(double hauteur, double largeur) {
    if (hauteur > 0 && largeur > 0) {
      this.hauteur = hauteur;
      this.largeur = largeur;
    }
  }

  @Override
  public String toString() {
    return "largeur : " + largeur + "\n"
        + "hauteur : " + hauteur;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || !(obj instanceof Rectangle)) {
      return false;
    }
    // Vérification de l'instance avant donc OK
    Rectangle sidonie = (Rectangle) obj;
    if (largeur == sidonie.largeur && hauteur == sidonie.hauteur) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(hauteur);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(largeur);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

}