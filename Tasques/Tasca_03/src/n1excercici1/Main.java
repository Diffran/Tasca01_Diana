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


        System.out.println("---------------MESOS SENSE AGOST---------------");
        for(Month mes: calendari){
            System.out.println(mes.getName());
        }

        System.out.println("---------------MESOS AMB AGOST POSICIO CORRECTE---------------");

        calendari.add(7,(new Month("agost")));

        for(Month mes: calendari){
            System.out.println(mes.getName());
        }
        System.out.println("----------------HASHMAP DELS MESOS--------------");
        LinkedHashSet<Month> calendariHash = new LinkedHashSet<>(calendari);
        Iterator<Month> iterador = calendariHash.iterator();
        for(Month mes : calendariHash){
            System.out.println(mes.getName());
        }


        System.out.println("----------------HASHMAP DELS MESOS INTENTANT UN DUPLICAT(AGOST)--------------");
        Month mes = calendari.get(7);
        calendariHash.add(mes);

        while(iterador.hasNext()){
            mes = iterador.next();
            System.out.println(mes.getName());
        }

    }
}
