package n2exercici1;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //crear objectes restaurants, 1 de valors repetits
        Restaurant res1 = new Restaurant("Trattoria del Nonno", 6);
        Restaurant res2 = new Restaurant("Bistró Parisino", 7);
        Restaurant res3 = new Restaurant("Taquería El Sol", 4);
        Restaurant res4 = new Restaurant("Restaurante La Cabaña", 9);
        Restaurant res1Duplicat = new Restaurant("Trattoria del Nonno", 6);//l'unic que no ha d'estar perque esta repetit
        Restaurant res2MateixaPunt = new Restaurant("Bar Nom", 7);
        Restaurant res3MateixNom = new Restaurant("Taquería El Sol", 6);

        //crear el HashSet posar els 3 primers objectes, que no son repetits
        HashSet<Restaurant> llistatRestaurants = new HashSet<>();
        llistatRestaurants.addAll(List.of(res1,res2,res3));

        //ara utilitzo el metode per insertar la resta d'objectes
        llistatRestaurants=Restaurant.insertarRestaurant(llistatRestaurants,res4);
        llistatRestaurants=Restaurant.insertarRestaurant(llistatRestaurants,res1Duplicat);
        llistatRestaurants=Restaurant.insertarRestaurant(llistatRestaurants,res2MateixaPunt);
        llistatRestaurants=Restaurant.insertarRestaurant(llistatRestaurants,res3MateixNom);

        //imprimeixo el tamany, hauria de ser de 6, només un no s'entra
        System.out.println("---------------------------------------------------");
        System.out.println("numero de restaurants: "+llistatRestaurants.size());
        llistatRestaurants.forEach(restaurant -> System.out.println(restaurant.getNom()+"->"+restaurant.getPuntuacio()));
    }
}
