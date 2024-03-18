package n1exercici1_TreeSet;

import java.io.File;
import java.util.TreeSet;

public class LlegirDirEx1 {

    public static void llegirDir(String ruta){
        File directori = new File(ruta);
        File fitxers[] = directori.listFiles();//llista només el contingut del directori, crea l'array del length adequat
        TreeSet<String> fitxersOrdenats = new TreeSet<>();

        if(directori.isDirectory()){

            //passar el array al TreeSet
            for(File file : fitxers){
                fitxersOrdenats.add(file.getName());//al ser un TreeSet els endreçara automaticament
            }

            //imprimir el TreeSet, ja ordenat
            for(String file : fitxersOrdenats){
                System.out.println(file);
            }
        }else{
            System.out.println("Error: entra un directori");
        }

    }
}
