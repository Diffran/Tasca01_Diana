package n2exercici1;

import java.util.HashSet;

public class Restaurant {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public static HashSet<Restaurant> insertarRestaurant(HashSet<Restaurant> restaurants, Restaurant entradaRest){
        boolean existeix = false;
        for(Restaurant restaurant : restaurants){
            if(restaurant.nom.equals(entradaRest.nom)&&(restaurant.puntuacio==entradaRest.puntuacio)){
                System.out.println("no es pot entrar l'objecte restaurant, perque ja està el restaurant");
                existeix = true;
            }
        }
        if(!existeix){
            restaurants.add(entradaRest);
            return restaurants;
        }
        return restaurants;//retorna el HashSet sense modificar.
    }
}
