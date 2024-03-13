package n1exercici3;

import java.io.File;
import java.util.Arrays;

public class LlistarArbreEscriure {
    public static void llistarEsciureDir(String rutallegir, String rutaEscriure){
        File directori = new File(rutallegir);

        if(directori.isDirectory()){
            File[] ordenarFiles = directori.listFiles();
            Arrays.sort(ordenarFiles);

            for(File file : ordenarFiles){
                //imprimir el nom arxiu o entrar al directori
                System.out.println(file.getName());
                if(file.isDirectory()){
                    llistarEsciureDir(file.getAbsolutePath(), rutaEscriure);
                }
            }
        }else{
            System.out.println("el File no és un directori");
        }
    }
}
