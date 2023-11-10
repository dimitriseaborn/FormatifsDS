/*  420-201 – Formatif 7 - POO
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

package formatif7;

public class Inventaire {
    public static Fruit[] getStockFruitFaible(Fruit[] fruits, int stockFaible) {
        int nbFruitFaible = 0;
        Fruit[] fruitsFaibles;

        //compte le nombre de fruits en faible quantité pour avoir la dimension de l'array de retour
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getQuantite() < stockFaible) {
                nbFruitFaible++;
            }
        }
        fruitsFaibles = new Fruit[nbFruitFaible];
        for (int i = 0, j = 0; j < fruitsFaibles.length; i++) {
            if (fruits[i].getQuantite() < stockFaible) {
                fruitsFaibles[j++] = fruits[i];
            }
        }
        return fruitsFaibles;
    }
}
