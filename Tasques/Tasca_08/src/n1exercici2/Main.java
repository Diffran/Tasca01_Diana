package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> llista = new ArrayList<>(List.of("Casa", "Perro","Gato","Jardín", "Computadora", "Árbol", "Mariposa",
                "Elefante","Zapato","Ventana","Mochila","Televisor","Tren","Piano","Fresa","Montaña","Vela","Globo","Helado","Unicornio"));


        llista = paraulaAmbO(llista);

        System.out.println("Paraules amb o i amb més de 5 lletres:");
        llista.forEach(paraula -> System.out.println(paraula));
        System.out.println( "Hi ha " + llista.size()
                +" paraules amb la lletra 'o' i més de 5 lletres");
    }

    public static List<String> paraulaAmbO(List<String> paraules){
        return paraules.stream()
                .filter(paraula -> paraula.toLowerCase().contains("o"))
                .filter(paraula -> paraula.length()>5)
                .collect(Collectors.toList());
    }
}
