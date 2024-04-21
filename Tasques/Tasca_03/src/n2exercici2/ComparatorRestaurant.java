package n2exercici2;

import java.util.Comparator;

public class ComparatorRestaurant  implements Comparator<RestaurantEx2> {
    @Override
    public int compare(RestaurantEx2 res1, RestaurantEx2 res2){
        int compNom = res1.getNom().compareTo(res2.getNom());
        if (compNom != 0) {
            return compNom;
        } else {
            return Integer.compare(res1.getPuntuacio(), res2.getPuntuacio());
        }
    }
}
