package n1exercici4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mesos = new ArrayList<>(List.of("Gener","Febrer","Març","Abril","Maig",
                "Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre"));
        //imprimir en pantalla cada element del List amb un referenced method
        mesos.forEach(System.out::println);
    }
}
