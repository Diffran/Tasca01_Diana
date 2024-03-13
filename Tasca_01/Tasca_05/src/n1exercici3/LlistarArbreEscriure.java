package n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class LlistarArbreEscriure {
    public static void llistarEsciureDir(String rutallegir, String rutaEscriure){
        File directori = new File(rutallegir);
        File escriureDirectori = new File(rutaEscriure);

        if(directori.isDirectory()){
            File[] ordenarFiles = directori.listFiles();
            Arrays.sort(ordenarFiles);

            try {
                FileWriter escriptor = new FileWriter(escriureDirectori, true);
                for (File file : ordenarFiles) {
                    //imprimir el nom arxiu o entrar al directori
                    escriptor.write(file.getName()+"\n");
                    System.out.println(file.getName());
                    if (file.isDirectory()) {
                        llistarEsciureDir(file.getAbsolutePath(), rutaEscriure);
                    }
                }
            }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }
        }else{
            System.out.println("el File no és un directori");
        }
    }
}
