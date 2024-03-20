package n2exercici1;

import n1exercici3_TreeSet.LlegirDirEx3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        String arrel = System.getProperty("user.dir");

        Properties arxiuConfig = new Properties();
        try{
            arxiuConfig.load(new FileInputStream("Tasques/dades/tasca_05_n2exercici1.config"));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
