package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class LlistarAlfaDirectori {
    public static void llistarDir(String path){
        File directori = new File(path);

        if(directori.isDirectory()){
            File[] ordenarFiles = directori.listFiles();
            Arrays.sort(ordenarFiles);

            for(File file : ordenarFiles){
                System.out.println(file.getName());
            }
        }else{
            System.out.println("el File no és un directori");
        }
    }
}
