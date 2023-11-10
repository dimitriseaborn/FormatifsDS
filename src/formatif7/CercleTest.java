/*  420-201 – Formatif 7 - POO
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

package formatif7;

public class CercleTest {
    public CercleTest() {
        tester_constructeurEtToString();
        tester_getSet();
        tester_creerAirCirconferenceDiametre();
        tester_estRayonValide();
    }

    private void tester_estRayonValide() {
        System.out.println("======tester_estRayonValide======");
        Cercle cercle = new Cercle(0);
        cercle.setRayon(0);
        cercle.setRayon(10);
        cercle.setRayon(0.00000000001);
        cercle.setRayon(1000000000);
        System.out.println("un IllegalArgumentException devrait être lancé:");
        cercle.setRayon(-0.01);
    }

    public void tester_creerAirCirconferenceDiametre() {
        System.out.println("======tester_creerAirCirconferenceDiametre======");
        Cercle cercle = new Cercle(10);
        System.out.println("L'air d'un cercle de rayon 10.0 = " + cercle.getAire() +
                "\nLa circonférence d'un cercle de rayon 10.0 = " + cercle.getCirconference() +
                "\nLa diamètre d'un cercle de rayon 10.0 = " + cercle.getDiametre());
    }

    public void tester_getSet() {
        System.out.println("======tester_getSet======");
        Cercle cercle = new Cercle();
        cercle.setRayon(10);
        System.out.println(cercle.getRayon() == 10);
        cercle.setCercle(new Cercle(20));
        System.out.println(cercle.getDiametre() == 40);
    }

    public void tester_constructeurEtToString() {
        System.out.println("======tester_constructeurEtToString======");
        System.out.println(new Cercle());
        System.out.println("------");
        System.out.println(new Cercle(5));
    }

    public static void main(String[] args) {
        new CercleTest();
    }
}
