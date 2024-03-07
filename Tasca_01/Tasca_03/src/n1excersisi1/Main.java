package n1excersisi1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //creo l'arrayList
        ArrayList<Month> calendari = new ArrayList<>();
        //afegir els objectes month menys agost
        calendari.add(new Month("gener"));
        calendari.add(new Month("febrer"));
        calendari.add(new Month("març"));
        calendari.add(new Month("abril"));
        calendari.add(new Month("maig"));
        calendari.add(new Month("juny"));
        calendari.add(new Month("juliol"));
        calendari.add(new Month("septembre"));
        calendari.add(new Month("octubre"));
        calendari.add(new Month("novembre"));
        calendari.add(new Month("desembre"));
        //afegir agost a la posicio 7
        calendari.add(7,(new Month("agost")));
        //demostrar que manté l'ordre correcte
        for(Month mes: calendari){
            System.out.println(mes.getName());
        }
        System.out.println("------------------------------");
        //duplico el mes d'agost
        Month mes = calendari.get(7);
        //convertir l'arrayList en Hashset
        LinkedHashSet<Month> calendariHash = new LinkedHashSet<>(calendari);
        //agregar l'objecte duplicat
        calendariHash.add(mes);
        //creo un iterador per el calendariHas
        Iterator<Month> iterador = calendariHash.iterator();
        //recorre la llista
        while(iterador.hasNext()){
            mes = iterador.next();
            System.out.println(mes.getName());
        }

    }
}
