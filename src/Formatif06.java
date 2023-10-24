/*  420-201 – Formatif 6
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

import java.util.Arrays;

public class Formatif06 {
    public Formatif06() {
        testerGetNbValeursPositives();
        testerTrouverIndice();
        testerSontDesTableauxEgaux();
        testerRemplacerValeur();
        testerSortirLesNombresPositifs();
        testerFindLargestNbs();
    }

    private void testerFindLargestNbs() {
        System.out.println("testerFindLargestNbs");
        System.out.println(Arrays.equals(findLargestNbs(new int[][]{{4, 2, 7, 1}, {20, 70, 40, 90}, {1, 2, 0}}), new int[]{7, 90, 2}));
        System.out.println(Arrays.equals(findLargestNbs(new int[][]{{}, {20, 70, 40, 90}, {1, 2, 0}}), new int[]{0, 90, 2}));
        System.out.println(Arrays.equals(findLargestNbs(new int[][]{{-34, -54, -74}, {-32, -2, -65}, {-54, 7, -43}}), new int[]{-34, -2, 7}));
    }

    private int[] findLargestNbs(int[][] tableaux) {
        int[] tableauRetour = new int[tableaux.length];

        for (int i = 0; i < tableaux.length; i++) {
            int[] tableau = tableaux[i];
            int largestNum = Integer.MIN_VALUE;

            if(tableau.length == 0) {
                largestNum = 0;
            }
            for (int j = 0; j < tableau.length; j++) {
                if (tableau[j] > largestNum) {
                    largestNum = tableau[j];
                }
            }
            tableauRetour[i] = largestNum;
        }
        return tableauRetour;
    }

    private void testerSortirLesNombresPositifs() {
        int[] t1 = {1, -1, 0, 7, -2};
        int[] t1Copie = {1, -1, 0, 7, -2};
        int[] t1Rep = {1, 0, 7};
        int[] t2 = {1, 2, 7, 2};
        int[] tVide = {};
        int[] tRep;

        System.out.println("testerSortirLesNombresPositifs");
        tRep = sortirLesNombresPositifs(t1);
        System.out.println(sontDesTableauxEgaux(tRep, t1Rep) == true);
        System.out.println(sontDesTableauxEgaux(t1, t1Copie) == true);

        tRep = sortirLesNombresPositifs(t2);
        System.out.println(sontDesTableauxEgaux(tRep, t2) == true);

        tRep = sortirLesNombresPositifs(tVide);
        System.out.println(sontDesTableauxEgaux(tRep, tVide) == true);
    }

    private int[] sortirLesNombresPositifs(int[] tableau) {
        int longueur = getNbValeursPositives(tableau);
        int[] tableauRetour = new int[longueur];
        int i = 0;

        for (int j = 0; j < tableau.length; j++) {
            if (tableau[j] >= 0) {
                tableauRetour[i] = tableau[j];
                i++;
            }
        }
        return tableauRetour;
    }

    private void testerRemplacerValeur() {
        int[] t1 = {1, -1, 2, 7, 2};
        int[] t2 = {1, -1, 3, 7, 3};
        int[] t3 = {1, -1, 3, 7, 3};
        int[] t4 = {1, -1};
        int[] tVide = {};

        System.out.println("testerRemplacerValeur");
        System.out.println(sontDesTableauxEgaux(t1, t2) == false);
        remplacerValeur(t1, 2, 3);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);

        System.out.println(sontDesTableauxEgaux(t2, t3) == true);
        remplacerValeur(t2, -99, 55);
        System.out.println(sontDesTableauxEgaux(t2, t3) == true);

        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private void remplacerValeur(int[] tableau, int ancienneValeur, int nouvelleValeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == ancienneValeur) {
                tableau[i] = nouvelleValeur;
            }
        }
    }

    private void testerSontDesTableauxEgaux() {
        int[] t1 = {1, -1, 2, 7};
        int[] t2 = {1, -1, 2, 7};
        int[] t3 = {1, -1, 2, 8};
        int[] t4 = {1, -1};
        int[] tVide = {};

        System.out.println("testerSontDesTableauxEgaux");
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t3) == false);
        System.out.println(sontDesTableauxEgaux(t1, t2) == true);
        System.out.println(sontDesTableauxEgaux(t1, t4) == false);
        System.out.println(sontDesTableauxEgaux(tVide, tVide) == true);
    }

    private boolean sontDesTableauxEgaux(int[] tab1, int[] tab2) {
        boolean estEgal = true;
        boolean estMemeLongueur = tab1.length == tab2.length;

        if (estMemeLongueur) {
            for (int i = 0; i < tab1.length; i++) {
                if (tab1[i] != tab2[i]) {
                    estEgal = false;
                }
            }
        }
        return estEgal && estMemeLongueur;
    }

    private void testerTrouverIndice() {
        int t1[] = {1, -1, 1, 7};
        int tVide[] = {};

        System.out.println("testerTrouverIndice");
        System.out.println(trouverIndice(t1, -1) == 1);
        System.out.println(trouverIndice(t1, 1) == 0);
        System.out.println(trouverIndice(t1, 7) == 3);
        System.out.println(trouverIndice(t1, -2) == -1);
        System.out.println(trouverIndice(tVide, 7) == -1);
    }

    private int trouverIndice(int[] tableau, int nb) {
        //return au milieu de la fonction: lisibilité à améliorer
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nb) {
                return i;
            }
        }
        return -1;
    }

    private void testerGetNbValeursPositives() {
        int[] t1 = {1, -1, 0, 7};
        int[] tVide = {};

        System.out.println("testerGetNbValeursPositives");
        System.out.println(getNbValeursPositives(t1) == 3);
        System.out.println(getNbValeursPositives(tVide) == 0);
    }

    private int getNbValeursPositives(int[] tableau) {
        int nbValeurs = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] >= 0) {
                nbValeurs++;
            }
        }
        return nbValeurs;
    }

    public static void main(String[] args) {
        new Formatif06();
    }
}
