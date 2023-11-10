/*  420-201 – Formatif 7 - POO
 *  Groupe : 3 – mardi & vendredi
 *  Nom : Seaborn
 *  Prénom : Dimitri
 *  DA : 2351867
 */

package formatif7;

import java.util.Arrays;
import java.util.Collections;

public class TesterInventaire {
    public TesterInventaire() {
        Fruit[] fruits = new Fruit[6];
        Fruit[] fruitsFaibles;

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit("Fruit" + i, i * 10);
        }
        Collections.shuffle(Arrays.asList(fruits));//mélange fruits pour le but des tests
        System.out.println(Arrays.toString(fruits));
        fruitsFaibles = Inventaire.getStockFruitFaible(fruits, 30);
        System.out.println("Devrait afficher les fruits 0, 1 et 2");
        System.out.println(Arrays.toString(fruitsFaibles));
    }

    public static void main(String[] args) {
        new TesterInventaire();
    }
}
