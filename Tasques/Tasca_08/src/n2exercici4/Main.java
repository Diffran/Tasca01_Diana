package n2exercici4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Object> llista = List.of(42,17,88,33,"fantastico","serenidad",55,"eclectico",73,"pico");

        System.out.println("llista sense endreçar: ");
        System.out.println(llista + "\n");
        System.out.println("llista endreçada alfa, per e davant i a=4: ");
        System.out.println(cadenesINum(llista) + "\n");
        System.out.println("llista endreçada només imprimeix números: ");
        System.out.println(nomesNum(llista));
    }

    public static List<String> cadenesINum(List<Object> llista){
        List<String> sorted = llista.stream()
                .map(String::valueOf)
                .map(element -> element.replace("a","4"))
                .sorted(Comparator.comparingInt(element -> element.charAt(0)))
                .sorted((s1, s2)-> s1.contains("e") != s2.contains("e")?
                        (s1.contains("e") ? -1 : 1)
                        : s1.compareTo(s2))
                .collect(Collectors.toList());
        return sorted;
    }

    public static List<String> nomesNum(List<Object> llista){
        List<String> numeros = llista.stream()
                .map(String::valueOf)
                .map(element -> element.replace("a","4"))
                .sorted(Comparator.comparingInt(element -> element.charAt(0)))
                .sorted((s1, s2)-> s1.contains("e") != s2.contains("e")?
                        (s1.contains("e") ? -1 : 1)
                        : s1.compareTo(s2))
                .filter(element -> element.toString().matches("-?\\d+(\\.\\d+)?"))
                .collect(Collectors.toList());
        return numeros;
    }
}
