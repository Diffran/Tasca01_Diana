package n2exercici2;


import n2exercici1.Restaurant;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(this.nom.equals(((RestaurantEx2) o).getNom()) && this.puntuacio == ((RestaurantEx2) o).getPuntuacio()){
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

    public static HashSet<RestaurantEx2> insertarRestaurant(HashSet<RestaurantEx2> restaurants, RestaurantEx2 entradaRest) {
        boolean existeix = false;
        for(RestaurantEx2 restaurant : restaurants){
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

    //-------------------------EXERCICI 2------------------------------------
    public static TreeSet<RestaurantEx2> ordenarRestaurants(HashSet<RestaurantEx2> llista) {
        TreeSet<RestaurantEx2> llistaOrdenada = new TreeSet<>(new ComparatorRestaurant());

        llistaOrdenada.addAll(llista);
        return llistaOrdenada;
    }
}
