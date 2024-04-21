package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class LlistarAlfaDirectori {
    public static void llistarDir(String path) throws NoDirectoriException {
        File directori = new File(path);

        if(directori.isDirectory()){
            File[] ordenarFiles = directori.listFiles();
            Arrays.sort(ordenarFiles);

            for(File file : ordenarFiles){
                System.out.println(file.getName());
            }
        }else{
            throw new NoDirectoriException();
        }
    }
}
