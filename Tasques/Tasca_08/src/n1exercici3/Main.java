package n1exercici3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mesos = new ArrayList<>(List.of("Gener","Febrer","Març","Abril","Maig",
                "Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre"));
        //imprimir en pantalla cada element del List amb un lambda
        mesos.forEach(mes -> System.out.println(mes));
    }
}
