package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Mesos {
    static List<String> mesos = List.of( "gener","febrer","març","abril",
            "maig", "juny", "juliol", "agost","setembre", "octubre",
            "novembre", "desembre");

    public static String imprimirMes(int index){
        if(index < mesos.size() && index > -1){
            return mesos.get(index);
        }else{
            return "indexOutOfBounds";
        }
    }
}
