package n2exercici2;


import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class RestaurantEx2 {
    private String nom;
    private int puntuacio;

    public RestaurantEx2(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }
    public String getNom() {
        return nom;
    }
    public int getPuntuacio() {
        return puntuacio;
    }

    public static HashSet<RestaurantEx2> insertarRestaurant(HashSet<RestaurantEx2> restaurants, RestaurantEx2 entradaRest){
        boolean existeix = false;
        for(RestaurantEx2 restaurant : restaurants){
            if(restaurant.nom.equals(entradaRest.nom)&&(restaurant.puntuacio==entradaRest.puntuacio)){

                System.out.println("no es pot entrar l'objecte restaurant, perque ja està el restaurant");
                existeix = true;

            }
        }
        if(!existeix){

            restaurants.add(entradaRest);
            return restaurants;

        }
        return restaurants;
    }

    //-------------------------EXERCICI 2------------------------------------
    public static TreeSet<RestaurantEx2> ordenarRestaurants(HashSet<RestaurantEx2> llista) {
        TreeSet<RestaurantEx2> llistaOrdenada = new TreeSet<>(new Comparator<RestaurantEx2>() {
            @Override
            public int compare(RestaurantEx2 res1, RestaurantEx2 res2) {
                int compNom = res1.getNom().compareTo(res2.getNom());
                if (compNom != 0) {
                    return compNom;
                } else {
                    return Integer.compare(res1.getPuntuacio(), res2.getPuntuacio());
                }
            }
        });

        llistaOrdenada.addAll(llista);
        return llistaOrdenada;
    }
}
