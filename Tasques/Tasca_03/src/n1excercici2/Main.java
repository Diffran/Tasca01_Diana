package n1excercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> llista = new ArrayList<>();
        llista.add(1);
        llista.add(2);
        llista.add(3);

        for(Integer a: llista){
            System.out.println(a);
        }
        System.out.println();

        List<Integer> llistaInversa = new ArrayList<>();

        ListIterator<Integer> iteradorReves = llista.listIterator(llista.size());
        while(iteradorReves.hasPrevious()){
            llistaInversa.add(iteradorReves.previous());
        }

        for(Integer a: llistaInversa){
            System.out.println(a);
        }
    }
}
