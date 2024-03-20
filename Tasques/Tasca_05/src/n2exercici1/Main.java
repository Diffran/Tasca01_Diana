package n2exercici1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static n2exercici1.LlegirDirNiv2.llegirDirNiv2;

public class Main {
    public static void main(String[] args) {
        String arrel = System.getProperty("user.dir");
        String directori ="", fitxer="";

        //aixo elimina part de la ruta arrel, perque el meu directori i el meu fitxer estan a una altra carpeta
        arrel=arrel.replace("\\Tasques\\Tasca_05\\src\\n2exercici1","");

        //crear el Properties per llegir l'arxiu .properties
        Properties arxiuConfig = new Properties();
        try{
            arxiuConfig.load(new FileInputStream("tasca_05_n2exercici1.properties"));
            //es un .properties, vol dir que agafa una key=valor, amb getProperty -> key="directori"
            directori = arxiuConfig.getProperty("directori");
            fitxer = arxiuConfig.getProperty("fitxer");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        directori=arrel+"\\"+directori;
        fitxer=arrel+"\\"+fitxer;

        LlegirDirNiv2.llegirDirNiv2(directori,fitxer);
    }
}
