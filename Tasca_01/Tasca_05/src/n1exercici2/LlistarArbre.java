package n1exercici2;

import java.io.File;
import java.util.Arrays;

public class LlistarArbre {
    public static final String TAB = "\t";
    public static void llistarArbre(File directori, Integer nivell){
        if(nivell==null || nivell<0){
            nivell=0;
        }

        if(directori.isDirectory()){
            File[] ordenarFiles = directori.listFiles();
            Arrays.sort(ordenarFiles);

            for(File file : ordenarFiles){
                //perque faci un o més tabs depenent del nivell
                for(int i=0; i<nivell; i++){
                    System.out.print(TAB);
                }

                //imprimir el nom arxiu o entrar al directori
                System.out.println(file.getName());
                if(file.isDirectory()){
                    nivell++;
                    llistarArbre(file, nivell);
                }
            }
        }else{
            System.out.println("el File no és un directori");
        }
    }
}
