package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> llista = new ArrayList<>(List.of("Gato",2,"Elefante",67,
                "Murciélago",1989,"Koala",73,"Tortuga",42));

        ordenarStrings(llista);
    }

    public static void ordenarStrings(List<Object> llista){
         llista.stream()
                .filter(objecte -> objecte.getClass().equals(String.class))
                .sorted(Comparator.comparingInt(paraula -> ((String)paraula).length()))
                 .forEach(System.out::println);

    }
}
