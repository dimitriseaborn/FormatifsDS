/*  FORMATIF 3
 *  Cours 420-201 - Introduction à la programmation
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

import java.util.Scanner;

public class Formatif3DS {
    public Formatif3DS() {
        testerAfficherInfoRectangle();
        demanderEtAfficherInfoRectangle();
    }

    private void demanderEtAfficherInfoRectangle() {
        int longueur;
        int largeur;
        String couleur;

        longueur = lireEntier("Quelle est la longueur de votre rectangle? ");
        largeur = lireEntier("Quelle est la largeur de votre rectangle? ");
        couleur = lireString("Quelle est la couleur de votre rectangle? ");
        afficherInfoRectangle(couleur, longueur, largeur);
    }

    private int lireEntier(String question) {
        int reponse;

        reponse = Integer.parseInt(lireString(question));
        return reponse;
    }

    private String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);
        afficherQuestion(question);
        reponse = sc.nextLine();
        return reponse;
    }

    private void afficherQuestion(String str) {
        System.out.print(str);
    }

    private void testerAfficherInfoRectangle() {
        afficherInfoRectangle("jaune", 2, 4);
        System.out.println("-------------");
        afficherInfoRectangle("magenta", 0, 7);
        System.out.println("-------------");
        afficherInfoRectangle("rouge", 1000, 3500);
        System.out.println("-------------");
        afficherInfoRectangle("vert", 0, 0);
        System.out.println("-------------");
        afficherInfoRectangle("noir", 1, 1);
        System.out.println("-------------");
    }

    private void afficherInfoRectangle(String couleur, int longueur, int largeur) {
        String str;

        str = "Le rectangle a une longueur de " + longueur + " et une largeur de " + largeur + '\n';
        str += "Le rectangle est " + couleur + '\n';
        str += "Son périmètre est de " + calculerPerimetre(longueur, largeur) + '\n';
        str += "Son aire est de " + calculerAire(longueur, largeur);
        System.out.println(str);
    }

    private void afficherAire(int longueur, int largeur) {
        int aire;

        aire = calculerAire(longueur, largeur);
        System.out.println("L'aire d'un rectangle de " + longueur + " par " + largeur + " est de " + aire);
    }

    private int calculerAire(int longueur, int largeur) {
        int aire;

        aire = longueur * largeur;
        return aire;
    }

    private void testerAfficherPerimetre() {
        afficherPerimetre(2, 4);
        afficherPerimetre(1000, 4);
        afficherPerimetre(0, 0);
        afficherPerimetre(0, 3);
        afficherPerimetre(4, 4);
    }

    private void testerCalculerPerimetre() {
        System.out.println("Le périmètre d'un rectangle de 2 par 3 est " + calculerPerimetre(2, 3));
        System.out.println("Le périmètre d'un rectangle de 53 par 3 est " + calculerPerimetre(53, 3));
        System.out.println("Le périmètre d'un rectangle de 0 par 1 est " + calculerPerimetre(0, 1));
        System.out.println("Le périmètre d'un rectangle de 2 par 2 est " + calculerPerimetre(2, 2));
        System.out.println("Le périmètre d'un rectangle de 1 par 1 est " + calculerPerimetre(1, 1));
    }

    private void afficherPerimetre(int longueur, int largeur) {
        int perimetre;

        perimetre = calculerPerimetre(longueur, largeur);
        System.out.println("Le périmètre d'un rectangle de " + longueur + " par " + largeur + " est de " + perimetre);
    }

    private int calculerPerimetre(int longueur, int largeur) {
        int perimetre;

        perimetre = (largeur + longueur) * 2;
        return perimetre;
    }

    public static void main(String[] args) {
        new Formatif3DS();
    }
}
