package n2exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(37,81,12,65,93,24,50,8,70,45);

        System.out.println(separatPerComes(numeros));
    }

    public static String separatPerComes(List<Integer> numeros){
        String cadena;
        cadena = numeros.stream()
                .map(numero -> numero%2==0? "e"+numero : "o"+numero)
                .collect(Collectors.joining(","));
        return cadena;
    }
}
