package n1exercici2;

import n1exercici2.pack.GenericMethods;
import n1exercici2.pack.Persona;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Leandro","Gastón", 60);

        System.out.println("--------------------------------------------------");
        GenericMethods.metodeGeneric(p,"lletres",2);
        System.out.println("--------------------------------------------------");
        GenericMethods.metodeGeneric("lletres",2,p);
        //no importa l'ordre dels arguments
    }
}
