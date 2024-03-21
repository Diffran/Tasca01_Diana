package n1exercici1_TreeSet;

import java.io.File;
import java.util.TreeSet;

public class LlegirDirEx1 {

    public static void llegirDir(String ruta){
        File directori = new File(ruta);
        File fitxers[] = directori.listFiles();
        TreeSet<String> fitxersOrdenats = new TreeSet<>();

        if(directori.isDirectory()){

            //TreeSet endreça automaticament
            for(File file : fitxers){
                fitxersOrdenats.add(file.getName());
            }


            for(String file : fitxersOrdenats){
                System.out.println(file);
            }
        }else{
            System.out.println("Error: entra un directori");
        }

    }
}
