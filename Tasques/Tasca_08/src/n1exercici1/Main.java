package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> llista = new ArrayList<>(List.of("Casa", "Perro","Gato","Jardín", "Computadora", "Árbol", "Mariposa",
                "Elefante","Zapato","Ventana","Mochila","Televisor","Tren","Piano","Fresa","Montaña","Vela","Globo","Helado","Unicornio"));

        System.out.println("Paraules amb o:");
        paraulaAmbO(llista).forEach(paraula -> System.out.println(paraula));
        System.out.println( "Hi ha " + paraulaAmbO(llista).size()+" paraules amb la lletra 'o'");
    }

    public static List<String> paraulaAmbO(List<String> paraules){
        return paraules.stream()
                .filter(paraula -> paraula.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}
