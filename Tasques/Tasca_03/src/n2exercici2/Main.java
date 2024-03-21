package n2exercici2;


import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantEx2 res1 = new RestaurantEx2("Trattoria del Nonno", 6);
        RestaurantEx2 res2 = new RestaurantEx2("Bistró Parisino", 7);
        RestaurantEx2 res3 = new RestaurantEx2("Taquería El Sol", 4);
        RestaurantEx2 res4 = new RestaurantEx2("Restaurante La Cabaña", 9);
        RestaurantEx2 res1Duplicat = new RestaurantEx2("Trattoria del Nonno", 6);//l'unic que no ha d'estar perque esta repetit
        RestaurantEx2 res2MateixaPunt = new RestaurantEx2("Bar Nom", 7);
        RestaurantEx2 res3MateixNom = new RestaurantEx2("Taquería El Sol", 6);


        HashSet<RestaurantEx2> llistatRestaurants = new HashSet<>();
        llistatRestaurants.addAll(List.of(res1,res2,res3));


        llistatRestaurants= RestaurantEx2.insertarRestaurant(llistatRestaurants,res4);
        llistatRestaurants= RestaurantEx2.insertarRestaurant(llistatRestaurants,res1Duplicat);
        llistatRestaurants= RestaurantEx2.insertarRestaurant(llistatRestaurants,res2MateixaPunt);
        llistatRestaurants= RestaurantEx2.insertarRestaurant(llistatRestaurants,res3MateixNom);


        System.out.println("---------------------------------------------------");
        System.out.println("numero de restaurants: "+llistatRestaurants.size());
        llistatRestaurants.forEach(restaurant -> System.out.println(restaurant.getNom()+"->"+restaurant.getPuntuacio()));

        //-------------------EXERCICI 2----------------------------------------------
        System.out.println("-----------EXERCICI 2---------------------   ");
        RestaurantEx2.ordenarRestaurants(llistatRestaurants).forEach(restaurant -> System.out.println(restaurant.getNom()
            +"->"+restaurant.getPuntuacio()));
    }
}
