public class RectangleColore extends Rectangle {

  /**
   * Couleur du rectangle
   */
  private String couleur;

  public RectangleColore(double largeur, double hauteur, String couleur) {
    super(hauteur, largeur);
    this.couleur = couleur;
  }

  @Override
  public boolean equals(Object obj) {
    if (super.equals(obj)) {
      if (!(obj instanceof RectangleColore)) {
        return false;
      } else {
        RectangleColore rec = (RectangleColore) obj; 
        if (rec.couleur == null) {
          return false;
        }
        if(couleur.equals(rec.couleur)) {
          return true;
        }
      }  
    }
    return false;
  }

  @Override
  public String toString() {
    return super.toString()
       + "\n" + "couleur : " + couleur;
  }
}