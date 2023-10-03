/*  420-201 – Formatif 5
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

import java.util.Scanner;

public class Formatif5 {
    public Formatif5() {
        afficherFelicitations(3);
        afficherPyramide(4);
        lireEntierValide("Veuillez entrer un nombre entre 3 et 7 inclusivement", 3, 7);
        lireChoixValide("12345", "Entrez un nombre de 1 à 5");
    }

    private void lireChoixValide(String choixValides, String question) {
        String reponse;
        boolean estValide;

        do {
            reponse = lireString(question);
            estValide = choixValides.contains(reponse);
            if (!estValide) {
                System.out.println("Erreur : Votre choix est invalide, choisissez parmi ces caractères: " + choixValides);
            }
        } while (!estValide);
    }

    private void lireEntierValide(String question, int min, int max) {
        int reponse;

        do {
            reponse = lireEntier(question);
        } while (!(reponse >= min && reponse <= max));
    }

    private void testerAdditionSuccessive() {
        System.out.println(additionSuccessive(2) == 3);
        System.out.println(additionSuccessive(3) == 6);
        System.out.println(additionSuccessive(4) == 10);
        System.out.println(additionSuccessive(6) == 21);
        System.out.println(additionSuccessive(0) == 0);
    }

    private int additionSuccessive(int limite) {
        return limite * (1 + limite) / 2;
    }

    private void afficherPyramide(int hauteur) {
        for (int i = 1; i <= hauteur; i++) {
            System.out.println(getLigneDeCaracteres(i, '*'));
        }
    }

    public void testerGetLigneDeCaracteres() {
        String s;

        s = getLigneDeCaracteres(0, 'x');
        System.out.println(s.equals(""));

        s = getLigneDeCaracteres(1, '*');
        System.out.println(s.equals("*"));

        s = getLigneDeCaracteres(5, 'x');
        System.out.println(s.equals("xxxxx"));
    }


    private String getLigneDeCaracteres(int nbCaractere, char caractere) {
        String str;

        str = "";
        for (int i = 0; i < nbCaractere; i++) {
            str += caractere;
        }
        return str;
    }

    private void afficherFelicitations(int nbAffichage) {
        for (int i = 0; i < nbAffichage; i++) {
            System.out.println("Félicitation!");
        }
    }

    private String lireString(String question) {
        Scanner sc;
        String reponse;

        sc = new Scanner(System.in);
        System.out.print(question + ' '); //Éviter que la réponse soit collée à la question
        reponse = sc.nextLine();
        return reponse;
    }

    private int lireEntier(String question) {
        int reponse;

        reponse = Integer.parseInt(lireString(question));
        return reponse;
    }

    public static void main(String[] args) {
        new Formatif5();
    }
}
