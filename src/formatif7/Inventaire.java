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
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getQuantite() < stockFaible) {
                nbFruitFaible++;
            }
        }
        Fruit[] fruitsFaibles = new Fruit[nbFruitFaible];
        for (int i = 0, j = 0; j < fruitsFaibles.length; i++) {
            if (fruits[i].getQuantite() < stockFaible) {
                fruitsFaibles[j] = fruits[i];
                j++;
            }
        }
        return fruitsFaibles;
    }
}
