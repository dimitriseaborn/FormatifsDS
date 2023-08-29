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

    private void afficher0CelsiusEnFahrenheit() {
        double fahrenheit = calculer0CelsiusEnFahrenheit();
        System.out.println("0 Celsius en Farenheit est : " + fahrenheit);
    }

    private static double calculer0CelsiusEnFahrenheit() {
        double celsius;
        double fahrenheit;

        celsius = 0;
        fahrenheit = celsius * 9d / 5d + 32;
        return fahrenheit;
    }

    private void afficher0FahrenheitEnCelsius() {
        double celsius = calculer0FahrenheitEnCelsius();
        System.out.println("0 Fahrenheit En Celsius est : " + celsius);
    }

    private static double calculer0FahrenheitEnCelsius() {
        double celsius;
        double fahrenheit;

        fahrenheit = 0;
        celsius = (fahrenheit - 32) * 5d / 9d;
        return celsius;
    }

    private void afficherConvertirKmVersMetre(int kilometre) {
        int metre;

        metre = calculerKmVersMetre(kilometre);
        System.out.println(kilometre + " kilomètres équivalent à " + metre + " mètres.");
    }

    private static int calculerKmVersMetre(int kilometre) {
        int metre;
        metre = kilometre * 1000;
        return metre;
    }

    private void afficherMetreVersKm(double metre) {
        double kilometre;

        kilometre = calculerMetreVersKm(metre);
        System.out.println(metre + " mètres équivalent à " + kilometre + " kilomètres.");
    }

    private static double calculerMetreVersKm(double metre) {
        double kilometre;
        kilometre = metre / 1000d;
        return kilometre;
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
        afficher0CelsiusEnFahrenheit();
        afficherLigne();
        System.out.println("Question : 18");
        afficher0FahrenheitEnCelsius();
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
