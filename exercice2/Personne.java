package exercice2;

public class Personne {

  private String nom;

  private String prenom;

  private String numSecuSociale;


  @Override
  public boolean equals(Object obj) {
    
  }

  @Override
  public String toString() {
    return "nom : " + nom + "\n"
      + "prenom : " + prenom + "\n"
      + "numSecuSociale : " + numSecuSociale + "\n";
  }

  
}