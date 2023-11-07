/*  420-201 – Formatif 7 - POO
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

package formatif7;

public class Fruit {
    private String nom;
    private int quantite;

    public Fruit(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nom='" + nom + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}
