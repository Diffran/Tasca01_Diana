package n2exercici1;

import java.util.HashSet;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o){
       if(this == o) return true;
       if(o == null || getClass() != o.getClass()) return false;
       if(this.nom.equals(((Restaurant) o).getNom()) && this.puntuacio == ((Restaurant) o).getPuntuacio()){
           return true;
        }else{ return false;}
    }

    @Override
    public int hashCode(){
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public String toString(){
        return this.nom + " -> " + this.puntuacio;
    }

    public static HashSet<Restaurant> insertarRestaurant(HashSet<Restaurant> restaurants, Restaurant entradaRest) {
        boolean existeix = false;
        for(Restaurant restaurant : restaurants){
            if(restaurant.equals(entradaRest)){
                System.out.println("no es pot entrar l'objecte restaurant, perque ja està el restaurant");
                existeix = true;
            }
        }
        if(!existeix){
            restaurants.add(entradaRest);
            return restaurants;
        }
        return  restaurants;
    }

}
