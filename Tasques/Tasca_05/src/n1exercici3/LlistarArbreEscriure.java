package n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class LlistarArbreEscriure {
    public static final String TAB = "\t";
    public static ArrayList<String> arrayDirectori = new ArrayList<>();

    public static void llistarEsciureDir(String rutallegir, String rutaEscriure, Integer nivell) {
        File directori = new File(rutallegir);
        File escriureDirectori = new File(rutaEscriure);
        String linea="";

        if(nivell==null || nivell<0){
            nivell=0;
        }

        if (directori.isDirectory()) {
            File[] ordenarFiles = directori.listFiles();
            Arrays.sort(ordenarFiles);

            for (File file : ordenarFiles) {
                //imprimeix tabs segons el nivell del contingut del directori
                for(int i=0; i<nivell; i++){
                    linea = linea.concat(TAB);
                }

                //imprimir el nom arxiu o entrar al directori-----------------------------------------
                if(file.isDirectory()){
                    linea = linea.concat(" [DIR]");
                }else{
                    linea = linea.concat(" [FIT]");
                }
                linea = linea.concat("|"+file.getName()+ " - " + new Date(file.lastModified()) + "\n");//es el nom del arxiu o directori
                arrayDirectori.add(linea);//vaig omplint el array list amb les lineas
                linea="";

                if(nivell == 0){
                    try {
                        FileWriter escriptor = new FileWriter(escriureDirectori, true);

                        for(int i=0; i<arrayDirectori.size(); i++){
                            escriptor.write(arrayDirectori.get(i));
                        }
                        arrayDirectori.clear();//neteja l'array un cop ja shan enviat el nivell 0
                        escriptor.close();
                    }catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }


                //si es un directori entra a dins i crida de nou el metode per imprimirne el contingut
                if (file.isDirectory()) {
                    nivell++;//fa que s'imprimeixi un tab mes
                    llistarEsciureDir(file.getAbsolutePath(),rutaEscriure, nivell);
                    nivell--;//fa que simprimeixi un tab menys
                }
            }

        } else {
            System.out.println("el File no és un directori");
        }
    }
}
