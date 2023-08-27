/*  420-201 – Formatif 1
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */


public class Formatif01 {
    public Formatif01() {
        appelerTous();
    }

    private void afficherLigne() {
        System.out.println("****************************************");
    }

    private void afficherMesInfos() {
        System.out.println("Nom : Dimitri Seaborn\nLieu de naissance : Québec");
    }

    private void afficherSomme3A6() {
        int resultat;

        resultat = 3 + 4 + 5 + 6;
        System.out.println("La somme des chiffres de 3 à 6 est : " + resultat);
    }

    private void calculerEtAfficher0CelsiusEnFarenheit() {
        double celsius;
        double fahrenheit;

        celsius = 0;
        fahrenheit = celsius * 9d / 5d + 32;
        System.out.println("0 Celsius en Farenheit est : " + fahrenheit);
    }

    private void calculerEtAfficher0FarenheitEnCelsius() {
        double celsius;
        double fahrenheit;

        fahrenheit = 0;
        celsius = (fahrenheit - 32) * 5d / 9d;
        System.out.println("0 Farenheit En Celsius est : " + celsius);
    }

    private void afficherConvertirKmVersMetre(int kilometre) {
        int metre;

        metre = kilometre * 1000;
        System.out.println(kilometre + " kilomètres équivalent à " + metre + " mètres.");
    }

    private void afficherMetreVersKm(double metre) {
        double kilometre;

        kilometre = metre / 1000d;
        System.out.println(metre + " mètres équivalent à " + kilometre + " kilomètres.");
    }

    public void appelerTous() {
        afficherLigne();
        System.out.println("Question : 12");
        afficherMesInfos();
        afficherLigne();
        System.out.println("Question : 16");
        afficherSomme3A6();
        afficherLigne();
        System.out.println("Question : 17");
        calculerEtAfficher0CelsiusEnFarenheit();
        afficherLigne();
        System.out.println("Question : 18");
        calculerEtAfficher0FarenheitEnCelsius();
        afficherLigne();
        System.out.println("Question : 19");
        afficherConvertirKmVersMetre(2);
        afficherLigne();
        System.out.println("Question : 20");
        afficherMetreVersKm(555);
    }

    public static void main(String[] args) {
        new Formatif01();
    }
}
