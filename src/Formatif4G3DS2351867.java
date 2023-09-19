/*  420-201 – Formatif 4 - le si
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

import java.util.Scanner;

public class Formatif4G3DS2351867 {
    public Formatif4G3DS2351867() {
        tester_estExact();
        tester_poserQuestionEtCorriger();
        tester_estEntreBornes();
        tester_convertirNoteACote();

        lireNote("Veuillez entrer une note qui sera convertie en cote de A à E: ");
    }

    private void lireNote(String question) {
        int note;

        note = lireEntier(question);
        if (estEntreBornes(0, note, 0)) {
            System.out.println("Vous avez entré la note: " + note + ", ce qui vous donne la cote suivante: " + convertirNoteACote(note) + ".");
        } else {
            System.out.println("Désolé, la note " + note + "n'est pas valide. Veuillez entrer une valeur entre 0 et 100 inclusivement.");
        }
    }

    private void tester_convertirNoteACote() {
        System.out.println(convertirNoteACote(-1) == 'E');
        System.out.println(convertirNoteACote(0) == 'E');
        System.out.println(convertirNoteACote(59) == 'E');
        System.out.println(convertirNoteACote(60) == 'D');
        System.out.println(convertirNoteACote(70) == 'C');
        System.out.println(convertirNoteACote(80) == 'B');
        System.out.println(convertirNoteACote(90) == 'A');
        System.out.println(convertirNoteACote(100) == 'A');
        System.out.println(convertirNoteACote(101) == 'A');
    }

    private char convertirNoteACote(int note) {
        char cote;

        if (note >= 90) {
            cote = 'A';
        } else if (note >= 80) {
            cote = 'B';
        } else if (note >= 70) {
            cote = 'C';
        } else if (note >= 60) {
            cote = 'D';
        } else {
            cote = 'E';
        }
        return cote;
    }

    private void tester_estEntreBornes() {
        System.out.println(estEntreBornes(74, 75, 80) == false); //affiche true
        System.out.println(estEntreBornes(75, 75, 80) == true); //affiche true
        System.out.println(estEntreBornes(80, 75, 80) == true); //affiche true
        System.out.println(estEntreBornes(81, 75, 80) == false); //affiche true
    }

    private boolean estEntreBornes(int nombre, int min, int max) {
        return min <= nombre && nombre <= max;
    }

    private void tester_poserQuestionEtCorriger() {
        poserQuestionEtCorriger("Quel est le symbole chimique de l'or?", "Au", "Bravo, c'est exact!", "Non, il s'agit de Au");
        poserQuestionEtCorriger("Qui est présentement le président du Canada?", "Justin Trudeau", "Félicitation!", "Non, la bone réponse est Justin Trudeau");
    }

    private void poserQuestionEtCorriger(String question, String bonneReponse, String bonneReponseAffichage, String mauvaiseReponseAffichage) {
        String reponseDonnee;

        reponseDonnee = lireString(question);
        System.out.println(estExact(reponseDonnee, bonneReponse) ? bonneReponseAffichage : mauvaiseReponseAffichage);
    }

    private void tester_estExact() {
        System.out.println(estExact("abc", "abc") == true);
        System.out.println(estExact("abc", "cbc") == false);
        System.out.println(estExact("abc", "abc ") == false);
        System.out.println(estExact("abc", "Abc") == true);
    }

    private boolean estExact(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
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
        new Formatif4G3DS2351867();
    }
}
