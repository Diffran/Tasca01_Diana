package n1excercici1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> calendari = new ArrayList<>();


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

        calendari.add(7,(new Month("agost")));

        for(Month mes: calendari){
            System.out.println(mes.getName());
        }
        System.out.println("------------------------------");

        Month mes = calendari.get(7);

        LinkedHashSet<Month> calendariHash = new LinkedHashSet<>(calendari);

        calendariHash.add(mes);

        Iterator<Month> iterador = calendariHash.iterator();
        while(iterador.hasNext()){
            mes = iterador.next();
            System.out.println(mes.getName());
        }

    }
}
