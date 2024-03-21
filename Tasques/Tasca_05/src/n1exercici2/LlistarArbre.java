package n1exercici2;

import java.io.File;
import java.util.Arrays;
import java.util.Date;


public class LlistarArbre {
    public static final String TAB = "\t";

    public static void llistarArbre(String ruta, Integer nivell){
        File directori = new File(ruta);
        
        if(nivell==null || nivell<0){
            nivell=0;
        }
        
        if(directori.isDirectory()){
            File[] ordenarFiles = directori.listFiles();
            Arrays.sort(ordenarFiles);

            for(File file : ordenarFiles){
                

                for(int i=0; i<nivell; i++){
                    System.out.print(TAB);
                }


                if(file.isDirectory()){
                    System.out.print(" [DIR]");
                }else{
                    System.out.print(" [FIT]");
                }
                System.out.println("|"+file.getName()+ " - " + new Date(file.lastModified()));//es el nom del arxiu o directori


                if(file.isDirectory()){
                    nivell++;
                    llistarArbre(file.getAbsolutePath(),nivell);
                    nivell--;
                }      
            }
        }else{
            System.out.println("el File no és un directori");
        }
    }
}
