package n2exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> noms = List.of("Juan","Arnau","Laura","Ava","Sofía", "Adriana","Elena","Luis","Ana","Pablo" ,"Marta" ,"Alejandro");

        System.out.println(nomsAmbA(noms));
    }

    public static List<String> nomsAmbA(List<String> llistat){
        llistat = llistat.stream()
                .filter(nom -> nom.charAt(0) == 'A' && nom.length()==3)
                .collect(Collectors.toList());

        return llistat;
    }
}
