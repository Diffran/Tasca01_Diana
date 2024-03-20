package n2exercici1;

import n1exercici2.pack.Persona;
import n2exercici1.pack.NoGenericMethodN2;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Leandro","Gastón", 60);

        System.out.println("--------------------------------------------------");
        NoGenericMethodN2.metodeGeneric(p,"lletres",2);
        System.out.println("--------------------------------------------------");
        NoGenericMethodN2.metodeGeneric("lletres",p,2);
        //només puc canviar l'ordre dels dos primers, l'ultim ha de ser un int
    }
}
